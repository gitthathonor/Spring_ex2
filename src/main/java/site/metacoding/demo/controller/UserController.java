package site.metacoding.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import site.metacoding.demo.domain.User;
import site.metacoding.demo.service.UserService;

@Controller
public class UserController {
	
	private final UserService userSevice;

	@Autowired
	public UserController(UserService userSevice) {
		this.userSevice = userSevice;
	}
	
	@GetMapping("/member/join")
	public String joinForm() {
		return "member/joinForm";
	}
	
	@PostMapping("/member/join")
	public String join(UserForm form) {
		User user = new User();
		user.setUsername(form.getUsername());
		
		userSevice.join(user);
		
		System.out.println("UserController : join() 성공");
		
		return "redirect:/";
	}
	
	
}

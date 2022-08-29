package site.metacoding.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import site.metacoding.demo.domain.User;
import site.metacoding.demo.repository.UserRepository;

@Transactional
public class UserService {
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public Integer join(User user) {
		userRepository.save(user);
		System.out.println("userService : 성공");
		return user.getId();
	}
	
}

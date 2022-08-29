package site.metacoding.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import site.metacoding.demo.repository.UserRepository;
import site.metacoding.demo.service.UserService;

@Configuration
public class SpringConfig {
	
	private final UserRepository userRepository;

	@Autowired
	public SpringConfig(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Bean
	public UserService userService() {
		return new UserService(userRepository);
	}
	
//	@Bean
//	public UserRepository userRepository() {
//		return new JpaUserRepository(em);
//	}
	
	
}

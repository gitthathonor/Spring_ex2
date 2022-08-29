package site.metacoding.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import site.metacoding.demo.domain.User;

@Repository
public interface UserRepository {
	
	User save(User user);
	
	List<User> findAll();
	
	Integer findById(Integer id);
	
	Integer findByUsername(String username);
}

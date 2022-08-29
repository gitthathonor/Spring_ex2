package site.metacoding.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;


import site.metacoding.demo.domain.User;


public class JpaUserRepository implements UserRepository{
	
	private final EntityManager em;
	
	
	public JpaUserRepository(EntityManager em) {
		this.em = em;
	}

	@Override
	public User save(User user) {
		em.persist(user);
		System.out.println("jpaRepository : save성공");
		return user;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

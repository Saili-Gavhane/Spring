package com.lti.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.model.User;
@Repository("repository")
public class UserRepositoryImpl implements UserRepository {

	@Override
	public User addUser(User u) {
	
		return null;
	}

	@Override
	public void updateUser( User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByEmail(String email) {
		User u = new User(1,"Zartab Nakwa","zaru@gmail.com","qwerty");
		return u;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

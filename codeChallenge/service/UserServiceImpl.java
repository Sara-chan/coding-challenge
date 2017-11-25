package com.codeChallenge.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeChallenge.dao.UserDao;
import com.codeChallenge.model.User;

/**
 * 
 * @author Sara
 *
 */

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
	

	@Override
	public void add(User u) {

		userDao.add(u);
	}

	@Override
	public void update(User u) {

		userDao.update(u);
	}

	@Override
	public void delete(User u) {

		userDao.delete(u);
	}

	@Override
	public List<User> getAll() {

		return userDao.getAll();
	}

}

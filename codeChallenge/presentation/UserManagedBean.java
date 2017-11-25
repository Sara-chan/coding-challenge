package com.codeChallenge.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.annotation.PostConstruct;


import com.codeChallenge.model.User;
import com.codeChallenge.service.UserService;

/**
 * 
 * @author Sara
 *
 */

@ViewScoped
@ManagedBean(name="userManagedBean")

public class UserManagedBean implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private User user;
	private List<User> listUsers;
	
	@ManagedProperty("#{userService}")
	private UserService userService;
	
	
	@PostConstruct
	public void init() {
		
		user = new User();
		listUsers = new ArrayList<User>();
		listUsers = userService.getAll();
		
	}
	
	public void addUser() {
		
		userService.add(user);
		listUsers.add(user);
		user = new User();
	}
	
	public void deleteUser() {
		
		userService.delete(user);
	}
	
	public void updateUser() {
		
		userService.update(user);
	}
	
	public List<User> getAllUsers() {
		
		return userService.getAll();
	}
	
	

}

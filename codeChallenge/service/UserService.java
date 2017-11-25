package com.codeChallenge.service;


import java.util.List;



import com.codeChallenge.model.User;

/**
 * 
 * @author Sara
 *
 */
public interface UserService {
	
	public void add(User u);
	public void update(User u);
	public void delete(User u);
	public List<User> getAll();
	
	

}

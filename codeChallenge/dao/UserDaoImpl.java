package com.codeChallenge.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.codeChallenge.model.User;

/**
 * 
 * @author Sara
 *
 */

@Repository
@Qualifier("userDao")
public class UserDaoImpl implements UserDao {
	
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	final String COLLECTION = "users";
	
	
	

	@Override
	public void add(User u) {

		mongoTemplate.insert(u);
	}

	@Override
	public void update(User u) {

		mongoTemplate.save(u);
	}

	@Override
	public void delete(User u) {

		mongoTemplate.remove(u);
	}

	@Override
	public List<User> getAll() {

		return mongoTemplate.findAll(User.class);
	}
	
	

}

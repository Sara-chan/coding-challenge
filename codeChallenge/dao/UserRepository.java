package com.codeChallenge.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.codeChallenge.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	User findByUsername(String username);

}

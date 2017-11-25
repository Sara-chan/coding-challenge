package com.codeChallenge.dao;

import java.net.UnknownHostException;
import java.util.List;

import com.codeChallenge.model.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

/**
 * 
 * @author Sara
 *
 */
@Configuration
public class MongoDB {

	@Autowired
	MongoTemplate mongoTemplate;


	public static void main(String[] args) throws UnknownHostException {
		
  
		@SuppressWarnings("resource")
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB dB = (DB) mongoClient.getDatabase("test");
        DBCollection col = dB.getCollection("users");
		BasicDBObject basicObject = new BasicDBObject();
		basicObject.put("email", "sara@gmail.com");
		basicObject.put("password", "sara");
		col.insert(basicObject);
		DBCursor dbCursor = col.find(basicObject);
		while(dbCursor.hasNext()) System.out.println(dbCursor.next());
		

	
	}

}

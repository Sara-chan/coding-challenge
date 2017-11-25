package com.codeChallenge.dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("mongolab2")
public class MongoLabConfiguration {

    @Bean
    public MongoClient mongoClient() throws MongoException, UnknownHostException {
        return new MongoClient(new MongoClientURI(System.getenv("MONGOLAB_URI")));
    }
}

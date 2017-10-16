package com.stackroute.spring.Hackathon.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stackroute.spring.Hackathon.Domain.UserModel;
import com.stackroute.spring.Hackathon.Repository.UserRepository;


@Service
public class GitService_db implements GitService {

	@Autowired
	private UserRepository userDetails;
	
	// Getters and Setters for UserRepository fields
		
	public UserRepository getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserRepository userDetails) {
		this.userDetails = userDetails;
	}

	// Method to save a new user into User Repository
	
	public UserModel addUser(UserModel user){
		userDetails.save(user);	
		return user;
	}
	
	// Method to save a get a user by its id from User Repository	
	
	
	public UserModel getUserbyId(String id){
		return userDetails.findOne(id);
	}

	// Method to get all users from User Repository

	public Iterable<UserModel> allUser(){
		return userDetails.findAll();
	}

	// Method to update a user by its id from User Repository
	
	public void updateUserbyId(String id, UserModel user) {
		userDetails.save(user);
	}

	// Method to delete a user from User Repository by its id	

	public void DeletebyId(String id) {
		userDetails.delete(id);
	}
}

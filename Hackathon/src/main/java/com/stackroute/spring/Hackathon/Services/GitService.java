package com.stackroute.spring.Hackathon.Services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stackroute.spring.Hackathon.Domain.UserModel;


public interface GitService {
	
	public  UserModel addUser(UserModel user);
	
	public  UserModel getUserbyId(String id);
	
	public  void updateUserbyId(String id,UserModel user);	
	
	public  Iterable<UserModel> allUser();
	
	public  void DeletebyId(String id);

}

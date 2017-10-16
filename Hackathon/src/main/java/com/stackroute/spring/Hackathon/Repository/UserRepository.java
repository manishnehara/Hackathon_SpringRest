package com.stackroute.spring.Hackathon.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.spring.Hackathon.Domain.UserModel;


// This will be AUTO IMPLEMENTED by Spring into a Bean called UserRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<UserModel, String> {
	
}



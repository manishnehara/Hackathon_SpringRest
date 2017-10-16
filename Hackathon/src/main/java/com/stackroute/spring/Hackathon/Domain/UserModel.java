package com.stackroute.spring.Hackathon.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class UserModel {
	
	@Id
	@ApiModelProperty(notes = "The database generated user ID")
	private String id;
	
	@NotNull
	@ApiModelProperty(notes = "The database generated user name")
	private String name;
	
	@NotNull
	@ApiModelProperty(notes = "The database generated user email")
	private String email;
	public UserModel(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public UserModel() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	


}

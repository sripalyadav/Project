package com.sripal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="User_Reg")
public class User {
	
	@Id
	@NotEmpty(message="Enter the Id")
	@GenericGenerator(name="user_seq",strategy="com.sripal.Generator.User_Generator")
	@GeneratedValue(generator="user_seq")
	private String UserId;
	
	@NotBlank(message="Enter The First Name")
	private String FirstName;
	@NotBlank(message="Enter The Last Name")
	private String LastName;
	@javax.validation.constraints.Email
	@NotBlank(message="Enter The EMail")
	private String Email;
	
	@NotBlank(message="Enter The Password")
	private String Password;
	
	@NotBlank(message="Enter The Gender")
	private String Gender;
	@NotBlank(message="Enter The Dob")
	private String dob;
	
	@NotNull(message="Enter mobile number")
	private Long Mobile;
	@NotBlank(message="Enter Aadress")
	private String Address;
	
	

}

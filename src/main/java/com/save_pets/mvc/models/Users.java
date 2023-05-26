package com.save_pets.mvc.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="users")
public class Users {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long rut;
	private String address;
	private String email;
	private String password;
	 @Transient
	    private String passwordConfirmation;
	private Long phoneNumber;
	
	
	

}

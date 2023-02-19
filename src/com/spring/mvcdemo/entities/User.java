package com.spring.mvcdemo.entities;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

	private String name;
	
	@NotNull(message = "Password is required.")
	@Size(min=1,message = "Password is required.")
	private String password;
	
	private String country;
	private String nativeLanguage;

	public User() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getNativeLanguage() {
		return nativeLanguage;
	}

	public void setNativeLanguage(String nativeLanguage) {
		this.nativeLanguage = nativeLanguage;
	}

	
}

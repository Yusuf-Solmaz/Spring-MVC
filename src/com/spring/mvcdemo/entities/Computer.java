package com.spring.mvcdemo.entities;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Computer {

	@NotNull(message = "is required")
	@Size(min =1,message = "is required" )
	private String brand;
	
	private String ramCapacity;

	public Computer() {
		
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getRamCapacity() {
		return ramCapacity;
	}

	public void setRamCapacity(String ramCapacity) {
		this.ramCapacity = ramCapacity;
	}
	
	
}

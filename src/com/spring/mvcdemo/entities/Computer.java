package com.spring.mvcdemo.entities;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Computer {

	@NotNull(message = "is required")
	@Size(min =1,message = "is required" )
	private String brand;
	
	private String ramCapacity;
	
	@Min(value = 0,message = "min is 0")
	@Max(value = 120, message = "max is 120")
	private String displayCardCapacity;

	@NotNull(message = "is required")
	@Pattern(regexp = "^[a-zA-Z0-9]{11}",message = "Serial number must be 11 digits.")
	private String serialNumber;
	


	public Computer() {
		
	}
	
	public String getDisplayCardCapacity() {
		return displayCardCapacity;
	}

	public void setDisplayCardCapacity(String displayCardCapacity) {
		this.displayCardCapacity = displayCardCapacity;
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
	
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
}

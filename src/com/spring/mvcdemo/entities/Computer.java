package com.spring.mvcdemo.entities;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.spring.mvcdemo.validation.MyValidation;

public class Computer {

	@NotNull(message = "is required")
	@Size(min =1,message = "is required" )
	private String brand;
	
	private int ramCapacity;
	
	@NotNull(message = "is required")
	@Min(value = 0,message = "min is 0")
	@Max(value = 120, message = "max is 120")
	private Integer displayCardCapacity;

	@NotNull(message = "is required")
	@Pattern(regexp = "^[a-zA-Z0-9]{11}",message = "Serial number must be 11 digits.")
	private String serialNumber;
	

	@MyValidation
	@NotNull(message = "is required")
	private String displayCardBrand;

	public Computer() {
		
	}
	
	public Integer getDisplayCardCapacity() {
		return displayCardCapacity;
	}

	public void setDisplayCardCapacity(Integer displayCardCapacity) {
		this.displayCardCapacity = displayCardCapacity;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getRamCapacity() {
		return ramCapacity;
	}

	public void setRamCapacity(Integer ramCapacity) {
		this.ramCapacity = ramCapacity;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getDisplayCardBrand() {
		return displayCardBrand;
	}

	public void setDisplayCardBrand(String displayCardBrand) {
		this.displayCardBrand = displayCardBrand;
	}

	public void setRamCapacity(int ramCapacity) {
		this.ramCapacity = ramCapacity;
	}
}

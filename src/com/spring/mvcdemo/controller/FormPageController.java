package com.spring.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormPageController {

	
	@RequestMapping("/showForm")
	public String showForm() {
		return "my-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "info";
	}
	
}

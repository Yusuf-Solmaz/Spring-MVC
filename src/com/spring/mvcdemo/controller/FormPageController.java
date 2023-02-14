package com.spring.mvcdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("uperProcessForm")
	public String uperProcessForm(HttpServletRequest httpServletRequest, Model model) {
		
		String newName = httpServletRequest.getParameter("myName");
		
		String upperName = newName.toUpperCase();
		
		model.addAttribute("upperName",upperName);
		
		return "info";
	}
}

package com.spring.mvcdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	/*@RequestMapping("uperProcessForm")
	public String uperProcessForm(HttpServletRequest httpServletRequest, Model model) {
		
		String newName = httpServletRequest.getParameter("myName");
		
		String upperName = newName.toUpperCase();

		int newNumber = Integer.parseInt(httpServletRequest.getParameter("myNumber"));
		
		int addedNumber = newNumber+5;
		
		model.addAttribute("addedNumber",addedNumber);
			
		model.addAttribute("upperName",upperName);
		
		return "info";
	}*/
	
	@RequestMapping("uperProcessForm")
	public String upperProcessForm(@RequestParam("myName") String theName,@RequestParam("myNumber") int theNumber, Model model) {
		String upperName= theName.toUpperCase();
		int newNumber = 5 + theNumber;
		model.addAttribute("upperedName",upperName);
		model.addAttribute("increasedNumber",newNumber);
		return "info";
	}
	
}

package com.spring.mvcdemo.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvcdemo.entities.User;

@Controller
@RequestMapping("/user")
public class UserController {

	
	
	@InitBinder
	public void InitBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/showUserForm")
	public String showUserAdd(Model model) {
		User user = new User();
		
		model.addAttribute("user",user);
		return "user-add";
	}
	
	
	@RequestMapping("/userAdd")
	public String userAdd(@Valid @ModelAttribute("user")User user, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "user-add";
		}
		else {
			return "user-confirmation";
		}
		
	}
}

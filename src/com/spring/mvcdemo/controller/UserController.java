package com.spring.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvcdemo.entities.User;

@Controller
@RequestMapping("/user")
public class UserController {

	
	@RequestMapping("/showUserForm")
	public String showUserAdd(Model model) {
		User user = new User();
		
		model.addAttribute("user",user);
		return "user-add";
	}
	
	
	@RequestMapping("/userAdd")
	public String userAdd(@ModelAttribute("user")User user) {
		return "user-confirmation";
	}
}

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

import com.spring.mvcdemo.entities.Computer;


@Controller
@RequestMapping("computer")
public class ComputerController {
	
	@InitBinder
	public void InitBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	

	@RequestMapping("show")
	public String ShowAction(Model model) {
		
		model.addAttribute("computer",new Computer());
		return "computer-add";
	}
	
	@RequestMapping ("computerAdd")
	public String addComputer(@Valid @ModelAttribute("computer")Computer computer,BindingResult bindingResult){
		
		if (bindingResult.hasErrors()) {
			return "computer-add";
		}
		else {
			return "computer-confirm";
		}
	}
	
}

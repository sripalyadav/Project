package com.sripal.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sripal.entity.User;
import com.sripal.service.UserService;

import lombok.val;

@Controller
public class UserController {
	
	@Autowired
	private UserService userserv;
	
	@GetMapping("/regform")
	public String loadRegistration_page(Model model,User user) {

		return"reg";
	}
	
	@PostMapping("/Save")
	public String Handle_Sbmt_btn(@Valid@ModelAttribute("user") User user, BindingResult br,Model model) {

		if(br.hasErrors()) {
			return"reg";
		}
			
			 userserv.saveUser(user);
			System.out.println(user);	
				return"redirect:/regform";
		}
		
            
	}



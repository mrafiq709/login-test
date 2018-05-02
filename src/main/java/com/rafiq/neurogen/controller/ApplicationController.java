package com.rafiq.neurogen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rafiq.neurogen.model.PersonForm;

@Controller
public class ApplicationController {

	@GetMapping("/welcome")
	public String LoginGet(Model model) {
		model.addAttribute("data", new PersonForm());
		return "login";
	}
	@PostMapping("/welcome")
	public String LoginPOST(Model model, @ModelAttribute("data") PersonForm personData) {
		System.out.println("Testing posted data...");
		System.out.println(personData.getEmail());
		System.out.println(personData.getPassword());
		model.addAttribute("data", personData);
		return "form_data";
	}
	
	@PostMapping("/logout")
	public String LogOut() {
		System.out.println("########## ok ###########");
		return "login";
	}
}

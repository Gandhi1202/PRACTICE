package com.webmvc.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class UserController {
	@GetMapping("/")
	public String setValues(Model model)
	{
		User user= new User();
		model.addAttribute("user", user);
		return "jindex";
	}
	
@PostMapping("register")
public String getData(@Valid User user,BindingResult result, Model model) {
	if(result.hasErrors())
	{
		return "jindex";
	}
	System.out.println(user);
	model.addAttribute("regi", "Registration is succesfull");
	
	return "jsuccess";	
}
}

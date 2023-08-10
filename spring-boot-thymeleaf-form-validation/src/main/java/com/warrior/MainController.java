package com.warrior;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	@GetMapping("/register")
	public String showForm(Model model) {
		User user=new User();
		model.addAttribute("user",user);
		
		List<String> list=Arrays.asList("Developer","Designer","Architect");
		model.addAttribute("list",list);
		
		return "register_form";	
	}
	@PostMapping("/register")
	public String submitForm(@Valid @ModelAttribute("user")User user, BindingResult bindingResult){
		System.out.println(user);
		if(bindingResult.hasErrors()) {
			return "register_form";
		}
		else {
		return "register_success";
		}
		
	}

}

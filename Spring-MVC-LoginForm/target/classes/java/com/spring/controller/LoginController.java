package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String inti(Model model) 
	{
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "login";
	}

@RequestMapping(method=RequestMethod.POST)
public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean) 
     {
	if(loginBean !=null && loginBean.getUseername() !=null & loginBean.getPassword() != null) {
		if (loginBean.getUseername().equals("deepu") && loginBean.getPassword().equals("nani@777")){
			model.addAttribute("msg", loginBean.getUseername());
			return "success"; 
	}
		else 
		{
			model.addAttribute("error", "invalid details");
			return "login";
		}
		
	}
	return "model";
	
	}
}

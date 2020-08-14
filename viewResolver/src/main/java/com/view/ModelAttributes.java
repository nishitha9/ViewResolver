package com.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Controller
public class ModelAttributes {
	
	
	
	@RequestMapping("/ModelAttribute")
	public String ModelAttribute(/*@ModelAttribute ("message") CreateProduct product*/)
	{
		return "result";
	}
	
	@ModelAttribute
	public void sampleMethod(Model model)
	{
		
		model.addAttribute("methodname","Model Attribute is been printed");
	}

}

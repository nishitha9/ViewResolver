package com.view;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
@RequestMapping("/main")
public class XmlViewResolverEg {
	
	@RequestMapping("/xmlViewResolver")
	@ResponseBody
	public String display(@RequestParam("name")String name, ModelMap mp)
	{
		
		mp.addAttribute("ResponseType", "XMLViewResolver Printed");
		//return "xmlViewResolver";
		return "Hello " + name;
	}
	@RequestMapping("/InternalView/{name}")
	public String display1(@PathVariable("name") String name, ModelMap mp)
	{
		mp.addAttribute("ResponseType", "Internal View Printed");
		mp.addAttribute("name",name);
		return "InternalView";
	}
}

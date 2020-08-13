package com.view;

import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.simple.*;

@Controller
public class JSONResponseViewer extends HttpServlet{
	
	
	@RequestMapping("/JSONResponseViewer")
	@ResponseBody
	public  String display() throws JsonProcessingException
	{
		ObjectMapper mapper =new ObjectMapper();
		
		
		CreateProduct c=new CreateProduct();
		c.name="round ball";
		c.no=102;
		c.features="A round white color bounce ball";
		
		String jsonString=mapper.writeValueAsString(c);
		
		System.out.println(jsonString);
		return jsonString;
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("/JSONResponseViewerSimple")
	@ResponseBody
	public String jsonResponse(HttpServletRequest request, HttpServletResponse response)
	{
	//	response.setContentType("application/json");
		
		JSONObject json=new JSONObject();

		
		json.put("name","Nishitha");
		json.put("Value",101);
		JSONArray arr=new JSONArray();
		arr.add(12);
		arr.add(34);
		arr.add("hey");
		json.put("arrayList",arr);
		
		CreateProduct c=new CreateProduct();
		c.setName("ToyCar");
		c.setNumber(101);
		c.setFeatures("A car with battery control");
		
		json.put("Toycar",c);
		ArrayList<Object> arr1= (ArrayList<Object>) json.get("arrayList");
		System.out.println(arr1.get(2));
		System.out.println(json.get("name"));
		System.out.println(json.get("arrayList"));
		return json.toJSONString();
	}
	

} 

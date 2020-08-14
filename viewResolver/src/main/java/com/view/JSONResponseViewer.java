package com.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

		//Adding elements and array values
		
		json.put("name","Nishitha");
		json.put("Value",101);
		JSONArray arr=new JSONArray();
		arr.add(12);
		arr.add(34);
		arr.add("hey");
		json.put("arrayList",arr);
		
		//creating class object
		CreateProduct c=new CreateProduct();
		c.setName("ToyCar");
		c.setNumber(101);
		c.setFeatures("A car with battery control");
		
		json.put("Toycar",c);
		ArrayList<Object> arr1= (ArrayList<Object>) json.get("arrayList");  //JSONString to java object 
		
		//Creating and adding map . 
		
		Map<String,Object> hashmap=new HashMap<String,Object>();
		hashmap.put("name", "name1");
		hashmap.put("number", 1010);
		
		json.put("Map", hashmap);
		
		String jsonString=JSONValue.toJSONString(hashmap);
		
		System.out.println(jsonString);
		System.out.println(arr1.get(2));
		System.out.println(json.get("name"));
		System.out.println(json.get("arrayList"));

		
		
		
		return json.toString();
	}
	

} 

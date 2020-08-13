package com.view;

public class CreateProduct {
	
	String name;
	int no;
	String features;
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 
	 public void setFeatures(String features)
	 {
		this.features=features;
	 }
	 
	 public void setNumber(int no)
	 {
		 this.no=no;
	 }
	 @Override
	public String toString()
	{
		return "Name : " + name+ " " + "features: " + features + " "+ " Model Number: " + no;
	} 
	
	
	
}

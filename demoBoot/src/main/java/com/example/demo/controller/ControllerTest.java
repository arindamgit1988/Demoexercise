package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest 
{
	//System.out.println("Inside Con");
	
  @RequestMapping("testweb")
   public String testweb() 
   {
	  
		   System.out.println("Hellllllllllo");
		   return "index";
		   
	
}
}

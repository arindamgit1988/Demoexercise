package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.services.Loginservice;
import com.example.demo.services.LoginserviceIMPL;

@Controller
public class LoginController 
{
	@Autowired
	Loginservice lg;
	@Autowired
	LoginserviceIMPL lip;
	
	
	//Destination Folder: C:\oraclexe\
	//Oracle Home: C:\oraclexe\app\oracle\product\11.2.0\server\
	//Oracle Base:C:\oraclexe\
	//Port for 'Oracle Database Listener': 1521
	//Port for 'Oracle Services for Microsoft Transaction Server': 2030
	//Port for 'Oracle HTTP Listener': 8080
	//http://127.0.0.1:8011
	//jdbc:oracle:thin:@127.0.0.1:8011:demo","system","arindam" XE
	
@RequestMapping("login")
public ModelAndView login(@RequestParam("t1") String un,@RequestParam("p1") String pass)//@RequestParam("t1") String un,@RequestParam("p1") String pass
{
	
	ModelAndView mv = new ModelAndView();
	mv.addObject("t1", un);
	mv.addObject("p1", pass);
	lg.setUser(un);
	lg.setPass(pass);
	boolean page = false;
	if(lip.success())
	{
		mv.setViewName("success");
	}
	else
	{
		mv.setViewName("index");

	}
	return mv;
}
}

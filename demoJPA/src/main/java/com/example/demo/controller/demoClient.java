package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.DemoEntity;
import com.example.demo.entity.demoEntObj;
import com.example.demo.service.StudentServ;

@Component
public class demoClient 
{
	String URL = "demo/{id}/"+"hello/";
	//ServiceController srv;
	@Autowired
	StudentServ srs;
	
    public demoEntObj clientDemo(String id)
    {
    	System.out.println("InSide Client " +id);
    	String URL = "demo/{id}/"+"hello/";
    	return srs.findName(id);
	  
    }
}

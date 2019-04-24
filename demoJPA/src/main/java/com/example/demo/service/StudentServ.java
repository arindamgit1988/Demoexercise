package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.controller.demoClient;
import com.example.demo.dao.StudentDao;
import com.example.demo.entity.DemoEntity;
import com.example.demo.entity.Student;
import com.example.demo.entity.demoDTO;
import com.example.demo.entity.demoEntObj;

import java.util.List;

@Component
public class StudentServ 
{
	@Autowired
    StudentDao dao;
	
	//Student s;
	
	@Autowired
	demoDTO ddto;
	@Autowired
	demoEntObj doj;
	@Autowired
	DemoEntity dt;
	
	@Autowired
	demoClient cd;
	
	public demoDTO searchService(String id)
	{
		ddto.setId(id);
		cd.clientDemo(id);
		String repoName = ddto.getRepoName();
		return ddto;
		
	}
  
	public demoEntObj findName(String id)
	{
		
		doj.getDemoentity().setId(id);
		String repoName = doj.getDemoentity().getRepoName();
		ddto.setRepoName(repoName);
		return doj;
	}
}

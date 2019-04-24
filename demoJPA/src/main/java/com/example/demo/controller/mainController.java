/*package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import com.example.demo.entity.University;
import com.example.demo.service.StudentServ;

@Controller
public class mainController 
{
	@Autowired
    Student s;
	
	@Autowired
	StudentDao sd;
	
	@Autowired
	StudentServ ss;
	
	@Autowired
	University uni;
	
	 @RequestMapping("/")
	   public String testweb() 
	   {
		  
			   System.out.println("Hellllllllllo");
			   return "add.jsp";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("name") String name,@RequestParam("tech") String tech,@RequestParam("reg") int reg,@RequestParam("mob") int mob,@RequestParam("unid") int unid )
	{
		s.setName(name);
		s.setTech(tech);
		s.setReg(reg);
		s.setMob(mob);
		//uni.setUnid(unid);
		
		uni.setUnid(unid);
		//s.getUni().se
		
		s.setUni(uni);
		
		System.out.println("detail  "+uni);
		
		sd.save(s);
		
		return "success.jsp";
	}
	
	@RequestMapping("search")
	public ModelAndView search(@RequestParam("reg1") int reg)
	{
		s.setReg(reg);
		System.out.println("inside MV "+s.getReg());
		
		ModelAndView mv = new ModelAndView();
		List<Student> s1 = ss.searchService(s.getReg());
		System.out.println("In ModelandView"+s1.get(0));
		Iterator<Student> iterator=s1.iterator();
		while(iterator.hasNext())
		{
			s=iterator.next();
			mv.addObject("Informations",s.getName());
			mv.addObject("registration", s.getReg());
			mv.addObject("clgname", s.getUni().getUname());
			System.out.println("college "+s.getUni());
			break;
		
		}
		
		mv.setViewName("success.jsp");
	
		return mv;
	}
	
}*/

package com.example.demo.controller;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentDao;
import com.example.demo.dao.UniversityDao;
import com.example.demo.entity.Student;
import com.example.demo.entity.University;
import com.example.demo.entity.demoEntObj;
import com.example.demo.service.StudentServ;

@RestController
public class ServiceController 
{
 @Autowired
  StudentDao sd;
 
@Autowired 
University un;
 
 @Autowired
 UniversityDao ud;
 
 @Autowired
 demoEntObj doj;
 
 @Autowired
 StudentServ srv;
 
 @Autowired
 demoClient dc;

 //Student std;
 
 @GetMapping("students")
 public List<Student> getAll()
 {
	 return (List<Student>)sd.findAll();
	 
 }
 
 
 
 @GetMapping("GetAllStudents/{reg}")
 public ResponseEntity<String> getAllResponse(@PathVariable("reg") int reg)
 {
	// return (List<Student>)sd.findAll();
	//return new ResponseEntity<List<Student>>((List<Student>)sd.findAll(), HttpStatus.OK);
	 List<Student>lst=new ArrayList<>();
	 lst = sd.findByReg(reg);
	 String name=null;
	 String mlt=null;
	 for (Student temp : lst) {
			
   name = temp.getName();
	mlt = temp.getUni().getUname();
			
	 } 
	 
	return ResponseEntity.status(HttpStatus.OK).body("The name is "+name+" and University is "+mlt);
	 
 }
 
 @GetMapping("students/{reg}")
 public List<Student> getOne(@PathVariable("reg") int reg)
 {
	 System.out.println(sd.findByReg(reg).toString());
	 return (List<Student>)sd.findByReg(reg);
 }
 
 @PostMapping("university/{unid}/student")
 public void addCourse(@RequestBody Student std,@PathVariable("unid") int unid)
 {
	/*std.setUni(new University(unid,"",""));
	 sd.save(std);*/
	 if(ud.existsById(unid))
	 {
		 System.out.println(unid);
		 un.setUnid(unid);
		 un.setAddr(" ");
		 un.setUname(" ");
		 std.setUni(un);
		 sd.save(std);
	 }
	 else
	 {
		 System.out.println("UnId Not Found");
	 }
 }
 
 @PutMapping("university/{unid}/student")
 public void updateCourse(@RequestBody Student std,@PathVariable("unid") int unid)
 {
	/*std.setUni(new University(unid,"",""));
	 sd.save(std);*/
	 if((ud.existsById(unid)) & sd.existsById(std.getReg()))
	 {
		 System.out.println(unid);
		 un.setUnid(unid);
		 un.setAddr(" ");
		 un.setUname(" ");
		 std.setUni(un);
		 sd.save(std);
	 }
	 else
	 {
		 System.out.println("UnId Not Found");
	 }
 }
 
 @GetMapping("university/{unid}/student")
 public List<Student> addAll(@PathVariable int unid)
 {
  List<Student> lst = new ArrayList<>();
  System.out.println(sd.findByUniUnid(unid).size());
  sd.findByUniUnid(unid).forEach(lst::add);
  //sd.saveAll(lst);
   return lst;
 }
 
 @GetMapping("university/{unid}")
 public List<University> getuni(@PathVariable("unid") int unid)
 {
	return ud.findByUnid(unid);
 }
 @GetMapping("university")
 public List<University> getAlluni()
 {
	return ud.findAll();
 }
 
 @GetMapping("demo/{id}")
 public String getName(@PathVariable("id") String id)
 {
	String repoName = srv.searchService(id).getRepoName();
	return repoName;
	
 }
 @GetMapping("demo/{id}/hello/")
 public String returnName(@PathVariable("id") String id)
 {
	demoEntObj doj = dc.clientDemo(id);
	System.out.println("Controller "+ doj.getDemoentity().getRepoName());
	return doj.getDemoentity().getRepoName();
	
 }

}

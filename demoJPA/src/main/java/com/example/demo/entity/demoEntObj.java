package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class demoEntObj 
{
	@Autowired
 DemoEntity demoentity;

public DemoEntity getDemoentity() {
	return demoentity;
}

public void setDemoentity(DemoEntity demoentity) {
	this.demoentity = demoentity;
}
 
	
}

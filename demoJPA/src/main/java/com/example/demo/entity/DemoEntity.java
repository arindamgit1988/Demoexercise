package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class DemoEntity 
{
 String id="112XYZ";
 String repoName="HelloWorld";
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getRepoName() {
	return repoName;
}
public void setRepoName(String repoName) {
	this.repoName = repoName;
}
 
}

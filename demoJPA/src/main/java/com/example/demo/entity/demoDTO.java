package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class demoDTO 
{
	 String id;
	 String repoName;
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

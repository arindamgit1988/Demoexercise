package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class Loginservice 
{
private String user,pass;

public String getUser() {
	return user;
}

public void setUser(String user) {
	this.user = user;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}


}

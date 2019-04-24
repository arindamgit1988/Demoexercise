package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginserviceIMPL 
{
@Autowired
Loginservice lgs;

public boolean success()
{
	if(lgs.getUser().equals("Arindam") && lgs.getPass().equals("kolkata"))
	{
		return true;
	}
	else
	{
	return false;
	}
}
}

package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity

public class Student 
{
String name;
String tech;
@Id
int reg;
int mob;


@OneToOne

public University uni;

public Student() {
	super();
}
/*public Student(String name, String tech, int reg, int mob, int unid) {
	super();
	this.name = name;
	this.tech = tech;
	this.reg = reg;
	this.mob = mob;
	this.uni = new University(unid,"","");
}*/
public University getUni() {
	return uni;
}
@JsonProperty("uni")
public void setUni(University uni) {
	this.uni = uni;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
public int getReg() {
	return reg;
}
public void setReg(int reg) {
	this.reg = reg;
}
public int getMob() {
	return mob;
}
public void setMob(int mob) {
	this.mob = mob;
}


}

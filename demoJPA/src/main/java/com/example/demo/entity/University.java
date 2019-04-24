package com.example.demo.entity;

import java.beans.ConstructorProperties;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Component

public class University 
{
 @Id
 int unid;
 String addr;
 String uname;



public University() {
	super();
}
/*public University(int unid, String addr, String uname)
{
	// TODO Auto-generated constructor stub
	this.unid=unid;
	this.addr=addr;
	this.uname=uname;
}*/
public int getUnid() {
	return unid;
}
public void setUnid(int unid) {
	this.unid = unid;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
@Override
public String toString() {
	return "University [unid=" + unid + ", addr=" + addr + ", uname=" + uname + "]";
}
 
 
 


}

package com.nit.dto;

import java.io.Serializable;


public class UserDTO implements Serializable{
private String user;
private String pwd;

public UserDTO() {
	System.out.println("UserDTO.UserDTO()");
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
}

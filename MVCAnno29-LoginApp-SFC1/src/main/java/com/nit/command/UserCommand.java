package com.nit.command;

public class UserCommand {
private String user;
private String  pwd;


public UserCommand() {
	System.out.println("UserCommand.UserCommand()");
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

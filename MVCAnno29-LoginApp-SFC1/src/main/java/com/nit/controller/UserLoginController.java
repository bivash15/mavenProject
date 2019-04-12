package com.nit.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nit.command.UserCommand;
import com.nit.dto.UserDTO;
import com.nit.service.UserService;

@Controller
public class UserLoginController {
	@Autowired
	private UserService service;

	
	@RequestMapping(value= "/login.htm",method=RequestMethod.GET)
	public String showForm(Map<String,Object> map,@ModelAttribute("userCmd") UserCommand cmd){
		System.out.println("UserLoginController.showForm()");
		
		return "login";
		
	}
	
@RequestMapping(value= "/login.htm",method=RequestMethod.POST)
public String processResult(Map<String,Object> map,@ModelAttribute("userCmd") UserCommand cmd){
	System.out.println("UserLoginController.processResult()");
	//copy cmd to dto
	UserDTO dto=new UserDTO();
	BeanUtils.copyProperties(cmd, dto);
	//use service
	String msg=service.validate(dto);
	map.put("msg", msg);
	return "login";
	
}
}

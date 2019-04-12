package com.nit.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nit.bo.UserBO;
import com.nit.dao.UserDAO;
import com.nit.dto.UserDTO;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO dao;
	@Override
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public String validate(UserDTO dto) {
		UserBO bo=new UserBO();
		//convert dto to bo
		BeanUtils.copyProperties(dto, bo);
		//use dao
		int count=dao.authenticate(bo);
		if(count==0)
			return "Invalid Credential";
		else
			return "Valid Credential::Logged In Successfully";
	}
}

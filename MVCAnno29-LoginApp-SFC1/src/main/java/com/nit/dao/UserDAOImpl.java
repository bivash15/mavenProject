package com.nit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nit.bo.UserBO;
@Repository
public class UserDAOImpl implements UserDAO {
	private static final String USER_LOGIN="SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD=?";
	
	@Autowired
	private JdbcTemplate jt;
	@Override
	public int authenticate(UserBO bo) {
		int count=jt.queryForObject(USER_LOGIN, Integer.class, bo.getUser(),bo.getPwd());
		return count;
	}

}

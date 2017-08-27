package com.qlth.bus;

import com.qlth.dao.UserDAO;

public class UserBUS {

	public boolean login(String username,String password){
		UserDAO u=new UserDAO();
		
		return u.login(username, password);
	}
}

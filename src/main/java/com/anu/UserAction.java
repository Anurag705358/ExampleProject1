package com.anu;

import com.opensymphony.xwork2.ModelDriven;

public class UserAction implements ModelDriven<User> {
	int check=-1;
	private User user;  
	public String execute() throws Exception {
		check=UserDao.saveUser(user);
		if(check==-1){
			return "error";
		}
		else
		return "success";
	}

	public User getModel() {
		// TODO Auto-generated method stub
		user=new User();
		return user;
	}
}

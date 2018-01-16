package com.anu;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Login extends ActionSupport implements SessionAware, ModelDriven<User> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	SessionMap<String, Object> sessionmap;

	private User user=new User();;  

	public String execute() {
		 
		LoginDao ld = new LoginDao();
		if (ld.validate(user)) {
			sessionmap.put("login", "true");
			sessionmap.put("email", user.getEmail());
			
			return SUCCESS;
		} else {
			return ERROR;
		}

	}

	public void setSession(Map<String, Object> map) {
		// TODO Auto-generated method stub
		sessionmap = (SessionMap<String, Object>) map;
		

	}

	public String logout() {
		if (sessionmap.size()==0) {
			return ERROR;
		}

		else {
			
			sessionmap.invalidate();
			return SUCCESS;

		}

	}
	public User getModel() {
		// TODO Auto-generated method stub
		
		return user;
	}

}

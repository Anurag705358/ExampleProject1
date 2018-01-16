package com.anu;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Profile extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	HttpServletRequest request = ServletActionContext.getRequest();
	HttpSession session = request.getSession();

	public String execute() {

		String s = (String) session.getAttribute("login");

		if (s == "true") {

			return SUCCESS;
		} else
			return ERROR;

	}

}

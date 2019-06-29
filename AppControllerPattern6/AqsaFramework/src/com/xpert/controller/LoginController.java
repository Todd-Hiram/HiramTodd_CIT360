package com.xpert.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.techzoo.aqsa.Controller;
import org.techzoo.aqsa.View;

public class LoginController implements Controller{

	@Override
	public View execute(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		return new View("/LoginUser.jsp");
	}
}
package com.niit.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.niit.daoimpl.UserDAOImpl;
import com.niit.model.User;

@Controller
public class IndexController 
{
	UserDAOImpl userDAO=new UserDAOImpl();
	
	@RequestMapping(value = {"","/","/index"})
	@ResponseBody
	public List<User> m1()
	{
		return userDAO.displayUsers();
	}
}

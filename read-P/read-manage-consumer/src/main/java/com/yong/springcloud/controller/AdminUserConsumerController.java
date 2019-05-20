package com.yong.springcloud.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yong.springcloud.entities.AdminUser;
import com.yong.springcloud.service.AdminUserClientService;



@Controller
public class AdminUserConsumerController {

	@Autowired
	private AdminUserClientService adminUserClientService;
	
	
	
	//adminlogin
	@RequestMapping(value="/consumer/login")
	public String login()
	{
		return "adminuser/login";
	}
	
	@RequestMapping(value="/consumer/adminuser/findUser")
	public String findUser( AdminUser loginUser,HttpServletRequest request) throws Exception
	{
		if (loginUser.getAusername() == null) {
			return "adminuser/login";
		}
		
		AdminUser dataUser = adminUserClientService.findUser(loginUser.getAusername());
		if(dataUser!=null) {
			if(dataUser.getAuserpwd().isEmpty())
			{
				return "adminuser/error";
			}
			if(dataUser.getAuserpwd().equals(loginUser.getAuserpwd())==false)
			{
				return "adminuser/error";
			}
			else {
				request.getSession().setAttribute("dataUser", dataUser);
				return "redirect:/consumer/menu";
			}
		}
		else {
			return "adminuser/error";
		}
		
	}
	
	@RequestMapping(value="/consumer/menu")
	public String menu()
	{
		return "menu";
	}
	
	@RequestMapping(value="/consumer/left")
	public String left()
	{
		return "left";
	}
	
	@RequestMapping(value="/consumer/top")
	public String top()
	{
		return "top";
	}
	
}

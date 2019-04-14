package com.yong.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yong.springcloud.entities.AdminUser;
import com.yong.springcloud.service.AdminUserService;
@RestController
public class AdminUserController {

	@Autowired
	private AdminUserService adminUserService;
	
	@RequestMapping(value="/adminUser/findUser/{ausername}",method=RequestMethod.GET)
	public AdminUser findUser(@PathVariable("ausername") String ausername) {

		return adminUserService.findUser(ausername);
	}
}

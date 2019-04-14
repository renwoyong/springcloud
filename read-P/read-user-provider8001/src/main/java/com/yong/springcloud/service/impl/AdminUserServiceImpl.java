package com.yong.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yong.springcloud.dao.AdminUserDao;
import com.yong.springcloud.entities.AdminUser;
import com.yong.springcloud.service.AdminUserService;
@Service
public class AdminUserServiceImpl implements AdminUserService{
	
	@Autowired
	private AdminUserDao admindao;

	@Override
	public AdminUser findUser(String ausername) {
		
		return admindao.findUser(ausername);
	}
	
	

}

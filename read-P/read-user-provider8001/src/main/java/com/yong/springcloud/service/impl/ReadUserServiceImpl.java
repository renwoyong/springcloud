package com.yong.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yong.springcloud.dao.ReadUserDao;
import com.yong.springcloud.entities.ReadUser;
import com.yong.springcloud.service.ReadUserService;
@Service
public class ReadUserServiceImpl implements ReadUserService{
	
	@Autowired
	  private ReadUserDao dao ;

	public boolean add(ReadUser user) {
		return dao.addUser(user);
	}

	public ReadUser get(Long userid) {
		
		return dao.findById(userid);
	}

	public List<ReadUser> list() {
		
		return dao.findAll();
	}
	
	public boolean upuser(ReadUser user)
	{
		return dao.upUser(user);
	}
	  
	public boolean delUser(Long userid)
	{
		return dao.delUser(userid);
	}

	@Override
	public ReadUser findUser(String username) {
		
		return dao.findUser(username);
	}

	@Override
	public boolean setvip(Long userid) {
		
		return dao.setvip(userid);
	}

	@Override
	public boolean cancalvip(Long userid) {
	
		return dao.cancalvip(userid);
	}
	
	
}

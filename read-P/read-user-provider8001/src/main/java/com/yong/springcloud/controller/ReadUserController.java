package com.yong.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yong.springcloud.entities.ReadUser;
import com.yong.springcloud.service.ReadUserService;

@RestController
public class ReadUserController {
	
	  @Autowired
	  private ReadUserService service;
	  
	  @RequestMapping(value="/readUser/add",method=RequestMethod.POST)
	  public boolean add(@RequestBody ReadUser user)
	  {
	   return service.add(user);
	  }
	  
	  @RequestMapping(value="/readUser/get/{userid}",method=RequestMethod.GET)
	  public ReadUser get(@PathVariable("userid") Long userid)
	  {
	   return service.get(userid);
	  }
	  
	  @RequestMapping(value="/readUser/list",method=RequestMethod.GET)
	  public List<ReadUser> list()
	  {
	   return service.list();
	  }
	  
	  @RequestMapping(value="/readUser/upUser",method=RequestMethod.POST)
	  public boolean upuser(@RequestBody ReadUser user) {
		  return service.upuser(user);
	  }
	  
	  @RequestMapping(value="/readUser/delUser/{userid}",method=RequestMethod.POST)
	  public boolean delUser(@PathVariable("userid") Long userid)
	  {
		  return  service.delUser(userid);
	  }
}

package com.yong.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yong.springcloud.entities.ReadUser;
@FeignClient(value = "read-user-provider8001")
public interface ReadUserClientService {
	  @RequestMapping(value = "/readUser/get/{userid}",method = RequestMethod.GET)
	  public ReadUser get(@PathVariable("userid") long userid);
	 
	  @RequestMapping(value = "/readUser/list",method = RequestMethod.GET)
	  public List<ReadUser> list();
	 
	  @RequestMapping(value = "/readUser/add",method = RequestMethod.POST)
	  public boolean add(ReadUser user);
	  
	  @RequestMapping(value = "/readUser/upUser",method = RequestMethod.POST)
	  public boolean upuser(ReadUser user);
	  
	  @RequestMapping(value = "/readUser/delUser/{userid}",method = RequestMethod.POST)
	  public boolean delUser(@PathVariable("userid") long userid);
	  
	  @RequestMapping(value="/readUser/findUser",method=RequestMethod.GET)
	  public ReadUser findUser(@RequestParam("username") String username);
	  
	}


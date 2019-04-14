package com.yong.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yong.springcloud.entities.AdminUser;
@FeignClient(value = "read-user-provider8001")
public interface AdminUserClientService {
	
	@RequestMapping(value = "/adminUser/findUser/{ausername}",method = RequestMethod.GET)
	  public AdminUser findUser(@PathVariable("ausername") String ausername);
}

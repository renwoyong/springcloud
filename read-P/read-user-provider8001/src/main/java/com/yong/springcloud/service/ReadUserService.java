package com.yong.springcloud.service;

import java.util.List;

import com.yong.springcloud.entities.ReadUser;

public interface ReadUserService {
	
	 public boolean add(ReadUser user);
	 
	  public ReadUser    get(Long userid);
	  
	  public List<ReadUser> list();
	  
	  public boolean upuser(ReadUser user);
	  
	  public boolean delUser(Long userid);
	  
	  public ReadUser findUser(String username);
	  
	  public boolean setvip(Long userid);
	  
	  public boolean cancalvip(Long userid);

}

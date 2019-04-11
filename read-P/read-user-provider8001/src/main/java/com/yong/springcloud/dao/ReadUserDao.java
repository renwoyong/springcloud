package com.yong.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yong.springcloud.entities.ReadUser;
@Mapper
public interface ReadUserDao {
	
	public boolean addUser(ReadUser user);
	 
	  public ReadUser findById(Long userid);
	 
	  public List<ReadUser> findAll();
	  
	  public boolean upUser(ReadUser user);

	  public boolean delUser(Long userid);
}

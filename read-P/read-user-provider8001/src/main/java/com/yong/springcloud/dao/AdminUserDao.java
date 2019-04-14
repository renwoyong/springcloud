package com.yong.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yong.springcloud.entities.AdminUser;
@Mapper
public interface AdminUserDao {

	public AdminUser findUser(String ausername);
}

package com.yong.springcloud.service;

import com.yong.springcloud.entities.AdminUser;

public interface AdminUserService {

	public AdminUser findUser(String ausername);
}

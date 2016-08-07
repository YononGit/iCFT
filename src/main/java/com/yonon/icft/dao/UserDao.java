package com.yonon.icft.dao;

import com.yonon.icft.model.User;

public interface UserDao {
	//用户登录
	public User getUser(User user);
	//用户注册
	public boolean addUser(User user);
	//检测用户名是否可用
	public User getUserByUsername(String name);
}

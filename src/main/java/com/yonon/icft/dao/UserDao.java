package com.yonon.icft.dao;

import com.yonon.icft.model.User;

public interface UserDao {
	public User getUser(User user);
	public boolean addUser(User user);
}

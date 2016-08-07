package com.yonon.icft.service;

import com.yonon.icft.model.User;

public interface UserService {
	public User getUser(User user);
	public boolean addUser(User user);
	public User getUserByUsername(String name);
}

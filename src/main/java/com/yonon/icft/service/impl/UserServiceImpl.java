package com.yonon.icft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonon.icft.dao.UserDao;
import com.yonon.icft.model.User;
import com.yonon.icft.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return userDao.getUser(user);
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	/* (non-Javadoc)
	 * @see com.yonon.icft.service.UserService#getUserByUsername(java.lang.String)
	 */
	@Override
	public User getUserByUsername(String name) {
		// TODO Auto-generated method stub
		return userDao.getUserByUsername(name);
	}

}

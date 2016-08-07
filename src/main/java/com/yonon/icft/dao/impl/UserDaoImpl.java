package com.yonon.icft.dao.impl;


import com.yonon.icft.dao.UserDao;
import com.yonon.icft.model.User;

public class UserDaoImpl implements UserDao {
	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		if (user == null)
			return false;
		else
			return false;
	}

	/* (non-Javadoc)
	 * @see com.yonon.icft.dao.UserDao#getUserByUsername(java.lang.String)
	 */
	@Override
	public User getUserByUsername(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}

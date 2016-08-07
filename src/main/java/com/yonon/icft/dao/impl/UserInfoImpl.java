package com.yonon.icft.dao.impl;

import com.yonon.icft.dao.UserInfoDao;
import com.yonon.icft.model.UserInfo;

public class UserInfoImpl implements UserInfoDao {

	UserInfo userInfo;
	/**
	 * 返回新增的用户信息表的id
	 * */
	@Override
	public int addUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfo.getId();
	}

	@Override
	public UserInfo getUserInfo(int id) {
		// TODO Auto-generated method stub
		return userInfo;
	}

}

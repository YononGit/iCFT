package com.yonon.icft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonon.icft.dao.UserInfoDao;
import com.yonon.icft.model.UserInfo;
import com.yonon.icft.service.UserInfoService;
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public int addUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return userInfoDao.addUserInfo(userInfo);
	}

	@Override
	public UserInfo getUserInfo(int id) {
		// TODO Auto-generated method stub
		return userInfoDao.getUserInfo(id);
	}

}

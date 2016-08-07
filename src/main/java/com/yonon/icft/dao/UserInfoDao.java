package com.yonon.icft.dao;

import com.yonon.icft.model.UserInfo;

public interface UserInfoDao {
	public int addUserInfo(UserInfo userInfo);
	public UserInfo getUserInfo(int id);
}

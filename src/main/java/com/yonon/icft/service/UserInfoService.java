package com.yonon.icft.service;

import com.yonon.icft.model.UserInfo;

public interface UserInfoService {
	public int addUserInfo(UserInfo userInfo);
	public UserInfo getUserInfo(int id);
}

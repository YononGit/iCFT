package com.yonon.icft.dao;

import com.yonon.icft.model.User;

public interface UserDao {
	//�û���¼
	public User getUser(User user);
	//�û�ע��
	public boolean addUser(User user);
	//����û����Ƿ����
	public User getUserByUsername(String name);
}

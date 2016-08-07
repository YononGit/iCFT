package com.yonon.icft.model;

public class User {
	private int id;
	private String name;
	private String psw;
	private int userInfoID;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPsw() {
		return psw;
	}
	public int getUserInfoID() {
		return userInfoID;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public void setUserInfoID(int userInfoID) {
		this.userInfoID = userInfoID;
	}
}

package com.eb.entity;

public class User {
	
	private int id;
	private String username;
	private String password;
	private String picname;
	private String picuuidname;
	public String getPicname() {
		return picname;
	}
	public void setPicname(String picname) {
		this.picname = picname;
	}
	public String getPicuuidname() {
		return picuuidname;
	}
	public void setPicuuidname(String picuuidname) {
		this.picuuidname = picuuidname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}

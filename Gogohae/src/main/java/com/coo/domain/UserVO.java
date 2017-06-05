package com.coo.domain;

import java.util.Date;

public class UserVO {
	
	private int uno;
	private String id;
	private String nick;
	private String email;
	private Date regdate;
	private Date updatedate;
	public int getUno() {
		return uno;
	}
	public void setUno(int uno) {
		this.uno = uno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	
	@Override
	public String toString() {
		return "UserVO [uno=" + uno + ", id=" + id + ", nick=" + nick + ", email=" + email + ", regdate=" + regdate
				+ ", updatedate=" + updatedate + "]";
	}
	
	

}

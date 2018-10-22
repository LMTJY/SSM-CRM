package com.pojo;

public class Customer {
	private int uid;
	private String uname;
	private Type hangye;
	private Type jibie;
	private String shouji;

	public String getShouji() {
		return shouji;
	}

	public void setShouji(String shouji) {
		this.shouji = shouji;
	}

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Type getHangye() {
		return hangye;
	}
	public void setHangye(Type hangye) {
		this.hangye = hangye;
	}
	public Type getJibie() {
		return jibie;
	}
	public void setJibie(Type jibie) {
		this.jibie = jibie;
	}

	public Customer(int uid, String uname, Type hangye, Type jibie, String shouji) {
		this.uid = uid;
		this.uname = uname;
		this.hangye = hangye;
		this.jibie = jibie;
		this.shouji = shouji;
	}

	public Customer() {
		super();
	}
	
}

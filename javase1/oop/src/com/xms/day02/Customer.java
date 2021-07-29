package com.xms.day02;

/**
 * 其中Customer类姓名、身份证号、联系电话、家庭地址等属性
    Customer类方法say()，返回String类型，返回他的个人信息。
 * @author Administrator
 *
 */
public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	long id;
	long telenum;
	public Customer(String f,String l) {
		this.firstName = f;
		this.lastName = l;
	}
	String path;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getTelenum() {
		return telenum;
	}
	public void setTelenum(long telenum) {
		this.telenum = telenum;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
}

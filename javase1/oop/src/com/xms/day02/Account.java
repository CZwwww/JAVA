package com.xms.day02;

/**
 * 编程3：
定义银行账户类Account，属性：卡号cid，余额balance，所属用户Customer   
银行账户类Account方法：
（1getInfo()，返回String类型，返回卡的详细信息
（2取钱方法withdraw()，参数自行设计，如果取钱成功返回true，失败返回false
（3存钱方法save()，参数自行设计，如果存钱成功返回true，失败返回false
   
其中Customer类姓名、身份证号、联系电话、家庭地址等属性
    Customer类方法say()，返回String类型，返回他的个人信息。

在测试类Bank中创建银行账户类对象和用户类对象，并设置信息，与显示信息
 * @author Administrator
 *
 */
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	public Account() {
		
	}
	public Account(int id,double balance,double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate =
				annualInterestRate;
	}
	
	Customer customer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	void getInfo() {
		System.out.println("cid:"+id+"balance:");
	}
	boolean withdraw(int num) {
		if(num>0&&balance>=num) {
			balance -=num;
			return true;
		}
			return false;
	}
	boolean deposit(double money) {
		if(money>0) {
			balance += money;
			return true;
		}
		return false;
	}
}

package com.xms.day02;
/**
 * 如果（取款金额<账户余额， 
可直接取款 
如果（取款金额>账户余额， 
计算需要透支的额度 
判断可透支额 overdraft 是否足够支付本次透支需要，如果可以 
	将账户余额修改为 0，冲减可透支金额 
如果不可以 
	提示用户超过可透支额的限额 
 * @author Administrator
 *
 */
public class AccountCheck extends Account{
	private int overdraft;
	@Override
	
	public boolean withdraw(int num) {
		if(num<getBalance()) {//取钱小于余额
			return super.withdraw(num);
		}
		if(num>getBalance()&&num-getBalance()<overdraft) {//取钱大于余额但超出部分没有超出透支额度
			overdraft-=(num-getBalance());
			setBalance(0);
			return true;
		}
		System.out.println("超过透支限额");
		return false;
	}
	//constructor with non parameter
	public AccountCheck() {
		super();
		// TODO Auto-generated constructor stub
	}
	//有参构造器
	public AccountCheck(int id, double balance, double annualInterestRate,int overdraft) {
		super(id, balance, annualInterestRate);
		// TODO Auto-generated constructor stub
		this.overdraft = overdraft;
	}
	public int getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(int overdraft) {
		this.overdraft = overdraft;
	}
	
}

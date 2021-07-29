package com.xms.day02;

public class AccountTest {
	public static void main(String[] args) {
		AccountCheck ac = new AccountCheck(1122, 20000, 4.5, 5000);
		ac.withdraw(5000);
		printBO(ac);
		ac.withdraw(18000);
		printBO(ac);
		ac.withdraw(3000);
		printBO(ac);
	}
	static void printBO(AccountCheck ac) {
		System.out.println("余额:"+ac.getBalance()+",可透支额度"+ac.getOverdraft());
	}
}

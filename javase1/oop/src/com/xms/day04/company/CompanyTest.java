package com.xms.day04.company;

public class CompanyTest {
	public static void main(String[] args) {
		Lenovo l = new Lenovo(new Works() {
			
			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("开发新产品");
			}
		}, new Dept("开发部"));
		Lenovo l2 = new Lenovo(new Works() {
			
			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("销售新产品");
			}
		}, new Dept("销售部"));
		System.out.println(l.getDept().getName());
		l.getWorks().work();
		System.out.println(l2.getDept().getName());
		l2.getWorks().work();
	}
}

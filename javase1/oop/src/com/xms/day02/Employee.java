package com.xms.day02;

public class Employee extends Person{
	String office;
	double wage;
	String hiredate;
	
	private static final double MANAGER_BONUS = 2;
	private static final double NORMAL_BONUS = 1.5;
	Employee(){
		
	}
	public Employee(String office, double wage, String hiredate) {
		super();
		this.office = office;
		this.wage = wage;
		this.hiredate = hiredate;
	}
	public String getName() {
		return super.getName();
	}
	public Employee getInstance() {
		return new Employee();
	}
	public double submitBonus () {
		double bonusMulti = NORMAL_BONUS;
		if(this instanceof Manager)
			bonusMulti = MANAGER_BONUS;
		return wage*bonusMulti;		
	}
//	public static void testStatic() {//普通方法不能重写为静态方法
//		
//	}
//	public int testStatic() {//重写时返回类型不同不能编译
//		
//	}
}
class Manager extends Employee{

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String office, double wage, String hiredate) {
		super(office, wage, hiredate);
		// TODO Auto-generated constructor stub
	}
	
}

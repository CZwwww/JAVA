package com.xms.day04.company;

public class Lenovo {
	private Works works;
	private Dept dept;
	public Lenovo(Works works, Dept dept) {
		super();
		this.works = works;
		this.dept = dept;
	}
	public Works getWorks() {
		return works;
	}
	public void setWorks(Works works) {
		this.works = works;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
}
class Dept {
	private String name;

	public Dept(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

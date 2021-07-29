package com.xms.day02.westswim;

public class PersonTest {
	public static void main(String[] args) {
		Person tangseng = new Person("唐僧", 1.8, new Weapon("禅杖",20,50,"杖"), Person.REN_ZU);
		Person sunwukong = new Person("孙悟空", 1.7, new Weapon("金箍棒",13200,999,"棒"), Person.XIAN_ZU);
		Person baigujing = new Person("白骨精", 1.6, new Weapon("白骨爪",500,300,"爪"), Person.YAO_ZU);
		tangseng.skill();
		sunwukong.skill();
		baigujing.skill();
		System.out.println(tangseng.equals(sunwukong));
		System.out.println(tangseng.equals(baigujing));
		System.out.println(tangseng);
		
	}
}

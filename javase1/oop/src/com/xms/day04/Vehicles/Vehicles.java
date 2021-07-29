package com.xms.day04.Vehicles;
/**
 * 一个交通工具接口类Vehicles，work接口，
 * 有Horse类和Boat类分别实现Vehicles，创
 * 建交通工具工厂类，两个方法分别获得交通工
 * 具Horse和Boat；有Person类，有name和Vehicles
 * 属性，在构造器中赋值，实例化“唐僧”，一般情况下用Horse作
 * 为交通工具，遇到大河时用Boat作为交通工具。
 * @author Administrator
 *
 */
public interface Vehicles {
	void work();
}




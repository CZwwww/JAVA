package com.xms.day02.westswim;
/**
 * 1封装一个西游记人物类Person：包含私属性：姓名（name、身高（height、武器（weapon、种族（race，并提供访问器（get方法和修改器（set方法
2在测试类中实例化个对象：tangseng（唐僧、sunwukong（孙悟空、baigujing（白骨精，分别设置他们的种族为：人族、仙族、妖族
3在打印对象时，照例如：“姓名：孙悟空；种族：仙族”的格式在控制台输出信息。
4提供一个技能方法void skill()，这个方法根据当前对象name属性判断技能，如果是孙悟空，就打印“七十二变”，如果是唐僧，就打印“紧箍咒”，如果是白骨精，就打印“九阴白骨爪”，在测试类中调用这个方法。
5重写equals方法进行判断，如果种族属性是人族或者仙族，则返回true，如果是妖族，则返回false，在测试类中对孙悟空和唐僧进行比较，打印结果，对唐僧和白骨金进行比较，并打印结果。
 * @author Administrator
 *
 */
public class Person {
	public static final int XIAN_ZU = 0;
	public static final int YAO_ZU = 1;
	public static final int REN_ZU = 2;
	private String name;
	private double height;
	private Weapon weapon;
	private int race;
	public Person(String name, double height, Weapon weapon, int race) {
		super();
		this.name = name;
		this.height = height;
		this.weapon = weapon;
		this.race = race;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public int getRace() {
		return race;
	}
	public void setRace(int race) {
		this.race = race;
	}
	void skill() {
		if("孙悟空".equals(name))
			System.out.println("七十二变");
		if("唐僧".equals(name))
			System.out.println("紧箍咒");
		if("白骨精".equals(name))
			System.out.println("九阴白骨爪");
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null) {
			return false;
		}
		if(obj instanceof Person) {
			Person p = (Person)obj;
			return p.getRace()==0||p.getRace()==2;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weapon=" + weapon.toString() + ", race=" + race + "]";
	}
	
	
}
class Weapon{
	String name;
	int atk;
	int def;
	String type;
	public Weapon() {
		// TODO Auto-generated constructor stub
	}
	public Weapon(String name, int atk, int def, String type) {
		super();
		this.name = name;
		this.atk = atk;
		this.def = def;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Weapon [name=" + name + ", atk=" + atk + ", def=" + def + ", type=" + type + "]";
	}
	
	
}
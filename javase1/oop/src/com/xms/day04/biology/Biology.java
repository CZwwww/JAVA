package com.xms.day04.biology;
/**
 * 鸭嘴兽属于脊椎动物中的哺乳动物，太阳花属于植物中的种子植物，而鸭嘴兽和太阳花都属于生物。完成如下要求（共50分，每小题10分）：
1）设计一系列的接口来表示这些规范：生物?动物?脊椎动物?哺乳动物；生物?植物?种子植物，并且照箭头要求来继承；
2）生物都有呼吸方式，只有一个方法声明：void respirations();设计两个类，分别是鸭嘴兽和太阳花，分别实现生物接口的respirations方法，
执行方法可以分别输出：“鸭嘴兽是动物，需要呼吸氧气”，“太阳花是植物，可以吸收二氧化碳，呼出氧气”；
3）动物接口拥有方法声明：void run(),鸭嘴兽类可以实现方法，输出信息：“鸭嘴兽只两只脚，它可以用两只脚奔跑”
4）植物接口都有繁殖方法声明  void reproduction(),太阳花在实现reproduction方法时输出信息“太阳花可以用种子繁殖，也可以用枝条繁殖”
5)声明一个Test类作为测试，执行上述声明的所有方法；
 * @author Czw
 *
 */
public interface Biology {
	void respirations();
}
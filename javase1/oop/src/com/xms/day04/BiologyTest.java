package com.xms.day04;

import com.xms.day04.animal.Animal;
import com.xms.day04.animal.Cat;
import com.xms.day04.animal.Dog;
import com.xms.day04.animal.Platypus;
import com.xms.day04.biology.Biology;
import com.xms.day04.botany.SunnyFlower;

public class BiologyTest {
	public static void main(String[] args) {
		Biology b = new Platypus();
		Biology b1 = new SunnyFlower();
		Animal dog = new Dog();
		Animal cat = new Cat();
		b.respirations();
		b1.respirations();
		Platypus p = (Platypus)b;
		p.run();
		SunnyFlower s = (SunnyFlower)b1;
		s.reproduction();
		
		dog.shout();
		cat.shout();
	}
}

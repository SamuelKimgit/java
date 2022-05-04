package com.pcwk.oop07.poly;

public class ZooKeeper {

	void feed(Animal animal) {
		System.out.println(animal + "에게 고기 주기");
	}
// 다형성을 사용하여 Lion, Rabbit, Monkey 를 Animal안에 넣어 하나로 
//	void feed(Lion lion) {
//		System.out.println(lion + "에게 고기 주기");
//	}
//
//	void feed(Rabbit rabbit) {
//		System.out.println(rabbit + "에게 고기 주기");
//	}
//	
//	void feed(Monkey monkey) {
//		System.out.println(monkey + "에게 고기 주기");
//	}
}

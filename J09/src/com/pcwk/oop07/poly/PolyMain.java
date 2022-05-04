package com.pcwk.oop07.poly;

public class PolyMain {
	
	public static void main(String[] args) {
		Lion lion = new Lion(); // Lion인스턴스 생성
		ZooKeeper zooK = new ZooKeeper();
		
		zooK.feed(lion);		 // 사자에게 고기 주기
		zooK.feed(new Rabbit()); // 토끼에게 고기 주기
		zooK.feed(new Monkey()); // 원숭이에게 고기 주기
		
	}

}

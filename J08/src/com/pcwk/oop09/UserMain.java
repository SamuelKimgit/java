package com.pcwk.oop09;

public class UserMain {

	public static void main(String[] args) {
		User user01 = new User("영이",7);
		User user02 = new User("찰스",9);
		
		System.out.println("user01 :" + user01.name + ", " + user01.age);
		System.out.println("user02 :" + user02.name + ", " + user02.age);
		
		
	}
}

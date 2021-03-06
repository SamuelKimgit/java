package com.pcwk.oop10;

public class UserMain {

	public static void main(String[] args) {
		User user01 = new User("영이",7);
		User user02 = new User("찰스",9);
		
		System.out.println("user01 :" + user01.getName() + ", " + user01.getAge());
		System.out.println("user02 :" + user02.getName() + ", " + user02.getAge());
		
		User user03 = new User("성기훈",45);
		user03.setAge(46); // setter 값 변경
		System.out.println("user03 :" + user03.getName() + ", " + user03.getAge());
	}
}
//	user01 :영이, 7
//	user02 :찰스, 9
//	user03 :성기훈, 46

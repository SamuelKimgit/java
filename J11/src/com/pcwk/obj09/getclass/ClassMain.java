package com.pcwk.obj09.getclass;

public class ClassMain {

	public static void main(String[] args) {
		Card c01 = new Card("HEART",3);
		System.out.println(c01);
		
		// Class cObj = Card.class;
		try {
			Card c02 = Card.class.newInstance(); // default 생성자를 통해 객체 생성!
			
			System.out.println(c02);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException  e) {
			e.printStackTrace();
		}
		
		Class cObj = c01.getClass();
		// 클래스 이름
		System.out.println(cObj.getClass()); // class java.lang.Class
		System.out.println(cObj.toString()); // class com.pcwk.obj09.getclass.Card
		
	}
}
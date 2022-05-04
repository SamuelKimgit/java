package com.pcwk.oop10;

public class User {
	
	private String name;	// 이름
	private int age;		// 나이
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// setXXX() : 값 멤버변수 Setting
	// getXXX() : 값 멤버변수 가져오기
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) { // 데이터 정확성을 높이기 위해 if 작성
		if(age<=0) {
			System.out.println("나이는 0보다 커야한다.");
			return;
		}
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
}
//	user01 :영이, 7
//	user02 :찰스, 9


package com.pcwk.oop03;

public class InheritanceMain {
	
	public static void main(String[] args) {
		Student student = new Student(); // 학생 인스턴스 생성
		student.breath();	// Person의 breath() 메서드 호출
		student.learn();	// Student의 learn() 메서드 호출
		
		System.out.println("==================");
		
		Teacher teacher = new Teacher();
		teacher.eat();		// Person의 eat() 메서드 호출
		teacher.teach();	// Teacher의 teach() 메서드 호출
		
		
	}

}

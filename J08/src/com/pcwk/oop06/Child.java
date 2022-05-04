package com.pcwk.oop06;

public class Child extends Parent {
	int x = 20;
	void method() {
		System.out.println("x: "+x); // Child 클래스에서 int x 를 선언했기 때문에 Child x
		System.out.println("this.x=" + this.x); // Child의 x
		System.out.println("super.x=" + super.x); // Parent의 x
	}
}

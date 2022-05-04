package com.pcwk.oop07.poly;

public class Lion extends Animal {
// Cannot reduce the visibility of the inherited method from Object
// String toString() {  // toString()오류
// 접근지정자 입력
	public String toString() {
		return "사자";
	}

}

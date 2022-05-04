package com.pcwk.ed01;

public class EX08_InstanceOf {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		// 왼쪽에는 참조 변수를 오른쪽에는 클래스명을 두고 연산
		System.out.println("a instanceof A=>"+(a instanceof A)); 
		// a instanceof A=>true / 변수a는 Class A타입이다 true
		System.out.println("b instanceof A=>"+(b instanceof A)); 
		// b instanceof A=>true / B클래스는 A클래스에 상속 되어 있기 때문에 유효하다
		System.out.println("a instanceof B=>"+(a instanceof B)); 
		// a instanceof B=>false
		System.out.println("b instanceof B=>"+(b instanceof B)); 
		// b instanceof B=>true
	}
}

package com.pcwk.oop08.poly;

public class PolyCastingMain {

	public static void main(String[] args) {
//		형제간의 관계 : 형변형 불가
//		Type mismatch: cannot convert from Ambulance to FireEngine
//		FireEngine f = new FireEngine();
//		Ambulance a = new Ambulance();
//		f = a; 
		
		Car car = null;
		FireEngine fe01 = new FireEngine();
		FireEngine fe02 = new FireEngine();
		// 자손타입 -> 조상타입(Up-casting) : 형변형 생략 가능
		car = fe01; // OK
		car.drive();
		// car.water(); // 컴파일 오류
		
		// 조상타입 -> 자손타입(Down-casting) : 형변형 생략 불가능
		// fe02 = car;  error불가능 - 캐스팅시 가능.
		// Type mismatch: cannot convert from Car to FireEngine
		fe02 = (FireEngine)car;
		fe02.water(); // water! OK
		
	}
}

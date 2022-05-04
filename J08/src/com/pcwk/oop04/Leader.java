package com.pcwk.oop04;

public class Leader extends Student {
	
	public Leader() {
		System.out.println("Leader() default생성자");
	}
	
	void lead() {
		System.out.println("리드 한다.");
	}

	@Override		// Alt + Shift + S => 상단 Source 메뉴
	public void say() {
		System.out.println("선생님께 인사!");
	}
	
	
	// 오버라이딩
//	@Override
//	public void say() {
//		System.out.println("선생님께 인사!");
//	}
}

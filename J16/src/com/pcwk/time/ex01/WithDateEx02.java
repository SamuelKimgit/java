package com.pcwk.time.ex01;

import java.time.LocalDate;

public class WithDateEx02 {
	// 각 클래스에 필드 값들을 특정값으로 변경 할 수 있는 메서드
	// withXXX(int)
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("today: " + today); // today: 2022-02-24
		
		LocalDate newDay = today.withYear(1988) // LocalDate 이기에 ; 전까지 .이후 선언가능
								.withMonth(2)
								.withDayOfMonth(24);
		System.out.println(newDay); // 1988-02-24
		
	}

}

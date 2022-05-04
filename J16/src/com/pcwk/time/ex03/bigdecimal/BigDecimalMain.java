package com.pcwk.time.ex03.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalMain {
//	BigDecimal	
//	정확한 소수점 연산을 해야 할 때는 BicDecimal 클래스를 사용.
//	double과 long으로 소수점 연산을 할 때 오추가 나는 부분을 보완.
//	10진수를 2진수로 변환시 오차 발생!
	public static void main(String[] args) {
		double a = 24.3953;
		double b = 50.343998; 
				//window 계산기 : 74.739298
		
		System.out.println(a+b); // 74.73929799999999
		
		// 실수 -> 정수 * 10의 -n
		// unscaledValue x 10-scale)
		BigDecimal num01 = new BigDecimal(String.valueOf(b));
		BigDecimal num02 = new BigDecimal(String.valueOf(a));
		
		System.out.println(num01.add(num02)); // 74.739298
		
	}// main

}

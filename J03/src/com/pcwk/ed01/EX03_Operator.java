package com.pcwk.ed01;

public class EX03_Operator {
	// 비트 연산자 ( &, |, ^, ~ )
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		
//		0	0	0	0	0	1	0	1
//	  &	0	0	0	0	1	0	1	0
//====================================
//		0	0	0	0	0	0	0	0
		int result = num1 & num2;
		System.out.println("num1 & num2="+result); // num1 & num2=0

//		0	0	0	0	0	1	0	1
//	  |	0	0	0	0	1	0	1	0
//====================================
//		0	0	0	0	1	1	1	1
		result = num1 | num2;
		System.out.println("num1 | num2="+result); // num1 | num2=15
		
//		0	0	0	0	0	1	0	1
//	  ^	0	0	0	0	1	0	1	0
//====================================
//		0	0	0	0	1	1	1	1		
		result = num1 ^ num2;
		System.out.println("num1 ^ num2="+result); // num1 ^ num2=15
	}
}

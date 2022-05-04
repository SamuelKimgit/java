package com.pcwk.loop;

import java.util.Scanner;

public class Q05_02 {
	public static void main(String[] args) {
//		Q1. 두 수를 입력받아 사칙 연산을 수행하는 프로그램을 작성 하세요.
//		(입력은 int로 받으세요. switch-case문으로 작성하세요)
		Scanner scanner = new Scanner(System.in);

		System.out.printf("num1을 입력하세요>>");
		int num1 = scanner.nextInt();
		
		System.out.printf("연산기호를 입력하세요>>");
		String operator = ""; // 연산자
		operator = scanner.next();
		// nextLint() : 위쪽 Enter에 영향을 받음.
		// --> next() 로 변경

		System.out.printf("num2을 입력하세요>>");
		int num2 = scanner.nextInt();
		
		double result = 0; // 연산결과
		
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / (double)num2;
			break;
		default:
			System.out.println("연산자를 확인 하세요.");
			return;
		}//switch
		System.out.println(num1 + (""+operator) + num2 + "=" + result);	
	}//main
}

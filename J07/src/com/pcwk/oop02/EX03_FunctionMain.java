package com.pcwk.oop02;

public class EX03_FunctionMain {
	// return이 필요하지 않을때는 void 사용
	public static void main(String[] args) {
		int first = 11;
		int second = 13;
		
		int sum = add(first, second);
		System.out.println(first + "+" + second + "=" + sum);
		
		int subtract = subtract(first, second);
		System.out.println(first + "-" + second + "=" + subtract);
		
		int multi = multiply(first, second);
		System.out.println(first + "*" + second + "=" + multi);
		
		double div = divide(first, second);
		System.out.println(first + "/" + second + "=" + div);
		
	}
	
	/**
	 * 나누기
	 * @param num1
	 * @param num2
	 * @return num1 / num2
	 */
	public static double divide(int num1, int num2) {
		return num1 / (double)num2; // num1 / (1.0*num2); <- int / double
	}
	
	/**
	 * 곱하기
	 * @param num1
	 * @param num2
	 * @return num1 * num2
	 */
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	/**
	 * 빼기
	 * @param num1
	 * @param num2
	 * @return num1 - num2
	 */
	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}

	/**
	 * 더하기
	 * @param num1
	 * @param num2
	 * @return num1 + num2
	 */
	public static int add(int num1, int num2) { // 
		int result = 0;
		
		result = num1 + num2;
		
		return result;
	}
	// ^ 오류가 없는 상태로 시작 가능.
}
//	11+13=24
//	11-13=-2
//	11*13=143
//	11/13=0.8461538461538461
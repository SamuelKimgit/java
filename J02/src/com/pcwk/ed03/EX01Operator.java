/**
 * 패키지: com.pcwk.ed03
 * 파일 : EX01Operator.java
 * 작성자: ITSC
 */
package com.pcwk.ed03;

public class EX01Operator {
//	산술 연산자	
//	 변수와 상수와 함께 사용하여 기본적인 계산을 할 수 있다.

	public static void main(String[] args) {
		int a = 10; // = 대입 연산자
		int b = 3;  // b에 3을 할당.
		
		System.out.println("a+b="+(a+b)); // a+b=13 
		System.out.println("a-b="+(a-b)); // a-b=7
		System.out.println("a*b="+(a*b)); // a*b=30
		System.out.println("a/b="+(a/b)); // a/b=3   int / int => int
		System.out.println("a%b="+(a%b)); // a%b=1   몫을 나눈 나머지값
	}
}

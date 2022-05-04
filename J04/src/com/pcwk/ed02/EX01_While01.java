package com.pcwk.ed02;
//	while문	
//	while문은 조건식을 검사하고 조건식이 참(true)이면 반복하고 
//	거짓(false)이면 while문 전체를 벗어난다.

public class EX01_While01 {
	public static void main(String[] args) {
		int num; // 숫자(증가)
		int sum; // 합계
		
		// 초기화
		num = 1;
		sum = 0;
		
		while(num<=1000) {
			sum = sum + num; // sum+=num;
			System.out.println(num);
			++num;			 // num = num + 1
		}// while
		System.out.println("sum="+sum);
		
	}//main
}

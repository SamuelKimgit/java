package com.pcwk.ed02;
//	for문	
//	for문은 특정한 횟수동안 작업을 반복하고 싶을 때 사용한다.
//	반복횟수를 알고 잇는 경우 많이사용

public class EX03_For {
	public static void main(String[] args) {
		// 1-10까지 누적
		int i;		// 증감
		int sum;	// 합계
		
		// 초기화
		for(i=1,sum=0; i<=10; i++) {
			sum = sum+=i;
			//System.out.println("i:"+i);
		}//for
		System.out.println("1-10까지 합:" +sum);
	}//main
}

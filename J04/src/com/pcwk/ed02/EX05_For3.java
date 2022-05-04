package com.pcwk.ed02;

public class EX05_For3 {
	public static void main(String[] args) {
		// 1-10까지 누적
		
		int sum=0;	// 합계
		
		// 초기화: for문 내에서 초기화
		for(int i=1, j=10; ; i++,j--) {	// 조건식을 빈칸으로 두면(true) 무한루프에 빠진다.
			sum = sum+=i;
			System.out.println("i="+i);
			System.out.println("j="+j);
			if(i==11)break;		// 임의로 break를 만들어준다.
		}//for
		System.out.println("1-10까지:"+sum);
		
	}//main
}

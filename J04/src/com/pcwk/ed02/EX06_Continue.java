package com.pcwk.ed02;
//	cuntinue문	
//	현재의 반복을 뛰어 넣고 반복을 진행한다.
//	1 ~ 100까지 홀수 만 더하기

public class EX06_Continue {
	public static void main(String[] args) {
		
		int total = 0;
		int num;
		// continue를 만나면 for문에 증감식으로 간다.
		for( num=1; num<=100; num++) {
			if(num % 2 == 0) { // 짝수
				continue; // 짝수를 만나면 수행하지않고 다시 증감식으로 올라감
			}
			System.out.println(num);
			total+=num;
		}//for

		System.out.println("1~100까지 홀수의 합:" + total);
		
	}//main
}

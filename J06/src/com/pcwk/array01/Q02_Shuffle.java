package com.pcwk.array01;

import java.util.Arrays;

public class Q02_Shuffle {
	public static void main(String[] args) {
//	Q2. 섞기(shuffle)	
//	배열의 요소의 순서를 반복해서 바꾼다.(카드게임,로또번호 생성)
//	int numArr[] = new int[10];
//	// 1, 2, 3, 4, 5, 6, 7, 8, 9, 0
		int numArr[] = new int[10];
// 1. numArr 값을 0~9까지 할당한다.
// 2. shuffle
		// 1.
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = i; // numArr 값을 0~9까지 할당
		}
		System.out.println(Arrays.toString(numArr));
		// 2.
//		두 변수에 값 교환하기	
//		int x = 10;	
//		int y = 20;	
//		int tmp;	
//			
//		tmp = x; // tmp = 10	
//		x = y;     // x = 20	
//		y = tmp; // y = 10	

		for(int i=0;i<=88;i++) {
			int n = (int)(Math.random()*10);
			// System.out.println("n: "+n);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;  // numArr[0],numArr[n]값이 교환
			
		}
		System.out.println(Arrays.toString(numArr));
//		numArr[i] = (int)(Math.random()*10);
//		System.out.println(numArr[i]);
//		//System.out.println((int)(Math.random()*10));
		
	}
}
//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
//[8, 0, 1, 2, 6, 4, 7, 9, 5, 3] shuffle할때마다 바뀜

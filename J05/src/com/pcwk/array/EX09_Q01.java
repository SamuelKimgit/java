package com.pcwk.array;
// Q1. int[] score = { 100, 88, 100, 100, 90 }에 총 합과 평균을 구하세요.

public class EX09_Q01 {
	/*public static void main(String[] args) {
		int[] score = { 100, 88, 100, 100, 90 };
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // sum = sum + score[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum / (double)score.length));
	}
	*/
	public static void main(String[] args) { // 강사님 풀이
	// Q1. int[] score = { 100, 88, 100, 100, 90 }에 총 합과 평균을 구하세요.
		int[] score = {100, 88, 100, 100, 90 };
		int sum = 0; 		// 총점
		double avg = 0.0f; 	// 평균
		
		for(int num :score) {
			sum+=num;
		}
		System.out.println("합계:"+sum);
		avg = sum/(double)score.length;
		System.out.println("평균:"+avg);
	}
}
//	합계:478
//	평균:95.6

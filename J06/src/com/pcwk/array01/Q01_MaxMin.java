package com.pcwk.array01;

public class Q01_MaxMin {
	public static void main(String[] args) {
//	Q2. 최대값과 최소값 구하기.		
//	배열의 요소 중 제일 큰 값과 제일 작은 값을 찾는다.		
//	int[] score = { 79, 88, 91, 33, 100, 55, 95 };
//	1. 최대값 변수, 최소값 변수 구하기
//	2. 배열요소를 1개씩 비교해 최대 값을 찾는다.
//		배열이 최대 값보다 더 크면 max=비교한 배열을 할당
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0];
		int min = score[0]; // 배열의 첫번째값을 넣어주고

		for (int i = 0; i < score.length; i++) { // for문으로 한바퀴 돌릴때마다 비교해
			if (max < score[i]) { // score의 최대값을 찾는다.
				// max의 값보다 score[i]의 값이 크면 max = score[i] (하나씩 넘어가며 진행)
				max = score[i];
			}

			if (min > score[i]) { // 최대값가 마찬가지 방법으로 찾는다
				min = score[i];
			}
		} // for
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);

	}// main
}

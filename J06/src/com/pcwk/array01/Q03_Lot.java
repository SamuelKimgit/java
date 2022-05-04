package com.pcwk.array01;

import java.util.Arrays;

public class Q03_Lot {
//	Q3. 로또번호 추출	
//	1 ~ 45까지 중복되지 않게 숫자 6개를 뽑아내시오.
	public static void main(String[] args) {

		int[] ball = new int[45];
		// 1. 숫자 1 ~ 45를 할당
		// 2. shuffle 6개 추출

		// 1.
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // 배열은 0부터 시작하기 때문에 +1 로 1~45를 만들어줌
		}
		System.out.println(Arrays.toString(ball));

		// 2.
		for (int i = 0; i < 6; i++) {
			// 0.0 <=x < 1.0
			// 0.0 <=x < 45.0 * 45
			// 0   <=x < 45 (int)
			int n = (int)(Math.random() * 45);
			// System.out.println(n);

			int tmp = ball[i]; // ball[i], ball[n] 자리교환
			ball[i] = ball[n];
			ball[n] = tmp;
		}

		// 중복되지 않는 6개 숫자
		// System.out.println(Arrays.toString(ball));
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
	}// main
}

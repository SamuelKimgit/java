package com.pcwk.loop;

public class Q05_03 {
	public static void main(String[] args) {
//	Q3. 구구단의 짝수단만 출력 하도록 프로그램을 작성하세요.
//	(for 문으로 작성하세요.)

		for (int i = 2; i <= 9; i++) {
			if (i % 2 != 0) { // != 2로 나뉘지않는것을 제외 홀수걸러내기
				continue;
			}
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
			System.out.println();
		}
		
	}// main
}

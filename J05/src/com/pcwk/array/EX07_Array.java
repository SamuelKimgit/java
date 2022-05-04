package com.pcwk.array;

public class EX07_Array {
	public static void main(String[] args) {
		int[] score = { 100, 88, 98, 90 };
		// 향상된 for
		for (int num : score) {
			System.out.println(num);
		}
		
		System.out.println("==================");

		String[] a = { "Hello", "world", "PCWK" }; // 배열의 크기 3 인덱스 0, 1, 2
		// for(배열의 타입변수 변수이름: 배열이름)
		for (String str : a) {
			System.out.print(str + " ");
		}

	}// main
}
//	100
//	88
//	98
//	90
//	==================
//	Hello world PCWK
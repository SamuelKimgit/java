package com.pcwk.ed01;

import java.util.Scanner;

// case문 동시에 사용하기(break문 생략)	
// 월을 입력 받아서 해당 월 일수 출력!
public class EX03_Switch02 {
	public static void main(String[] args) {
		
		// console입력
		Scanner scanner = new Scanner(System.in);
		System.out.printf("월 입력>");
		
		int month = 1; // 월
		month = scanner.nextInt();
		
		int day = 0; // 일수

		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			day = 28;
			break;
		default:
			day = 31;
			break;
		}
		System.out.println("월: " + month);
		System.out.println("일수: " + day);
	}
}

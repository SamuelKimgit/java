package com.pcwk.ed01;

import java.util.Scanner;
//	점수를 입력 받아서 학점 구하기!	
//	100 ~ 90점
//	89 ~ 80점
//	79 ~ 70점
//	69 ~ 60점
//	60점 미만은 

public class EX07_Switch06_Quiz {
	public static void main(String[] args) {
		System.out.printf("점수 입력(1~100)>>");
		Scanner scanner = new Scanner(System.in);
		// 95점 이상이면
		// +
		
		int score = scanner.nextInt(); // 점수
		// System.out.println(score/10);
		char grade = ' '; // 학점
		char plus  = ' ';
		// int/int 	-> int
		// 91/10	-> 9
		
		switch(score/10) {
		case 10:
		case 9:
			if(score>=95) {
				plus = '+';
			}
			grade = 'A';
			break;
		case 8:
			if(score>=85) {
				plus = '+';
			}
			grade = 'B';
			break;
		case 7:
			if(score>=75) {
				plus = '+';
			}
			grade = 'C';
			break;
		case 6:
			if(score>=65) {
				plus = '+';
			}
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		} // switch
		System.out.println("점수는: " + score);
		System.out.println("학점은: " + grade + plus);
	
		// 직접풀이
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요. >>");
		int score = scanner.nextInt();
		char grade = ' ';
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		switch (grade) {
		case 'A':
			System.out.println("당신의 학점은" + grade + "입니다.");
			break;
		case 'B':
			System.out.println("당신의 학점은" + grade + "입니다.");
			break;
		case 'C':
			System.out.println("당신의 학점은" + grade + "입니다.");
			break;
		case 'D':
			System.out.println("당신의 학점은" + grade + "입니다.");
			break;
		default:
			System.out.println("당신의 학점은" + grade + "입니다.");
			break;
		}
		*/
	}
}

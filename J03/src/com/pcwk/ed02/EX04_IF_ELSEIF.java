package com.pcwk.ed02;

public class EX04_IF_ELSEIF {
	public static void main(String[] args) {
//		성적에 따라 학점 부여하기					
//		100 ~ 90점			A
//		89 ~ 80점			B
//		79 ~ 70점			C
//		69 ~ 60점			D
//		60점 미만 			F
		
		int score = 88;		// 점수
		char grade = ' ';	// 학점
		
		if ( score >= 90 ) {
			grade = 'A';
		} else if ( score >= 80 ) {
			grade = 'B';
		} else if ( score >= 70 ) {
			grade = 'C';
		} else if ( score >= 60 ) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("당신의 점수는: "+score);
		System.out.println("당신의 학점은: "+grade);
	}
}

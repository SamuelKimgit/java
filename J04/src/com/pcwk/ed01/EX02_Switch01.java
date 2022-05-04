package com.pcwk.ed01;
//switch - case 문	
//switch문은 하나의 조건식으로 많은 경우의 수를 처리하는 조건문입니다.
//(조건식의 결과가 정수 또는 문자열의 값이고 그 값에 따라 수행문이 결정)

public class EX02_Switch01 {
	public static void main(String[] args) {
		int rank = 1;
		char medalColor = ' ';

		switch (rank) {
		case 1:
			medalColor = 'G';
			break;
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			medalColor = ' ';
			break;
		} // switch
		System.out.println("Ranking: " + rank);
		System.out.println("MedalColor: " + medalColor);
	} // main
}

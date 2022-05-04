package com.pcwk.array01;

public class EX01_ChangeData {
	public static void main(String[] args) {
		// x, y 값 교환 (자리 바꾸기, shuffle)
		int x = 20;
		int y = 10;
		int tmp;
		
		System.out.println("X: "+ x);
		System.out.println("Y: "+ y);
		
		tmp = x;
		x = y;
		y = tmp;
		System.out.println("=======================");
		System.out.println("after X: "+ x);
		System.out.println("after Y: "+ y);
		
	}//main
}
//	X: 20
//	Y: 10
//	=======================
//	after X: 10
//	after Y: 20
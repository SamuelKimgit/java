package com.pcwk.oop02;

public class MyDateMain {

	public static void main(String[] args) {
		MyDate myDate = new MyDate(15, 2, 2022);
		System.out.println(myDate.toString());
		// myDate.year = 2018;
		// myDate.month = 2;
		// myDate.day = 31; // 2월에 일수는 31이 될 수 없음.

	}
}
//	MyDate [day=15, month=2, year=2022]
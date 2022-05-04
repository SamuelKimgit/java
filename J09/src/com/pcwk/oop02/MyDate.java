package com.pcwk.oop02;

public class MyDate {

	private int day; // 일
	private int month; // 월
	private int year; // 년도

	public MyDate() {}

	public MyDate(int day, int month, int year) {
		super();
		// this.day = day;
		// this.month = month;
		// this.year = year;
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		// 1~9999 범위 내 지정
		if (year < 1 || year > 9999) {
			System.out.println("연도를 확인 하세요.");
		} else {
			this.year = year;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		// 1~12월만 해당하게 set설정
		if (month < 1 || month > 12) {
			System.out.println("월을 확인 하세요.");
		} else {
			this.month = month;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (month == 2) {// 2월인 경우
			// 윤달 처리 추가 작업 필요
			if (day < 1 || day > 29) { // 2월이 아닌 경우
				System.out.println("일수를 확인 하세요.");
			} else {
				this.day = day;
			}

		} else {
			// 30,31일인경우 case처리 필요.
			this.day = day;
		}
	}

	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}

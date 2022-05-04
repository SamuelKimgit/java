package com.pcwk.oop08;

import java.text.SimpleDateFormat;
import java.util.Date;

// import java.util.*; --> import java.util.Date;
// 사용하는 것이 자동으로 추가됨
// import문 정리 Ctrl + Shift + O
// 소스코드 형식정리 Ctrl + Shift + F

public class ImportTestMain {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd"); // 년-월-일
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a"); // 시:분:초 오전/오후
		
		System.out.println("today :" + today);
		System.out.println("오늘 날짜 :" + date.format(today));
		System.out.println("현재 시간 :" + time.format(today));
		// Local PC 사용자시간은 믿으면 안된다. 수동으로 설정 가능
	}
}
//	Local PC 시간
//	today :Mon Feb 14 14:31:59 KST 2022
//	오늘 날짜 :2022-02-14
//	현재 시간 :02:31:59 오후

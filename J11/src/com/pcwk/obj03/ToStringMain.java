package com.pcwk.obj03;

public class ToStringMain {

	public static void main(String[] args) {
		String str = new String("KOREA IT");
		
		// toString()이 문자열이 반환 되도록 오버라이딩 되어 있다.
		
		System.out.println(str);
		System.out.println(str.toString());
		
		// toString()이 날짜문자열이 반환 되도록 오버라이딩 되어 있다.
		// import없이 클래스를 사용.
		java.util.Date today = new java.util.Date();
		System.out.println(today);
		System.out.println(today.toString());
		// "EEE MMM dd HH:mm:ss zzz yyyy";
		
		
	}
}
//	KOREA IT
//	KOREA IT
//	Thu Feb 17 11:07:53 KST 2022
//	Thu Feb 17 11:07:53 KST 2022
package com.pcwk.ed01;

public class EX02_Operator {

	// 논리 연산자 ( &&, ||, ^ )
	public static void main(String[] args) {
		int age01 = 11;
		int age02 = 13;
		//				 true	 &&	  true  -> true   AND연산자
		//				 false	 &&	  true  -> false  둘 중 한곳이라도 false면 false
		boolean flag = (age01>0) && (age02>0);
		System.out.println("(age01>0) && (age02>0):"+flag); // true
		
		//	 	 true	 ||	  true  -> true 	OR연산자  
		//	 	 true	 ||	  false  -> true   	둘 중 한곳이라도 true면 true
		flag = (age01>0) || (age02<0);
		System.out.println("(age01>0) || (age02<0):"+flag); // true
	}
}

package com.pcwk.ed01;

public class EX04_Operator {
//	단락 회로 평가	

	public static void main(String[] args) {
		int num1 = 10;
		int i	 = 2;
//		논리 곱(&&)은 두 항이 모두 true일 때만 결과가 true
//		=> 앞 항이 false이면 뒤 항의 결과를 평가하지 않아도 false
		//	 				 false			   && 	 true	
		boolean flag = ((num1 = num1+10) < 10) && ((i=i+2)<10);
		System.out.println("flag=" +flag); // flag=false
		System.out.println("num1="+num1); // num1=20
		System.out.println("i="+i); // i=2 
		// 앞 항의 결과가 false이므로 뒤 항의 연산은 수행하지 않음
		
//		논리 합(||)은 두 항이 모두 false일 때만 결과가 false 
//		=> 앞 항이 true이면 뒤 항의 결과를 평가하지 않아도 true
		//				true		   ||	  true
		flag = ((num1 = num1+10) > 10) || ((i=i+2)<10);
		System.out.println("flag="+flag); // flag=true
		System.out.println("num1="+num1); // num1=30
		System.out.println("i="+i); // i=2 
		// 앞 항의 결과가 true이므로 뒤 항의 연산은 수행하지 않음
	}
}

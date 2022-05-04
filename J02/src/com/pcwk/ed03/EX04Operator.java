/**
 * 패키지: com.pcwk.ed03
 * 파일 : EX04Operator.java
 * 작성자: ITSC
 */
package com.pcwk.ed03;

public class EX04Operator {
//	비교 연산자		
//	 양변을 비교하여 같으면 참(true), 다르면 거짓(false)을 반환	
//	 이항 연산	
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("a<b:"+(a<b)); // a<b:true
		System.out.println("a>b:"+(a>b)); // a>b:false
		System.out.println("(a+b)<c=:"+((a+b)<=c)); // (a+b)<=c:true
		System.out.println("(a+b)>c=:"+((a+b)>=c)); // (a+b)>=c:true
	}
}

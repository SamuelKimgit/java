package com.pcwk.array01;

public class EX02_Random {
	public static void main(String[] args) {
//		난수 발생		
//		0 ~ 9사이 난수를 발생
//		Math.random()
//		0.0 <= x < 1.0   // 우리가 필요한 정수로 바꿔서 표현
// *10	0.0 <= x < 10.0
//(int)	  0 <= x < 10
		
		// System.out.println("난수: "+Math.random()); 
		// 난수: 0.4588093586594607 매번 값이 바뀐다
		//System.out.println("난수: "+(Math.random()*10));
		// 난수: 7.783596783473449 *10 ->> 자릿수가 오른다
		System.out.println("난수: "+(int)(Math.random()*10));
		// 난수: 8 			(int)를 Casting하여 정수로 표현한다.
	}
}

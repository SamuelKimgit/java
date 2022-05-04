package com.pcwk.obj05.clone;

public class CircleMain {

	public static void main(String[] args) {
//		일회용으로 사용하기 때문에 선언과 동시에 초기화 한다.
//		Point p = new Point(1,1);
//		Circle c01 = new Circle(p, 2.0);
		Circle c01 = new Circle(new Point(1,1), 2.0);
		
		// deep Copy 깊은 복사
		// 
		Circle c03Deep = c01.deepCopy();
		System.out.println(c03Deep);
		
		System.out.println("======================================");
		
		// 얕은 복사 : 사용 금지
		Circle c02 = c01.clone();
		c02.p.x = 9; // 이렇게 복사를 하면 원본도 바뀜
		c02.p.y = 9;
		
		System.out.println(c01);
		System.out.println(c02);
//	r= 2.0, p: x= 9, y= 9
//	r= 2.0, p: x= 9, y= 9
		
		
		
	}
}

package com.pcwk.oop04;

public class CardMain extends Card {
//public class CardMain extends Card { 
//Card클래스에 final이 붙어있어 상속 불가능.
//The type CardMain cannot subclass the final class Card
//
//	public void disp() {
//		
//	} // 상속을 받아 오버라이딩 할 수 없다.
	public static void main(String[] args) {
		Card card = new Card("Heart",10);
		//card.NUMBER = 1; 
		// 상수는 값을 설정하면 값 변경 불가.
		// The final field Card.NUMBER cannot be assigned
		
	}
}

package com.pcwk.oop09.poly;

public class PolyArgumentMain {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		
		Tv t = new Tv();
		
		buyer.buy(t); 
		buyer.buy(new Computer());
		
		buyer.summary();
	}
}
//	Tv을/를 구입하셨습니다.
//	MacBook Pro을/를 구입하셨습니다.
//	구매 총 금액 : 9620
//	구입 제품 목록 : Tv,MacBook Pro,
//	보너스 점수 : 962
//	남은 잔액 : 380

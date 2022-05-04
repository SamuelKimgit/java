package com.pcwk.oop10.abstracted;
//public class Play {
public abstract class Play {
// 1. 상속받은 자식에서 추상메서드를 구현 . 강제!
// 2. 표준화(멈춤은 -> stop 에서 만드세요)
	abstract void play(int pos); // 추상 메서드
// The abstract method play in type Play can only be defined by an abstract class
	
	abstract void stop(); // 추상 메서드
	
	void disp() {
		System.out.println("Play 일반 메서드");
	}
}

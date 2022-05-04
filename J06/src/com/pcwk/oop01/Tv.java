package com.pcwk.oop01;

public class Tv {
	// 변수: 인스턴스 변수
	public boolean power;		// 전원 상태	/ 킨다, 끈다
	public int volume;			// 소리		/ 올리고 내리고 숫자로 표기
	public int channel;			// 채널		/ 올리고 내리고 숫자로 표기
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void power() {
		power =! power; // 계속 부정 작동할 때 마다 반대로 작용함.
	}
	
}

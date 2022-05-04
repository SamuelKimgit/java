package com.pcwk.oop01;

public class TvMain {
	public static void main(String[] args) {
		Tv t; // Tv 인스턴스를 참조하기 위한 변수 t
		t = new Tv(); // Tv 인스턴스를 생성
		
		System.out.println("전원: "+t.power); // 전원 켜기 전 상태확인
		t.power(); // power메소드 호출 / 전원켜기
		System.out.println("전원: "+t.power); // 전원 켠 후 상태확인
		
		t.channel = 3; // tvN 채널 켜기
		t.volume = 11; // 볼륨 11로 맞추기
		
		System.out.println("현 채널: "+t.channel);
		System.out.println("볼륨: "+t.volume);
		
		// 메서드 호출
		t.channelUp();
		System.out.println("현 채널: "+t.channel);
		
		// 전원 off
		t.power();
		System.out.println("전원: "+t.power); // 전원 끈 후 상태확인
	}
}

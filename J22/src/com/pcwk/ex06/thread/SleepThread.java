/**
* <pre>
* com.pcwk.ex06.thread
* Class Name : SleepThread.java
* Description:
* Author: ITSC
* Since: 2022/03/08
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/03/08 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex06.thread;

public class SleepThread extends Thread {
	// sleep() block효과를 이용해 카운트 다운
	@Override
	public void run() {
		System.out.println("카운트 다운 10초!");
		
		for(int i = 10; i >= 0; i--) {
			System.out.println(i);
			
			if(i != 0) {
				try {
					// sleep은 지정된 시간동안 스레드를 일시정지 시킨다.
					// 지정된 시간이 지나고 나면 자동적으로 실행 대기상태가 된다.
					Thread.sleep(1000); //  1/1000초
				} catch (InterruptedException e) {
					System.out.println(e.getMessage() + "," + e.toString());
				}
			}
			
		}// for
		
		System.out.println("종료!");
	}// run

}
//	카운트 다운 10초!
//	10
//	9
//	8
//	7
//	6
//	5
//	4
//	3
//	2
//	1
//	0
//	종료!
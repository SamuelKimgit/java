/**
* <pre>
* com.pcwk.ex04.thread
* Class Name : ThreadMain.java
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
package com.pcwk.ex04.thread;

public class ThreadMain {

	public static void main(String[] args) {
		MyThread thread01 = new MyThread();
		thread01.start();
		
		MyRunnable thread02 = new MyRunnable();
		Thread t = new Thread(thread02);
		t.start();
		
		for(int i = 0; i<10; i++) {
			System.out.println("main() 함수 진행중: " + i);
		}
		
	}// main
}
// 순서가 매번 다르게 수행된다.
// 시간 분할 방식:모든 프로세스에게 동일한 시간을 할당하고 골고루 실행

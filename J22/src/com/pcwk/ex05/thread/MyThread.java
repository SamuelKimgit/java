/**
* <pre>
* com.pcwk.ex05.thread
* Class Name : MyThread.java
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
package com.pcwk.ex05.thread;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("<" + Thread.currentThread().getName() + ">"); // 현재 수행되고 있는 스레드이름
		}
		
		// 시간 지연
		for(int i = 0; i < 1_000_000; i++) {
			for(int j = 0; j < 1_000_000; j++) {
				
			}
		}
		
	}// run

}

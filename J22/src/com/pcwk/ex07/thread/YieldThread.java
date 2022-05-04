/**
* <pre>
* com.pcwk.ex07.thread
* Class Name : YieldThread.java
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
package com.pcwk.ex07.thread;

public class YieldThread implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			// 자음 + 한자 => 특수문자
			System.out.print("★");
//			실행 중에 자신에게 주어진 실행시간을 다른 스레드에게 양보 한다.
			Thread.yield();
		}
		
	}// run

}

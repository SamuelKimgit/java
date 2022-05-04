/**
* <pre>
* com.pcwk.ex04.thread
* Class Name : MyRunnable.java
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

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("MyRunnable 진행중: " + i);
		}

	}

}

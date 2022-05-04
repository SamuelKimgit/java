/**
* <pre>
* com.pcwk.ex04.thread
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
package com.pcwk.ex04.thread;

public class MyThread extends Thread{

	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("Thread 진행중: " + i);
		}
		
	}// run
	
}

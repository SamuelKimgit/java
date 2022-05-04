/**
* <pre>
* com.pcwk.ex09.thread
* Class Name : SyncMain.java
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
package com.pcwk.ex10.thread.copy;

public class SyncMain {

	public static void main(String[] args) {
		Runnable runnable01 = new RunnableEx01();
		
		Thread t01 = new Thread(runnable01);
		Thread t02 = new Thread(runnable01);
		
		// 멀티Thread 접근 제어 확인 위해 2가지 선언
		// synchronized로 제어
		t01.start();
		t02.start();
		
	}// main
}
//	balance: 800
//	balance: 500
//	balance: 300
//	balance: 100
//	balance: 100
//	balance: 100
//	balance: 100
//	balance: 0
//	balance: 0

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
package com.pcwk.ex09.thread;

public class NoneSyncMain {

	public static void main(String[] args) {
		Runnable runnable01 = new RunnableEx01();
		
		Thread t01 = new Thread(runnable01);
		Thread t02 = new Thread(runnable01);
		
		t01.start();
		t02.start();
		
	}// main
}

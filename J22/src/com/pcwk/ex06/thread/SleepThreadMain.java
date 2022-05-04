/**
* <pre>
* com.pcwk.ex06.thread
* Class Name : SleepThreadMain.java
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

public class SleepThreadMain {

	public static void main(String[] args) {
		SleepThread thread01 = new SleepThread();
		thread01.start();
		
	}// main
}

/**
* <pre>
* com.pcwk.ex07.thread
* Class Name : YieldThreadMain.java
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

public class YieldThreadMain {

	public static void main(String[] args) {
		YieldThread yieldThread = new YieldThread();
		NormThread normThread = new NormThread();
		
		Thread t01 = new Thread(yieldThread);
		Thread t02 = new Thread(normThread);
		
		t02.start();
		t01.start();
		
	}// main

}

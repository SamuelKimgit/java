/**
* <pre>
* com.pcwk.ex07.thread
* Class Name : NormThread.java
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

public class NormThread implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.print("☆");
		}

	}// run

}

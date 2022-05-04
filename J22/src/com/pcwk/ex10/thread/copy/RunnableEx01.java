/**
* <pre>
* com.pcwk.ex09.thread
* Class Name : RunnableEx01.java
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

public class RunnableEx01 implements Runnable {

	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			// 100, 200, 300 난수발생
			// 0.0 <= x < 1.0 math
			// 0.0 <= x < 3.0
			// 1.0 <= x < 4.0
			// 1 <= x < 4
			// 100 <= x < 400
			int money = (int)(Math.random()*3+1)*100;
			
			acc.withdraw(money);
			System.out.println("balance: " + acc.getBalance());
		}
		
		
	}// run
}

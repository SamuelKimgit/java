/**
* <pre>
* com.pcwk.ex09.thread
* Class Name : Account.java
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

// 계좌, 출금
public class Account {

	private int balance = 1000; // 잔고

	public int getBalance() {
		return balance;
	}
	
	// 출금
	// withdraw() 한번에 한 스레드만 접근
	// public synchronized void withdraw(int money) {
	public void withdraw(int money) {
		synchronized(this) {
			
			if(balance >= money) { // 잔고 >= 출금액
				try {
					Thread.sleep(1000);
					
					balance -= money; // 잔고 =  잔고 - 출금액
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}// if
		}// synchronized
	}// withdraw
}

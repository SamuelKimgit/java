/**
* <pre>
* com.pcwk.ex08.thread
* Class Name : JoinThread.java
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
package com.pcwk.ex08.thread;

import java.util.ArrayList;

public class JoinThread02 extends Thread {
	int seq;
	
	public JoinThread02(int seq) {
		this.seq = seq;
	}
	
	@Override
	public void run() {
		System.out.println(this.seq + " thread start.");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(this.seq + " thread stop.");
	}

	// join 사용
	// main()이 마지막에 종료 되도록 처리
	public static void main(String[] args) {
		ArrayList<Thread> threads = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			Thread thread = new JoinThread02(i);
			thread.start();
			
			threads.add(thread);
		}
		
		// ArrayList<Thread> 스레드 join
		// join() 메서드는 특정한 스레드가 작업을 먼저 수행할 때 사용합니다.

		for(int i = 0; i < threads.size(); i++) {
			Thread t = threads.get(i);
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("main end."); // main 종료

	}

}

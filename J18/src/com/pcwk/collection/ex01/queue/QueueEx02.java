/**
* <pre>
* com.pcwk.collection.ex01.queue
* Class Name : QueueEx02.java
* Description:
* Author: ITSC
* Since: 2022/02/28
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/28 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.collection.ex01.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx02 {

// 명령어로 history Queue로 생성! 

	static Queue<String> q = new LinkedList<>();
	static final int MAX_SIZE = 5; // Queue에 5개까지만 저장

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

		while (true) {
			System.out.print(">>");
			try {
				// 콘솔에서 라인단위로 입력
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim(); // 앞 뒤 공백 제거

				if (input.equals("")) { // space enter처리 : 다시입력
					continue;
				} else if (input.equalsIgnoreCase("q")) { // 대,소문자 무시
					System.out.println("프로그램 종료");
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q - 프로그램을 종료 합니다.");
					System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
				} else if (input.equals("history")) {
					int i = 0;
					save("history"); // history로 queue에 기록
					
					Iterator<String> iter = q.iterator();
					while(iter.hasNext()) {
						System.out.println(++i + "." + iter.next());
					}
					
				} else {	
					save(input);
					System.out.println(input);
				}

			} catch (Exception e) {
				System.out.println("입력 오류 입니다.");
			} // try-catch

		} // while

	}// main

	/**
	 * Queue에 저장
	 * dos명령어 history : C:\Users\ITSC>doskey /history
	 * @param input
	 */
	public static void save(String input) {
		// "" 입력이 아니면 queue에 저장
		if (!"".equals(input)) {
			q.offer(input);
		}

		// 5개 넘어 서면 제일 처음 입력된것 삭제
		if (q.size() > MAX_SIZE) {
			q.remove();
		}
	}// save
}
//	help를 입력하면 도움말을 볼 수 있습니다.
//	dbr
//	>>clf
//	clf
//	>>vkf
//	vkf
//	>>rn
//	rn
//	>>history
//	1.dbr
//	2.clf
//	3.vkf
//	4.rn
//	5.history
//	>>입력 오류 입니다.
//	>>
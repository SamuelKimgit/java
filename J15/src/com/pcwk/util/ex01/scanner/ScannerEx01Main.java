/**
* <pre>
* com.pcwk.util.ex01.scanner
* Class Name : ScannerEx01Main.java
* Description:
* Author: ITSC
* Since: 2022/02/23
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/23 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex01.scanner;

import java.util.Scanner;

import com.pcwk.cmn.LoggerManager;

public class ScannerEx01Main implements LoggerManager {

	// Scanner를 통한 무한입력
	// 프로그램 종료
	public static void main(String[] args) {
		// keyboard input
		Scanner scanner = new Scanner(System.in);
		String[] argArr = null;

		while (true) {
			System.out.println("q를 입력하면 프로그램 종료.");
			String prompt = ">>";
			System.out.println(prompt);

			// Line단위 입력
			String input = scanner.nextLine();

			input = input.trim(); // 앞 뒤 공백제거 / input에 있는걸 앞뒤 공백제거 후 다시 input에 넣음
			// abc 1234 678
			// RegExp : '+' 1회 이상 반복 의미
			argArr = input.split(" +"); // 입력 받은 내용을 공백을 구분자로 자른다.
			// split 이 Enter 를 만나기전까지의 중간 공백에 구분자를 자른다.(엔터역할)

			// 제일 앞 문자를 잘라낸다
			String command = argArr[0].trim();

			if ("".equals(command)) { // command가 공백이면 다시 입력
				continue;
			}

			// 명령어를 소문자로 변환
			command = command.toLowerCase();

			if ("q".equals(command)) {
				System.out.println("프로그램 종료!");
				// 프로그램 종료
				// exit = Terminates the currently running Java Virtual Machine
				System.exit(0); // 0번이면 정상, 그 이외는 비정상
			} else {
				for(int i = 0; i < argArr.length; i++) {
					System.out.println(argArr[i]);
				}
			}
		} // while

	}// main

}

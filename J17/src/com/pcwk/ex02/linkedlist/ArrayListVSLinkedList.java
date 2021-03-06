/**
* <pre>
* com.pcwk.ex02.linkedlist
* Class Name : ArrayListVSLinkedList.java
* Description:
* Author: ITSC
* Since: 2022/02/25
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/25 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex02.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {
	// 순차적인 추가/삭제 : ArrayList
	// 중간에 추가/삭제 : LinkedList
	// 데이터 삭제시엔 필시 뒤에서 부터 삭제
	public static void main(String[] args) {
		// 순차적인 추가
		// ArrayList VS LinekdList : ArrayList - Win!
		ArrayList<String> arrayList = new ArrayList<>(1_000_000);
		LinkedList<String> linkedList = new LinkedList<>();
		System.out.println("-순차적인 추가-");
		System.out.println("ArrayList: " + addSequential(arrayList));
		System.out.println("LinkedList: " + addSequential(linkedList));

		// 중간에 추가
		// ArrayList VS LinkedList : LinkedList - Win!
		System.out.println("-중간에 추가-");
		System.out.println("ArrayList: " + addMiddle(arrayList));
		System.out.println("LinkedList: " + addMiddle(linkedList));

		// ☆뒤에서 부터 삭제☆
		// ArrayList VS LinekdList : ArrayList - Win!
		System.out.println("-뒤에서 부터 삭제-");
		System.out.println("ArrayList: " + removeArrayList(arrayList));
		System.out.println("LinkedList: " + removeArrayList(linkedList));
		
	}// main

	/**
	 * 뒤에서 부터 삭제
	 * @param list
	 * @return long
	 */
	public static long removeArrayList(List<String> list) {
		long start = System.currentTimeMillis();

		for(int i = list.size()-1; i >= 0; i--) {
			list.remove(i);
		}
		
		long end = System.currentTimeMillis();
		return end - start;

	}

	/**
	 * 중간에 추가
	 * @param list
	 * @return ling
	 */
	public static long addMiddle(List<String> list) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < 100_000; i++) {
			list.add(999, String.valueOf(i)); // i+"" == String.valueOf(i) 동일하다.
		}

		long end = System.currentTimeMillis();
		return end - start;
	}

	/**
	 * 순차적인 추가
	 * @param list
	 * @return long
	 */
	public static long addSequential(List<String> list) {
		long start = System.currentTimeMillis();
		// 천단위 구분자 " _ " 언더스코어
		// 1000000 -> 1_000_000
		for (int i = 0; i < 1_000_000; i++) {
			list.add(i + "");
		}

		long end = System.currentTimeMillis();
		return end - start;
	}

}
//	-순차적인 추가-
//	ArrayList: 95
//	LinkedList: 1156
//	-중간에 추가-
//	ArrayList: 9426
//	LinkedList: 286
//	-뒤에서 부터 삭제-
//	ArrayList: 5
//	LinkedList: 25

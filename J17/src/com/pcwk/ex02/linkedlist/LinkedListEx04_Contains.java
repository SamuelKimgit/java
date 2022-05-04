/**
* <pre>
* com.pcwk.ex02.linkedlist
* Class Name : LinkedListEx04_Contains.java
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

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListEx04_Contains {

	public static void main(String[] args) {
		// 값 존재 유무 확인
		LinkedList<String> lectureList = new LinkedList<>(Arrays.asList("C", "JAVA", "ORACLE", "WEB", "SPRING", "C"));

		// 데이터 존재 유무
		boolean contains = lectureList.contains("WEB");
		System.out.println("contains: " + contains); // contains: true

		// 특정 데이터의 인덱스 : 존재하는 경우
		int index = lectureList.indexOf("WEB");
		System.out.println("index:" + index); // index:3

		// 데이터가 없는 경우 : -1
		index = lectureList.indexOf("SVN");
		System.out.println("index: " + index); // -1

	}// main
}

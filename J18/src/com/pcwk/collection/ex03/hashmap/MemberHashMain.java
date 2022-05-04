/**
* <pre>
* com.pcwk.collection.ex03.hashmap
* Class Name : MemberHashMain.java
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
package com.pcwk.collection.ex03.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MemberHashMain {

	// 순서 보장되지 않음
	public static void main(String[] args) {
		//Map map = new HashMap<>(); // Map인터페이스 통한 객체 생성
		HashMap map = new HashMap<>();
		
		// 추가
		map.put("김자바", new Member(100,"김자바"));
		map.put("이자바", new Member(200,"이자바"));
		map.put("박자바", new Member(300,"박자바"));
		// map.put("김자바", new Member(400,"김자바")); // key중복 없음
		
		// 데이터 가져오기
		//System.out.println(map.get("김자바")); // Member [memberId=100, memberName=김자바]
		
		//Returns a Set view of the keys contained in this map
		Set set = map.keySet(); // key값을 set형태로 return
		Iterator iter = set.iterator();
		
		// key에 해당되는 value() 추출
		while(iter.hasNext()) {
			System.out.println(map.get(iter.next()));
		}
		
		//System.out.println(map);
		
	}// main
}

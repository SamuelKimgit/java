/**
* <pre>
* com.pcwk.ex11.json
* Class Name : ArrayListToJsonMain.java
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
package com.pcwk.ex11.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class ArrayListToJsonMain {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		Person person01 = new Person("철수", 9, "남");
		Person person02 = new Person("영희", 9, "여");
		Person person03 = new Person("짱구", 9, "남");
		
		// list에 person 추가
		list.add(person01);
		list.add(person02);
		list.add(person03);
		
		Gson gson = new Gson();
		String jsonString = gson.toJson(list);
		System.out.println(jsonString);
		
	}// main
}

/**
* <pre>
* com.pcwk.ex11.json
* Class Name : JsonToPersonMain.java
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

import com.google.gson.Gson;

public class JsonToPersonMain {

	public static void main(String[] args) {
		// json String -> java class
		
//		{"name":"철수","age":9,"gender":"남"}
		
		// jsonString to Person
		String jsonString = "{\"name\":\"철수\",\"age\":9,\"gender\":\"남\"}";
		
		Gson gson = new Gson();
		
		Person person = gson.fromJson(jsonString, Person.class);
		System.out.println("person: " + person.toString());
//		person: Person [name=철수, age=9, gender=남]
		
	}// main
}

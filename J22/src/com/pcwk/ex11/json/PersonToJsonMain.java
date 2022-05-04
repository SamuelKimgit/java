/**
* <pre>
* com.pcwk.ex11.json
* Class Name : PersonToJsonMain.java
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

public class PersonToJsonMain {

	public static void main(String[] args) {
		// Java class -> json String
		
		Person person = new Person("철수", 9, "남");
		
		Gson gson = new Gson();
		
		String jsonString = gson.toJson(person);
		System.out.println("jsonString: " + jsonString);
//		jsonString: {"name":"철수","age":9,"gender":"남"}
		
	}// main
}

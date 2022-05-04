/**
* <pre>
* com.pcwk.util.ex03.singleton
* Class Name : SingleToneMain.java
* Description:
* Author: ITSC
* Since: 2022/02/22
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/22 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex03.singleton;

public class SingleToneMain {

	public static void main(String[] args) {
		// The constructor SingleTone() is not visible
		// SingleTone s01 = new SingleTone();
		SingleTone s01 = SingleTone.getInstance();
		SingleTone s02 = SingleTone.getInstance();
		
		System.out.println("s01:" + s01);
		System.out.println("s02:" + s02);
		System.out.println(s01.equals(s02)); // true
		
	}

}
//	s01:com.pcwk.util.ex03.singleton.SingleTone@15db9742
//	s02:com.pcwk.util.ex03.singleton.SingleTone@15db9742
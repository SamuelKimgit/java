/**
* <pre>
* com.pcwk.ex01.net
* Class Name : IPEx01.java
* Description:
* Author: ITSC
* Since: 2022/03/07
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/03/07 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPEx01 {

	public static void main(String[] args) {
		// InetAddress
//		C:\Users\ITSC>ipconfig /all
//
//		Windows IP 구성
//
//		   호스트 이름 . . . . . . . . : DESKTOP-ONE4R81
//		   주 DNS 접미사 . . . . . . . :
//		   노드 유형 . . . . . . . . . : 혼성
//		   IP 라우팅 사용. . . . . . . : 아니요
//		   WINS 프록시 사용. . . . . . : 아니요
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getLocalHost();
			// 호스트 이름을 출력
			System.out.println("getHostName: " + ip.getHostName());
			
			// 호스트 주소를 출력
			System.out.println("getHostAddress: " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}// main

}
//	getHostName: DESKTOP-ONE4R81
//	getHostAddress: 192.168.3.4

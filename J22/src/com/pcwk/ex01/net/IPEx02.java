/**
* <pre>
* com.pcwk.ex01.net
* Class Name : IPEx02.java
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

public class IPEx02 {

	public static void main(String[] args) {
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com");
			System.out.println("getHostName: " + ip.getHostName());
			System.out.println("getHostAddress: " + ip.getHostAddress());
			
			ipArr = InetAddress.getAllByName("www.naver.com");
			for(int i = 0; i < ipArr.length;i++) {
				System.out.println("ipArr[" + i + "] : " + ipArr[i]);
			}
			// www.naver.com. -> IP
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}// main
}
//	getHostName: www.naver.com
//	getHostAddress: 223.130.200.104
//	ipArr[0] : www.naver.com/223.130.200.104
//	ipArr[1] : www.naver.com/223.130.195.95
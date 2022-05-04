/**
* <pre>
* com.pcwk.ex02.net
* Class Name : URLEx01.java
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
package com.pcwk.ex02.net;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class URLEx01 {

	public static void main(String[] args) {
//		URL ( Uniform Resource Location )	
//		URL은 인터넷에 존재하는 여러 서버들이 제공하는 자원에 접글할 수있는 주소를 표현
//		ex)
//		프로토콜://호스트명:포트번호/경로명/파일명?쿼리스트링#참조
		
//		프로토콜		자원에 접근하기 위해 서버와 통신하는데 사용되는 통신 규약(https)
//		호스트명		자원을 제공하는 서버의 이름(search.daum.net)
//		포트번호		http의 기본 포트는 80이다. https의 기본 포트는 443이다. ftp의 기본 포트는 20,21이다.
//		경로명		접근하려는 자원이 저장된 서버상의 위치( /sample)
//		파일명		접근하려는 자원의 이름(hello.jsp)
//		쿼리			URL에서 ? 이후의 부분
//		참조			URL에서 # 이후의 부분

		try {
			URL url = new URL("http://sinchon.koreaisacademy.com/"
					+ "?dGubun=1&_ga=2.28977851.600780303.1646616004-285336498.1638953022");
			
			// 호스트명과 포트번호
			System.out.println("호스트명: " + url.getAuthority());
			System.out.println("포트번호: " + url.getDefaultPort());
			System.out.println("프로토콜: " + url.getProtocol());
			System.out.println("쿼리: " + url.getQuery());
			System.out.println("전체 주소: " + url.toURI());
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}// main
}
//	호스트명: sinchon.koreaisacademy.com
//	포트번호: 80
//	프로토콜: http
//	쿼리: dGubun=1&_ga=2.28977851.600780303.1646616004-285336498.1638953022
//	전체 주소: http://sinchon.koreaisacademy.com/
//				+ ?dGubun=1&_ga=2.28977851.600780303.1646616004-285336498.1638953022
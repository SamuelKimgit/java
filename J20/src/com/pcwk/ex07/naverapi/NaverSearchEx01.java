/**
* <pre>
* com.pcwk.ex07.naverapi
* Class Name : NaverSearchEx01.java
* Description:
* Author: ITSC
* Since: 2022/03/03
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/03/03 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex07.naverapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class NaverSearchEx01 {

	public static void main(String[] args) {
		String clientId = "ZSHnOy0geidEj7iNkR02"; // 클라이언트 아이디
		String clientSecret = "6k4FxMWY2j"; // 클라이언트 비밀번호

		if(args.length != 1) { // param이 없으면 종료
			System.out.println("검색어를 입력 하세요.");
			System.exit(0);
		}
		String text = args[0]; // 검색어
		BufferedReader br = null;

		try {
			text = URLEncoder.encode(text , "UTF-8");
			System.out.println("text: " + text);
			// blog : JSON
//			String apiURL = "https://openapi.naver.com/v1/search/blog?query=" + text;
			
			// book : JSON
			String apiURL = "https://openapi.naver.com/v1/search/book.json?query=" + text;
			
			// book : XML
//			String apiURL = "https://openapi.naver.com/v1/search/book.xml?query=" + text;
			
			// news : JSON
//			String apiURL = "https://openapi.naver.com/v1/search/news.json?query=" + text;
			
			System.out.println("apiURL: " + apiURL);

			URL url = new URL(apiURL); // URL

			// clientId,clientSecret 적용을 위한 HttpURLConnection
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET"); // GET방식으로 접근
			con.setRequestProperty("X-Naver-Client-Id", clientId); // clientId
			con.setRequestProperty("X-Naver-Client-Secret", clientSecret); // clientSecret

//			responseCode = 200 OK 성공
//			responseCode = 401 Unauthorized 실패
			int responseCode = con.getResponseCode();
			System.out.println("responseCode: " + responseCode);

			if (200 == responseCode) { // 성공
				// byte스트림을 char스트림으로 연결 -> BufferedReader생성
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
				
				// 가지고 온 데이터 출력
				String line = "";
				while ( (line = br.readLine()) != null) {
					System.out.println(line);
				}
				
			} else {
				System.out.println("clientId,clientSecret를 확인하세요.");
				return;
			}

		} catch (IOException e) {
			System.out.println("==============================");
			System.out.println("=IOException=" + e.getMessage());
			System.out.println("==============================");
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // try-catch-finally

	}// main
}

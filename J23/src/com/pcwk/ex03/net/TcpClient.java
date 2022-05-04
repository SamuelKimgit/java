/**
* <pre>
* com.pcwk.ex03.net
* Class Name : TcpClient.java
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
package com.pcwk.ex03.net;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
//	Socket	
//	프로세서간의 통신을 담당하며, InputStream, OutputStream

	public static void main(String[] args) {
		// ServerIp, port
		String serverIp = "192.168.3.19"; // 127.0.0.1 은 자기자신을 가르킨다.
		// 192.168.3.4
		int serverPort = 7779;
		
		// Socket생성
		try {
			Socket socket = new Socket(serverIp, serverPort);
			
			// 소켓의 input 스트림 생성
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			// 소켓의 입력을 출력한다.
			System.out.println("서버로 부터 받은 메시지: " + dis.readUTF());
			System.out.println("연결을 종료합니다.");
			
			// 스트링과 소켓을 닫는다.
			dis.close();
			socket.close();
			System.out.println("연결이 종료 되었습니다.");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}// main
	
}
//	서버로 부터 받은 메시지: [09:40:57] Test Message from Server.
//	연결을 종료합니다.
//	연결이 종료 되었습니다.

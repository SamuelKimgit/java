package com.pcwk.ex05.net;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

// DataInputStream통한 massage수신
public class Receiver extends Thread {
	Socket socket;
	DataInputStream dis;
	
	public Receiver(Socket socket) {
		this.socket = socket;
		
		try {
			dis = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// Receiver
	
	// massage수신
	@Override
	public void run() {
		while(dis != null) {
			try {
				System.out.println(dis.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}// while
	}// run
	
}// class

package com.pcwk.ex05.net;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

// DataOutputStream통한 massage전송
public class Sender extends Thread{
	Socket socket; // socket
	DataOutputStream out;
	String name;
	
	public Sender(Socket socket) {
		this.socket = socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			name = "[" + socket.getInetAddress() + " : " + socket.getPort() +"]"; // [192.168.3.4 : 7794]
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// Sender
	
	
	// massage입력, 전송
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(out != null) {
			try {
				out.writeUTF(name + " " + sc.nextLine()); // [192.168.3.4 : 7794]
			} catch (IOException e) {
				e.printStackTrace();
			}
		}// while
	}// run
	
}// class
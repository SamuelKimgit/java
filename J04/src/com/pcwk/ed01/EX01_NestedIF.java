package com.pcwk.ed01;

import java.util.Scanner;
//중첩 if 문	
//if문 내에 if문이 있는 문장.

public class EX01_NestedIF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("아이디를 입력 하세요>");
		String userID = scanner.nextLine();
		System.out.println("userID:"+userID);
		
		// userID : java, passwd : 1234
		if (userID.equals("java")) {
			System.out.println("id일치");
			System.out.printf("비밀번호를 입력하세요>");
			String passwd = scanner.nextLine();
			
			if(passwd.equals("1234")) {
				System.out.println("비번 일치");
			} else {
				System.out.println("비번을 확인하세요.");
			}
		//----if---------------------------
		} else {
			System.out.println("아이디를 확인하세요.");
		}
	}
}

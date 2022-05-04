package com.pcwk.array;

public class EX05_Array {
	public static void main(String[] args) {
		char[] alphabet = new char[26];
		// A~Z
		char ch = 'A'; // 문자열(ASCII CODE) A = 65,  a = 97
		// 배열의 시작번지는 0 -> 마지막을 n 이라고 하면 n-1해야한다.
		
		for(int i=0;i<alphabet.length;i++,ch++) {
			alphabet[i] = ch;
			System.out.println(i+","+ch);
		}
		
		for(int i=0; i<alphabet.length;i++) {
			System.out.print((int)alphabet[i]+"="+alphabet[i]+",");
		}
	}//main
}

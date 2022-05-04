package com.pcwk.time.ex05.list.vector;

import java.util.Vector;
//The Vector class implements a growable array ofobjects

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> vector01 = new Vector<>();
		
		vector01.add("1");
		vector01.add("2");
		vector01.add("3");
		vector01.add("4");
		vector01.add("5");
//		vector01.add("6");
//		vector01.add("7");
//		vector01.add("8");
//		vector01.add("9");
//		vector01.add("10"); // 가변 배열
//		vector01.add("11"); // 11개부터 capacity(담을 수 있는 용량) 증가(해당단위만큼:10)
		
		print(vector01);
		
	}// main
	
	public static void print(Vector<String> v) {
		System.out.println("담을 수 있는 용량:" + v.capacity());
		System.out.println("element 개수: " + v.size());
		
		for(String s : v) {
			System.out.println(s);
		}
		
	}// print
}

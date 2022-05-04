package com.pcwk.array;

//	배열의 초기화	
//	배열 선언과 동시에 초기화
//	배열 초기화시 배열의 개수를 명시하지 않음
//	아무런 초기화 값 없이 선언만 한 경우, 정수는0, 실수는0.0으로 초기화 된다.
//	객체 배열은 null로 초기화 된다.

public class EX01_Array {
	public static void main(String[] args) {
		// 배열 초기화시 배열의 개수를 명시하지 않음 error
		// int [] studentId = new int[3] {101,102,103};
		
		int [] studentId = new int[] {101,102,103};
		System.out.println("studentId[0]: "+studentId[0]);
		System.out.println("studentId[1]: "+studentId[1]);
		
		int add = studentId[0] + studentId[1];
		System.out.println("add="+add);
		
		System.out.println("배열길이: "+studentId.length);
		
		// 배열에 있는 모든 값 출력 하기
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//		at com.pcwk.array.EX01_Array.main(EX01_Array.java:26)
		// for(int i=0; i<=3; i++){ // 배열은 0부터 시작하기 때문에 i<= 3, 3을 포함하면 안된다.
		for (int i = 0; i<3; i++) { 
			System.out.println(studentId[i]);
		}
		System.out.println("=========================================");
		
		studentId[0] = studentId[0] +100;
		studentId[1] = studentId[1] +100;
		System.out.println("studentId[0]: "+studentId[0]); // studentId[0]: 201
		System.out.println("studentId[1]: "+studentId[1]); // studentId[1]: 202
	}//main
}

/**
 * 패키지: com.pcwk.var01
 * 파일 : VaruabkeCasting06.java
 * 작성자: ITSC
 */
package com.pcwk.var01;

public class VaruabkeCasting06 {
//	명시적 형변환 : 묵시적 형변환의 반대의 경우
//	변환 되는 자료형을 명시해야 함, 자료의 손실이 발생 할 수 있다.
	
	public static void main(String[] args) {
		// 큰 수를 작은 변수에 할당.
		int iNum = 11;
		byte bNum = (byte)iNum;
		
		System.out.println("iNum:"+iNum); // iNum:11
		System.out.println("bNum:"+bNum); // bNum:11
		
		int iNum01 = 1000;
		byte bNum01 = (byte)iNum01;
		
		System.out.println("iNum01:"+iNum01); // iNum01:1000
		System.out.println("bNum01:"+bNum01); // bNum01:-24

		// 더 정밀한 자료형에서 덜 정밀한 변수로 대입
		double dNum02 = 3.14;
		int iNum02 = (int)dNum02;
		
		System.out.println("dNum02:"+dNum02); // dNum02:3.14
		System.out.println("iNum02:"+iNum02); // iNum02:3  
		// int는 실수를 표현할 방법이 없기 때문에 소수점은 짤린다.
	}
}

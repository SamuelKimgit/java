/**
 * 패키지: com.pcwk.var01
 * 파일 : VariableImplicitConversion.java
 * 작성자: ITSC
 */
package com.pcwk.var01;
/**
 * @author ITSC
 *
 */
public class VariableImplicitConversion {
// 묵시적 형변환	
// 작은 수에서 큰 수로, 덜 정밀한 수에서 더 정밀한 수로 대입 되는 경우

	public static void main(String[] args) {
		byte bNum = 11;
		int iNum = bNum; // byte형 값이 int형으로 자동으로 변환됨
		System.out.println("bNum:"+bNum); // bNum:11
		System.out.println("iNum:"+iNum); // iNum:11

		// 덜 정밀한 수에서 더 정밀한 수로 대입
		int iNum02 = 14;
		float fNum = iNum02;
		System.out.println("iNum02:"+iNum02); // iNum02:14
		System.out.println("fNum02:"+fNum); // fNum02:14.0
		
		double dNum;
		//		14.0 + 11
		dNum = fNum + iNum;
		System.out.println("fNum + iNum:"+dNum); //fNum + iNum:25.0
	}
}

/**
 * ��Ű��: com.pcwk.var01
 * ���� : VariableImplicitConversion.java
 * �ۼ���: ITSC
 */
package com.pcwk.var01;
/**
 * @author ITSC
 *
 */
public class VariableImplicitConversion {
// ������ ����ȯ	
// ���� ������ ū ����, �� ������ ������ �� ������ ���� ���� �Ǵ� ���

	public static void main(String[] args) {
		byte bNum = 11;
		int iNum = bNum; // byte�� ���� int������ �ڵ����� ��ȯ��
		System.out.println("bNum:"+bNum); // bNum:11
		System.out.println("iNum:"+iNum); // iNum:11

		// �� ������ ������ �� ������ ���� ����
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

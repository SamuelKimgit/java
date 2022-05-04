/**
* <pre>
* com.pcwk.ex03.reader_writer
* Class Name : FileReaderWriterEx01.java
* Description:
* Author: ITSC
* Since: 2022/03/03
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/03/03 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex03.reader_writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.pcwk.cmn.LoggerManager;

public class FileReaderWriterEx01 implements LoggerManager {

	// 특수 문자
	// \n : 라인스킵
	// \r : 케리지 return (커서를 제일 앞으로)
	// \t : tab문자 만큼 띄우기
	// ' ' : space문자 만큼 띄우기
	public static void main(String[] args) {
//		C:\DCOM_20220127\01_JAVA\workspace\J20\src\com
//		  \pcwk\ex03\reader_writer\FileReaderWriterEx01.java
		String filePath = "C:\\DCOM_20220127\\01_JAVA\\workspace\\J20\\src\\com"
				+ "\\pcwk\\ex03\\reader_writer\\FileReaderWriterEx01.java";
		try (FileReader fr = new FileReader(filePath); FileWriter fw = new FileWriter("convert.java");) {
			int data = 0;
			while ((data = fr.read()) != -1) {
				if ('\n' != data && ' ' != data && '\r' != data && '\t' != data) {
					fw.write(data);
				}
			} // while

		} catch (IOException e) {
			LOG.debug("-------------");
			LOG.debug(e.getMessage());
			LOG.debug("-------------");
		}

		LOG.debug("프로그램 종료!");

	}// main

}

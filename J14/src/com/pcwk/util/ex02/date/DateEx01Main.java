/**
* <pre>
* com.pcwk.util.ex02.date
* Class Name : DateEx01Main.java
* Description:
* Author: ITSC
* Since: 2022/02/22
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/22 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex02.date;

import java.util.Date;
import com.pcwk.cmn.LoggerManager;

public class DateEx01Main implements LoggerManager{

	public static void main(String[] args) {
		Date today = new Date();
		LOG.debug(today.toString()); // Tue Feb 22 11:29:46 KST 2022
		
		long currDate = System.currentTimeMillis();
		Date today02 = new Date(currDate);
		LOG.debug(today02.toString()); // Tue Feb 22 11:31:02 KST 2022

	}// main

}

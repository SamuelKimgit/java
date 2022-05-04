/**
* <pre>
* com.pcwk.util.ex02.date
* Class Name : DateEx02Main.java
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

import java.util.Calendar;
import java.util.Date;
import com.pcwk.cmn.LoggerManager;

public class DateEx02Main implements LoggerManager{

//	Calendar -> Date	
//	ex)	
//		Calendar cal = Calendar.getInstance();
//		Date d = new Date(cal.getTimelnMills());
//		
//	Date -> Calendar	
//	ex)	
//		Date d = new Date();
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(d);

	public static void main(String[] args) {
//		Calendar -> Date 변환		
		Calendar cal01 = Calendar.getInstance();
		Date d01 = new Date(cal01.getTimeInMillis());
		
		LOG.debug("d01:" + d01);
		
//		Date -> Calendar 변환	
		Date d02 = new Date();
		Calendar cal02 = Calendar.getInstance();
		cal02.setTime(d02);
		
		LOG.debug("d02:" + d02);
	}

}

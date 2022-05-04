/**
* <pre>
* com.pcwk.util.ex01.calendar
* Class Name : CalendarEx01Main.java
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
package com.pcwk.util.ex01.calendar;

import java.util.*;

import com.pcwk.cmn.LoggerManager;

public class CalendarEx01Main implements LoggerManager{

	/**
	 * Calendar
	 */
	public static void main(String[] args) {
		// Calendar는 추상클래스로 스스로 객체를 생성할 수 없다.
		// 메서드를 통해서 생성가능하다.
		// 싱글톤으로 객체를 생성한다.
		// Calendar cal = new Calendar();
		
		Calendar cal01 = Calendar.getInstance();
		Calendar cal02 = Calendar.getInstance();
		// 싱글톤 여부
		LOG.debug("cal01:" + cal01.toString());
		LOG.debug("cal02:" + cal02.toString());
		
		// 객체동일성 확인.
		LOG.debug("cal01:" + System.identityHashCode(cal01));
		LOG.debug("cal02:" + System.identityHashCode(cal02));
	}
}
//	toString은 Calendar - @Override(재정의) 되어있다. 
//		- cal01:java.util.GregorianCalendar
//		[time=1645490117971,areFieldsSet=true,areAllFieldsSet=true
//		,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul"
//		,offset=32400000,dstSavings=0,useDaylight=false,transitions=22
//		,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1
//		,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22
//		,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=9
//		,HOUR_OF_DAY=9,MINUTE=35,SECOND=17,MILLISECOND=971
//		,ZONE_OFFSET=32400000,DST_OFFSET=0]		

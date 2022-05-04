package com.pcwk.exception;

import com.pcwk.api.string.LoggerManager;

public class ExceptionEx02Main implements LoggerManager {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;

		try {
			for (int i = 0; i <= 20; i++) {
				// 0.0 <= x < 1.0
				result = number / (int)(Math.random() * 10);
				LOG.debug("1 result: " + result);
			}
		} catch (ArithmeticException e) { 
// Exception이 먼저 잡아버리면 더이상 도달하지 못한다.
// Unreachable catch block for ArithmeticException. It is already handled by the catch block for Exception
			LOG.debug("0 / by zero 발생");
			LOG.debug(e.toString());
		} catch (Exception e) {
			LOG.debug(e.toString()); // ArithmeticException예외 이외의 모든 예외는 Exception이 처리
		}
		LOG.debug("3 프로그램 종료!"); // 프로그램이 비정상 종료

	}// main
}
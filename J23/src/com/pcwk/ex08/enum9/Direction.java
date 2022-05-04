package com.pcwk.ex08.enum9;

public enum Direction {
	EAST(1),SOUTH(5),WEST(-1),NORTH(10);

	public final int value; // 정수값을 지정할 필드
	
	Direction(int value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	
}

package com.pcwk.oop07;

public class Point3D extends Point {
	int z;
//	Implicit super constructor Point() is undefined for 
//	default constructor. Must define an explicit constructor
	public Point3D(int x, int y, int z) {
		// super()자동으로 호출
		// Constructor call must be the first statement in a constructor
		
		super(x,y); // 무조건 첫 줄에 호출되어야 한다. 다른줄에 삽입 되면 오류
		this.x = x;	// (생략가능
		this.y = y;	//   코드 중복)
		this.z = z;
	}
	
	@Override	// (아버지)Point에 있는 (자식)getLocation()을 @Override 했다.
	public String getLocation() {
		return "x: " + x + ", y: " + y + ", z: " + z;
	}
	
	
	
}


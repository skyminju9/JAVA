package com.javaex.constant;

public class Constant {
	
	static final double PI=3.14159;
	static final int MAX_SPEED=110;

	public static void main(String[] args) {
		
//		PI=3.14; PI를 static final로 class에서 선언했기 때문에 변경할 수 없음
		System.out.println(PI);
		System.out.println(MAX_SPEED);
	}
}

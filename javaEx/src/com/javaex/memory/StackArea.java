package com.javaex.memory;

public class StackArea {

	public static void main(String[] args) {
		int a=5; a=4; a=3; a=2;
		System.out.println(a);
		for (int i=0; i<5; i++) {
		}
//		System.out.println(i); 컴파일 에러 
	}
}

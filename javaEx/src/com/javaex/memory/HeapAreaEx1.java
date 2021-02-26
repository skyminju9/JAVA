package com.javaex.memory;

public class HeapAreaEx1 {

	public static void main(String[] args) {
		int[] a=null; //int형 배열 a를 선언 - stack 영역의 공간을 할당
		System.out.println(a); //res : null
		a = new int[5]; //Heap 영역에 5개의 연속된 공간을 할당, 변수 a에 참조값을 할당 
		System.out.println(a);

	}

}

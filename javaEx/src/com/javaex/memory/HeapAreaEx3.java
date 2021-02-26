package com.javaex.memory;

class A{} //class A를 선언 

public class HeapAreaEx3 {
	public static void main(String[] args) {
		A a = null; //A 타입의 a 객체 선언. null로 스택 영역 공간을 할당 
		System.out.println(a); //null
		a = new A(); //힙 메모리에 공간 할당, 객체 a에 참조 값을 할당 
		System.out.println(a); //@15db9742
	}
}

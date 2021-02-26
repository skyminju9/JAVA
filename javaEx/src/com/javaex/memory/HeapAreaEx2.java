package com.javaex.memory;

public class HeapAreaEx2 {
	public static void main(String[] args) {
		String str1 = new String("Joker"); //str1과 str2는 각각 다른 참조 값을 리턴받음 
		String str2 = new String("Joker");
		if (str1==str2) { //참조 값을 비교. 데이터 값을 비교하고자 하면 .equals 메서드를 사용할 것
			System.out.println("same address");
		} else {
			System.out.println("different address");
		}
	}
}

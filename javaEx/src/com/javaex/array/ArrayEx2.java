package com.javaex.array;

public class ArrayEx2 {

	public static void main(String[] args) {
		String[] days = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		//값 목록이 있다면, {}으로 값의 목록을 지정하여 초기화할 수 있다 
		//배열 변수 선언과 동시에 진행할 것 
		for (int i=0; i<7; i++) {
			System.out.println(days[i]);
		}
		
		//혹은, 다음과 같은 방식으로 new 연산자 뒤에 나열할 수 있다 
		String[] days2;
		days2 = new String[] {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		for (int j=0;  j<7; j++) {
			System.out.println(days2[j]);
		}
	}
}

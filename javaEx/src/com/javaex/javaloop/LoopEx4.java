package com.javaex.javaloop;

public class LoopEx4 {

	public static void main(String[] args) {
		int i=1;
		while (true) { //break문을 만나기 전까지 계속 반복함 
			if (i%6==0&&i%14==0) { //break를 만날 조건 
				System.out.println(i); //6과 14의 배수이면 i를 출력하고, break로 빠져나감 
				break; //continue를 사용하면 안되는 이유 : 그 다음 문장을 건너뛰기 때문에, 42가 되는 순간 무한히 42를 출력하게 됨
			}
			i++; //6과 14의 배수가 아닐 경우 계속해서 i++를 진행하고, if문을 거침 
			// 42가 된 후에 break로 반복문 자체(while)를 벗어나기 때문에 종료 
		} 
	}
}

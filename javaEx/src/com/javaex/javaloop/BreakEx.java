package com.javaex.javaloop;

public class BreakEx {

	public static void main(String[] args) {
		int sum=0;
		int num=0;
		while (true) {
			sum += num;
			
			if (sum>5000) {
				break;
			}
			num++;
		}		
		System.out.println(sum);
		System.out.println(num);
	}
}

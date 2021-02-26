package com.javaex.random;

public class RandomLotto {

	public static void main(String[] args) {
		for (int i=1; i<7; i++) {
			int num=(int)(Math.random()*45)+1;
			System.out.printf("%d\t", num);
		}
	}
}

package com.javaex.conditionals;
import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		System.out.print("Enter your score:");
		Scanner scanner = new Scanner(System.in);
		int score=scanner.nextInt();
		
		if (score%3==0) {
			System.out.printf("%d is multiple of 3", score);
		}
		else {
			System.out.printf("%d is not multiple of 3", score);
		}
	}

}

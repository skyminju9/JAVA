package com.javaex.conditionals;
import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		System.out.print("Enter your score:");
		Scanner integer=new Scanner(System.in);
		int score=integer.nextInt();
		
		if (score>=60) {
			System.out.println("you are passed");
		}
		else {
			System.out.println("you are failed");
		}
	}
}

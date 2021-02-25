package com.javaex.conditionals;
import java.util.Scanner;

public class OddEvenEx {

	public static void main(String[] args) {
		System.out.print("Enter num:");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		if (num>0) {
			if (num%2==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		}
		else if(num<0) {
			System.out.println("negative integer");
		}
		else {
			System.out.println("zero");
		}
	}
}

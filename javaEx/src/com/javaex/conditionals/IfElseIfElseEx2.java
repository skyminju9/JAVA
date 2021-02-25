package com.javaex.conditionals;
import java.util.Scanner;

public class IfElseIfElseEx2 {

	public static void main(String[] args) {
		System.out.println("choose class");
		System.out.println("1.JAVA   2.C   3.C++   4.Python");
		System.out.print("class number:");
		
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		
		if (num==1) {
			System.out.println("classroom is R101 ");
		}
		else if (num==2) {
			System.out.println("classroom is R202");
		}
		else if (num==3) {
			System.out.println("classroom is R303");
		}
		else if(num==4) {
			System.out.println("classroom is R404");
		}
		else {
			System.out.println("Ask customer service agents ");
		}
	}
}

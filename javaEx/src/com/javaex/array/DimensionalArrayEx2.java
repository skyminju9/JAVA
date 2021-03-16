package com.javaex.array;

public class DimensionalArrayEx2 {

	public static void main(String[] args) {
		int [][] num = new int[4][3];
		num[0][0]=4; num[0][1]=3; num[0][2]=4;
		num[1][0]=3; num[1][1]=7; num[1][2]=6;
		num[2][0]=5; num[2][1]=8; num[2][2]=7;
		num[3][0]=9; num[3][1]=9; num[3][2]=10;
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<3; j++) {
				System.out.println(i+"행 "+j+"열의 값:"+num[i][j]);
			}
		}
	}
}

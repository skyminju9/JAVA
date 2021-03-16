package com.javaex.array;

public class ScoreArray {

	public static void main(String[] args) {
		int [][] score = {
				{79, 80, 99}, //0행에 학생 A의 성적을 입력, 총 0~2열
				{ 95, 85, 89},
				{90, 65, 56},
				{69, 78, 77}
		};
		
		int[] student = new int[4];
		int[] subject = new int[3];
		String[] stuName= {"A학생", "B학생", "C학생", "D학생"};
		String[] subName= {"English", "Mathmathics", "Science"};
		
		for (int i=0; i<student.length; i++) {
			for (int j=0; j<subject.length; j++) {
				student[i] += score[i][j]; //학생별 총점 계산 
			}
			System.out.println(stuName[i]+" 총점 : "+student[i]);
		}
		System.out.println("---------------------");
		for (int j=0; j<subject.length; j++) {
			for (int i=0; i<student.length; i++) {
				subject[j]+=score[i][j];
				}
			System.out.println(subName[j]+"총점 : "+subject[j]);
		}
	}
}

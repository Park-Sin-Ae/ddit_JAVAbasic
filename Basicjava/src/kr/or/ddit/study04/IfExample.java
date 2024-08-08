package kr.or.ddit.study04;

import java.util.Scanner;

public class IfExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample obj = new IfExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
	
	}
	
	public void method5() {
		boolean flag = false;
		
		if(flag) {
			System.out.println("실행1");
			System.out.println("실행1");
		}if(flag) 
			System.out.println("실행2"); 
			System.out.println("실행2-1"); 
	}
	
	public void method4() {
		/*
		 * 0~2 -
		 * 3~6 0
		 * 7~9 +
		 * 
		 * 90점 이상 A
		 * 80점 이상 B
		 * 70점 이상 C
		 * 60점 이상 D
		 * 60점 미만 F
		 * 
		 */
		
		String grade = "";
		int score = sc.nextInt();
		
		if(score == 100) {
			grade = "A+";
		}
		else if(score >= 90) {
			grade = "A";
			}
		else if(score >= 80) {
			grade = "B";

		}
		else if(score >= 70) {
			grade = "C";
	
		}
		else if(score >= 60) {
			grade = "D";
	
		}
		else {
			grade = "F";
		}
		if(score != 100 && score > 60) {
			if(score %10 <= 2) {
				grade +="-";
			} else if(score %10 <=6) {
				grade +="0";
			} else if(score %10 <=9) {
				grade +="+";
			}
		} 
		
		
		System.out.printf("학점은 : " + grade);		
	}
	public void method3() {
		/*
		 * 90점 이상 A
		 * 80점 이상 B
		 * 70점 이상 C
		 * 60점 이상 D
		 * 60점 미만 F
		 * 
		 */
		String grade = "";
		int score = sc.nextInt();
		
		if(score >= 90){
			grade = "A";
		}else if(score >= 80){
			grade = "B";
		}else if(score >= 70){
			grade = "C";
		}else if(score >= 60){
			grade = "D";
		}else{
			grade = "F";
		}
		System.out.println("학점은 : " + grade);
	}
	
	public void method2() {
		/*
		 * 90점 이상 A
		 * 80점 이상 B
		 * 70점 이상 C
		 * 60점 이상 D
		 * 60점 미만 F
		 * 
		 */
		String grade = "";
		int score = sc.nextInt();
		
		if(score >= 90){
			grade = "A";
		}if(score >= 80 && score < 90){
			grade = "B";
		}if(score >= 70 && score < 80){
			grade = "C";
		}if(score >= 60 && score < 70){
			grade = "D";
		}if(score < 60){
			grade = "F";
		}

		System.out.println("학점은 : " + grade);
	}
	
	public void method1() {
		System.out.println("method1 실행");
		boolean flag = true;
		if(flag) {
			System.out.println("if 문 실행");
		}
		System.out.println("if 문 종료");
		System.out.println("method1 종료");
	}
}

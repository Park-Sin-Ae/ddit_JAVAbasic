package kr.or.ddit.study02.sec03;

import java.util.Scanner;

public class TypeChange3 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		TypeChange3 obj = new TypeChange3();
//		obj.method1();
		obj.method2();
//		obj.method3();
	}
	
	public void method3() {
		System.out.println("숫자를 입력하세요.");
		String num = sc.next();
		int i = Integer.parseInt(num);
		System.out.println(i);
	}
	
	public void method2() {
		/*
		 * 	국어 영어 수학 점수 입력 받은 후
		 * 
		 * 	총 점수와, 평균을 구하시오
		 */
		
		System.out.println("국어>>");
		String kor = sc.next();
		int korI = Integer.parseInt(kor);
		System.out.println("영어>>");
		String eng = sc.next();
		int engI = Integer.parseInt(eng);
		System.out.println("수학>>");
		String math = sc.next();
		int mathI = Integer.parseInt(math);
		System.out.println("국어 :" + kor + "\t" + "영어 :" + eng + "\t" + "수학 : " + math + "\t");
		
		
		int sum = korI+engI+mathI;
		double avg = (double)sum/3;
//		double avg = sum/0.3; //소수 점 자리로 하면 자동으로 double 이 적용
		System.out.println("총점 :" + sum);
		System.out.println("평균 : " + avg);
	}
	
	public void method1() {
		/*
		 * 	국어 영어 수학 점수 입력 받기.
		 */
		System.out.println("국어 점수 :");
		String kor = sc.next();
		System.out.println("영어 점수 :");
		String eng = sc.next();
		System.out.println("수학 점수 :");
		String math = sc.next();
		System.out.println("국어 점수 :" + kor);
		System.out.println("영어 점수 :" + eng);
		System.out.println("수학 점수 :" + math);
	}
}

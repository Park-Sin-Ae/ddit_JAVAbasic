package kr.or.ddit.study06.sec06;

import java.util.Scanner;

public class SalaryTest {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SalaryMan s1 = new SalaryMan();
//		s1.name = "박신애";
		System.out.println("나이를 입력하세요.");
		
		int age = sc.nextInt();
		s1.setAge(age);
		System.out.println(s1);
	}
}

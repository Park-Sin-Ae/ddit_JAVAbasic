package kr.or.ddit.study03;

import java.util.Scanner;

public class RelationOperator {
	public static void main(String[] args) {
		/*
		 * 	관계 연산자
		 * 	> < == <= >= !=
		 */
		
//		int a = 10;
//		int b = 7;
//		
//		System.out.println("a>b : " +(a>b));
//		System.out.println("a<b : " +(a<b));
//		System.out.println("a==b : " +(a==b));
//		System.out.println("a<=b : " +(a<=b));
//		System.out.println("a>=b : " +(a>=b));
//		System.out.println("a!=b : " +(a!=b)); // ! : not
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요. : ");
		int score = sc.nextInt();
		
		if(score > 90) {
			System.out.println("A 학점.");
		}
		else if(score > 80) {
			System.out.println("B 학점.");
		}
		else if(score > 70) {
			System.out.println("C 학점.");
		}
		else if(score > 60) {
			System.out.println("D 학점.");
		}
		else {
			System.out.println("F 학점.");
		}
	}
}

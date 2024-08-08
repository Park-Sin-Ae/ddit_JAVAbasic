package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample obj = new ForExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();
		
	}
	
	public void method6() {
		// 내가 입력한 알파벳으로 부터 z까지 출력
		// chatAt 활용.
		String str = sc.next();
		
		char ch = str.charAt(0);
		
		for(; ch<='z'; ch++) {
			System.out.println(ch);
		}
	}
	
	public void method5() {
		// a부터 z까지 출력.
		char ch = 'a';
		
		for(int i=0; i<='z'-'a'; i++) {
			char ch2 = (char)(ch+i);
			System.out.println("i : " + i + ", sum : " + ch2);
		}
		
		for(char c='a'; c<='z'; c++) {
			System.out.println("c : " + c + ", sum : " + c);
		}
		
		String s = "";
		for(char c='a'; c<='z'; c++) {
			s +=c;
		}
		System.out.println(s);
		
		for(int i=97; i<97+26; i++) {
			char ch2 = (char)(i);
			System.out.println("i : " + i + ", sum : " + ch2);
		}
		
	}
	
	public void method4() {
		// 1~10 까지의 홀수의 합을 구하시오.
		int sum = 0;
//		for(int i = 1; i<=10; i++) {
//			if(i%2==1) {
//				sum+=i;	
//			}
//		}
		for(int i=1; i<=10; i=i+2) {
			sum+=i;
			System.out.println("i : " + i + ", sum : " + sum);
		}
		System.out.println("1~10까지의 홀수의 합은 : " + sum);
		 
		//1~10까지의 짝수의 합을 구하시오.
		int sum2 = 0;
//		for(int i = 1; i<=10; i++) {
//			if(i%2==0) {
//				sum2+=i;
//			}
//		}
		for(int i =2; i<=10; i+=2) {
			sum2+=i;
			System.out.println("i : " + i + ", sum : " + sum2);
		}
		System.out.println("1~10까지의 짝수의 합은 : " + sum2);
	}
	
	public void method3() {
		// 10~ 20까지의 합을 구하시오.
		
		int sum = 0;
		for(int i=10; i<=20; i++) {
			sum += i;
			System.out.println("i : " + i + ", sum : " + sum);
		}
		
		System.out.println("10~20까지의 합은" + sum);
	}
	
	public void method2() {
		// 1~20 까지의 합을 구하시오.
		
		int sum = 0;
		for(int i=1; i<=20; i++) {
			sum+=i;
			System.out.println("i : "+ i+ ", sum : " +sum);
		}
		System.out.println("1~20 까지의 합은" +sum);
	}
	
	public void method1() {
		
		/*
		 *  반복문 for, while 문
		 *  for(int i=1, i<=10; i++)
		 *  
		 *  int i=1 <-초기화식
		 *  i<10    <-조건식(종료조건)
		 *  i++ <- 증감식(
		 */
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum+=i;
			System.out.println("i : "+i+", sum : " +sum);
		}
	}

}

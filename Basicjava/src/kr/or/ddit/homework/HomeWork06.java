package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork06 obj = new HomeWork06();
//		obj.method1();
//		obj.method2();
		obj.method3();
	}

	public void method1() {
		/*
		 *  전체 구구단을 출력하시오.
		 *  
		 *  2*1 = 2   3*1 = 3   4*1 = 4 ...   9*1 = 1
		 *  2*2 = 4
		 *  
		 *  
		 *  2*9 = 18 ...                      9*9 = 81
		 */
		
		// for문 행 만들고
		// 2단, 3단, 4단 ... 9단까지 옆으로 붙이기 --> 안 된다고..
		
		// 첫째줄 - 2*1 = 2(띄어쓰기) 3*1 = 3(띄어쓰기) ... 9*1 = 9 /println
		for(int i =1; i<=9; i++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.print(dan+"x"+i+"="+dan*i+"\t");
			}
			System.out.println();
		}
		
	}
	
		
		

		
		
	
	public void method2() {
		/*
		 *   전체 구구단을 출력하는데,
		 *   입력 받은 단수는 제외하고 출력
		 *   ex) 3단을 제외한 전체 구구단 출력
		 *   
		 */
		
		System.out.println("제외할 단수를 입력하시오");
		int num = sc.nextInt();
		for(int i =1; i<=9; i++) {
			for(int dan=2; dan<=9; dan++) {
//				if(num==dan) continue; 1번쨰 방법
//				if(num!=dan) {
//					System.out.print(dan+"x"+i+"="+dan*i+"\t");  2번쨰 방법
//				}
//				System.out.print(dan+"x"+i+"="+dan*i+"\t");
			}
			System.out.println();
		}
	}
	
	public void method3() {
		/*
		 *   입력 받은 값이 양의 정수이며
		 *   1. 홀수라면
		 *      n 이하의 홀수인 모든 양의 정수 총 합.
		 *      ex) 5 => 1+3+5
		 *   2. 짝수라면
		 *      n 이하의 모든 짝수의 제곱의 총 합.
		 *      ex) 6 => 2*2 + 4*4 + 6*6  
		 */
		int num = 10;
		int sum = 0;
		if(num%2==0) {
			for(int i=2; i<=num; i+=2) {
				sum+=i*1;
			}
		}
		else {
			for(int i=1; i<=num; i+=2) {
				sum+=i;
			}
		}
		System.out.println("총합은 : " + sum);
	}
	
}

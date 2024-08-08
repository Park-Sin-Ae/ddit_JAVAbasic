package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork2 obj = new HomeWork2();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		
	}
	
	public void method1() {
		/*
		 *   실수 데이터를 입력 받은후 
		 *   *100 한후 정수 부분만 출력해보기. 
		 *   1.34523
		 *   -> 134 
		 */
		System.out.println("실수 데이터를 입력하세요.");
		String num = sc.next();
		
		double num1 = Double.parseDouble(num)*100;
		System.out.printf("%d", (int)num1);
		
		/*
		 * 선생님 답
		 */
		
		double numD = Double.parseDouble(num);
		numD = numD*100;
		int numI = (int)numD;
		System.out.println(numI);
	}
	
	public void method2() {
		/*
		 *   소수점 2째 자리까지 출력.
		 *   1.34523
		 *   -> 1.34 
		 */
		System.out.println("실수 데이터를 입력하세요.");
		String num = sc.next();
		
		double num1 = Double.parseDouble(num);

		System.out.println(Math.floor(num1*100)/100.0);
		
		/*
		 * 선생님 답
		 */
		double numD = Double.parseDouble(num);
		numD = numD*100;
		int numI = (int)numD;
		numD = numI/100.0;
		System.out.println(numD);
	}
	
	public void method3() {
		/*
		 *   num1 에 num2 값을 나눈후 *2000 한 값을 출력.
		 *   num1 = 3 
		 *   num2 = 2 
		 *   -> 결과 값 3000
		 */
		
		String num1 = sc.next();
		String num2 = sc.next();
		
		double numD1 = Double.parseDouble(num1);
		double numD2 = Double.parseDouble(num2);
		
		double i = (numD1/numD2)*2000;
		System.out.printf("%d", (int)i);
		
		/*
		 * 선생님 답
		 */
		
		int numI1 = Integer.valueOf(num1);
		int numI2 = Integer.valueOf(num2);
		
//		int result = (int)(((numI1)/numI2)*2000); / 1번 방법
		
//		double r1 = (double)numI1/numI2;
//		int result = (int)(r1*2000);		/2 번방법
		
		int result = 2000*numI1/numI2;  //3번 방법 곱하기를 먼저하는 방법
		
		System.out.println(result);
		
	}
	
	public void method4() {
		/*
		 * 	 심화 과제
		 *   (생략 가능  if 문 사용 하지 않고.)
		 *   소수점 2째 자리에서 반올림 하기.
		 *   3.56
		 *   -> 3.6
		 */
		String num = sc.next();

		double num1 = Double.parseDouble(num);
//		float num1 = Float.parseFloat(num);
		System.out.printf("%.1f" , num1);
		
		/*
		 * 선생님 답
		 * 3.54
		 * -> 4
		 */
		
		double d1 = 3.54;
		
		int n1 = (int)d1;
		int n2 = (int)((d1-n1)*2);
		
		int result = n1+n2;
		System.out.println(result); //1번방법
		
//		d1 = d1+0.5;
//		int result = (int)d1;
//		System.out.println(result); //2번방법
	}
	
}

package kr.or.ddit.study05;

import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();
	}
	
	public void method1() {
		/*
		 * 학생 점수 10개 선언 해서 값을 저장해보기.
		 * int
		 * 
		 * 10명 학생의 점수 총합 구해보기.
		 */
		
		 int[] arr = new int [10];
		 arr[0] = 70;
		 arr[1] = 72;
		 arr[2] = 72;
		 arr[3] = 72;
		 arr[4] = 72;
		 arr[5] = 72;
		 arr[6] = 72;
		 arr[7] = 72;
		 arr[8] = 72;
		 arr[9] = 72;
		 // 배열.length 배열의 길이
		 int sum = 0;
		 for(int i=0; i<arr.length; i++) {
			 sum+=arr[i];
			 System.out.println(arr[i]);
		 }
		 System.out.println("총 합은 : "+sum);
	}
	
	public void method2() {
		/*
		 * 크기 5짜리 int 타입 배열 생성
		 * []  <- 배열선언
		 * arr <- 배열 이름
		 * new <- 객체 생성
		 * int[숫자] <- 생성도리 개수
		 */
//		int arr[] = new int[5]; // 둘 다 상관없음
		int[] arr = new int[5]; // 변수명이 길어질 경우가 있기에 타입 뒤에 써 주는게 좋음
//		System.out.println(arr);
		
		// 크기 5짜리 int 타입의 배열을 생성하고
		// 데이터를 저장
		// {10,20,30,40,50}
		// ,  <-데이터 구분
		// 10 <- 같은 타입의 데이터 입력
		int[] arr2 = {10,20,30,40,50};
	}
	
	public void method3() {
		// int 타입 변수 5개 저장하고
		// 역순으로 출력해보기.
		
		int[] arr = {10,20,30,40,50};
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[arr.length-1-i]);
		}
		
	
	}
	
	public void method4() {
		int[] score = {77,95,57,67,84};
		/*
		 * 최대값 구하기.
		 */
		int max = score[0];
		int min = score[0];
		for(int i = 0; i<score.length; i++) {
			if(max<score[i]) {
				max = score[i];
				
			}
			if(max>score[i]) {
				min = score[i];
			}
			
		}System.out.println("최대값은 :" + max+"\t" + "최소값은 : " + min);
		
	}
	
	public void method5() {
		/*
		 * 타입별 초기 값.
		 * boolean : false;
		 * char    : \u0000 = ' '
		 * byte, short, int, long : 0
		 * float   : 0.0f
		 * double  : 0.0
		 * 
		 * reference type : null
		 */
		
		boolean[] bArr = new boolean[10];
		for (int i = 0; i < bArr.length; i++) {
			System.out.println(bArr[i]);
			
		}
	}
	
	public void method6() {
		/*
		 * 로또 번호 6개 출력하기.
		 * 1. 로또 배열 45개 생성.
		 * 2. 각 배열에 값을 넣기.
		 * 3. 배열 섞기.
		 * 4. 45개 배열중에 앞에서 6개 출력하기.
		 */
		
//		int[] lotto = new int[6];
//		
//		System.out.print("로또 번호 : ");
//		for(int i = 0; i<lotto.length; i++) {
//			int num = (int)(Math.random()*45) +1;
//			lotto[i] = num;
//			for(int j = 0; j<i; j++) {
//				if(lotto[i]==lotto[j]) {
//					i--;
//					break;
//				}
//			}
//			System.out.print(lotto[i]+" ");
//		}
		//1
		int[] lotto = new int[45];
		System.out.print("로또번호 : ");
		//2
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = i+1; 
		}
		//3
		for(int i = 0; i<10000; i++) {
			int ran = (int)(Math.random()*lotto.length);
			int temp = lotto[ran];
			lotto[ran] = lotto[0];
			lotto[0] = temp;
			
		}
		//4 
		for(int i = 0; i<6; i++) {
			System.out.print(+lotto[i]+"\t");
		}
		
		// 5.배열 길이가 6개인 배열을 생성하여
		//   로또 번호 앞에 6개를 복사하기
		int[] sixArray = new int[6];
		for(int i = 0; i<6; i++) {
			sixArray[i]=lotto[i];
		}
		
	}
}


package kr.or.ddit.study06.sec04;

import java.util.Date;

public class Recursion {
	public static void main(String[] args) {
		Recursion r = new Recursion();
		long fact = r.factorial(5);
		System.out.println(fact);
		int sum = r.sum(3);
		System.out.println(sum);
		
		Date d1 = new Date();
		long febo = r.febo(50);
		Date d2 = new Date();
		System.out.println(d2.getTime()-d1.getTime()+"ms");
		System.out.println(febo);
	}
	
	long[] result = new long[100];
	public long febo(int num) {
		// 1 1 2 3 5 8 13 21 34 ...
		if(num==1) return 1;
		if(num==2) return 1;
		
		if(result[num] != 0) {	
			return result[num];
		}else {
			long l = febo(num-1)+febo(num-2);
			result[num] = 1;
			return l;
			
		}
		
	}
	
	public int sum(int num) {
		/*
		 *  for문을 사용하지 말고 재귀 함수 구조로
		 *  1+2+3+num 총합 구하기.
		 */
		if(num==1) return 1;
		return sum(num-1)+num;
	}

	public long factorial(int i) {
		if(i==1) return 1; // 재귀함수는 꼭 종료 조건을 넣어 줘야한다.
		return factorial(i-1)*i; // 종료조건이 만족 할 때까지 실행된다.
	}
}

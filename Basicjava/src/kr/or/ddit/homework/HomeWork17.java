package kr.or.ddit.homework;

import java.util.Calendar;
import java.util.Scanner;

public class HomeWork17 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork17 obj = new HomeWork17();
		obj.process();
		
		
	}
	public void process() {
		Calendar cal = Calendar.getInstance();
		
		while(true) {
			
			cal.set(Calendar.DATE, 1); // 1일에 해당하는 날짜마다 출력
			int day = cal.get(Calendar.DAY_OF_WEEK);
			System.out.println("===================="+ cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONTH) + 1) + "월======================");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("==================================================");
			for (int i = 1; i < day; i++) System.out.print("\t");
			int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
			
			for(int i = 1; i <= lastDay; i++) {
				cal.set(Calendar.DATE, i); // 1일에 해당하는 날짜마다 출력
				System.out.print(i + "\t");
				int day2 = cal.get(Calendar.DAY_OF_WEEK); // 요일 체크
				if(day2 == 7) System.out.println();
			}
			String str = sc.next();
			if(str.equals("<")) cal.add(Calendar.MONTH, -1);
			if(str.equals(">")) cal.add(Calendar.MONTH, 1);
		}
			
			
		}
	
		// 월 마지막 일
//		while(true) {
//			cal.set(Calendar.DATE, 1);
//			int lastDay = cal.getActualMaximum(Calendar.DATE);
//			System.out.println("일\t월\t화\t수\t목\t금\t토 ");
//			
//			// 일주일 중 현재 요일
//			// 일 1 월 2 화 ... 토 7
//			int day = cal.get(Calendar.DAY_OF_WEEK);
//			System.out.println(day);
//			
//			for(int i = 1; i < day; i++) {
//				System.out.print("\t");
//			}
//			for(int i = 1; i < lastDay; i++) {
//				System.out.printf("%4d", i);
//				day++;
//				
//				if(day%7 == 1) {
//					System.out.println();
//				}
//				
//			}
//			if(day%7 != 1 )
//				System.out.println();
//			System.out.println(" ===========================");
		
			/*
			 * 	  2024.01
			 * -------------
			 * 이전달<   >다음달
			 * -------------
			 * 일 월 화 수 목 금 토
			 *   1 2 3 4 5 6
			 * 7 8 9 10...
			 * 
			 * 			31
			 */
//		}
		
}

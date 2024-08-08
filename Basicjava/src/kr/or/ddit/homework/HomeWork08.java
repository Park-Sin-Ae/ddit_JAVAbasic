package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork08 obj = new HomeWork08();
		obj.process();
	}
	
	public void process() {
		/*
		 * 5개의 점수를 입력 받고
		 * 
		 * 길이가 5개 짜리 int 배열에 값을 저장해보자.
		 * 
		 * 그 후에 1을 선택하면 오름차순 정렬
		 * 		2를 선택하면 내림차순 정렬
		 * 
		 * 정렬된 결과 값을 출력.
		 * 
		 */
		int[] score = new int[5];
		
		System.out.println("점수를 입력하세요(5개)");
		for(int i = 0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		System.out.println("1: "+"오름차순"+"\t"+"2: "+"내림차순");	
		int cond = sc.nextInt();	
		
		if(cond==1) {
			for(int i = 0; i<score.length-1; i++) {
				boolean flag = true;
				for(int j = 0; j<score.length-1; j++) {
					if(score[j] > score[j+1]) {
						int temp = score[j];
						score[j] = score[j+1];
						score[j+1] = temp;
						flag = false;
					}
				} if(flag) break;
				
			}for(int i = 0; i<score.length; i++) {
				System.out.print(score[i]+"\t");
			}

		
		} else if(cond==2) {
			for(int i = 0; i<score.length-1; i++) {
				boolean flag = true;
				for(int j = 0; j<score.length-1; j++) {
					if(score[j] < score[j+1]) {
						int temp = score[j];
						score[j] = score[j+1];
						score[j+1] = temp;
						flag = false;
					}
				} if(flag) break;
				
			}for(int i = 0; i<score.length; i++) {
				System.out.print(score[i]+"\t");
			}
		}

	}
}


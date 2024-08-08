package kr.or.ddit.homework;

import java.util.Scanner;


public class HomeWork09 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
		obj.process();
	}
	
	public void process() {
		// 5명의 3과목 성적과 이름을 배열에 저장하고. 국어, 영어, 수학
		// 총점과 평균과 등수를 구하여 출력 하시오. (소숫점 생략)
		String[] stName = {"강타","문희준","이재원","장우혁","토니안"};
		int[][] score = {{80,70,80,0,0,1},
				 		 {90,85,90,0,0,1},
				 		 {90,70,75,0,0,1},
				 		 {65,75,70,0,0,1},
				 		 {80,70,70,0,0,1}
		};
	
		
		
		for(int i = 0; i<score.length; i++) {
			//총점 계산.
			score[i][3] = score[i][0]+score[i][1]+score[i][2];
			//평균 계산.
			score[i][4] = score[i][3]/3;
			
		}
		// 등수 구하기
		for(int i =0; i<score.length; i++) {
			// 내 점수랑 다른 사람들의 점수랑 비교하기.
			for(int j = 0; j<score.length; j++) {
				if(score[i][3]<score[j][3]) {
					score[i][5]++;
				}
			}
			
		}
//		
		for(int i = 0; i<score.length; i++) {
			System.out.print(stName[i]+"\t");
			for(int j = 0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		/*
		 * 정렬하기 배열을 바꿔야함(이름+등수)
		 */
		
		
		System.out.println("-------------------------------정렬하기");
				
		for(int i = 0; i<score.length-1; i++) {
			for(int j = 0; j<score.length-1; j++) {
				if(score[j][3] < score[j+1][3]) {
					int[] temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
					
					String temp2 = stName[j];
					stName[j] = stName[j+1];
					stName[j+1] = temp2;
					
				}
				System.out.println(score);
			}
			
		}
		
		int[] intArray = {10, 20, 30};
		int num = intArray.length;
		System.out.println("배열"+num);
	}
		
}

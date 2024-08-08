package kr.or.ddit.study05;

import java.util.Scanner;

public class ArrayExample02 {
Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	ArrayExample02 obj = new ArrayExample02();
//	obj.method1();
//	obj.method2();
//	obj.method3();
//	obj.method4();
//	obj.method5();
//	obj.method6();
//	obj.method7();
	obj.method8();
}

	public void method8() {
		
		/*
		 * 향상 된 for 문
		 */
		String[] str = {"a","b","c"};
		
		for(int i = 0; i<str.length; i++) {
			String s = str[i];
		}
		
//		for(String s : str) {  
//			System.out.println(s);
//		}
		
		int[] num = {1,2,3};
		for(int i : num) { //i에 넣은 num 값이 차례대로 나온다
			System.out.println(i);
		}
		
		
	}

	public void method7() {
		/*
		 * 로또 다시 만들고
		 * system.arraycopy 이용해 6개만 복사 해보기.
		 * 버블 정렬을 이용해서 6개의 숫자 정렬 하기.
		 */
		
		System.out.print("로또 번호 : ");
		int[] lotto = new int[45];
		for(int i = 0; i<45; i++) lotto[i] = i+1;
		for(int i = 0; i<10000; i++) {
			int ran = (int)(Math.random()*lotto.length);
			int temp = lotto[0];
			lotto[0] = lotto[ran];
			lotto[ran] = temp;
		}
		int[] l = new int[6];
		System.arraycopy(lotto, 0, l, 0, 6);
		
		for(int i = 0; i<l.length; i++) {
			System.out.print(l[i]+ "\t");
		}
		
		int[] target = l.clone();
		System.out.println("");
		System.out.println("복사");
		for(int i = 0; i<target.length; i++) {
			System.out.print(target[i]+"\t");
		}
		for(int i = 0; i<l.length-1; i++) {
			boolean flag = true;
			for(int j = 0; j<l.length-1; i++) {
				if(l[j]<l[j+1]) {
					int temp = l[j];
					l[j] = l[j+1];
					l[j+1] = temp;
					flag =false;
				}
			} if(flag) break;
			
		} 
		System.out.println();
		for(int i = 0; i<l.length; i++) {
			System.out.println(l[i]+"\t");
		}
	}

	public void method6() {
		/*
		 * 	배열 복사
		 * 	2. 깊은 복사(deep copy)
		 *     배열 공간을 별도로 확보(heap 영역에)	   
		 * 	  2.1  반복문이용
		 * 	  2.2 System.arraycopy
		 * 	  2.3 clone
		 * 	 
		 */
		
		// 반복문 이용
		int[] source = {1, 2, 3, 4, 5};
		int[] target = new int[source.length]; //새로운 공간 확보
		// 서로 다름
		
		for(int i = 0; i<source.length; i++) {
			target[i] = source[i];
		}
		
		target[1] = 10;
		System.out.println("원본배열");
		for(int i = 0; i<source.length; i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();
		System.out.println("복사된 배열");
		for(int i = 0; i<target.length; i++) {
			System.out.print(target[i]+"\t");
		}
		System.out.println();
		
		// System.arraycopy 지정 복사
		int[] target2 = new int[source.length];
		System.arraycopy(source, 0, target2, 0, source.length); //복사할배열, 어디부터복사, 복사할위치배열, 저장할 위치,길이지정 
		target2[1] = 11;
		System.out.println("원본배열");
		for(int i = 0; i<source.length; i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();
		System.out.println("System.arraycopy 으로 복사된 배열");
		for(int i = 0; i<target.length; i++) {
			System.out.print(target[i]+ "\t");
		}
		System.out.println();
		
		// clone 전체복사
		int[] target3 = source.clone();
		target2[1] = 11;
		System.out.println("원본배열");
		for(int i = 0; i<source.length; i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();
		System.out.println("clone 으로 복사된 배열");
		for(int i = 0; i<target3.length; i++) {
			System.out.print(target3[i]+ "\t");
		}
		System.out.println();
	}
	
	public void method5() {
		/*
		 * 	배열 복사
		 * 	1. 얕은 복사(shallow copy)
		 * 	       복사된 배열이나 원본 배열이 변경될 때 서로간의 값이 같이 변경 
		 */
		
		int[] source = {1, 2, 3, 4, 5};
		int[] target = source;
		
		target[1] = 10;
		System.out.println("원본 배열");
		for(int i = 0; i<source.length; i++) {
			System.out.print(source[i]+"\t");
		}
		System.out.println();
		System.out.println("복사된 배열");
		for(int i = 0; i<target.length; i++) {
			System.out.print(target[i]+"\t");
		}
	}

	public void method4(){
		/*
		 * 선택 정렬 (최소값에 최대값을 넣어 비교)
		 */
		
		int[] num = {70, 65, 44, 90, 83};
		
		for(int i = 0; i<num.length-1; i++) { // length-1(n-1)만큼실행한다
			int min = num[i];
			int index = i; //최소값의 위치
			for(int j=i; j<num.length; j++) { //최소값을 찾아서 0번째 배열과 바꾼다 // 전체배열을 비교하기위해 length-1을 사용하지 않는다
				if(min>num[j]) {
					min = num[j];
					index = j;
				}
			}
			int temp = num[i];
			num[i] = num[index];
			num[index] = temp;
		}
		for(int i = 0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
	}
	
	public void method3() {
		int[] score = {70, 65, 44, 90, 83};
		
			// 1,2,3,4,5
		// 2,1,3,4,5
		// 2,3,1,4,5
		//
		// 2,3,4,5,1
		// 3,4,5,2,1
		/*
		 * 	오름차순으로 출력(큰 숫자가 앞으로)
		 */
		
		for(int i = 0; i<score.length-1; i++) {
			for(int j = 0; j<score.length-1; j++) {
				if(score[j] < score[j+1]) {
					int temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
			}
		}for(int i = 0; i<score.length; i++) {
			System.out.print(score[i]+"\t");
		}
	}
	
	public void method2() {
		/*
		 * 향상된 버블 정렬
		 * 버블 정렬 진행 중 더이상 값이 바뀌지 않는 경우
		 * 중단한다.
		 */
		
		int[] num = {63, 95, 87, 94, 75};
		for(int i = 0; i<num.length-1; i++) {
			boolean flag = true;
			for(int j = 0; j<num.length-1; j++) { 
				if(num[j] < num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					flag = false;  // 정렬이 아직 끝나지 않았으니 false 이므로 for문이 반복된다
				}
			}
			if(flag) break; //true 인경우 중단
		}
	}
	public void method1() {
		/*
		 * 	버블 정렬
		 * 	원본 자료가 n개일때 n-1차 운행한다.
		 * 	각 회차에서 인접한 값을 비교하여 오름차순인 경우 작은 값을 앞에 위치시킴
		 */
		
		int[] num = {95, 87, 94, 75, 63};
		for(int i = 0; i<num.length-1; i++) { // 오름차순 정렬을 위해 반복하는 문 (정렬이 될때까지 반복한다)
			for(int j = 0; j<num.length-1; j++) {
				// i = 0
				// j = 0 95, 87, 94, 75, 63
				// j = 1 95, 94, 87, 75, 63
				// J = 2 95, 94, 87, 75, 63
				// J = 3 95, 87, 94, 75, 63
				// i = 1 95, 87, 94, 75, 63
				// j = 0 95, 87, 94, 75, 63
				// j = 1 95, 94, 87, 75, 63
				if(num[j]<num[j+1]) { //+1은 배열 순서
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		for(int i = 0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
	}
}

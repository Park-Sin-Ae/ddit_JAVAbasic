package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork05 {
	Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
		HomeWork05 hw = new HomeWork05();
//		hw.method5();
//		hw.method6();
		hw.method7();
	}
	public void method1() {
		/*
		 * for 문을 이용해서 다음 모양을 그려보시오.
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * 
		 */
		System.out.println("숫자를 입력해 주세요.");
		int num = sc.nextInt();
		for(int i = 0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method2() {
		/*
		 * for 문을 이용해서 다음 모양을 그려보시오.
		 *     *
		 *    **
		 *   ***
		 *  ****
		 *  
		 */
		
		System.out.println("숫자를 입력해 주세요.");
		int num = sc.nextInt();
		for(int i = 0; i<num; i++) {
			for(int space = 0; space<num-i-1; space++) {
				System.out.print(" ");
				
			}
			for(int str=0; str<=i; str++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
	
	public void method3() {
		
		/*
		 * for 문을 이용해서 다음 모양을 그려 보시오
		 * ****
		 * ***
		 * **
		 * *
		 * 
		 */
		System.out.println("숫자를 입력해 주세요.");
		int num = sc.nextInt();
		for(int i = 0; i<num; i++) {
			
			for(int str=0; str<=num-i-1; str++) {
				System.out.print("*");
				
			}
			for(int space = 0; space<=i; space++) {
				System.out.print(" ");
				
			}
			System.out.println();
		}
	
	}
	
	public void method4() {
			
			/*
			 * for 문을 이용해서 다음 모양을 그려 보시오
			 * 
			 *     ****
			 *      ***
			 *       **
			 *        *
			 * 
			 */
		System.out.println("숫자를 입력해 주세요.");
		int num = sc.nextInt();
		for(int i = 0; i<num; i++) {
			for(int space = 0; space<=i; space++) {
				System.out.print(" ");
				
			}
			
			for(int str=0; str<=num-i-1; str++) {
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}
	
	public void method5() {
		
		/*
		 * for 문을 이용해서 다음 모양을 그려 보시오
		 * 
		 *  aaa*
		 *  aa***
		 *  a*****
		 *  *******
		 * 
		 */
		System.out.println("숫자를 입력해 주세요.");
		int num = sc.nextInt();
		for(int i = 0; i<4; i++) {
			for(int space = 0; space < num-i-1; space++) {
				System.out.print(" ");
				
			}
			for(int star = 0; star < i*2+1; star ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void method6() {
		
		/*
		 * for 문을 이용해서 다음 모양을 그려 보시오
		 * 
		 *     *******
		 *     a*****
		 *     aa***
		 *     aaa*
		 * 
		 */
		
		System.out.println("숫자를 입력해 주세요.");
		int num = sc.nextInt();
//		for(int i = num; i > 0; i--) {
//			for(int space=num-i; space>0; space--) {
//				System.out.print("a");
//			}
//			for(int star = i*2-1; star >0; star--) {
//				System.out.print("*");
//			}
//						
//			System.out.println();
//		}
		for(int i = 0; i < num; i++) {
			for(int space=0; space<i; space++) {
				System.out.print("a");
			}
			for(int star = 0; star <(num-i)*2-1; star++) {
				System.out.print("*");
			}
						
			System.out.println();
		}
	}
	public void method7() {
		
		/*
		 * for 문을 이용해서 다음 모양을 그려 보시오
		 * 
		 *     ****
		 *     *  *
		 *     *  *
		 *     ****
		 * 
		 */
		System.out.println("숫자를 입력해 주세요");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			for(int star = 0; star<num; star++) {
				if(i==0||i==num-1||star==0||star==num-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}
}

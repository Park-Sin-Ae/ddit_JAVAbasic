package kr.or.ddit.study06.sec04;

public class Computer {
	public static void main(String[] args) {
		Computer c = new Computer();
		int[] array = {1,2,3,4,5};
//		int result = c.add(array);
		int result = c.mltpl(array);
		System.out.println("결과값 : " +  result);
//		System.out.println("결과값 : " +  result1);
		
	}
	/*
	 * 	파라미터로 int 배열 값을 받아 더해주는 메소드를 설계해 보세요.
	 * 	리턴은 합을 리턴
	 */
	public int add(int[] array) {
		int sum = 0;
		for(int i = 0; i<array.length; i++) {
			sum += array[i];
	
		}
		
		return sum;
	}
	/*
	 * 	파라미터로 int 배열 값을 받아 *2 한 후 더해주는 메소드를 설계해 보세요.
	 * 	리턴은 합을 리턴
	 */
	
	public int mltpl(int[] array) {
		int sum = 0;
		for(int i = 0; i<array.length; i++) {
		
			sum += array[i]*2;
		}
		
		return sum;
	}
}

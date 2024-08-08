package kr.or.ddit.study06.sec04;

public class Cal {
	public static void main(String[] args) {
		Cal cal = new Cal();
		int add = cal.add(10, 10);
		System.out.println(add);
		
		int a = 10;
		int b = 9;
		
		System.out.println(cal.minus(a,b));
		System.out.println(cal.multiple(a,b));
		System.out.println(cal.dvsn(a,b));
		System.out.println(cal.per(a,b));
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}
	
	public int multiple(int a, int b) {
		return a*b;
	}
	
	public double dvsn(int a, int b) {
		return (double)a/b;
	}
	
	public int per(int a, int b) {
		return a%b;
	}
}

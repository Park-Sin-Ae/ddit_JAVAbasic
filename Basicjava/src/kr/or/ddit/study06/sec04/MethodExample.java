package kr.or.ddit.study06.sec04;

public class MethodExample {
	public static void main(String[] args) {
		System.out.println("메인 메소드");
		
		MethodExample me = new MethodExample();
		me.method1();
		int i2 = me.method2();
		System.out.println("method2 리턴 값  : " + i2);
		double d3 = me.method3();
		System.out.println("method3 리턴 값  : " + d3);
	}
	
	public void method1() {
		System.out.println("public void method1");
		System.out.println("리턴 값 없어요");
	}
	
	public int method2() {
		System.out.println("public void method2");
		System.out.println("리턴 값 int");
		return 10;
	}


	public double method3() {
		System.out.println("public void method3");
		System.out.println("리턴 값 double");
		return 5.5;
	
}

}

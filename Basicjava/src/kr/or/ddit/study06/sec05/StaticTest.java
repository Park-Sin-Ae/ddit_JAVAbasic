package kr.or.ddit.study06.sec05;

import java.util.Arrays;

public class StaticTest {
	
	int field = 10;
	static int static_field = 11; //static 을 붙일때는 파일 앞에 붙인다.
	
	public static void main(String[] args) {
		StaticTest.s_method1(); // 필드를 접근하는 방법 클래스+(불러울)메서드
		StaticTest.s_method2();
		System.out.println(StaticTest.static_field);
		
		// method1 에서 method2를 부를 수 있다.
		// method1 에서 field를 부를 수 있다.method2에서 field를 부를 수 있다.
		// method1에서 s_method1을 부를 수 있다.
		// s_method2에서 field를 부를 수 없다.(어떤 필드를 불러? 라고 물어봄)
		// s_method 에서 static field를 부를 수 있다.
		// s_method1에서 s_mehotd2를 부를 수 있다(같은 스테틱 메서드이기 때문에)
		
		// Static 메서드는 객체를 만들 지 않아도 데이터에 올라가 있다.
		
//		Arrays array = new Arrays();
//		array.sort(); // 객체를 사용 한것
//		Arrays.sort(); // 객체를 사용하지 않고 바로 사용하는 것은 스태틱 메서드 이다.
	}
	
	public void method1() {
		
	}
	
	public void method2() {
		
	}
	
	public static void s_method1() {
		StaticTest st = new StaticTest();
		st.method1();
	}
	
	public static void s_method2() {
		
	}

}

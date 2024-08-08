package kr.or.ddit.study11;

import java.io.File;

public class StringLang {
	public static void main(String[] args) {
		StringLang s1 = new StringLang();
//		s1.method1();
//		s1.method2();
//		s1.method3();
//		s1.method4();
//		s1.method5();
//		s1.method6();
//		s1.method7();
		s1.method8();
	}
	
	public void method8() {
		String test = "스플릿 테스트, test1, test2, test3, test4";
		System.out.println(test);
		String tokens[] = test.split(","); // 콤마 기준으로 쪼개서 String 배열에 넣어라
		for(String s : tokens) {
			System.out.println(s.trim());
		}
	}
	
	public void method7() {
		//  객체가 생성되어야 메서드를 사용할 수 있다.
		String str = null;
		if(str == null || str.isEmpty()) {
			System.out.println("비었음");
		}
	}
	
	public void method6() {
		
		String test = "가나다라마 phone";
		
		test = test.replace("원본 문자열", "바뀔 문자열");
		test = test.replace("phone", "핸드폰");
		System.out.println(test);
		
		// 정규식을 통해 바꿈.
//		test.replaceAll(regex, replacement);
	}
	
	public void method5() {
		String test = "문자 테스트          \n \r";
		System.out.println(test);
		System.out.println("----------");
		test = test.trim();
		System.out.println(test);
		System.out.println("----------");
	}
	
	public void method4() {
		
		// 검색할때 많이 사용 함
		String test = "aBcD";
		
		System.out.println("소문자"+test);
		test = test.toUpperCase();
		if(test.contains("ABCD")) {
			System.out.println("포함");
		}
		System.out.println("대문자"+test);
		
		System.out.println("----------");
		test = "ABCD";
		System.out.println("대문자"+test);
		test = test.toLowerCase();
		System.out.println("소문자"+test);
	}
	
	public void method3() {
		String test = "문자열 text 입니다.";
		
		
		// 시작하는 문자 체크(주로 한 년도에 대한 데이터를 부를 때 사용)
		String start = "문자열";
		if(test.startsWith(start)) {
			System.out.println(start + "로 시작합니다.");
		}
		
		// 끝나는 문자 체크 (주로 확장자 검사에 쓰임)
		String end = "입니다.";
		if(test.endsWith(end)) {
			System.out.println(end+"로 끝납니다.");
		}
		
		// 2024년으로 시작하는 엑셀파일 개수를 구하시오.
		
		int cnt = 0;
		File dir = new File("원하는 폴더 경로");
		// 디렉토리(폴더)에 있는 모든 파일 이름을 가져온다.
		for(String s : dir.list()) {
			if(!s.startsWith("2024")) continue;
			if(s.endsWith(".xls") || s.endsWith(".xlsx")) {
				cnt++;
			}
		}
		

	}
	
	public void method2() {
		String test = "문자열 test 입니다.";
		String search = "test";
		
		if(test.contains(search)) {
			System.out.println(search + " : 값이 포함되어 있습니다.");
		}
		
		
		// equals : 값이 동일 할때 출력
		search = test;
		if(test.equals(search)) {
			System.out.println(search + " : 값이 동일 합니다.");
		}
	}
	
	public void method1() {
		String test = "문자열 test 입니다.";
		// 문자열 순서대로 하나씩 꺼낼때
		for(int i = 0; i<test.length(); i++) {
			System.out.println(test.charAt(i));
		}
		
		// 문자열 전체를 꺼낼때,
		for(char c : test.toCharArray()) { 
			System.out.println(c);
		}
	}
}

package kr.or.ddit.study06.sec02;

public class Student {
	/*
	 *  국어, 영어, 수학
	 *  총점, 평균 , 등수
	 *  
	 *  이름 
	 */
	
	int kor;
	int eng;
	int math;
	
	int sum;
	double svg;
	
	int rank;
	
	String name;

	@Override
	public String toString() {
		return "Student [kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", svg=" + svg + ", rank="
				+ rank + ", name=" + name + "]";
	}
	
	// alt+shift+s 
	// generate toString()
}

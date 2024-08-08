package kr.or.ddit.study06.sec03;

public class Sing {
	/*
	 *  이름
	 *  가수
	 *  가사
	 *  연도
	 */
	
	String name;
	String singer;
	String lyrcs;
	String year;
	
//	String name = "여수 밤바다";
//	String singer = "버스커버스커";
//	String lyrcs = "여수밤바다 그 조명에 담긴 아름다운 얘기가 있어 네게 들려주고파 전활 걸어";
//	String year = "2019년 12월 1일";
	
	// 기본 생성자
	public Sing() {
		
	}
	
	public Sing(String name, String singer, String lyrcs, String year) {
		this.name = name;
		this.singer = singer;
		this.lyrcs = lyrcs;
		this.year = year;
	}
}

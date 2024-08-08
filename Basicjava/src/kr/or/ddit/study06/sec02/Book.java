package kr.or.ddit.study06.sec02;

public class Book {
	/*
	 *  책 제목, 작성자, 등록일, 책 설명
	 * 
	 */
	String nation = "한국";
	String title;
	String writer;
	String date;
	String expln;
	@Override
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + ", date=" + date + ", expln=" + expln + "]";
	}

	
	
}

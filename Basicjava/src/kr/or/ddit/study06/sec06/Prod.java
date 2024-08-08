package kr.or.ddit.study06.sec06;

public class Prod {
	/*
	 * 상품가격, 이름, 내용
	 * 
	 * getter setter 만들어서 사용 해볼 것.
	 */
	
	private int price;
	private String name;
	private String cont;
	    
	public int getPrice() {
		return price;
	}
	public String getConetnt() {
		return cont;
	}
	public String getName() {
		return name;
	}

	public int setPrice(int i) {
		return price;
	}
	public String setConetnt(String string) {
		return cont;
	}
	public String setName(String string) {
		return name;
	}
	
	@Override
	public String toString() {
		return "Prod [price=" + price + ", name=" + name + ", cont=" + cont + "]";
	}
	
	
}

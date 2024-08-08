package kr.or.ddit.homework.home12;

public class Tv {
	String mnfct;
	String prdctYear;
	int size;
	
	public Tv(String mnfct, String prdctYear, int size) {
		this.mnfct = mnfct;
		this.prdctYear = prdctYear;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tv [mnfct=" + mnfct + ", prdctYear=" + prdctYear + ", size=" + size + "]";
	}
	
}

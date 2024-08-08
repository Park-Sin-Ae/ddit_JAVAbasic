package kr.or.ddit.study07.pen;

public class FoutainPen extends BallPen {
	/*
	 *  남은양
	 *  칼라
	 *  
	 *  
	 */
	int amount;
	String color;
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void refill(int add) {
		setAmount(getAmount()+add);
	}
}

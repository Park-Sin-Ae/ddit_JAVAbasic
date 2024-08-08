package kr.or.ddit.homework;

public class HomeWork15 {
	public static void main(String[] args) {
		HomeWork15 cal = new HomeWork15();
		
//		System.out.println("덧셈 : " + cal.add(2,3));
//		System.out.println("뺄셈 : " + cal.min(2,3));
//		System.out.println("곱셈 : " + cal.mult(2,3));
//		System.out.println("나눗셈 : " + cal.dvsn(2,3));
		/*
		 * 계산기 만들기.
		 */	
		cal(10,Oper.GDP, 5);
		
		
	}
	
	public static double cal( int a, Oper oper, int b) {
		HomeWork15 cal = new HomeWork15();
	      if(oper == Oper.PLUS) {
	    	  return cal.add(a,b);
	      } else if(oper == Oper.MINUS) {
	    	  return cal.min(a,b);
	      } else if (oper == Oper.GDP) {
	    	  return cal.mult(a, b);
	      } else if(oper == Oper.NANUGI) {
	    	  return cal.dvsn(a,b);
	      } else if(oper == Oper.PER) {
	    	  return cal.per(a,b);
	      }else return 0.0;
	    
	   }
	
	public int per(int a, int b) {
		return a%b;
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int min(int a, int b) {
		return a-b;
	}
	
	public int mult(int a, int b) {
		return a*b;
	}
	
	public double dvsn(double a, double b) {
		return a/b;
	}
	
	
	// 3*4.5 숫자2 연산자 1개
	public static double cal(String s) {
		// 3*4
		// [3, 4]
		String[] oper = {"*","/"};
		for(int i = 0; i<oper.length; i++) {
			if(s.contains(oper[i])) {
				String[] nums = s.split("\\" + oper[i]);
				int a = Integer.parseInt(nums[0]);
				int b = Integer.parseInt(nums[1]);
				return cal(a, oper[i], b);
			}
		}
		if(s.contains("*")) {
			String[] nums = s.split("\\*");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			return cal(a, "*", b);
		}
		if(s.contains("/")) {
			String[] nums = s.split("\\/");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			return cal(a, "/", b);
		}
		if(s.contains("-")) {
			String[] nums = s.split("\\-");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			return cal(a, "-", b);
		}
		if(s.contains("+")) {
			String[] nums = s.split("\\+");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			return cal(a, "+", b);
		}

	return 0;	
	}
}

 

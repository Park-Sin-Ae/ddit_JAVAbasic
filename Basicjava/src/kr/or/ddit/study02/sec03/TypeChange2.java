package kr.or.ddit.study02.sec03;

public class TypeChange2 {
	public static void main(String[] args) {
		String s1 = "10";
		int i = Integer.valueOf(s1);
		System.out.println(i);
		
		/*
		 * 	byte	-> Byte
		 * 	short	-> Short
		 * 	int		-> Integer
		 * 	long	-> Long
		 * 
		 * 	float	-> Float
		 * 	double	-> Double
		 * 
		 * 	boolean	 -> Boolean
		 */
		
		int i1 = Integer.valueOf(s1) +1;
		int i2 = Integer.parseInt(s1) +2;
		System.out.println(i1+", "+i2);

		//String -> byte
		String s2 = "10";
		byte b2 = Byte.parseByte(s2);
		System.out.println("String -> byte : " + s2 + ", " + b2);
		
		//String -> short
		String s3 = "200";
		short b3 = Short.parseShort(s3);
		System.out.println("String -> Short : " + s3 + ", " + b3);
		
		//String -> long
		String s4 = "1000000000";
		long b4 = Long.parseLong(s4); 
		System.out.println("String -> Long : " + s4 + ", " + b4);
		
		//String -> float
		String s5 = "22.456";
		float b5 = Float.parseFloat(s5);
		System.out.println("String -> Float : " + s5 + ", " + b5);
		
		//String -> double
		String s6 = "124";
		double b6 = Double.parseDouble(s6);
		System.out.println("String -> Double : " + s6 + ", " + b6
				);
	}
}

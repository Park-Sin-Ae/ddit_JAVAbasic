	package kr.or.ddit.homework;

		public class HomeWork11 {
			public static void main(String[] args) {
				/*
				 *  1. 생성자를 통해  x, y, 높이, 너비를 입력 받고 
				 *   area 값은 자동으로 계산 하도록 하자.
				 *   area 넓이 값은 높이 * 너비
				 */
				
				/*
				 *  2. 생성자를 통해  Point,  높이, 너비를 입력 받고
				 *    point 클래스에서 꺼낸 x, y 값을 통해 
				 *    1번 문제에 생성자를 호출 해보도록 하자.     
				 */
				
				/*
				 * 1, 2번 결과 출력.
				 */
				Point pnt = new Point(9,1);
				Rectangle re1 = new Rectangle(pnt, 7, 2);
//				Rectangle re1 = new Rectangle(new Point(1,2), 7, 2);
				System.out.println(re1);
			}

		}			
	
		class Rectangle {
			int area;
			int x;
			int y;
			int height;
			int width;
			
			

			public Rectangle(int x, int y, int height, int width) {
				this.area = width * height;
				this.x = x;
				this.y = y;
				this.height = height;
				this.width = width;
			}
			public Rectangle(Point point, int height, int width) {
				this(point.x, point.y, height, width);
			}
			@Override
			public String toString() {
				return "Rectangle [area=" + area + ", x=" + x + ", y=" + y + ", height=" + height + ", width=" + width
						+ "]";
			}
	

	}

		class Point{
			int x;
			int y;
			Point(int x, int y){
				this.x = x;
				this.y = y;
			}
			
		}


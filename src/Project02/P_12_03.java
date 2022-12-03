package Project02;



	class Point < X , Y >{
		X x; 
		Y y; 

		
		Point () {}       
		Point (X x, Y y){		
			this.x = x; 
			this.y = y; 	
		}
	
		public X getX() {
			return x;
		}
		public Y getY() {
			return y;
		}
		
	}


	class GenericMethod {
		
		//makeRectangle () 메소드를 호출시 
		public static <T,V> double makeRectangle (Point<T,V> p1, Point<T,V> p2) {
			// 두 점의 좌표를 받아서 넓이를 계산 해서 리터으로 돌려줌. 	
			double width = (double)p2.getX() - (double)p1.getX(); 
			double height = (double)p2.getY() - (double)p1.getY();
			
			return width * height; 
		}
	}

	public class  P_12_03  {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			// 두점의 좌표를 저장하는 p1 , p2 
			Point<Double,Double> p1 = new Point(1.0, 1.0);
			Point<Double,Double> p2 = new Point(5.0, 5.0) ; 
			
			// makeRectangle (p1, p2)   <== 두점의 값을 받아서 넓이를 처리해서 리턴으로 받아옴 
			double rect = GenericMethod.makeRectangle(p1, p2);
			
			System.out.println("두 좌표의 넓이는 : " + rect + " 입니다.");
			
		}

	}
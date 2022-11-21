package Project01;

public class P_11_21 {

	public static void main(String[] args) {

		
		arrayFlexble (7, 8 ) ;
		

	}

	public static void arrayFlexble (int...values) {
		if (values[0] > 0 && values[0] < 10) {
			System.out.printf("파워 레벨 %d 입니다." , values[0]);
		}else {
			System.out.println("잘못된 입력 입니다. 1~9 사이의 값만 넣으세요");
		}
		if (values[1] > 0 && values[1] < 10) {
			System.out.printf("스피드 레벨 %d 입니다." , values[1]);
		}else {
			System.out.println("잘못된 입력입니다. 1~9사이의 값만 넣으세요");
		}
	}
}

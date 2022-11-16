package Project01;

import java.util.Scanner;

public class P_11_15_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		do {
			
			System.out.println("1~4중 선택하세요");
			a = sc.nextInt();
			
			if ( a == 1) {System.out.println(" 1. 7의 배수와 8의 배수출력을 선택");
			int b;
			System.out.println("배열의 방갯수를 입력해주세요 >>> ");
			b = sc.nextInt();
			int[] arr1 = new int [b];
			
			for (int i = 0, k =1 ; i < arr1.length ; i++ , k++) {
				if(k%7 == 0 || k%8 == 0 ) {
					arr1[i] = k;
					System.out.println(arr1[i] + " ");
				}
			  }
			}
			else if ( a == 2) {System.out.println("2. 1씩 증가하도록 값을 넣는데 4의 배수만 빼고 출력 선택");
			int c;
			System.out.println("배열의 방갯수를 입력해주세요 >>>");
			c = sc.nextInt();
			int[] arr2 = new int [c];
			
			for (int j = 0, y = 1 ; y < arr2.length ; j ++ , y++ ){
				if(y%4 !=0) {
					arr2[j] = y;
					System.out.println(arr2[j] + " ");
									}
			}
			}else if (a == 3) {System.out.println("3. 3의 배수만 저장하는데 그 중 6의 배수는 빼고 저장 후 출력선택");
			int d;
			System.out.println("배열의 방갯수를 입력해주세요 >>>");
			d = sc.nextInt();
			int[] arr3 = new int [d];
			
			for (int t = 0, y = 3 ; t <arr3.length ; t++, y+=3) {
				arr3[t] = y;
				
				if(y%6!=0) {
					System.out.println(arr3[t] + " ");
				}
			}
			}else if (a==4) {
				System.out.println("4. 프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 입력입니다. 1~4번까지만 넣어주세요 ");
				
			}
		} while(true);
		System.out.println("do while 문을 빠져나왔습니다");

	}

}

package doit.ex01;

import java.util.Scanner;

public class P_01_3 {
	


	public static void main(String[] args) {

		Scanner max1 = new Scanner(System.in);
		
		System.out.println("네 정수의 최댓값을 구합니다.");
		System.out.println(" a의 값 >>"); int a =  max1.nextInt();
		System.out.println(" b의 값 >>"); int b =  max1.nextInt();
		System.out.println(" c의 값 >>"); int c =  max1.nextInt();
		System.out.println(" d의 값 >>"); int d =  max1.nextInt();
		

		int max = a;
		if ( b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max= d;
		
		System.out.println(" 최댓값은" + max + "입니다");
	}

}

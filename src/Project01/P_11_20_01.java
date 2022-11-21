package Project01;

public class P_11_20_01 {

	public static void main(String[] args) {
		System.out.println("=== STEP 1 : args 배열로 들어오는 모든 내용 출력 ====");
		for (int i = 0 ; i < args.length; i++) {
			System.out.print(args[i] + " ");
		}
		System.out.println();
		System.out.println();


		
		
		
		//step 2
		System.out.println("=====STEP 2  : 기본 출력 ========================");
		System.out.println();

		System.out.println("      국어       영어      수학     과학       <합계>      <평균>   ");
		System.out.println("================================================================");
		for (int i = 0 ; i < args.length; i++) {

		if (i % 5 == 0 ) { //5로 나누었을때 0일때 개행 , 0일때는 제외
			if (i != 0) {
				System.out.println();
			}
		}

		System.out.print(args[i] + "\t");
		// System.out.print(sum1  + "\t");

		}
		System.out.println();
		System.out.println("=================================================================");
		System.out.println("<합계> : ");
		System.out.println("<평균> : ");

		System.out.println();
		System.out.println();



		//step 3
		System.out.println("=====STEP 3  : 합계 / 평균 계산후 출력  ========================");
		System.out.println();

		int sum1 =  0 ;
		double avg1 = 1.0;

		//아랫 라인의 합계 및 평균 변수 선언
		int korSum = 0 ;
		int engSum = 0 ;
		int mathSum = 0 ;
		int sienceSum = 0 ;

		double korAvg ;
		double engAvg = 1.0 ;
		double mathAvg = 1.0 ;
		double sienceAvg = 1.0 ;

		//allSum, allAvg
		int allSum = 0;
		double allAvg ;


		System.out.println("      국어       영어      수학     과학       <합계>      <평균>   ");
		System.out.println("================================================================");
		for (int i = 0 ; i < args.length; i++) {

		if (i % 5 == 0 ) { //5로 나누었을때 0일때 개행 , 0일때는 제외
			if (i != 0) {
				System.out.println();
			}
		}

		//sum1, avg1
		if (i % 5 == 0) {
			sum1 = 0 ;
		}
		if (i % 5 != 0) {
			sum1 += Integer.parseInt(args[i]);
		}
		//avg1 : 합이 모두 구해지면 평균 계산
		if (i == 4 || i == 9 || i == 14 || i ==19) {
			avg1 = sum1 / 4.0;
		}

		//출력
		System.out.print(args[i] + "\t");
		if (i == 4 || i == 9 || i == 14 || i ==19) {
			System.out.print(sum1  + "\t" + avg1);
		}

		//마지막 라인에 라인 삽입
		if (i == args.length -1) {
		System.out.println();
		System.out.println("=================================================================");
		}

		// 아랫 라인의 합계 및 평균 구하기


		if (i == 1 || i == 6 || i== 11 || i == 16) {
		korSum += Integer.parseInt(args[i]);
		}
		if (i == 2 || i == 7 || i == 12 || i == 17) {
		engSum += Integer.parseInt(args[i]);
		}
		if (i == 3 || i == 8 || i == 13 || i == 18) {
		mathSum += Integer.parseInt(args[i]);
		}
		if (i == 4 || i == 9 || i == 14 || i == 19) {
		sienceSum += Integer.parseInt(args[i]);
		}

		//전체 합계 (allSum)
		if (i != 0 && i % 5 != 0 ) {
		allSum += Integer.parseInt(args[i]);
		}

		}

		// 아래 라인에 합계 및 평균 출력
		korAvg = korSum / 4.0 ;
		engAvg = engSum / 4.0 ;
		mathAvg = mathSum / 4.0 ;
		sienceAvg = sienceSum / 4.0 ;

		allAvg = allSum / 16.0 ;

		System.out.print("<합계> : ");
		System.out.print(korSum + "\t" + engSum + "\t" + mathSum + "\t" + sienceSum + "\t" + allSum + "\t" + allAvg + "\n");
		System.out.print("<평균> : ");
		System.out.print(korAvg + "\t" + engAvg + "\t" + mathAvg + "\t" + sienceAvg + "\n");

		System.out.println();
		System.out.println();

		
		



	}

}
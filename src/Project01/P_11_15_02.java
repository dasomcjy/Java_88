package Project01;

public class P_11_15_02 {
	
	public static void main(String[] args) {

	int i = 0;
	
    int [] arr1 = new int [10];{

    for ( int a = 1 ; a < 10 ; a++) {      // a : 3의 배수, 5의 배수를 저장하는 변수
	if ( a % 3 == 0 || a % 5 == 0) {
		arr1[i] = a;
		i++;
	}
	
	if ( i > 10) {
		break;
	}
    }		
    
    
		for ( i = 0 ; i < 10 ; i++) {
			System.out.println(arr1[i] + " ");
		}		
		}
	}}
 


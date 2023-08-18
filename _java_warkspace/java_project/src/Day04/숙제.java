package Day04;

public class 숙제 {

	public static void main(String[] args) {
		// 구구단 2단 출력
		/* 출력 결과
		 * 2*1=2
		 * 2*2=4
		 * 2*3=6
		 * ...
		 * 2*9=18
		 */
		
		int num1=2; //2단, 결과 값 변수 
		
		for(int num2=1;num2<=9;num2++) {
			System.out.println(num1+" * "+num2+" = "+(num1*num2));
		}
		
	}

}

/* 	구구단 2~9단까지 출력
 *  
 *  for(int j=2;j<=9;j++){   //단
 *  	for(int i=1;i<=9;i++) {
 *  System.out.pirntln(j+"*"+i+"="+(j*i));
 *  	}
 *  }	
 */





package Day08;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자를 거꾸로 출력, 각자리의 합계 출력
		 * ex) 11456 => 출력 : 65411 => 6+5+4+1+1 => 결과값 출력
		 * ex) 19781 => 출력 : 18791 => 1+8+7+9+1 => 결과값 출력
		 * &,/이용
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num=scan.nextInt();
		int sum=0;
		 // num % 10	나머지 값을 저장 => 마지막 자리
		 // num = num / 10;		int형으로 나머지를 버린 몫만을 가지고 다시 나누기
		while(num>0) {
			int b = num % 10; // 마지막 자리 추출
			sum +=b;
			num = num/10;
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.print("자리 합 : "+sum);
		
		
		scan.close();
		
		
	/*	//하나씩 구분
		String[] arr=n.split("");
		for(String tmp : arr) {
			System.out.print(tmp);
			

		String num[]=new String[n.length()];
		
		   //입력받은 값을 배열에 넣기
		for(int i=0;i==0;i++) {
			num[i]=n;
			System.out.println(num[i]);
			
			
				
			}
			
		}
		
	*/	
		
		

	}

}

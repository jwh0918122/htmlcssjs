package Day06;

import java.util.Scanner;

public class 소수구하기 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 자신밖에 없는 수(약수가 2개)
		 * ex) 3,5,7,11,13,17...
		 * 
		 * num를 입력받아 num가 소수인지 아닌지 판별(약수의 개수 구하고, 개수가 2인이 아닌지 체크)
		 * num=13 : 소수입니다.
		 * num=12 : 소수가 아닙니다.
		 */
		
		/* Scanner scan=new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		
		int num=scan.nextInt(); //입력받은 수
		int count=0; //약수의 개수를 세기위한 변수
		
		for(int i=1;i<=num;i++){
				if(num%i==0) { //약수의 조건
					count++; //약수가 발생되면 변수에 +1을 해라
				}
			}
		// 약수의 개수가 2인지 아닌지 체크
		if(count==2) {
			System.out.println(num+":소수입니다.");
		}else {
			System.out.println(num+":소수가 아닙니다.");
		}
	*/
		
	/* 2~100까지 소수를 출력(내가 쓴 오답)
		
		int count=0; //약수의 갯수
		
		for(int a=2;a<=100;a++) { //a=2~100
			for(int i=1;i<=a;i++){ //i=약수
				if(a%i==0) {
					count++;
				}	
		}
			if (count==2) {
				System.out.print(a);
		}
		
	}
	*/
		
	// 답
		
		int count=0; // 약수의 개수를 세어줄 변수
		for(int a=2;a<=100;a++) { //2~100까지의 수
			count=0; // 다음 수의 약수 개수를 구하기 위한 초기화★★★★
			for(int i=1;i<=a;i++) { //나누는 수
				if(a%i==0) {
					count++;
				}
			}
			//약수 개수가 2개인지 체크
			if(count==2) {
				System.out.print(a+" ");
			}
		}
	}
}

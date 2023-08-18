package Day05;

import java.util.Scanner;

public class For문05 {

	public static void main(String[] args) {
		/* 최소공배수 구하기
		 * 공배수 : 두 정수에서 공통적으로 있는 배수
		 * 10배수 : 10,20,30,40,50...
		 * 15배수 :  15,30,45,60...
		 * 10과 15의 공배수 : 30,60,90...
		 * 최소공배수 : 30
		 */
		
		/* num1과 num2를 입력받아 최소공배수를 출력
		 * i * num
		 * 반복 : i를 num1부터 무한까지 num1씩 증가
		 * 초기값:
		 * 조건식:없음
		 * 증감식:
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("두 정수를 입력하세요 : ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		for(int i=num1;;i=i+num1) {  // 10 20 30 40...
			if(i%num1==0 && i%num2==0) {  
				System.out.println("두 정수의 최소공배수는 "+i);
				break;
			}
		}
		
		
		
		
		
		
		
		
		scan.close();

	}

}

package Day05;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 1~50사이의 랜덤수를 생성하여 맞추는 게임
		 * 예) 컴퓨터가 랜덤으로 생성한 수 : 45
		 * 컴퓨터가 랜덤수를 생성하였습니다.
		 * 입력> 10
		 * up~
		 * 입력> 20
		 * up~
		 * 입력> 50
		 * down~
		 * 입력> 45
		 * 정답~ (종료)
		 */

		/*  
		Scanner scan=new Scanner(System.in);
		
		int random=(int)(Math.random()*7)+1;
		System.out.println("컴퓨터가 랜덤수(1~50)를 생성하였습니다.");
		
		for(;;) {
			System.out.println("숫자를 입력하세요 : ");
			int num1=scan.nextInt();
			if(num1>random) {
				System.out.println("down~");
			} else if(num1<random) {
				System.out.println("up~");
			} else {
				System.out.println("정답~");
				break;
				
				
		scan.close();
			}
		} 
		*/
		
		/* 시도 횟수까지 출력
		Scanner scan=new Scanner(System.in);
		
		int random=(int)(Math.random()*7)+1;
		System.out.println("컴퓨터가 랜덤수(1~50)를 생성하였습니다.");
		
		for(int i=1;;i++) {
			System.out.println("숫자를 입력하세요 : ");
			int num1=scan.nextInt();
			if(num1>random) {
				System.out.println("down~");
			} else if(num1<random) {
				System.out.println("up~");
			} else {
				System.out.println("정답~");
				System.out.println(i+"번 만에 답을 맞췄습니다.");
				break;
			}
		}
	
		scan.close();
		*/
		
		// 5번 시도 넘어가면 종료, 맞췄다면 시도 횟수까지 출력
		Scanner scan=new Scanner(System.in);
		
		int random=(int)(Math.random()*50)+1;
		System.out.println("컴퓨터가 랜덤수(1~50)를 생성하였습니다.");
		System.out.println("5번 안에 맞추세요");
		
		for(int i=1;i<=5;i++) {
			System.out.println("숫자를 입력하세요 : ");
			int num1=scan.nextInt();
			if(num1>random) {
				System.out.println("down~");
			} else if(num1<random) {
				System.out.println("up~");
			} else {
				System.out.println("정답~");
				System.out.println(i+"번 만에 답을 맞췄습니다.");
				break;
			}
			if(i==5) {
				System.out.println("정답을 5번 안에 맞추지 못했습니다.");	
			}
		}
		
		/* 답
		 
			Scanner scan=new Scanner(System.in);
			int random=(int)(math.random()*50)+1;
			System.out.println("컴퓨터가 랜덤수를 생성하였습니다.~?!!");
			System.out,println("회차 제한:5회);
			
			for(int i=1;i<=5;I==){ //무한루프
			 System.out,println("입력 > ");
			 int num = scan.nextInt(); **네가 맞추는 숫자
			 
			 if(random == num){
			 	System.out,println("정답~!!");
			 	System.out,println("컴퓨터 수 : "+random);
			 	break;
			 	}else if(random>num){
			 		System.out,println("up~"+i+"회");
			 	}else if(random<num){
			 	System.out,println("down~!!"+i+"회");
			 	}
		 */
		
	
		scan.close();
	}

}

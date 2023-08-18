package Day06;

import java.util.Scanner;

public class While문 {

	public static void main(String[] args) {
		/*
		 * 반복문 중 하나 While문 while(조건식){ 조건식이 true일 때 반복 실행문; 증감식; }
		 */

		// for문을 이용하여 1~10까지 출력

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		// while문을 이용하여 1~10까지 출력

		System.out.println();
		System.out.println("--------------------");

		int cnt = 1; // 반복변수의 선언
		while (cnt <= 10) {
			System.out.print(cnt + " ");
			cnt++;
		}

		// while문을 활용하여 1~10까지 중 짝수만 출력
		System.out.println();
		System.out.println("--------------------");

		/*
		 * 내가 입력한 오답 int a=1; while(a<=10 && a%2==0) { System.out.println(a+" "); a++; }
		 */

		int a = 1;
		while (a <= 10) {
			if (a % 2 == 0) { // 짝수인지 확인
				System.out.print(a + " ");
				// if문 안에 증감식(a++;)을 입력하면 짝수일 경우만 증가
			}
			a++;
		}

		/*
		 * up&douw게임 for문 이용 (5번 시도 넘어가면 종료, 맞췄다면 시도 횟수까지 출력) Scanner scan=new
		 * Scanner(System.in);
		 * 
		 * int random=(int)(Math.random()*50)+1;
		 * System.out.println("컴퓨터가 랜덤수(1~50)를 생성하였습니다.");
		 * System.out.println("5번 안에 맞추세요");
		 * 
		 * for(int i=1;i<=5;i++) { System.out.println("숫자를 입력하세요 : "); int
		 * num1=scan.nextInt(); if(num1>random) { System.out.println("down~"); } else
		 * if(num1<random) { System.out.println("up~"); } else {
		 * System.out.println("정답~"); System.out.println(i+"번 만에 답을 맞췄습니다."); break; }
		 * if(i==5) { System.out.println("정답을 5번 안에 맞추지 못했습니다."); } }
		 */

		int j = 1;
		while (a <= 10) {
			if (a % 2 == 0) { // 짝수인지 확인
				System.out.print(j + " ");
				// if문 안에 증감식(a++;)을 입력하면 짝수일 경우만 증가
			}
			j++;
		}

		// up&douw게임 while문 이용 (5번 시도 넘어가면 종료, 맞췄다면 시도 횟수까지 출력)

		/*
		 * 내가 쓴 오답 Scanner scan=new Scanner(System.in);
		 * 
		 * int random=(int)(Math.random()*50)+1;
		 * System.out.println("컴퓨터가 랜덤수(1~50)를 생성하였습니다.");
		 * System.out.println("5번 안에 맞추세요");
		 * 
		 * int i=0; while(i<=5){ System.out.println("숫자를 입력하세요 : "); int
		 * num=scan.nextInt(); if(num>random) { System.out.println("down"); }else
		 * if(num<random) { System.out.println("up"); }else { System.out.println("정답~");
		 * break; }if(i>5) { System.out.println("5번 안에 못맞췄습니다."); } i++; }
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		int random = (int) (Math.random() * 50) + 1;
		System.out.println("컴퓨터가 랜덤수(1~50)를 생성하였습니다.");
		System.out.println("5번 안에 맞추세요");

		int num = 0;
		int count = 1;
		while (num != random) {
			System.out.println("입력>");
			scan.nextInt();
			count++;
			if (num > random) {
				System.out.println("down~ " + count + "회");
			} else if (num < random) {
				System.out.println("up~ " + count + "회");
			} else {
				System.out.println("정답");
			}
		}

	}

}

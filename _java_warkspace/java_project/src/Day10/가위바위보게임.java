package Day10;

import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		/*
		 * 컴퓨터가 가위바위보를 랜덤으로 선택 (0=가위, 1=바위, 2=보) 내가 가위바위보 중 하나를 선택해서 입력 승패의 결과를 출력 ex)
		 * com=0(가위) user=가위 => 무승부입니다. com=1(바위) user=가위 => 졌습니다.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보를 입력하세요 : 0=가위, 1=바위, 2=보");
		
		// user
		int user = scan.nextInt();
		switch (user) {
		case 0:
			System.out.println("user : 가위");
			break;
		case 1:
			System.out.println("user : 바위");
			break;
		case 2:
			System.out.println("user : 보");
			break;
		default:
			System.out.println("잘못입력했습니다.");
			break;
		}
		
		//computer
		int com = (int) (Math.random() * 3) + 0;
		
		do {
			
		
		switch (com) {
		case 0:
			System.out.println("computer : 가위");
			break;
		case 1:
			System.out.println("computer : 바위");
			break;
		case 2:
			System.out.println("computer : 보");
			break;
		}
		}
		while(user<=2&&user>=0);
		
		
		//가위바위보
		if (com == user) {
			System.out.println("무승부 입니다.");
		} else {
			switch (user) {
			case 0:
				if (com == 1) {
					System.out.println("졌습니다.");
				} else {
					System.out.println("이겼습니다.");
				}
				break;

			case 1:
				if (user == 2) {
					System.out.println("졌습니다.");
				} else {
					System.out.println("이겼습니다.");
				}
				break;

			case 2:
				if (user == 0) {
					System.out.println("졌습니다.");
				} else {
					System.out.println("이겼습니다.");
				}
				break;

			}
		}

	}
}

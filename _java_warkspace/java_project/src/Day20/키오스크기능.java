package Day20;

import java.util.HashMap;
import java.util.Scanner;

/* 키오스크 확장판
 * --메뉴판-- (맵으로 구성)
 * 1. 피자 15000
 * 2. 햄버거 1000
 * 3. 콜라 2000
 * 4. 아이스크림 500
 * 
 * 주문하시겠습니까?
 * 피자 2개 주문
 * 콜라 2개 주문
 * 계산하기
 * 1500*2 =30000
 * 2000*2 =4000
 * 총 지불금액 34000원 입니다.
 */
/* 메뉴 추가 기능 : 메뉴판에 메뉴를 추가 할 수 있음.
 * 메뉴 삭제 기능 : 메뉴판에 메뉴를 삭제 할 수 있음.
 * 가격 변경 : 기존 메뉴의 가격을 변경
 * 계산 : 주문한 금액을 계산하여 총 지불금액을 확인
 * 
 */

public class 키오스크기능 {

	// 메뉴판 출력
	public static void printMenu(HashMap<String, Integer> menu) {

		int cnt = 1;
		System.out.println("---메뉴판---");
		for (String tmp : menu.keySet()) {
			System.out.println(cnt + ". " + tmp + " " + menu.get(tmp));
			cnt++;
		}
	}

	// 주문 하기
	public void order(HashMap<String, Integer> menu, HashMap<String, Integer> order, Scanner scan) {

		키오스크기능.printMenu(menu); // 메뉴 보여줌(출력)

		String food;
		int price;
		int gesu; 
		int num = 0; // 계속 주문하시겠니까? 변수
		int cnt = 0; //몇개 주문했는지 (0이면 주문한 내용, 가격 출력하면 안되니까)
		HashMap<String, Integer> gesu_m = new HashMap<>(); // 주문한 메뉴의 개수 받을 맵

		do {
			int j = 0; // 메뉴에 없는 이상한 값 입력 시 사용할 변수

			System.out.println("주문하실 메뉴를 입력하세요 : ");
			food = scan.next();

			System.out.println("수량을 입력하세요 : ");
			gesu = scan.nextInt();

			for (String tmp : menu.keySet()) { // 입력한 food의 가격을 같이 보여줌
				if (food.equals(tmp)) {
					j++; // 입력받은게 메뉴에 있는 음식인지 확인.(1이면 있는거, 0이면 없는거)
				}
			}

			if (j == 1) { // 해당 음식이 메뉴에 있을 시
				price = menu.get(food) * gesu;
				order.put(food, price);

				gesu_m.put(food, gesu); // 개수 맵에도 넣어줌

				cnt++; // 몇개 주문한지(0이면 금액 등은 출력하면 안되니까)
			} else {
				System.out.println("해당 메뉴는 없습니다.");
			}

			while (true) {
				System.out.println("계속 주문하시겠습니까?(계속 : 1 / 주문완료 : 0)");
				num = scan.nextInt();
				if (num == 0 || num == 1) {
					break;
				} else if (num < 1 || num > 1) {
					System.out.println("잘 못 입력하셨습니다.");
				}
			}

		} while (num != 0);

		if (cnt != 0) {

			// 주문한 메뉴와 가격 출력
			System.out.println("<주문하신 메뉴>");
			for (String tmp : order.keySet()) {
				System.out.println(tmp + " " + menu.get(tmp) + " (수량:" + gesu_m.get(tmp) + ")");
			}

			// 금액 계산
			int sum = 0;
			for (int tmp : order.values()) {
				sum += tmp;
			}
			System.out.println("결제 금액 : " + sum);
		}
	}

	// 메뉴 추가
	public void insert(HashMap<String, Integer> menu, Scanner scan) {

		int num;
		do {
			System.out.println("추가하실 메뉴를 입력하세요 :");
			String food = scan.next();
			System.out.println("메뉴의 가격을 입력하세요 : ");
			int price = scan.nextInt();
			menu.put(food, price);

			while (true) {
				System.out.println("메뉴 추가를 계속 하시겠습니까?(계속 : 1 / 종료 : 0)");
				num = scan.nextInt();
				if (num == 0 || num == 1) {
					break;
				} else if (num < 1 || num > 1) {
					System.out.println("잘 못 입력하셨습니다.");
				}
			}

		} while (num != 0);

		키오스크기능.printMenu(menu);
	}

	// 메뉴 삭제
	public void delet(HashMap<String, Integer> menu, Scanner scan) {

		int num;
		do {
			System.out.println("삭제하실 메뉴를 입력하세요 :");
			String food = scan.next();

			menu.remove(food);

			while (true) {
				System.out.println("메뉴 삭제를 계속 하시겠습니까?(계속 : 1 / 종료 : 0)");
				num = scan.nextInt();
				if (num == 0 || num == 1) {
					break;
				} else if (num < 1 || num > 1) {
					System.out.println("잘 못 입력하셨습니다.");
				}
			}

		} while (num != 0);
		키오스크기능.printMenu(menu);
	}

	// 가격 변경
	public void change(HashMap<String, Integer> menu, Scanner scan) {
		String food;
		int price;
		int num;
		do {
			System.out.println("가격변경할 메뉴를 입력하세요 : ");
			food = scan.next();
			System.out.println(food + " : " + menu.get(food) + "(변경 전)");

			System.out.println("해당 메뉴의 변경 가격을 입력하세요 :");
			price = scan.nextInt();

			menu.put(food, price); // 키는 중복이 안되기때문에 같은 값이 들어오면 value는 덮어씀

			while (true) {
				System.out.println("가격 변경을 계속 하시겠습니까?(계속 : 1 / 종료 : 0)");
				num = scan.nextInt();
				if (num == 0 || num == 1) {
					break;
				} else if (num < 1 || num > 1) {
					System.out.println("잘 못 입력하셨습니다.");
				}
			}

		} while (num != 0);

		키오스크기능.printMenu(menu);

	}

}

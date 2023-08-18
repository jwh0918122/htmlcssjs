package Day20;

import java.util.HashMap;
import java.util.Scanner;

public class 키오스크 {

	public static void main(String[] args) {
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
		 * -선택지..?-
		 * 1. 주문하기
		 * 2. 메뉴추가
		 * 3. 메뉴삭제
		 * 4. 가격변경
		 * 5. 종료
		 * 
		 * (주문하기=>메뉴 보여주고, 주문받기(while)=>주문완료=>금액계산
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		키오스크기능 k = new 키오스크기능();

		HashMap<String, Integer> menu = new HashMap<>(); // 메뉴
		HashMap<String, Integer> order = new HashMap<>(); // 주문한 거

		// menu 
		menu.put("피자", 15000);
		menu.put("햄버거", 1000);
		menu.put("콜라", 2000);
		menu.put("아이스크림", 500);

		int num; // 선택지
		String food;
		int price;
		
		do {
			System.out.println("1.주문하기|2.메뉴추가|3.메뉴삭제|4.가격변경|5.종료");
			num = scan.nextInt();
			switch (num) {
			case 1: // 주문하기
				k.order(menu, order, scan);// 주문
				break;
			case 2: // 메뉴추가
				k.insert(menu, scan);
				break;
			case 3: // 메뉴삭제
				k.delet(menu, scan);
				break;
			case 4: // 가격변경
				k.change(menu, scan);
				break;
			case 5: // 종료
				System.out.println("종료");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}

		} while (num != 5);

	}

}

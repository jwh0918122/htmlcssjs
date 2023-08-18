package Day21;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {

	// sale 클래스의 처리를 위한 클래스
	private ArrayList<Sale_Generic<String, Integer>> menu = new ArrayList<>(); // K=String , V=Integer
	private ArrayList<Sale_Generic<String, Integer>> order = new ArrayList<>();// K=String , V=Integer

	// 메뉴
	public void printMenu() {
		System.out.println(">>menu<<");
		System.out.println("1.제품추가|2.제품리스트|3.제품주문|4.주문내역|5.종료");
		System.out.println(">> menu : ");
	}

	public void add(Scanner scan) {
		// 제품 추가

		System.out.println("추가하실 제품명과 가격을 입력하세요 : ");
//		String product = scan.next();
//		int price = scan.nextInt();
//		
//		menu.add(new Sale_Generic<String, Integer>(product, price));

		String menu = null;
		int price = 0;
		System.out.println("제품명 : ");
		menu = scan.next();
		System.out.println("가격 : ");
		price = scan.nextInt();

		// 클래스 객체 생성 후 add
		Sale_Generic<String, Integer> p = new Sale_Generic<>(menu, price);
		this.menu.add(p);

	}

	public void menu(Scanner scan) {
		// 제품 리스트 보기

		for (Sale_Generic<String, Integer> tmp : menu) {
			System.out.println(tmp); // toString 반영하여 출력
		}

	}

	public void orderPick(String name, int count) {
		// 주문 하기
		// name = 주문음식, count = 주문수량

		for (int i = 0; i < menu.size(); i++) {
			String productMenu = menu.get(i).getMenu();// 주문 메뉴
			int productPrice = menu.get(i).getPrice(); // 주문 가격
			if (productMenu.equals(name)) {
				Sale_Generic<String, Integer> p = new Sale_Generic<>(productMenu, (productPrice * count));
				order.add(p);
			}
		}

	}

	public void printOrder() {
		// 주문내역 보기

		int sum = 0;
		for (Sale_Generic tmp : order) {
			System.out.println(tmp); // toString 반영하여 출력
			
			// 제네릭 타입의 멤버 값으로 직접 접근하게 되면 형변환 후 저장해야 함.
			// 왜냐면 위에 tmp의 자료형을 정해주지 않았기 때문
			sum +=(Integer) tmp.getPrice();
			
		}

	}

}

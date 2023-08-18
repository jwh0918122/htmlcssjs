package product;

import java.util.ArrayList;
import java.util.Scanner;

public class productManager implements prductInterface {

	// 메뉴판을 저장하기 위한 공간
	private ArrayList<product> menu = new ArrayList<>();

	// 주문내역을 저장하기 위한 공간
	private ArrayList<order> orderList = new ArrayList<>();

	public void addMenu() {
		// 기본메뉴 구성

// 		이렇게하면 쓸때마다 2줄 입력해야하니까 		
//		product p = new product("햄버거",5000);
//		menu.add(p);

//		이렇게 입력해도 됨
		menu.add(new product("햄버거", 5000));
		menu.add(new product("피자", 15000));
		menu.add(new product("음료", 2000));
		menu.add(new product("사탕", 500));
		menu.add(new product("과자", 1000));

	}

	@Override
	public void add(Scanner scan) {
		// 메뉴 추가
		//객체는 하나의 메뉴당 한 객체 필요

		System.out.println("추가하실 메뉴 이름을 입력하세요 : ");
		String food = scan.next();
		System.out.println("메뉴의 가격을 입력하세요 : ");
		int price = scan.nextInt();

		menu.add(new product(food, price));

	}

	@Override
	public void delete(Scanner scan) {
		// 메뉴 삭제

		System.out.println("삭제하실 메뉴의 이름을 입력하세요 : ");
		String food = scan.next();

//		menu.remove(food); <= menu리스트는 poduct객체의 리스트이므로 이렇게는 안됨 

//		list.remove(index), list.remove(Object)

		int cnt = 0;
		for (int i = 0; i < menu.size(); i++) {
			if (menu.get(i).getMeun().equals(food)) {
				menu.remove(i);
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("입력하신 메뉴는 없습니다.");

		}

// 강사님		
//		int index = -1;
//		for (int i = 0; i < menu.size(); i++) {
//			if (menu.get(i).getMeun().equals(food)) {
//				index = i; // 삭제할 index 확보
//
////				menu.remove(index); //index로 삭제
//				menu.remove(menu.get(index)); // Object로 삭제
//				System.out.println("삭제 완료~!!");
//				return;
//			}
//		}
//		if (index == -1) {
//			System.out.println("찾는 메뉴가 없습니다.");
//		}

	}

	@Override
	public void update(Scanner scan) {
		// 가격 변경
		//수정할 메뉴를 받아서 해당 메뉴의 객체를 set
		
		System.out.println("변경할 메뉴의 이름을 입력하세요 : ");
		String food = scan.next();

		int cnt = 0;
		for (int i = 0; i < menu.size(); i++) {
			if (menu.get(i).getMeun().equals(food)) {
				System.out.println("변경할 가격을 입력하세요 : ");
				int price = scan.nextInt();
				menu.get(i).setPrice(price);
				cnt++;
			}

		}
		if (cnt == 0) {
			System.out.println("입력하신 메뉴는 없습니다.");
		}
		

//	강사님		
//		int index = -1;
//		System.out.println("변경할 가격을 입력하세요 : ");
//		int upPrice = scan.nextInt();
//		
//		for(int i=0;i<menu.size();i++) {
//			if(menu.get(i).getMeun().equals(food)) {
//				index = i;
//				//메뉴의 가격만 수정
//				//menu.get(i).setPrice(upPrice);
//				
//				menu.set(i,new product(food, upPrice));
//				System.out.println("수정 완료");
//			}
//		}
//		if(index==-1) {
//			System.out.println("메뉴를 찾을 수 없습니다.");
//		}
	}

//// 강사님	
//	public void orderPick(String name, int count) {
//		// 주문 => 매개변수로 값을 받을 경우
//		// 메뉴와 수량을 입력받아 orderList에 추가(new older())
//		// 메뉴에 해당하는 price가 없는 상태 => menuList에서 구해와야 함.
//
//	// main에서 name,count 스캔받아서 사용			
//		int index = -1;
//		for (int i = 0; i < menu.size(); i++) {
//			if (menu.get(i).getMeun().equals(name)) {
//				index = i;
//				int price = menu.get(i).getPrice();
//				order tmp = new order(name, count, price);
////				tmp.setTotal(price*count); //생성자에 없다면... 
//				
//				orderList.add(tmp);
//				return;
//
//			}
//		} if(index==-1) {
//			System.out.println("없는 메뉴입니다.");
//		}
//
//	}

	@Override
	public void orderPick(Scanner scan) {
		// 주문
		//메뉴와 수량을 입력받아 orderList에 추가(new older())
		
		int price = 0;

		System.out.println("주문하실 메뉴를 입력하세요 : ");
		String food = scan.next();

		int cnt = 0;
		int count = 0;
		for (int i = 0; i < menu.size(); i++) {
			if (menu.get(i).getMeun().equals(food)) {
				price = menu.get(i).getPrice();
				cnt++;

				System.out.println("수량을 입력하세요 : ");
				count = scan.nextInt();

				order o = new order(food, count, price);

				orderList.add(o);

			}
		}

		if (cnt == 0) {
			System.out.println("입력하신 메뉴가 없습니다");
		}

	}

	@Override
	public void printOrder() {
		// 주문내역 출력

//	강사님
//		int sum=0;
//		System.out.println("--주문 내역--");
//		for(order o : orderList) {
//			sum+=o.getTotal(); //총 합계 구하기
//			o.print();
//		}
//		System.out.println();
//		System.out.println("총 금액 : "+sum);

		for (int i = 0; i < orderList.size(); i++) {
			System.out.println(orderList.get(i));
		}

	}

	@Override
	public void printProduct() {
		// 메뉴 출력
		int cnt = 1;
		System.out.println("--menu--");
		for (product p : menu) {
			System.out.println(cnt + ". " + p); // tmp(menu)객체의 toString 호출
			cnt++;
		}

	}

}

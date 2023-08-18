package product;

import java.util.Scanner;

public class productMain {

	public static void main(String[] args) {

		productManager pm = new productManager();
		Scanner scan = new Scanner(System.in);
		
		pm.addMenu(); //기본 메뉴 구성
		
		int menu = 0;
		do {
			System.out.println(">>  버튼 선택");
			System.out.println("1.메뉴추가|2.메뉴수정|3.메뉴삭제");
			System.out.println("4.메뉴리스트|5.주문|6.주문내역");
			System.out.println("7.종료|  선택>> ");

			menu = scan.nextInt();

			switch (menu) {
			case 1: pm.add(scan);
				break;
			case 2: pm.update(scan);
				break;
			case 3: pm.delete(scan);
				break;
			case 4: pm.printProduct();
				break;
			case 5: 				
				pm.orderPick(scan);
				break;
			case 6: pm.printOrder();
				break;
			case 7:
				//종료
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		} while (menu != 7);
		
		System.out.println("종료");

		scan.close();

	}
	

	 

}

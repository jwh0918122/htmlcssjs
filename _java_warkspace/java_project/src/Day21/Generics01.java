package Day21;

import java.util.Scanner;

public class Generics01 {

	public static void main(String[] args) {
		/* 제네릭(Generics) : 데이터 타입을 나중에 확정하는 기법
		 * 클래스나 메서드를 선언할 때 어떤 데이터가 들어올지 확신이 없다면, 
		 * 제네릭 타입으로 나중에 확정할 수 있음.
		 * 나중에 구현시 (객체 생성 시 ) 타입을 넣어 구현하면 됨.
		 * 
		 * 객체의 타입을 컴파일 할 때 체크할 수 있어서 타입 안정성을 해치지 않는 선에서 
		 * 적당히 형변환이 가능한 기법.
		 * 타입 안정성
		 * - 의도하지 않은 타입의 객체가 저장되는 것을 막는다.
		 * - 저장된 객체를 꺼내올 때 다른 탕비으로 잘못 형변환되는 것을 막아 오류를 줄인다.
		 */
		
		//Sale class실행을 위한 main
//		System.out.println(">>menu<<");
//		System.out.println("1.제품추가|2.제품리스트|3.제품주문|4.주문내역|5.종료");		
		Scanner scan = new Scanner(System.in);
		SaleManager sm = new SaleManager();

		int menu = -1;

		do {
			sm.printMenu();
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				sm.add(scan);
				break;
			case 2:
				sm.menu(scan);
				break;
			case 3:
				System.out.println("주문메뉴와 수량을 입력해 주세요 : ");
				String name=scan.next();
				int count = scan.nextInt();
				sm.orderPick(name,count);
				break;
			case 4:
				sm.printOrder();
				break;
			case 5: //종료
				break;
			default:
				System.out.println("잘 못 입력하셨습니다.");
			}

		} while (menu != 5);
		System.out.println("프로그램 종료~");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}

}

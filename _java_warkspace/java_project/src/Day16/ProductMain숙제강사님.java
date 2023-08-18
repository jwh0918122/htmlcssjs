package Day16;

import java.util.Scanner;

public class ProductMain숙제강사님 {

	public static void main(String[] args) {
		/*메뉴판
		 * Product[] menu new Product[10] => 배열 생성
		 * [0]피자 20000 => product class
		 * [1]햄버거 10000
		 * [2]콜라 2000
		 * 
		 * 1. 메뉴를 등록하고자 하는 배열
		 * 2. 메뉴(음식명+가격)=>class생성=>product class 
		 * 3. 하나의 product객체를 생성(new)해서 menu배열에 등록
		 */
		/* main클래스
		 * Product 클래스를 이용하여 객체를 생성
		 * 상품등록[] => 여러개의 메뉴를 등록 (배열에 객체를 하나씩 생성해서 넣어줌)
		 * 메뉴는 스케너를 통해 입력받아 등록
		 * 상품 등록 후 배열의 내용을 출력
		 * 
		 * ex)
		 * 상품을 등록하시겠습니까?(y/n) y
		 * y => 상품 등록 반복 / n => 등록 그만 and 리스트 출력
		 * 상품의 이름과 가격을 등록받아 상품 배열에 등록
		 */
		Scanner scan = new Scanner(System.in);
		Product숙제강사님[] menu = new Product숙제강사님[10];
		
		char c = 'y'; // 반복 키워드
		int cnt = 0; // menu객체를 핸들링 하기 위한 변수(index역할)

		while (c != 'n' || c != 'N') {
			System.out.println("상품을 등록하시겠습니까? y/n");
			c = scan.next().charAt(0);
			if (c == 'y' || c == 'Y') {
				System.out.println("상품명 >");
				String name = scan.next();

				System.out.println("가격 >");
				int price = scan.nextInt();

				//menu에 등록(product객체를 생성해서 등록) 
				
				
			//	Product p = new Product(name, price); //생성자로 등록
//				menu[cnt] = p;
				
//				Product p = new Product();  //메서드를 이용하여 등록
//				p.insertproduct(name, price);
//				menu[cnt] = p;
				
//				menu[cnt]=new Product();
//				menu[cnt].insertproduct(name, price);
				
			menu[cnt] = new Product숙제강사님(name, price);
			cnt++;

		} else {
			if (c == 'n' || c == 'N') {
				System.out.println("상품등록 종료");
			} else {
				System.out.println("y/n만 입력가능 합니다.");
			}

		}
	}
	System.out.println("---등록된 상품 리스트---");
	for (int i = 0; i < cnt; i++) {
		// toString 사용하는 경우
		System.out.println((i + 1) + ")" + menu[i]);
		// print 메서드를 사용하는 경우
		// menu[i].출력 메서드명;
	}
	scan.close();

}

}

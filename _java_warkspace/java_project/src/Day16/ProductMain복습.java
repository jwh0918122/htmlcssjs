package Day16;

import java.util.Scanner;

public class ProductMain복습 {

	public static void main(String[] args) {
		/*메뉴판
		 * Product[] menu new Product[3] => 배열 생성
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
		
		Scanner scan = new Scanner (System.in);
	
		
		Product복습[] p = new Product복습 [2];
		String strName; 
		int intPrice;
		char yn;
		int cnt=0;
		
		do {
			System.out.println("상품을 등록하시겠습니까? (Y/N)");
			yn = scan.next().charAt(0);

			if (yn == 'n' || yn == 'N') {
				System.out.println("종료");
				break;
			} else if (yn == 'y' || yn == 'Y') {

				System.out.println("등록하실 상품이름을 입력하세요 : ");
				strName = scan.next();
				System.out.println("가격을 입력하세요 : ");
				intPrice = scan.nextInt();

				Product복습 p2 = new Product복습(strName, intPrice);
				p[cnt] = p2;
				cnt++;
				if (cnt == p.length) {
					Product복습[] tmp = new Product복습[p.length * 2];
					System.arraycopy(p, 0, tmp, 0, p.length);
					p = tmp;
				}
			} else {
				System.out.println("잘 못 입력하셨습니다.");
			}
		} while (true);

		System.out.println("---메뉴판---");
		for (int i = 0; i < p.length; i++) {
			if (p[i] != null) {
//				p[i].toString();
				System.out.println(p[i]);
//				System.out.println(p[i].toString());
			}

		}

	}
}

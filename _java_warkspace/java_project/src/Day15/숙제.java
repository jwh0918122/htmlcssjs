package Day15;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* product 클래스 : 상품을 등록하는 클래스 - 메뉴하나 생성
		 * 상품명, 가격
		 * 상품등록매서드 => inserProduct()
		 * 출력매서드 => printProduct()
		 * getter, setter
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
		
		
		Product[] p = new Product[5];
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("상품을 등록하기겠습니까? (Y/N)");
		char yn=scan.next().charAt(0);
		while(yn=='y'||yn=='Y') {
			System.out.println("등록할 상품을 입력하세요 : ");
			String product_add=scan.next();
			
			System.out.println("상품의 가격을 입력하세요 : ");
			int price_add=scan.nextInt();			
		}
		
		
		
		
//		p[0]=new Product("라면",2000);
//		p[1]=new Product("김밥",1000);
//		p[2]=new Product("떡볶이",1500);
//		p[3]=new Product("라볶이",2000);
//		p[4]=new Product("콜라",500);
		
		
		
		
		
		
		
	}
	
}

class Product{
	private String product; //상품 
	private int price; //가격 
	
	public Product() {
		//기본 생성자
	}
	public Product(String product, int price) {
		this.product=product;
		this.price=price;
	}
	
	//상품&가격 추가 메서드
	public void inserProduct(String porduct, int price) {		
		this.product=porduct;
		this.price=price;
		
	}
	
	//상품&가격 출력 메서드
	public void print() {
		System.out.print("상품 : " + this.product);
		System.out.println(" / 가격 : " + this.price);

	}
	
	//getter, setter
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

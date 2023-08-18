package Day16;

public class Product복습 {
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
	
	 private String productName;
	 private int price;
	 
	 
	public Product복습(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}


	@Override
	public String toString() {
		return "제품 이름 = " + productName + ", 가격 = " + price ;
	}


	//getter, setter
	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	 
	 
	
	
	
	
	
	
	
	
	
}

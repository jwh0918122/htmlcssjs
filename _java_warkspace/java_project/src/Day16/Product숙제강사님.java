package Day16;

public class Product숙제강사님 {
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

	private String name;
	private int price;
	
	public Product숙제강사님() {
	//기본생성자	
	}
	public Product숙제강사님(String name,int price) { //추가생성자
		this.name=name;
		this.price=price;
	}
	//추가메서드
	public void insertproduct(String name,int price) { //생성자랑 내용은 같아도 생성할때 뿐만 아니라 나중에도 추가하고싶어서 넣은거
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return name+" : "+ price;
	}
	
}

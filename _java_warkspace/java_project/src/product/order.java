package product;

//메뉴판 상속
public class order extends product {
	//주문 메뉴판이 있어야 주문이 가능.
	//super(메뉴, 가격), 개수, 합계
	private int count;
	private int total;
	
	public order() {}
	
	public order(String menu, int count, int price) {
		
		super(menu,price); // product에 menu와 price 받는 생성자가 있어서 뜨는 거임
		
		this.count = count;
		this.total=price*count;
	}

	//주문내역 출력 메서드
	public void print() {
		System.out.println(super.getMeun()+" : "+super.getPrice());
		System.out.println(count+"개 주문 => 금액 : "+total);
	}

	//getter,setter
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}

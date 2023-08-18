package product;

public class product {
	//메뉴판 역할 class
	//메뉴, 가격 
	
	private String menu;
	private int price;
	
	public product() {
		
	}
	public product(String meun, int price) {
		this.menu = meun;
		this.price = price;
	}
	@Override
	public String toString() {
		return menu + ":"+ price;
	}
	
	//getter, setter
	public String getMeun() {
		return menu;
	}
	public void setMeun(String meun) {
		this.menu = meun;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

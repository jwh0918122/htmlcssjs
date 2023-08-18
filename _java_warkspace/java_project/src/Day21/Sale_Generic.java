package Day21;

public class Sale_Generic<K,V> { //Sale_Generic의 객체를 불러올 때 K,V를 메개변수로 쓸건데 아직 자료형을 정하지 못했다는 의미
	
	//멤버 변수 menu, price
	private K menu;
	private V price;
	
	
	public Sale_Generic() {}
	public Sale_Generic(K menu,V price) {
		this.menu=menu;
		this.price=price;
	}
		
	
	
	@Override
	public String toString() {
		return "Sale_Generic [menu=" + menu + ", price=" + price + "]";
	}
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}

	
}

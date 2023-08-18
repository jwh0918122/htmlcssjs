package Day21;

public class 숙제Customer {
	private String name;
	private int age;
	private int price;

	public 숙제Customer() {
	}

	public 숙제Customer(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public int price(int age) {

		if (age >= 15) {
			price = 100;
		} else {
			price = 50;
		}

		return price;

	}

	@Override
	public String toString() {
		return "숙제Customer [name=" + name + ", age=" + age + ", price=" + price + "]";
	}

	// getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

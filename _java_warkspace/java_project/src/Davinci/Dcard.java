package Davinci;

public class Dcard {
	private String color;
	private int num;

	public Dcard() {
	}

	public Dcard(String color, int num) {
		super();
		this.color = color;
		this.num = num;
	}

	public void print() {

		System.out.println(this.color);
		System.out.println(this.num);

	}

	// getter, setter
	public String getColor() {
		return color;
	}

	public void setColor(String color) {

		switch (color) {
		case "검":
		case "흰":
			this.color = color;
			break;

		}

		this.color = color;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}

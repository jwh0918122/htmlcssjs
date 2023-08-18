package Day11;

public class Class02 {

	public static void main(String[] args) {
		Car c = new Car();
		c.setColor("red");
		c.setPower(true);
		c.speedUp();
		System.out.println("My Car color : "+c.getColor());
		System.out.println("My Car power : "+c.getPower());
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		System.out.println("My Car speed : "+c.getSpeed());
		
		Car c2=new Car(); //새로생긴 객체(새자동차)
		System.out.println(c2.getColor());
	}
	
	

}
class Car{ //클래스명은 대문자로 시작
	//멤버변수 
	private String color;
	private boolean power;
	private int speed;
	
	public void power() {
		power = !power;
		
	}
	public void speedUp() {
		speed++;
		
	}
	public void speedDown() {
		speed--;
		
	}
	
	//getter : 메인에 가져오는 거
	public String getColor() {
		return this.color;
		
	}
	public boolean getPower() {
		return this.power;
		
	}
	public int getSpeed() {
		return this.speed;
		
	}
	//setter : 메인에서 수정하는 거
	public void setColor(String color) {
		this.color=color;
		
	}
	public void setPower(boolean power) {
		this.power=power;
		
	}
	public void setSpeed(int speed) {
		this.speed=speed;
		
	}
	
	
}
package Day14;

public class ClassEx01 {

	public static void main(String[] args) {
		// Car class를 활용한 생성자 연습
		  Car c= new Car("소나타", "빨강","2023", 2, 2);
//		  c.setPower(true);
//		  c.setAirback(2);
//		  c.setColor("레드");
//		  c.setDoor(2);
//		  c.setName("소나타");
//		  c.setSpeed(0);
//		  c.setYear("2023");
		  c.printInfo();
		  System.out.println(c); //toString 호출(멤버변수 출력해주는 기능)
		  c.powerOnOff();
		  c.speedUp();
		  c.speedUp();
		  c.speedUp();
		  c.speeDown();
		  
		  
		 
	}

}
// Car class 작성 위치
class Car{
	/*멤버변수 : name, color, year, door, airback, power, speed
	 *멤버변수 생성 => getter/setter 생성
	 *생성자  
	 * 1. 기본생성자, 
	 * 2.name, color, year 받는 생성자
	 * 3.name, color, year, door 받는 생성자
	 * 4.name, color, year, door, airback 받는 생성자
	 * 5. 전체 받는 생성자 
	
	 *메서드
	 *printInfo() : name, color, year, door, airback 
	
	 *powerOnOff()
	 *speedUp(), speedDown()
	 */
	
	//멤버변수
	private String name;
	private String color;
	private String year;
	private int door;
	private int airback;
	private boolean power;
	private int speed;

	public Car() {
		// 기본 생성자
	}

	public Car(String name, String color, String year) {
		// 추가 생성자1 (name, color, year 받는 생성자)
		this.name = name;
		this.color = color;
		this.year = year;
	}

	public Car(String name, String color, String year, int door) {
		// 추가 생성자2 (name, color, year, door 받는 생성자)
		this(name,color,year); //생성자 호출은 반드시 첫줄에
		this.door = door;
	}

	public Car(String name, String color, String year, int door, int airback) {
		// 추가 생성자3 (name, color, year, door, airback 받는 생성자)
		this(name,color,year,door);
		this.airback = airback;
	}

	public Car(String name, String color, String year, int door, int airback, boolean power, int speed) {
		// 추가 생성자4 (전체 멤버변수 받는 생성자) (source-제너레이트 컨스트럭쳐 유징 필드)
		super(); //상속자가 가지고 있는 생성자 (지워도 됌)
		this.name = name;
		this.color = color;
		this.year = year;
		this.door = door;
		this.airback = airback;
		this.power = power;
		this.speed = speed;
	}


	public void printInfo() {
		// printInfo메서드 : name, color, year, door, airback
		System.out.println("--MyCar--");
		System.out.println("name : " + name);
		System.out.println("color : " + color);
		System.out.println("year : " + year);
		System.out.println("door : " + door);
		System.out.println("airback : " + airback);
	}
	
	
	

	public void powerOnOff() {
		// powerOnOff()메서드
		
		if (power) {
			if (speed != 0) {
				System.out.println("시동을 끌 수 없습니다. 속도를 줄여주세요");
				return;
			}else {
			System.out.println("전원이 꺼졌습니다.");
			power = false;
			}
		} else {
			System.out.println("전원이 켜졌습니다.");
			
			power = true;
			//System.out.println("전원이 꺼졌습니다.");
		}

	}
	public void speedUp() {
		if (power) {
			speed++;
			System.out.println("현재 속도 : " + speed);
		} else {
			System.out.println("시동을 켜주세요");
		}

	}

	public void speeDown() {
		if (power) {
			speed--;
			System.out.println("현재 속도 : " + speed);
		} else {
			System.out.println("시동을 켜주세요");
		}

	}
	
	//toString : 멤버변수를 출력하는 기능 (소스-제너레이트투스트링)
	@Override 
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", year=" + year + ", door=" + door + ", airback=" + airback
				+ ", power=" + power + ", speed=" + speed + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public int getAirback() {
		return airback;
	}

	public void setAirback(int airback) {
		this.airback = airback;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
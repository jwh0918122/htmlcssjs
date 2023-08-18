package Day12;

import Day12.Class03;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car c = new Car(); //차의 객체가 만들어지는 상태
		
		c.setColor("red");
		c.setYear("2017");		
		c.print();
		c.powerOn();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedUp();
		c.speedUp();
		System.out.println("속력 : "+c.getSpeed());
		
		
		System.out.println("----카2----");
		//Car() // 생성자
		Car c2 = new Car();
		c2.setName("소나타");
		c2.setYear("2022");
		c2.setColor("흰색");
		c2.print();
		
		System.out.println("----카3----");
		Car c3=new Car("그랜저","2020", "파랑");
		c3.print();
		
	//객체를 생성할 때 초기값을 지정하는 것을 생성자
	//생성자를 이용하면 초기화를 쉽게 할 수 있다. 
	//class를 생성하면 기본 아무것도없는 생성자를 제공 Car()
	//다른 생성자를 추가하면 기본생성자는 사라짐
	//다른 생성자를 추가하더라고 기본생성자를 같이 추가하여 생성자를 여러개 두는 것이 일반적임.
	/*
	 * -생성자 선언 방법
	 * public클래스명(){ //리턴타입 없음. 생성자명은 클래스명과 같아야 함.
	 * 
	 * }
	 * 
	 */
	
	}
	
}

class Car{
//멤버변수 : name, year, color, power, speed 
	
//매서드 : 내 차종의 정보를 출력하는 매서드(name, year, color)
	
		
		private String color;
		private boolean power;
		private int speed;
		private String name = "람보르기니";
		
		//생성자 위치
		public Car() {
			//기본 생성자
		}
		//생성자의 매개변수의 값이 다르면 사용 가능(오버로딩)
		//오버로딩(매서드 오버로딩, 생성자 오버로딩 가능)
		//오버로딩 가능 조건 : 매개변수의 갯수가 다르거나, 타입이 다르거나 
		public Car(String name, String year, String color) {
			this.name=name;
			this.year=year;
			this.color=color;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		private String year; //연식으로 계산을 하지 않을 거니까 문자로 받음
		
		// 내 차 정보 출력
		public void print() {
			System.out.println("색 : "+color);
			System.out.println("차 종 : "+name);
			System.out.println("연식 : "+year);
		}
		
		//시동켜기 : powerOn 
		//power = true, "시동이 켜졌습니다."
		public void powerOn() {
			if(power) {
				System.out.println("이미 켜져있습니다.");
				return;
			} 
			
			power=true;
			
			System.out.println("시동이 켜졌습니다.");
			
		}
		//시동끄기 : powerOff
		//power = false, "시동이 꺼졌습니다."
		public void powerOff() {
			if(speed !=0) {
				System.out.println("시동을 끌 수 없습니다. 속도를 줄여주세요");
				return;
			}
			power=false;
			
			System.out.println("시동이 꺼졌습니다.");
			
		}
		//속도 올림 : speedUp
		//최대속도 200이 넘어가면 더이상 올라가지 않는다.
		//power가 true인 상태에서만 속도 변경이 가능.
		
		public void speedUp() {
			
	/*	내가 한거
	 	if(speed<200 && power==true) {
			speed=speed+10;
		}System.out.println("현재속도 : "+speed);
		}
		
	*/
			
	// 현재 스피드 상태 = 0
	if (power) {
		if (speed >= 200) {
			System.out.println("최고 속도입니다.");
		} else {
			speed += 10;
			System.out.println("현재속도 : " + speed);
		}
	} else {
		System.out.println("시동을 켜주세요");
	}
}
		//속도 내림 : speedDown
		//속도가 0이 되면 더이상 내려가지 않는다.
		//power가 true인 상태에서만 속도 변경이 가능.
		
		public void speedDown() {
	/* 내가 한거
	 		if (speed > 0 && power == true) {
				speed = speed - 10;
			}

		}
		*/
	if (power) {
		if (speed <= 0) {
			System.out.println("멈춰있습니다.");

		} else {
			speed = speed - 10;
			System.out.println("현재 속도 : "+speed);
		}
	} else {
		System.out.println("전원이 꺼져있습니다.");
	}
}
		
		//getter, setter
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
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
		public String getYear() {
			return year;
		}
		public void setYear(String year) {
			this.year = year;
		}
		public String getName() {
			return name;
		}
		
		
		
		
	
		

	
}



package Day15;

//abstract : 추상클래스 (생성자를 가질 수없다.)
abstract class Animal1{
	public String name;
	public String category;
	
	public void pirintInfo() {
		System.out.println("이름 : "+name);
		System.out.println("분류 : "+category);
	}
	
abstract public void howl(); //추상 메서드

}	

// 추상클래스 Animal1을 상속하는 Dog1, Cat2 클래스 생성
// 추상클래스를 상속하는 일반 클래스는 반듯이 추상메서드를 구현해야 한다.
// 추상클래스를 상속받는 클래스가 추상클래스라면 구현 안해도 됨.
class Dog1 extends Animal1{ //도그1에 빨간 줄 나오면 마우스 대고 도그1 언임플리먼트 메서드 클릭
	
	private String eat; //내 멤버변수
	
	public Dog1(String name, String category) { //생성자
		super.name = name;		//추상메서드에서 super를 이용해 멤버변수 가져와서 생성자 형성
		super.category = category;
	}

	@Override
	public void howl() {
		System.out.println(name+" 울음소리 : 멍멍 ");

	}
	public void eating(String eat) {
		this.eat=eat;
		System.out.println(name+"은(는) "+eat+"를(을) 좋아해요");
	}

}

class Cat1 extends Animal1 {
	private String eat; //내 멤버변수
	
	public Cat1() {

	}

	public Cat1(String name, String category) {
		super.name = name;
		super.category = category;
	}

	@Override
	public void howl() {
		System.out.println(name+"울음소리 : 냐옹");

	}
	public void eating(String eat) {
		System.out.println(name+"은(는) "+eat+"를(을) 좋아해요");
	}

}
public class 추상클래스01 {

	public static void main(String[] args) {
		/* 추상 메서드 : 메서드의 선언부만 있고, 구현은 없는 메서드
		 * 추상클래스 : 추상메서드 + 일반메서드 + 멤버변수 + 상수(final) => 추상인 것도 있고 아닌 것도 있고
		 * 추상클래스 : 미완성 설계도 => 객체를 생성할 수 없다.
		 * 키워드 : abstract
		 * abstract 클래스명 앞 / abstract 메서드명 앞에 추가
		 * abstract 리턴타입 메서드명(매개변수);
		 * - 인터페이스에서는 abstract 키워드 생략 가능.(어차피 추상메서드만 존재가능)
		 * - 추상클래스에서는 abstract 키워드 생략 불가능.
		 * - 주로 부모클래스에서 상속받을 때, 특정 메서드가 자식들에게 자주 오버라이딩 되는 상황일 때, 해당 메서드를 추상 메서드로 작성
		 * - 상속 받은 클래스에 추상메서드가 있다면, 반드시 구현해야 한다.
		*/
		
		Dog1 d1 = new Dog1("뽀삐","강아지과");
		d1.pirintInfo();
		d1.howl();
		d1.eating("개껌");
		
		System.out.println("------------------------");
		Cat1 c1 = new Cat1("나비", "고양이과");
		c1.pirintInfo();
		c1.howl();
		c1.eating("츄르");
		
	}

}

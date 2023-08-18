package Day15;

class Animal {
	private String name; // 이름
	private String category; // 종

	public Animal() {
		// 기본 생성자
	}

	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}

	// pringInfo 메서드
	public void printInfo() {
		System.out.println("-------------------");
		System.out.println("이름 : " + name);
		System.out.println("종 : " + category);
	}

	// 울음소리 howl 메서드
	public void howl() {
		System.out.println("==" + name + "울음소리" + "==");

	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
class Dog extends Animal{
	public Dog() {
		//기본 생성자
		setName("강아지");
		setCategory("개과");
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("멍멍~!!");
	}
	
	
}
class Cat extends Animal{
	public Cat() {
		//기본 생성자
	}
	public Cat(String name, String category) {
		//추가 생성자
		super.setName(name);
		super.setCategory(category);
	}	
	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("냐옹~!!");
	}
		
}
class Tiger extends Animal{

	public Tiger(String name, String category) {
		super(name,category); // 슈퍼로 부모클래스의 추가생성자 호출(매개변수 안받으면 기본생성자 호출하는 것)
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("어흥~!!");
	}
	
	
}
public class 상속02 {

	public static void main(String[] args) {
		/* 오버라이딩 : 부모클래스에서 물려받은 메서드를 재정의 하는 것
		 * - 부모 클래스의 메서드와 선언부가 일치해야 한다.
		 * - 접근제한자도 더 넓은 범위는 가능(축소는 안됨) 
		 */
		
		Dog d = new Dog();
		d.printInfo();
		d.howl();
		d.setName("뽀삐");
		d.printInfo();
		d.howl();
		
		Cat c = new Cat("나비", "고양이과");
		c.printInfo();
		c.howl();
		
		Tiger t = new Tiger("호랑이","고양이과");
		t.printInfo();
		t.howl();
		
		
	}

}

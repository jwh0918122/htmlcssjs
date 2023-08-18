package Day17;
/* 객체지향 프로그램의 4가지 특징
 * 
 * - 프로그램을 독립된 단위의 객체들을 모아서 처리하는 모임.
 * - 각각의 객체는 메세지를 주고 받으면서 데이터를 처리
 * - 추상화, 캡슐화(정보은닉), 상속, 다형성
 * 
 * ■ 추상화(Abstraction) - 핵심적인 코드만 보여주기
 * - 인터페이스와 구현은 분리한다.
 * - 불필요한 부분은 숨긴다.
 * 
 * ■ 캡슐화(encapsulation) - 데이터 보호(정보 은닉)
 * - 멤버변수(필드)는 숨기고 메서드로 접근 (그래서 멤버변수는 private, 메서드는 public으로 만듬)
 * - 멤버변수와 메서드를 하나로 묶는 것
 * - 은닉화 : 객체의 내부 정보는 숨겨 외부로 드러나지 않게 함.(외부에서 데이터를 직접 접근하는 것을 방지)
 * 
 * ■ 상속(inheritance) - 코드 재사용(확장)
 * - 클래스를 상속받아 수정하여 사용하면 중복 코드를 줄일 수 있음.
 * - 유지보수가 편함.
 * 
 * ■ 다형성(polymorphism) - 객체를 변경하기 용이함 
 * - 하나의 코드가 여러 자료(객체)형으로 구현되어 실행되는 것
 * - 코드는 같은데 들어오는 객체에 따라 다른 실행결과를 얻을 수 있음.
 * - 다형성을 잘 활용하면 유연하고, 확장성 있는, 유지보수가 편리한 프로그램을 만들 수 있음.
 */

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}
class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}	
}
class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void flying() {
		System.out.println("독수리는 날 수 있습니다.");
	}	
}
class Dog {
	public void move() {
		System.out.println("강아지가 귀엽게 걷습니다.");
	}
}
public class 다형성01 {

	public static void main(String[] args) {
		
		//조상의 클래스로 자식의 객체 생성 가능(반대는 불가능 Human a = new Animal(); X)
		//조상에서 제공하는 값만 자식이 사용 가능
		Animal hA = new Human();
		Animal tA = new Tiger();
		Animal eA = new Eagle();
		hA.move();
		tA.move();
		eA.move();
		
		System.out.println("-------gggg--------");
		
		다형성01 test = new 다형성01();
		Human h = new Human();	
		Tiger t = new Tiger();
		Eagle e = new Eagle();
				
		test.moveAnimal(hA);
		test.moveAnimal(tA);
		test.moveAnimal(eA);
		
		test.moveAnimal(h); // 객체 형변환이 이루어져 출력 가능.(업케스팅 자식=>조상)
		test.moveAnimal(t);
		test.moveAnimal(e);
		
		Dog d = new Dog();
	//	test.moveAnimal(d); //Dog클래스는 Animal을 상속받은 객체가 아니가 때문에 불가능
		
		System.out.println("---------------");
		
		Animal[] aniList = new Animal[10];
		int cnt = 0;
		aniList[cnt]=hA;
		cnt++;
		
		aniList[cnt]=tA;
		cnt++;
				
		aniList[cnt]=eA;
		cnt++;
		
		for(int i=0;i<cnt;i++) {
			aniList[i].move();
		}
		
		System.out.println("---------------");
		
		//휴먼을 담을 수 있는 자료형 객체 = 휴먼 클래스의 객체를 담은 것.
//		Human human = (Human)tA; //다운 캐스팅
//		human.readBook();
		
		// instanceof : 객체가 해당 클래스의 형이 맞는지 체크하는 연산자
		//다운캐스팅 (조상=>자식)
		Animal downCastingTeat = tA;
		if (tA instanceof Human) {
			Human hu = (Human) downCastingTeat;
			hu.readBook();
		} else if (tA instanceof Tiger) {
			Tiger ti = (Tiger) downCastingTeat;
			ti.hunting();
		} else if (tA instanceof Eagle) {
			Eagle ea = (Eagle) downCastingTeat;
			ea.flying();
		} else {
			System.out.println("error");
		}

	}

	public void moveAnimal(Animal animal) { //다형성의 예(업케스팅)
		animal.move();
	}

}

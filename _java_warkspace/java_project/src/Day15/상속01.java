package Day15;

public class 상속01 {

	public static void main(String[] args) {
		/* 상속 : 부모의 것을 자식에게 물려주는 것
		 * 클래스 상속 : 부모 클래스의 멤버변수/메서드를 물려주는 것(생성자(생성자는 따로 super()로 불러와야함),초기화블럭은 X)
		 * 상속 : 클래스 확장 개념
		 * 상속을 하는 이유 : 재사용을 해서 중복 코드를 줄이고, 유지보수를 쉽게하기 위해
		 * class A(부모) / class B(자식)
		 * 
		 * class B extends A{
		 * 
		 * }
		 * 
		 * 상속 키워드 : extends
		 * 
		 * 상속을 받으면 부모의 멤버변수와 메서드를 사용할 수 있다.
		 * 
		 * 부모 클래스의 접근제한자 private이면 자식 클래스에서 접근 불가능
		 * 접근제한자 protected : 상속받는 자식에게 허용하는 제어자
		 */
		
		A a = new A();
		a.setA(10);
		a.print();
		a.setB(20);
		a.setC(50);
		a.setNum(100);
		a.print();
		
		B b = new B();
		b.setB(40);
		b.print();
		b.num=200; //접근 제어자(제한자)가 protected이기 때문에 직접 접근 가능
		b.print();
		
	}

}
class A{ //부모 클래스
	private int a,b,c; // 나만 사용(상속 불가능)	
	protected int num; // 상속 가능
	
	public void print() {
		System.out.println("a:"+a+" "+"b:"+b+" "+"c:"+c);
		System.out.println("num:"+num);
	}
	
	//getter, setter
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
class B extends A{ // a b c(getter,setter 로 사용가능) / num 사용 가능
	private int d,e,f;
	
	//override(오버라이드) : 부모의 메서드를 재정의 하여 사용하는 것 (소스-오버라이드임플먼트메서드
	@Override
	public void print() { //오버라이드로 A클래스의 print메서드를 가져온 것
		// TODO Auto-generated method stub
		super.print(); // 부모의 값을 가져올 때 사용.
		System.out.println("d:"+d+" "+"e:"+e+" "+"f:"+f);
		System.out.println("------------");
	}

	
	
	
	// getter, setter
	public int getD() {
		return d;
	}

	
	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	
}





























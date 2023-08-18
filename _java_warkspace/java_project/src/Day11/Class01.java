package Day11;

public class Class01 { //파일명과 클래스명이 같은 경우에만 public 가능
// 멤버변수 선언 위치
	public static void main(String[] args) {
		/* 클래스 - 설계도
		 * 객체 - 제품
		 * 메서드 - 기능(객체가 할 수 있는)
		 * 
		 * 클래스
		 * - 속성(정보) : 멤버 변수
		 * - 기능 : 메서드
		 * 
		 * ex. 프린터 클래스
		 * - 속성(정보) : 크기, 색, 제조사, 제품명, 종류 
		 * - 기능(메서드) : 인쇄, 복사, 스캔, 팩스
		 * 
		 * 멤버변수는 클래스 안, 메서드 밖(위) 작성 - 4번 라인
		 * 멤버변수는 클래스 안에서 사용 가능(모든 메서드에서 공통적으로 사용 가능)
		 * 
		 * - 객체 선언
		 * 클래스명 객체명; //선언만 한거(값은 null)
		 * 객체명 = new 클래스명(); 
		 * 
		 * - 객체 선언(초기화 생성)
		 * 클래스명 객체명 = new 클래스명();
		 * 
		 * - 메서드 사용법 
		 * 1. 다른 클래스안에서 메서드를 호출할 경우 => 객체명.메서드명();
		 * 2. 같은 클래스안에서 메서드를 호출할 경우는 그냥 => 메서드명();
		 */
		
		/* 접근제한자(제어자)
		 * public : 모두 사용 가능 (그렇기 때문에 클래스 이름이 어디에도 동일한거가 있으면 안됨)
		 * protected : 나 + 패키지 + 자식클래스
		 * (default) : 나 + 패키지
		 * private : 나
		 * 
		 * public > protected > default > private
		 * 
		 * - 클래스에 public을 붙일 수 있는 건 .java파일명 = 클래스명이 같을 경우에만 가능
		 * - 멤버 변수와 멤버 메서드는 public 사용 가능
		 * - private : 멤버변수나 멤버 메서드는 다른 클래스에서 사용할 수 없다.
		 * - 일반적으로 멤버변수는 private, 메서드는 public으로 선언한다.
		 * - private으로 선언된 멤버 변수는 getter/setter 메서드를 만들어서 해당 변수에 접근할 수 있도록 한다.
		 */

		Point p = new Point();
		p.print(); 
//		p.x=1;
//		p.y=2;
		
		//getter
		p.save(10, 20);
		p.print();
		System.out.println(p.getX()+1);
		System.out.println(p.getY());
		
		//setter
		p.setX(50); 
		p.print(); //setter는 sysout 안됨
		p.setY(70);
		p.print();
		
	}

}
/* 다른 클래스 밖에서 생성
 * 접근제한자 class 클래스명{
 * 
 * }
 */
class Point{
	//멤버변수 위치
//	public int x; //public클래스는 파일명과 클래스명이 다르면 못만들지만 변수는 가능
//	public int y;
	private int x;
	private int y;
	
	
	//(x,y)
	public void print() {
		System.out.println("("+x+","+y+")");
	}
	//포인트 값을 저장하는 메서드
	public void save(int x, int y) { //매개변수로 밖에서 주는 값으로 setting
		// this : 멤버변수를 지칭하는 키워드(매개변수랑 멤버변수랑 헷갈릴 수 있으니까)
		this.x=x;
		this.y=y;
		
	}
	//getter
	public int getX() {
		return this.x;
	}
	//getter
	public int getY() {
		return this.y;
	}
	//setter
	public void setX(int x) {
		this.x=x;
	}//setter
	public void setY(int y) {
		this.y=y;
	}
}
class Bkkkkkkkkkkkkkkkhjkgkjlgkkkkkkkkkkkkkkkkk{
	
}
package Day14;

public class ClassEx03 {

	public static void main(String[] args) {
		/* 클래스 생성시 값을 초기화하는 방법
		 * - 기본값, 명시적 초기값, 초기화블럭, 생성자
		 * 1. 기본값 : 기본적으로 지정된 값 int => 0, String => null
		 * 2. 명시적 초기값 : 멤버변수 선언과 동시에 값을 지정하는 방법
		 * 		private String name = "홍길동";
		 * 3. 초기화블럭 : {  } 멤버변수의 초기화
		 * 4. 생성자 : 객체를 생성할 때 초기화 해서 생성
		 * - 초기값들의 우선순위
		 * 생성자 > 초기화블럭 > 명시적 초기값 > 기본값 (생성자가 우선순위 제일 높다)
		 */

		EzenStudent e = new EzenStudent();
		System.out.println(e);
		
		EzenStudent e2 = new EzenStudent("강남","장원희","6","0015646");
		System.out.println(e2);
//		e.set반(7");
//		e.set이름("장원희");
//		e.set전화번호("010-1234-5678");
//		System.out.println(e);
		
		
	}

}

class EzenStudent {
	// 멤버변수 : 지점="incheon", 이름, 반, 전화번호
	private String 지점 = "incheon"; //명시적 초기값
	private String 이름;
	private String 반;
	private String 전화번호;
	
	{
		//초기화 블럭 영역
		지점="인천";
		반="미정";
	}	

	
	
	
	// 기본생성자
	public EzenStudent() {

	}
	//멤버변수 다받는 생성자
	public EzenStudent(String 지점, String 이름, String 반, String 전화번호) {
		super();
		this.지점 = 지점;
		this.이름 = 이름;
		this.반 = 반;
		this.전화번호 = 전화번호;
	}

	// print 메서드(toString 가능)
	@Override
	public String toString() {
		return "EzenStudent [지점=" + 지점 + ", 이름=" + 이름 + ", 반=" + 반 + ", 전화번호=" + 전화번호 + "]";
	}

	// getter,setter
	public String get이름() {
		return 이름;
	}

	public void set이름(String 이름) {
		this.이름 = 이름;
	}

	public String get반() {
		return 반;
	}

	public void set반(String 반) {
		this.반 = 반;
	}

	public String get전화번호() {
		return 전화번호;
	}

	public void set전화번호(String 전화번호) {
		this.전화번호 = 전화번호;
	}

	public String get지점() {
		return 지점;
	}

}

package Day13;

public class Method08 {

	public static void main(String[] args) {
		/* 메서드 오버로딩
		 * 동일한 이름을 가지는 메서드를 여러개 만드는 경우
		 * 오버로딩 조건
		 * 1. 매개변수의 개수가 다르면 가능
		 * 2. 매개변수의 종류(자료형)이 다르면 가능
		 * - 리턴타입과는 상관 없음.매개변수의 이름과도 상관없음
		 */
		Method08 m = new Method08();//static이 있는 곳 에서 static이 없는 메서드를 가져오려면 객체를 만들어야함(같은 클래스에 있더라도) 
		int a = m.sum(10,20);
		System.out.println(a);
		
		System.out.println(m.sum(10, 20, 30));
		
		System.out.println(m.sum(1.5, 2.5));
		String str = "Hello";
		
	


	}
	//num1과 num2를 매개변수로 받아서 결과로 합을 돌려주는 메서드
	public int sum(int num1, int num2) {
		return num1+num2;
		
	}
	public int sum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	public double sum(double num1, double num2) {
		return num1+num2;
	
	}
	//리턴타입은 상관 x, 매개변수 이름 상관 x
//	public int sum(double num3, double num) {
//		return num1+num2;
//	}
}

package Day13;

public class Method10 {

	public static void main(String[] args) {
		/* 재귀 메서드 : 메서드안에서 본인의 메서드를 호줄하는 메서드(드물게 사용)
		 * ! : 팩토리얼
		 * 1부터 자신의 수까지 곱하는 값을 표현
		 * 0! => 1
		 * 1! => 1
		 * 2! => 1*2
		 * 3! => 1*2*3
		 * 4! => 1*2*3*4
		 * 5! => 1*2*3*4*5
		 * 
		 */

		Method10 f = new Method10();
		System.out.println(f.fact(3));
		System.out.println(f.factorial(3));
		
		
		
	
	
		

	}
	/* 기능 : 양수가 주어지면 주어진 양수의 팩토리얼 값을 알려주는 메서드
	 * 리턴타입 : 팩토리얼 값 => int
	 * 매개변수 : 양수 => int num
	 * 
	 */
	public static int fact(int num) {
		if(num<0) { //num가 0보다 작은 값이 들어오면
			return 0; //스텍오버플로가 발생
		}
		if(num==0 || num==1) { //0이나 1이 매개변수로 들어오면 1로 리턴
			return 1;
		}
		int res=1;
		for(int i=2;i<=num;i++) {
			res *= i; //res =res * i
		}
		return res;
	}
	
	
//	내가 한거
//  public int fack(int num) {
//
//		int result = 1;
//		for (int i = 1; i <= num; i++) {
//			result = result * i;
//		}
//		return result;
//
//	}
	
	public static int factorial(int num) {
		if(num<0) { //num가 0보다 작은 값이 들어오면
			return 0; //스텍오버플로가 발생
		}
		if(num==0 || num==1) { //0이나 1이 매개변수로 들어오면 1로 리턴
			return 1;
		}
		return num * factorial(num-1); //재귀메서드(내자신 factorial을 부름)
		//5*4*3*2*1
	}

}

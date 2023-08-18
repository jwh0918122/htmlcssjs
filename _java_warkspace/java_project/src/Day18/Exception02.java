package Day18;

public class Exception02 {
	
	public static void main(String[] args) {
		/* 0으로 나누었을 때 Exception //ArithmeticException
		 * num1, num2, 연산자를 입력하여 메서드를 실행
		 * 예외처리
		 */

		try {
			//예외가 발생할 수 있는 구문
			System.out.println(a(4,0,'+'));
			System.out.println(a(4,0,'-'));
			System.out.println(a(4,0,'*'));
			System.out.println(a(4,0,'/'));
			System.out.println(a(4,0,'%'));
			System.out.println(a(4,0,'$'));
			
		} catch (Exception e) {
			System.out.println(e.getMessage()); //리턴 String
			e.printStackTrace();
			
		}
		System.out.println("계산기 종료");
		System.out.println(a(4,0,'/'));
		System.out.println(a(4,0,'%'));
	}
	//기능 : 두 수를 입력받고, 연산자를 입력받아 4칙 연산의 결과를 리턴하는 메서드
	//throw를 발생시키기 => 예외 발생시키기(예외 떠넘기기)
	//throw 발생시키게 되면 예외를 메서드를 호출하는 객체에게 넘기는 현상이 발생 됨.
	//메서드 선언부 끝에 throws를 적고, 발생할 수 있는 예외를 반드시 적어줘야 함.
	//throws는 RuntimeException은 예외적으로 생략가능.
	
	public static double a(int num1,int num2,char op)throws RuntimeException { //throws는 RuntimeException은 예외적으로 생략가능.
		double result=0;
		
		//예외가 발생할 수 있는 부분은 미리 처리해 주는 것이 좋은.
		if((op=='/' || op=='%')&&num2 ==0) { //예외가 발생하는 상황
			//미리 예외 발생시키기
			throw new RuntimeException("num2는 0이 될 수 없습니다.");
		}
		
		
		switch(op) {
		case '+' : result=num1 + num2; break;
		case '-' : result=num1 - num2; break;
		case '*' : result=num1 * num2; break;
		case '/' : result=num1 / num2; break;
		case '%' : result=num1 % num2; break;
		default :
			throw new RuntimeException(op+"는 산술 연산자가 아닙니다.");	
		}
		return result;
				
//		switch (op) {
//		
//		case '+':
//			return num1 + num2;
//			
//		case '-':
//			return num1 - num2;
//			
//		case '*':
//			return num1 * num2;
//			
//		case '/':
//			return (double)num1 / num2;
//			
//		case '%':
//			return (double)num1 % num2;
//			
//		default:
//			return 0;						
//		}
//						
	}
}

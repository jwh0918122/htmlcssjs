package Day03;

import java.util.Scanner;

public class Switch문02 {

	public static void main(String[] args) {
		/* 숙제(클럽에 제출)
		 * 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		 * 연산자는 + - / * % 중 하나를 입력받기
		 * ex1) 3 2 + => 3 + 2 = 5
		 * ex2) 3 2 - => 3 - 2 = 1
		 * ex3) 3 2 * => 3 * 2 = 6
		 */
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("정수 2개와 연산자를 순서대로 입력하세요");
	
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	char ch=scan.next().charAt(0);
	double result= 0;
	
	switch(ch) {
	case '+': result=num1+num2; break; 
	case '-': result=num1-num2; break;
	case '*': result=num1*num2; break;
	case '/': result=num1/(double)num2; break;
	case '%': result=num1%num2; break;
	default : System.out.println("연산자를 잘 못 입력하였습니다."); break;
	
	}
	System.out.println(num1+""+ch+num2+" = "+result); 
	/* ch변수는 char형태(자료형)이어서 그냥 하면 해당 유티코드 숫자와 더하기 연산이 됨. 
	 그래서 앞에 의미 없는 문자인 ""를 넣어서 연산이 되지 않고, 연결만 되게 함 */
			
		//1+2+3+ㅁ+7+8+9
		// + : 더하기 산술연산자
		// + : 연결 연산자 (값을 문자로 인식되어야만 문자를 연결 가능)
	
	scan.close();
	
	

	}

}

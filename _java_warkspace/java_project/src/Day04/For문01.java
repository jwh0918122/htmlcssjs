package Day04;

public class For문01 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * 종류 : for, while, do~while
		 * - for, while문은 동작방식이 같다. => 조건이 맞지 않는다면 한번도 실행 안될 수도 있음
		 * - do while문은 위에 두 방식과는 조금 다름 => 조건이 맞지 않아도 반드시 1번은 실행 
		 * 
		 * for(1.초기화 ; 2.조건식 ; 4.증감연산식) {
		 * 3.실행문;
		 * }
		 * 
		 * 초기화 : 조건식이나 실행문에서 사용하는 변수를 초기화(처음 실행 시 한번만 수행 / 생략가능)
		 * 조건식 : 반복문의 반복을 결정하는 식(true=>반복, false=>중지 / 생략가능:무조건 true)
		 * 증감연산식 : 조건식에서 사용되는 변수가 증가 or 감소되어 반복 횟수를 조절(생략가능)
		 */
		
		// 1~10까지 출력
		// 초기화 : 사용할 변수 (i) 1부터 시작 => int i = 1;
		// 조건식 : 변수가 10이 될 때 까지 => i<=10 (1~10까지)
		// 증감식 : 1씩 증가 => i = i + 1;
		// 실행문 : i 출력
		
		for(int i=1;i<=10;i=i+1) {
			System.out.print(i+" "); //system.out.println은 줄바뀌어서 하나씩 출력
		}
		
		// 10~1까지 출력하는 예제
		// 증감연산자 ++(1증가) , --(1감소)
		System.out.println(); //위에 출력문이랑 줄 바꿈
		System.out.println("--------------------");
		
		for(int i=10;i>=1;i--) {
			System.out.print(i+" ");
		}
		
		//2부터 10까지 2씩 증가(짝수만 출력)
		System.out.println(); //위에 출력문이랑 줄 바꿈
		System.out.println("--------------------");
		
		for(int i=2;i<=10;i=i+2) { // i+=2
			System.out.print(i+" ");
		}
		
		//지역변수의 범위 { 선언      소멸 }
		/* 1부터 10까지 짝수만 출력
		 * if문의 조건을 사용하여 (짝수)조건이 true일때만 출력
		 */
		System.out.println(); //위에 출력문이랑 줄 바꿈
		System.out.println("--------------------");
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i+" ");
			}else {
				System.out.println("홀수는 pass~!!!");
			}
		}
		
		// 1부터 10까지의 합계 (1+2+3+$+...10 = ?)
		// 합계가 저장되는 변수가 필요
		
		System.out.println(); //위에 출력문이랑 줄 바꿈
		System.out.println("--------------------");
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+i; // sum : 0+1+2+3...+10
		}
		System.out.println(sum); //for문 안에 입력하면 sum의 계산 과정도 출력 됨(1,3,6...55)
					
	}

}

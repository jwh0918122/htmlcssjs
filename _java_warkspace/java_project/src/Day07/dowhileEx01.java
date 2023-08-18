package Day07;

import java.util.Scanner;

public class dowhileEx01 {

	public static void main(String[] args) {
		/* do~while문을 이용하여 값을 입력하면 그대로 출력
		 * 단, y/Y가 입력되면 종료
		 */
		
		Scanner scan=new Scanner(System.in);
	/*	
		char n;
		
		do { System.out.println("정수를 입력하세요 : ");
			 n=scan.next().charAt(0);
			 System.out.println(n);

	}while(n!='y'||n!='Y'); // 하나가 false가 되어도 하나는 ture이기 때문에 계속 실행 됨
		
	System.out.println("종료");
	
	scan.close();
	
	*/
		
		// 1~10까지 출력
		int i=1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<10);
		
		
		System.out.println();
		
		// 강사님 답
		
		char ch;
		do {
			System.out.println("한글자를 입력해주세요(y/Y:종료) : ");
			ch=scan.next().charAt(0);
			System.out.println();
			System.out.println(ch);
			//	if(ch=='y'||ch=='Y') {
			//	System.out.println("종료");
			//	break;
			//	} 이게 알아보기 더 편함(그럼 밑에 while(true)로 해야해)
				
		}while(!(ch=='y'||ch=='Y')); //만약(num!='y'||num!='Y')로 하면 하나가 false가 되어도 하나는 true이기 때문에 계속 실행 됨
		System.out.println("종료");
		
	
		
	}
}

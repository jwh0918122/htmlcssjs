package Day10;

import java.util.Scanner;

public class 가위바위보강사님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가위바위보를 입력하세요 : 0=가위, 1=바위, 2=보");
		
		int comNum = (int) (Math.random() * 3);
		System.out.println("컴퓨터 결정 완료~");
		System.out.println("가위/바위/보 중 하나 선택 >");
		String myChoice = scan.next(); //가위 바위 보 중 하나
		
		//컴퓨터 상태를 String 변환
		String comChoice=(comNum==0? "가위" : comNum==1? "바위" : "보");
		System.out.println("comChoic>"+comChoice);
		
		//비교
		if(comChoice.equals(myChoice)) {
			System.out.println("무승부");
		}else {
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위")? "승" : "패");
			}else if(comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보")? "승" : "패");
			}else {
				//컴 선택 = "	보"
				System.out.println(myChoice.equals("가위")? "승" : "패");
			}
		}
	}

}

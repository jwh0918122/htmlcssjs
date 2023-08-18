package Day10;

import java.util.Scanner;

public class 숙제강사님 {

	public static void main(String[] args) {
		/*
		 * 야구게임 컴퓨터가 3자리 숫자를 생성 (각 자리수는 1~9까지의 수) => 배열로 랜덤 저장(중복 불가능)
		 * 유저는 3자리의 숫자를 맞추는 게임 => 직접 입력(중복 되지 않게...)
		 * 자리와 숫자가 일치하면 strike => strike
		 * 숫자만 맞으면 => ball 
		 * 아무것도 안맞으면 => out
		 * 
		 * ex) 컴퓨터 생성번호 : 1 2 3 사용자 번호 : 1 7 8 => 1s 사용자 번호 : 1 3 2 => 1s 2b 사용자 번호 : 7
		 * 8 9 => out 사용자 번호 : 1 2 3 => 3s 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		int comNum[] = new int[3]; //컴퓨터 숫자 배열
		int myNum[] = new int[3]; //내 배열
		
		
		//앞에서 썼던 메서드 호출
/*		System.out.println("--comNum--");
		// 객체 생성 후 메서드 호출
		Method07_lotto me = new Method07_lotto(); // me 객체로 메서드 07에서 쓴 모든 메서드를 사용 가능
		me.randomArray(comNum);
		me.printArray(comNum);
		
		System.out.println("--myNum--");
		// static의 특징 객체를 만들지 않고 클래스명으로 호출 가능.
		Method07_lotto.randomArray(myNum);
		Method07_lotto.printArray(myNum);
*/
		
		// comNum 중복되지 않게 랜덤 수 추출 저장
		for(int i=0;i<=comNum.length-1;i++) {
			comNum[i]=(int) (Math.random() * 9) + 1;
			for(int j=0;j<i;j++) {
				if(comNum[j]==comNum[i]) {
					i--;
					break;
				}
			}
		}
		//comNum 중복 안되는지 체크
		for(int a : comNum) {
			System.out.print
			(a+" ");
		}
		System.out.println();
		
		while(true) {
			int stk=0; //strike 개수
			int ball=0; //ball 개수
			System.out.println("숫자 입력 > ");
			//문자로 입력 받기
			String myStr=scan.next(); //숫자를 문자로 받음
			String[] myNumStr = myStr.split(""); //한 글자마다 잘라서 배열로 저장
			for(int i=0; i<myNum.length;i++) {
				//문자를 숫자로 변환해서 myNum에 저장
				myNum[i]=Integer.parseInt(myNumStr[i]);
			}
			
/*			myNum 출력 확인
			for(int temp : myNum) {
				System.out.print(temp+" ");
*/
			//숫자 비교
			for(int i=0; i<comNum.length;i++) {
				for(int j=0;j<myNum.length;j++) {
					if(comNum[i]==myNum[j] && i==j) { //값 + 자리수도 같은 경우
						stk++;
					}else if(comNum[i]==myNum[j] && i!=j) { //값만 같은경우(자리수X)
						ball++;
					}
				}
			}
			//출력
			if(stk==0 && ball==0) {
				System.out.println("out~!!");
			}else {
				System.out.println("> "+stk+"s "+ball+"b");
			}
			if(stk==3) {
				System.out.println("축~!! 성공, 게임 종료~!!");
				break;
			}
		}
		
		
	}

}

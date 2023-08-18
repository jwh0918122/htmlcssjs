package Day11;

import java.util.Scanner;

import Day10.Method07_lotto;

public class BaseBallGame {

	public static void main(String[] args) {
		/* 야구게임 메서드화
		 * 사용자 번호는 직접 입력
		 * 컴퓨터번호는 랜덤생성(1~9, 중복X)
		 */
		
		
		
		int comNum[] = new int[3]; // 컴퓨터 숫자 배열
		int myNum[] = new int[3]; // 내 배열
		int max = 9, min = 1;
		int str = 0;
		int ball = 0;
		Scanner scan = new Scanner(System.in);
		

		// comNum에 random값 중복없이 넣기
		randomArr(comNum, min, max);
		print(comNum);
		
		System.out.println();
		while(true) {
		System.out.print("숫자를 입력하세요 : ");
		String myStr = scan.next(); // 문자로 입력받음
		String myNumStr[] = myStr.split(""); // 한글자씩 분리해서 배열로 반환

		for (int i = 0; i < myNum.length; i++) { // 문자를 숫자로 변환해서 myNum에 저장
			myNum[i] = Integer.parseInt(myNumStr[i]);
		}
		print(myNum);
//		for (int temp : myNum) {
//			System.out.print(temp + " ");
//		}
		
		
		str=strike(comNum, myNum);
		ball=ball(comNum, myNum);
		
		if(str==0 && ball==0) {
			System.out.println("> out~!!");
		}else {
			System.out.println("> "+str+"s "+ball+"b");
		}
		if(str==3) {
			System.out.println("축~!! 성공, 게임 종료~!!");
			break;
		}
			
		}
		
		
	}
	/* 랜덤 수 생성 메서드
	 * 범위를 주지 않고 min, max 를 이용하여 범위 설정
	 * min = 1, max =9
	 * (int) (Math.random() * 개수) + 시작;
	 * (int) (Math.random() *(max-min+1)) +min;
	 */
	public static int random(int min, int max) {
		if (max < min) { // 값이 바뀌었다면 max와 min을 교환
			int tmp = max;
			max = min;
			min = tmp;
		}
		return (int) (Math.random() * (max - min + 1)) + min;
	}
	
	/* 랜덤 배열 중복되지 않게 생성
	 * isContain을 Method07_lotto 가져와서 사용
	 * 메개변수 : 배열, int min, int max
	 * 리턴 타입 : void
	 */
	public static void randomArr(int comNum[], int min, int max) {
		int cnt = 0; // 배열의 index를 의미
		while (cnt < comNum.length) {
			int r = random(min, max);
			if (!Method07_lotto.isContain(comNum, r)) { // true = 중복된다.
				comNum[cnt] = r;
				cnt++;
			}
		}

	}
	
	/* strike 개수를 카운트하는 메서드
	 * comNum, myNum 주고,번호와 위치가 일치하면 count하는 메서드
	 * 리턴타임 => int
	 */
	public static int strike(int comNum[], int myNum[]) {

		while (true) {
			int stk = 0; // strike 개수

			// 숫자 비교
			for (int i = 0; i < comNum.length; i++) {
				for (int j = 0; j < myNum.length; j++) {
					if (comNum[i] == myNum[j] && i == j) { // 값 + 자리수도 같은 경우
						stk++;
					}
				}
			}
			return stk;
		}
	}
	
	/* ball 개수 카운트하는 메서드
	 * comNum, myNum 주고, 번호만 일치하면 count하는 메서드
	 */
	public static int ball(int comNum[], int myNum[]) {

		while (true) {
			int ball = 0; // ball 개수

			// 숫자 비교
			for (int i = 0; i < comNum.length; i++) {
				for (int j = 0; j < myNum.length; j++) {
					if (comNum[i] == myNum[j] && i != j) { // 값만 같은경우(자리수X)
						ball++;
					}
				}
			}
			return ball;
		}
	}
	/* 배열 출력하는 메서드
	 */
	public static void print(int arr[]) {
		for (int temp : arr) {
			System.out.print(temp + " ");

		}
	}
}

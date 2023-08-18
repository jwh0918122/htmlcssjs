package Day11;

import java.util.Scanner;

import Day10.Method07_lotto;

public class 야구게임복습 {
	int max;
	int min;

	public static void main(String[] args) {
		
		
		
//		
//		y2.randomArr(arr1,7,1);
//		
//		for(int tmp : arr1) {
//			System.out.print(tmp+" ");

		Scanner scan = new Scanner(System.in);
		
		야구게임복습 y2 = new 야구게임복습();

		int[] myNum = new int[3];

		while (true) {

			int[] comNum = new int[3];
			y2.randomArr(comNum, 9, 1);

			System.out.print("comNum : ");
			for (int tmp : comNum) {				
				System.out.print(+ tmp+" ");
			}
			
			System.out.println();
			System.out.println("숫자를 입력하세요 : (3개)");
			for (int i = 0; i < myNum.length; i++) {
				myNum[i] = scan.nextInt();
			}

			System.out.println("st : " + y2.st(comNum, myNum));
			System.out.println("ball : " + y2.ball(comNum, myNum));

		}

	}
	/*
	 * 야구게임 메서드화 사용자번호는 직접 입력 컴퓨터번호는 랜덤생성(1~9, 중복X)
	 */

	/*
	 * 랜덤 수 생성 메서드 범위를 주지 않고 min, max 를 이용하여 범위 설정 min = 1, max = 9
	 * (int)(Math.random()*개수)+시작; (int)(Math.random()*(max-min+1))+min;
	 */
	public int random(int max, int min) {
		if(max < min) { // 값이 바뀌었다면 max와 min을 교환
			int tmp = max;
			max = min;
			min = tmp;
		}
		int random = (int) (Math.random() * (max - min + 1)) + min;
		return random;
	}

	/*
	 * 랜덤 배열 중복되지않게 생성 isContain을 Method07_lotto 가져와서 사용 
	 * 매개변수 : 배열, int min, int max
	 * 리턴 X => void
	 */
	public void randomArr(int[] arr, int max, int min) {

		야구게임복습 y = new 야구게임복습();

		int cnt = 0;

		while (cnt < arr.length) {
			int k = y.random(max, min);
			if (!Method07_lotto.isContain(arr, k)) {
				arr[cnt] = k;
				cnt++;
			}
		}

	}

	/*
	 * 스트라이크 개수를 카운트하는 메서드 comNum, myNum 주고,
	 * 번호와 위치가 일치하면 count하는 메서드 리턴타입 => int
	 */
		
	public static int st(int[] comNum, int[] myNum) {

		int st = 0;
		for (int i = 0; i < comNum.length; i++) {
			if (comNum[i] == myNum[i]) {
				st++;
			}
		}

		return st;
	}

	/*
	 * 볼 개수 카운트하는 메서드 comNum, 
	 * myNum 주고, 번호만 일치하면 count하는 메서드
	 */		
	public int ball(int[] comNum, int[] myNum) {

		int cnt = 0;

		for (int i = 0; i < comNum.length; i++) {
			for (int j = 0; j < myNum.length; j++) {
				if (comNum[i] == comNum[j]) {
					cnt++; // 스트라이크, 볼 같이 체크
				}
			}
		}

		return cnt - st(comNum, myNum);
	}

	/*
	 * 배열 출력 메서드
	 */

}


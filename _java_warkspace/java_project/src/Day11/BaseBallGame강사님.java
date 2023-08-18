package Day11;
import java.util.Scanner;
import Day10.Method07_lotto;
public class BaseBallGame강사님 {
	public static void main(String[] args) {
		/* 야구게임 메서드화
		 * 사용자번호는 직접 입력
		 * 컴퓨터번호는 랜덤생성(1~9, 중복X)
		 * */
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		int max=9, min=1;
		int s=0, b=0;
		
		Scanner scan = new Scanner(System.in);
		
		createArray(comNum, min, max);
		Method07_lotto.printArray(comNum);
		
		//System.out.println();
		while(s!=3) {
			System.out.println("myNum 3개 입력 >");
			int cnt = 0;
			while(cnt<3) {
				myNum[cnt]=scan.nextInt();
				cnt++;
			}
			
			s = strike(comNum, myNum);
			b = ball(comNum, myNum);
			if(s!=0) {
				System.out.println(s+"S ");
			}
			if(b !=0) {
				System.out.println(b+"B ");
			}
			if(s==0 && b==0) {
				System.out.println();
				System.out.println("out~!!");
			}
		}
		System.out.println("종료~!!");
	}
	
	/* 랜덤 수 생성 메서드
	 * 범위를 주지 않고 min, max 를 이용하여 범위 설정
	 * min = 1, max = 9
	 *  (int)(Math.random()*개수)+시작;
	 *  (int)(Math.random()*(max-min+1))+min;
	 * */
	public static int random(int min, int max) {
		if(max < min) { // 값이 바뀌었다면 max와 min을 교환
			int tmp = max;
			max = min;
			min = tmp;
		}
		return (int)(Math.random()*(max-min+1))+min;
	}
	
	
	/* 랜덤 배열 중복되지않게 생성
	 * isContain을 Method07_lotto 가져와서 사용
	 * 매개변수 : 배열, int min, int max
	 * 리턴 X => void
	 * */
	public static boolean createArray(int arr[], int min, int max) {
		if(arr == null) {
			return false;
		}
		if((max-min+1) < arr.length) {
			return false;
		}
		int cnt =0;
		while(cnt < arr.length) {
			int r=random(min, max);
			if(!Method07_lotto.isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
		return true;
	}
	
	
	/* 스트라이크 개수를 카운트하는 메서드
	 * comNum, myNum 주고, 번호와 위치가 일치하면 count하는 메서드
	 * 리턴타입 => int
	 * */
	public static int strike(int com[], int my[]) {
		int cnt=0;
		for(int i=0; i<com.length; i++) {
			if(com[i] == my[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	
	/* 볼 개수 카운트하는 메서드
	 * comNum, myNum 주고, 번호만 일치하면 count하는 메서드
	 * */
	public static int ball(int com[], int my[]) {
		int cnt=0;
		for(int i=0; i<com.length; i++) {
			if(Method07_lotto.isContain(my, com[i])) {
				cnt++;  //ball + strike 같이 체크
			}
		}
		return cnt - strike(com, my);
	}
	
	
	/* 배열 출력 메서드
	 * */
	
}

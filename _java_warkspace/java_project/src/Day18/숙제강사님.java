package Day18;

import java.util.Scanner;

public class 숙제강사님 {

	public static void main(String[] args) {
		// 숫자를 입력받아 입력받은 숫자의 총합을 구하는 프로그램 작성
		// 입력 : 45,78,89,65,95 = String 타입으로 입력
		// 입력받은 문자들을 배열에 넣고 , 합계를 출력
		// 1. 총합
		// 2. 70점 이상 합계

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 :  ");
		String input = scan.next(); // ) 입력 : 45,78,89,65,95
		String[] numbers = input.split(","); // , 기준으로 분리하여 배열에 저장
		int total = 0;
		int total70 = 0;
		int cnt = 0;
		int cnt70 = 0;
		for (String num : numbers) {
			num = num.trim(); // 공백 제거
			int n = Integer.parseInt(num); // 문자를 숫자로 변환
			total += n;
			cnt++;
			if (n >= 70) {
				total70 += n;
				cnt70++;
			}
		}
		System.out.println("전체 총합 : " + total+" / 전체 수의 개수 : "+cnt);
		System.out.println("70점 이상 합계 : " + total70+" / 70점 이상 수의 개수 : "+cnt70);

	}

}

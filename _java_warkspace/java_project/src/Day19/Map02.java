package Day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력 받아(Scanner) 출력
		 * 합계, 평균 출력
		 * 종료 키워드가 나올때까지 반복(0=종료)
		 * 과목과 점수를 입력해 주세요 . >
		 * 국어 89
		 * 수학 78
		 * 0 종료
		 * map으로 출력 후 합계, 평균 출력
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		String subject;
		int score;
		int cnt = 0; // 평균을 구하기 위해 몇개 과목 입력했는지 카운트

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		do {

			System.out.println("과목을 입력해주세요(종료=0) : ");
			subject = scan.next();
			if (subject.equals("0")) {
				System.out.println("종료");
				break;
			}
			System.out.println("과목의 점수를 입력하세요 : ");
			score = scan.nextInt();

			map.put(subject, score);
			cnt++;

		} while (subject.equals("0") == false);

		int sum = 0; // 점수의 합계 구할 변수

//		향상된 for문 사용하여 출력	
//		for (String tmp : map.keySet()) {
//			sum = sum + map.get(tmp); // 점수의 합계 (map.get(tmp):key인 tmp의 value값을 토해냄)
//
//			System.out.println(tmp + ":" + map.get(tmp));
//		}
	
//		Iterator 사용하여 출력
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String tmp = it.next();
			sum = sum + map.get(tmp); // 점수의 합계 (map.get(tmp):key인 tmp의 value값을 토해냄)
			System.out.println(tmp + ":" + map.get(tmp));
		}

		if (cnt != 0) {
			System.out.println("점수의 합계 : " + sum);
			System.out.println("점수의 평균 : " + ((double) sum / cnt));
		}
	}

}

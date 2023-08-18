package Day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map02강사님 {

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
		HashMap<String, Integer> map = new HashMap();
		Scanner scan = new Scanner(System.in);
		int exit = 1; //exit=0 종료
		while(exit !=0) {
			//입력
			System.out.println("과목과 점수를 입력해주세요 : ");
			String subject = scan.next();
			int score= scan.nextInt();
			
			map.put(subject, score);
			System.out.println("계속 : 1, 종료 : 0");
			exit = scan.nextInt();						
		}
		int sum = 0;
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String subject = it.next();
			int score = map.get(subject);
			sum+=score;
			System.out.println(subject + ":" + score);
		}
		System.out.println("sum : "+sum);
		System.out.println("avg : "+((double)sum/map.size()));
	
		scan.close();

	}

}

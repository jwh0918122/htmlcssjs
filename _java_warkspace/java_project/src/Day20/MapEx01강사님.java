package Day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx01강사님 {

	public static void main(String[] args) {
		/* 단어장
		 * 단어(5개)를 입력받아 콘솔에 출력하는 기능
		 * --단어장--
		 * hello : 안녕
		 * apple : 사과
		 * orange : 오렌지
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		HashMap<String, String> m = new HashMap<>();

		int size = 2;
		while (m.size() < size) {
			System.out.println("단어를 입력하세요 : ");
			String word = scan.next();
			System.out.println("단어의 뜻을 입력하세요 : ");
			String mean = scan.next();
			m.put(word, mean);
		}
		System.out.println("---단어장---");
		Iterator<String> it = m.keySet().iterator();
		while (it.hasNext()) {
			String word = (String) it.next();
			String mean = m.get(word);
			System.out.println("단어:" + word + ", 의미:" + mean);
		}
	}
}

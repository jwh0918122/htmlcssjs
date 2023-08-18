package Day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx01 {

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

		String k; //key값 받을 변수
		String v; //value값 받을 변수

		for (int i = 1; i <= 5; i++) {
			System.out.println("단어를 입력하세요 : ");
			k = scan.next();
			System.out.println("단어의 뜻을 입력하세요 : ");
			v = scan.next();
			m.put(k, v);
		}

//		향상된 for문 출력		
//		System.out.println("---단어장---");
//		for(String tmp : m.keySet()) {
//			System.out.println(tmp+" : "+m.get(tmp));
//		}

//		Iterator		
		System.out.println("---단어장---");
		Iterator<String> it = m.keySet().iterator();
		while (it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp + " : " + m.get(tmp));
		}

	}

}

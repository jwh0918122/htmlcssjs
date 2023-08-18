package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list 생성
		 */
		//출력을 for / 향상된 for / Iterator 사용하여 출력
			
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("일어나기");
		arr.add("밥먹기");
		arr.add("씻기");
		arr.add("옷 입기");
		arr.add("학원 가기");

		// for문
		System.out.println("<for문>");
		for (int i = 1; i <arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("<향상된 for문>");
		// 향상된 for문
		for (String tmp : arr) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		System.out.println("<Iterator>");
		// Iterator
		Iterator<String> ite = arr.iterator();
		while (ite.hasNext()) {
			String tmp = ite.next();
			System.out.print(tmp+" ");
		}

		System.out.println();
		System.out.println("--정렬(오름차순)--");
		Collections.sort(arr);
		System.out.println(arr);
		
		arr.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 숫자는 - 크다, 작다를 이용 가능.
				// 문자는 compareTO 메서드를 활용하여 정렬
				return o2.compareTo(o1);
			} 
			
		});
		System.out.println(arr);
	}

}

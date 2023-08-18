package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List02 {

	public static void main(String[] args) {
		/* 두 배열을 매개변수로 입력받아서 하나로 합치는 ArrayList를 구성
		 * list = a b c d e f g h
		 */
		String arr1[] = new String[] { "a", "e", "c", "g" };
		String arr2[] = new String[] { "d", "f", "b", "h" };
		// 합치기 => 정렬

		ArrayList<String> list = new ArrayList();

		for (int i = 0; i < arr1.length; i++) { // arr1 넣기
			list.add(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) { // arr2 넣기
			list.add(arr2[i]);
		}

// 		// 향상된 for문 이요하여 출력
//		System.out.println("--배열 합치기--");
//		for(String tmp : list) {
//			System.out.print(tmp+" ");
//		}

		// for문 이용하여 출력
//		System.out.println("--배열 합치기--");
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i) + " ");
//		}

		// Iterator 이용하여 출력
		System.out.println("--배열 합치기--");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp + " ");
		}

		// 오름차순 정렬
		Collections.sort(list);
		System.out.println();
		System.out.println("--오름차순 정렬--");
		System.out.println(list);

		// 내림차순 정렬
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}

		});
		System.out.println();
		System.out.println("--내림차순 정렬--");
		System.out.println(list);
	}

}

package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class List02강사님 {

	public static void main(String[] args) {
		/* 두 배열을 매개변수로 입력받아서 하나로 합치는 ArrayList를 구성
		 * list = a b c d e f g h
		 */
		String arr1[] = new String[] { "a", "e", "c", "g" };
		String arr2[] = new String[] { "d", "f", "b", "h" };
		// 합치기 => 정렬

		ArrayList<String> list = new ArrayList();

		int cnt = arr1.length + arr2.length;
		int i = 0, j = 0;
		while (cnt > list.size()) { // size() : 개수
			if (i < arr1.length) {
				list.add(arr1[i]);
				i++;
			}
			if (j < arr2.length) {
				list.add(arr2[j]);
				j++;
			}
		}
		System.out.println(list); //출력
		Collections.sort(list);
		System.out.println(list); //오름차순

		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		System.out.println(list); //내림차순

	}

}

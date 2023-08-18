package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		/* Set 순서 보장X, 중복X
		 * HashSet(대표적인 Set 컬렉션 프레임 구현 클래스)
		 * TreeSet(정렬이 되는 Set)
		 * 순서가 없다. index가 없음.
		 */
		
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("apple");
		set.add("peach");
		set.add("홍길동");
		set.add("이순신");

		System.out.println(set); // 넣은 순서 상관 없이 자기 맘대로 출력(중복X)

		for (String tmp : set) {
			System.out.print(tmp + " ");
		}
		
		System.out.println();
		System.out.println("-------------");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("-------------");
		
		
		//set정렬  
		//set은 순서가 없어서 정렬이 안됨.
		//set => list로 변환한 후 정렬		
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

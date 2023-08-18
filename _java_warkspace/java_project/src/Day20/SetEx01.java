package Day20;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();

		// Math 클래스에서 제공하는 랜덤 메서드 사용
		int random = (int) (Math.random() * 45) + 1;

		// Random class 별도로 있음. 1~45까지 랜덤 수 출력
//		int random2 = new Random().nextInt(45) + 1;

//		set 중복저장X set에 로또번호 6개 생성 후 출력 랜덤으로 1~45
		while (set.size() < 6) {
			set.add(new Random().nextInt(45) + 1);
			
		}

//		대괄호 있게 생성
//		System.out.println(set);

		// 대괄호 없이 출력됨
		for (int tmp : set) {
			System.out.print(tmp + " ");
		}

		System.out.println("---------");

		// treeSet : 값이 들어오면 오름차순으로 set이 만들어짐

		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		while (set.size() < 6) {
			int random2 = (new Random().nextInt(45) + 1);
			treeSet.add(random2);

		}
		System.out.println(treeSet);

	}

}

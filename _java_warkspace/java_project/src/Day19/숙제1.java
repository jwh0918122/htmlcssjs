package Day19;

import java.util.HashMap;
import java.util.Iterator;

public class 숙제1 {
	
	
	public static void main(String[] args) {
		/* map을 이용하여 상품과 가격을 추가하여 합계를 구하시오.
		 * 상품을 map에 추가하는 값은 메서드로 작업
		 * 1. map은 main에 만들어놓고, method로 추가만(맵을 매개변수 받기)
		 * 가위, 2500
		 * 크레파스, 4000
		 * 합계 6500
		 */
		
		/* - 맵 입력 방식 - 
		 * 매개변수 : HashMap<String, Integer>map
		 * 리턴 : HashMap<String, Integer>  (리턴만)
		 */
		
		HashMap<String, Integer> map = new HashMap<>();

		숙제1.insert(map, "가위", 2500);
		숙제1.insert(map, "크레파스", 4000);
		숙제1.insert(map, "연필", 1000);

//		향상된 for문
//		int sum = 0;
//		for (String tmp : map.keySet()) {
//			sum += map.get(tmp);
//			System.out.println(tmp + " : " + map.get(tmp));
//		}
//		System.out.println("합계 : "+sum);
		
		
//		Iterator
		int sum2=0;
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String tmp = it.next();
			sum2 += map.get(tmp);
			int value = map.get(tmp);
			System.out.println(tmp + ":" + value + "원");

		}
		System.out.println("합계 : " + sum2);

	}

	public static void insert(HashMap<String, Integer> map, String product, int price) {
		map.put(product, price);

	}

}

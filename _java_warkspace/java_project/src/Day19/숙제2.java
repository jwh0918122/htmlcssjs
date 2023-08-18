package Day19;

import java.util.HashMap;

public class 숙제2 {

	public static void main(String[] args) {
		/* map을 이용하여 상품과 가격을 추가하여 합계를 구하시오.
		 * 상품을 map에 추가하는 값은 메서드로 작업
		 * 2. map을 method에서 만들어서 main으로 리턴 
		 * 가위, 2500
		 * 크레파스, 4000
		 * 합계 6500
		 */

		HashMap<String, Integer> map = insert();

		int tot = 0;
		for (String tmp : map.keySet()) {
			int value = map.get(tmp);
			tot += value;
			System.out.println(tmp + ":" + value + "원");
		}
		System.out.println("합계 : " + tot);

	}

	public static HashMap<String, Integer> insert() {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("크레파스", 4000);
		map.put("연필", 1000);

		return map;
	}
}

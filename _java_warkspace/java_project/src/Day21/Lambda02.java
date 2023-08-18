package Day21;

import java.util.HashMap;

public class Lambda02 {

	public static void main(String[] args) {
		/* map을 구성하여 forEach를 이용하여 출력
		 * number.forEach((n)->{    //여기서 n은 아무런 의미도 없음
		 * System.out.print(n+" ");
		 * }); 
		 */
		
		HashMap<String, Integer> map = new HashMap<>();

		map.put("영희", 100);
		map.put("몽이", 99);
		map.put("철수", 98);
		map.put("짱구", 97);
		map.put("훈이", 96);

//		map.keySet().forEach((n) -> {
//			System.out.println(n + " : " + map.get(n));
//		});
//
//		System.out.println();
//		System.out.println("-----------------");
//		map.keySet().forEach((n) -> {
//			System.out.printf("%s : %d %n", n, map.get(n)); // %s=문자열 ,%d=정수 ,%n = 줄바꿈
//		});

		map.forEach((x,y)-> System.out.println(x+":"+y)); //실행문이 하나이니까 {} 생략 가능
		
		
		Number add = (a,b) ->{ //함수 구현
			return a+b;
		};
		System.out.println(add.add(10, 30)); //결과 체크
		
//		System.out.println();
//		System.out.println("---------------------------");
//		Number max - (a,b)->(a >= b)? a:b; //함수 구현
//		System.out.println(max.add(2, 10)); //결과 체크
		
	}

}

//람다식에서 사용할 함수형 인터페이스
//메서드가 1개여야 함. 
@FunctionalInterface //이노테이션 필수
interface Number{
	int add(int a, int b);
	
}

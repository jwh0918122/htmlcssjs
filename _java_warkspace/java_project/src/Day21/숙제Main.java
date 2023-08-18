package Day21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 숙제Main {

	public static void main(String[] args) {
		/* 여행사 상품이 있습니다.
		 * 여행 비용은 15세 이상은 100만원, 그 미만은 50만원 계산
		 * 고객 3명이 패키지 여행을 간다고 했을 때 
		 * 1.비용계산 2.고객 명단 검색=>출력
		 * 고객의 클래스를 생성하고 ArrayList로 관리
		 * 
		 * 예시) 고객 정보 => 고객명단 ( Stream으로 구성해서 출력) 
		 * 이름:이순신, 나이:40, 비용:100
		 * 이름:김유신, 나이:20, 비용:100
		 * 이름:홍길동, 나이:10, 비용:50
		 * 총 여행 비용 : 250
		 * 
		 * 20대 이상 고객 명단 => 이름순으로 정렬
		 * 이름:김유신, 나이:20, 비용:100
		 * 이름:이순신, 나이:40, 비용:100
		 * 이름:홍길동, 나이:10, 비용:50
		 */

		ArrayList<숙제Customer> list = new ArrayList<>();
		숙제Customer c = new 숙제Customer(); //비용 메서드 사용하기 위해

		list.add(new 숙제Customer("이순신", 40, c.price(40)));
		list.add(new 숙제Customer("김유신", 20, c.price(20)));
		list.add(new 숙제Customer("홍길동", 10, c.price(10)));

		/* 고객 명단*/
		System.out.println("----고객 명단----");
		list.stream()
				.forEach(n -> System.out.println("이름:" + n.getName() + ", 나이:" + n.getAge() + ", 비용:" + n.getPrice()));
		
		//총 비용 구하기
		int sum = list.stream().mapToInt(n->n.getPrice()).sum();
		System.out.println("총 비용:"+sum);

			
		/* 20대 이상 고객 명단*/
		
		//오름차순 정렬
		list.sort(new Comparator<숙제Customer>() {

			@Override
			public int compare(숙제Customer o1, 숙제Customer o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		
		System.out.println();
		System.out.println("----20대 이상 고객 명단----");
		list.stream()
		.filter(n -> n.getAge()>=20)
		.forEach(n->System.out.println("이름:"+n.getName()+" 나이:"+n.getAge()+" 비용:"+n.getPrice()));
		
		//총 비용구하기(20대 이상)
		int sum2=list.stream()
		.filter(n -> n.getAge()>=20)
		.mapToInt(n->n.getPrice()).sum();
		System.out.println("총 비용:"+sum2);
		

	}

}

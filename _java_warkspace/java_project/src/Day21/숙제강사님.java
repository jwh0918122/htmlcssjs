package Day21;
import java.util.ArrayList;
import java.util.Comparator;
public class 숙제강사님 {
	public static void main(String[] args) {
		/* 여행사 상품이 있습니다.
		 * 여행 비용은 15세 이상은 100만원, 그 미만은 50만원 계산
		 * 고객 3명이 패키지 여행을 떠난다고 했을 때 
		 * 1. 비용계산, 2. 고객 명단 검색 => 출력
		 * 
		 * 고객의 클래스를 생성하고 ArrayList로 고객 관리
		 * 
		 * 예시) 고객 정보 => 고객 명단
		 * 	이름: 이순신, 나이: 40, 비용: 100
		 * 	이름: 김유신, 나이: 20, 비용: 100
		 * 	이름: 홍길동, 나이: 10, 비용: 50
		 * 	 총 여행비용: 250
		 * 
		 * 20대 이상 고객 명단 => 이름순으로 정렬
		 * 	이름: 김유신, 나이: 20, 비용: 100
		 *  이름: 이순신, 나이: 40, 비용: 100
		 * */
		//Customer 클래스를 이용한 객체 생성
		Customer cuLee = new Customer("이순신", 40);
		Customer cuKim = new Customer("김유신", 20);
		Customer cuHong = new Customer("홍길동", 10);
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(cuLee);
		list.add(cuKim);
		list.add(cuHong);
		
		int sum = 0;
		System.out.println("--고객명단--");
		for(Customer tmp : list) {
			String name = tmp.getName();
			int age = tmp.getAge();
			int price = tmp.getPrice();
			sum += price;
			System.out.println(tmp);
//			System.out.println("이름:"+name+", 나이:"+age+", 비용:"+price);
		}
		System.out.println("총비용:"+sum);
		//20세 이상 데이터 출력 (오름차순)
		list.sort(new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				// 이름순으로 정렬
				//String 정렬 : compareTo
				//Integer : o1-o2
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("--20세 이상명단--");
		for(Customer tmp : list) {
			if(tmp.getAge()>=20) {
				System.out.println(tmp);
			}
		}
		
		//Stream을 이용한 방법
		System.out.println("--스트림을 이용한 방법--");
		list.stream().forEach(s-> System.out.println(s));
		//원하는 요소를 출력할 때 map
		System.out.println("==고객명만 출력==");
		list.stream().map(m->m.getName()).forEach(f->System.out.println(f));
		//총비용
		System.out.println("--총 비용--");
		int tot = list.stream().mapToInt(m-> m.getPrice()).sum();
		System.out.println("총 비용:"+tot);
		//나이가 20세 이상인 데이터만 추출
		//Stream에서 자료형이 클래스인 경우, sorted를 하려면 클래스 자체의 정렬이 구현되어 있어야 함.(자료형이 int나 String면 자동으로 됨)
		list.stream().filter(c->c.getAge()>=20).sorted().forEach(a->System.out.println(a));
		
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("사과");
		list2.add("감");
		list2.add("배");
		
		list2.stream().sorted().forEach(n->System.out.println(n));
		
	}
	
}
/* list.stream().sorted() 할때 list의 자료형이 int거나 String이면 자동으로 오름차순으로 정렬이 되는데, 
 * 만약, 자료형이 클래스라면 무슨 기준으로 정렬을 해야할지 자료형 클래스에 implements Comparable<클래스이름> 로
 * 구현해줘야 한다.
 * */
class Customer implements Comparable<Customer>{ //정렬하는 기능을 구현한다
	
	//멤버변수선언
	private String name;
	private int age;
	private int price;
	
	//생성자
	public Customer() {}
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.price = price = (age>=15)? 100 :50;
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
//		return o.name.compareTo(this.name); // 내림차순
		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "고객명단 [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
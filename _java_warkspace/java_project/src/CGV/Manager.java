package CGV;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Manager {
	Customer c = new Customer();
	HashMap<Integer, Movie> movieMap = new HashMap<>(); // 영화 리스트맵
//	ArrayList<Movie> movieList = new ArrayList<>(); //영화 리스트

	// 영화 세팅
	public void addMovie() {
		movieMap.put(1, new Movie("인디아나 존스-운명의 다이얼"));
		movieMap.put(2, new Movie("엘리맨탈"));
		movieMap.put(3, new Movie("스파이더맨-어크로스 더 유니버스"));
		movieMap.put(4, new Movie("귀공자"));
		movieMap.put(5, new Movie("범죄도시3"));
		movieMap.put(6, new Movie("악마들"));
		movieMap.put(7, new Movie("명탐정코난-하이바라 아이 이야기"));
	}

	// 영화 리스트 출력
	public void moviePrint() {
		for (Integer tmp : movieMap.keySet()) {
			System.out.println(tmp + ". " + movieMap.get(tmp));
		}
	}

	// 영화 고르기
	public void PickMovie(Scanner scan) {
		
		System.out.println();
		System.out.println("관람하실 영화를 입력해 주세요 >> ");
		int num = scan.nextInt();

		for (Integer tmp : movieMap.keySet()) {
			if (tmp == num) {
				c.setUserPickMovie(movieMap.get(tmp).getMovie());
				System.out.println("선택하신 영화 : " + c.getUserPickMovie());
//				System.out.println("선택하신 영화 : "+movieMap.get(tmp).getMovie());
				return;
			}
		}
		System.out.println("선택하신 번호의 영화는 없습니다.");
	}

	// 날짜 선택
	public void PickDate(Scanner scan) {
		
		System.out.println();
		System.out.println("* 금일 기준, 최대 5일 후까지 예매 가능합니다.");
		System.out.println("관람하실 날짜를 입력하세요 : (ex:6/29)");
		c.setUserPickDate(scan.next()); 
		System.out.println("선택하신 날짜 : "+c.getUserPickDate());
		
	}
	

}

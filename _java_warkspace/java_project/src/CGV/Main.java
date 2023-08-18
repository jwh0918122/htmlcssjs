package CGV;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   

		Scanner scan = new Scanner(System.in);
		Manager m = new Manager();
		
		m.addMovie(); //기본 영화 세팅

		int menu=-1;
		do
		{
			System.out.println("1.예매하기|2.예매확인|3.예매취소|4.종료");
			System.out.println("메뉴를 선택하세요>>");
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				m.moviePrint();//영화 리스트 출력		
				m.PickMovie(scan);//영화 고르기
				m.PickDate(scan);//날짜 선택
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default :
				System.out.println("잘 못 입력 하셨습니다.");
			}

		}while(menu!=4);
		System.out.println("종료");

	}

}

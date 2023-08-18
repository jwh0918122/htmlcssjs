package product;

import java.util.Scanner;

public interface prductInterface {

	//메뉴추가, 메뉴삭제, 가격수정,주문, 주문내역 출력, 전체메뉴 출력 
	
	 void add(Scanner scan); //메뉴 추가
	 void delete(Scanner scan); //메뉴 삭제
	 void update(Scanner scan); //가격 수정
	 void orderPick(Scanner scan); //주문
	 void printOrder(); //주문내역 출력
	 void printProduct(); //메뉴 출력
	
	 
	 
}

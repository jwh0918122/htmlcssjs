package Day08;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때, 
		 * 검색어를 입력하면 해당단어를 포함하는 파일을 출력
		 */

		String[] fileName = {"java의 정석.txt","이것이 자바다.java","String.jpg",
				"String 메서드.txt","String 함수.jpg"};
		
		//ex) java검색 => java의 정석.txt, 이것이자바다.java
		//ex) String검색 => String.jpg, String 메서드.txt, String 함수.jpg
		//ex) jpg검색 => String.jpg, String 메서드.jpg, String 함수.jpg
		// 일치하는 값이 없으면 "입력하신 단어가 없습니다.
		
	/* 내가 한 거 
	 	Scanner scan=new Scanner(System.in);
	 
		
		int z=0;
		String s=scan.nextLine();
		for(int i=0;i<=fileName.length-1;i++) {
			
			if(fileName[i].contains(s)){
				System.out.println(fileName[i]);
			}else {
				z++; //검색한 값이 fileName에 포함되지 않으면 1씩 증가
			}
		}
		if(z==fileName.length) { //z가 fileName의 길이랑 같으면(검색한 값이 fileName에 모두 포함되지 않으면) 실행
			System.out.println("입력하신 검색 값이 없습니다.");
		}	
		
		scan.close();
		*/
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("검색어를 입력하세요. : ");
		String s=scan.nextLine();
		int cnt=0;
		System.out.println("--검색어 : "+s+" --");
		for(String temp : fileName) {
			if(temp.contains(s)) {
				System.out.println(temp);
				cnt++; //검색된 값의 개수
			}
		}
		if(cnt==0) {
			System.out.println("검색결과가 없습니다.");
		}
		
	
		
		scan.close();
		
	}
	}



package Day22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryMain {

	public static void main(String[] args) throws IOException {
		// 영어 사전
		/*
		 * 메뉴 1.단어등록|2.단어검색|3.단어수정|5.종료 
		 * 파일로 저장 클래스로 단어 구성 (단어, 뜻 하나씩)(단어와 뜻을 나타낼 수있는 거를스트링으로) 
		 * 메인에서 리스트로 받아서 단어장 만들기 단어대로 오름차순 정렬(할 수있으면)
		 * 
		 * => 할 수있으면 뜻 여러개로 리스트 만들어서 해 봐
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		FileWriter fw = new FileWriter("word.txt");

		DictionaryManager m = new DictionaryManager();

		m.gibon();

		int num;
		String word;
		String mean;
		do {
			System.out.println("메뉴를 입력하세요 >>");
			System.out.println("1.단어등록|2.단어검색|3.단어수정|4.단어장|5.종료");
			num = scan.nextInt();

			switch (num) {
			case 1: //단어 등록
				m.addWord(scan);
				break;
			case 2: //단어 검색
				m.serchWord(scan);
				break;
			case 3: //단어 수정
				m.updateWord(scan);
				break;
			case 4: //단어장
				m.printWord();
				break;
			case 5: // 종료
				break;
			default:
				System.out.println("잘 못 입력하셨습니다.");
			}

		} while (num != 5);
		System.out.println("종료");

	}// main 끝

}

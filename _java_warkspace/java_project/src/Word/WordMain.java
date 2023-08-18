package Word;

import java.util.ArrayList;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		/* 단어장 프로그램 작성
		 * 1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.파일출력|6.종료
		 * 파일로 저장
		 * 파일명은 word.txt 
		 */

		
		WordManager wm = new WordManager();
		Scanner scan = new Scanner(System.in);
		
		wm.addWord();

		int menu = -1;
		do {
			System.out.println("메뉴를 선택해주세요 >>");
			System.out.println("1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.파일출력|6.종료");
			menu = scan.nextInt();
			try {

				switch (menu) {
				case 1: 
					wm.insertWord(scan);
					break;
				case 2:
					wm.searchWord(scan);
					break;
				case 3:
					wm.modifyWord(scan);
					break;
				case 4:
					wm.printWord();
					break;
				case 5:
					wm.printFile();
					break;
				case 6:
					break;
				default : 
					System.out.println("잘 못 입력하셨습니다.");

				}

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		} while (menu != 6);

		System.out.println("종료");
	}

}

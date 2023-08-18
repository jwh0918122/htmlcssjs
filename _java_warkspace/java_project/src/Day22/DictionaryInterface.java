package Day22;
// 영어 사전
/* 메뉴
 * 1.단어등록|2.단어검색|3.단어수정|4.단어장|5.종료
 * 파일로 저장
 * 클래스로 단어 구성 (단어, 뜻 하나씩)(단어와 뜻을 나타낼 수있는 거를 스트링으로)
 * 메인에서 리스트로 받아서 단어장 만들기
 * 단어대로 오름차순 정렬(할 수있으면)
 * 
 * => 할 수있으면 뜻 여러개로 리스트 만들어서 해 봐
 * 
 * */

import java.io.IOException;
import java.util.Scanner;

public interface DictionaryInterface {

	void addWord(Scanner scan) throws IOException;
	void serchWord(Scanner scan) throws IOException;
	void updateWord(Scanner scan) throws IOException;
	void printWord() throws IOException;
	
}

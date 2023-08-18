package Word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordManager {
	
	private ArrayList<Word> list = new ArrayList<>();
	
	
	public void addWord() {
		list.add(new Word("dog", "강아지"));
		list.add(new Word("cat", "고양이"));
		list.add(new Word("apple", "사과"));
		list.add(new Word("banana", "바나나"));
	}

	public void insertWord(Scanner scan) {
		// 단어 등록
		Word w = new Word();
		System.out.println("등록하실 단어 : ");
		w.setWord(scan.next());
		System.out.println("의미 : ");

		scan.nextLine(); //뒷쫏에 들어갈 값의 공백 제거
		w.setMean(scan.nextLine()); //의미가 길다면 라인으로 받아	
		//		w.setMean(scan.next());
		
		list.add(w);
		System.out.println("등록 완료");
		
	}

	public void searchWord(Scanner scan) {
		// 단어 검색
		System.out.println("검색할 단어 : ");
		String s = scan.next();
		
		for(Word tmp : list) {
			if(tmp.getWord().equals(s)) {
				System.out.println("--검색 결과--");
				System.out.println(tmp);
				return; //리턴 받으면 메서드를 아예 나가서 밑에 "검색결과 없습니다"문구가 안나옴
			}
		}
		System.out.println("검색 결과가 없습니다.");

	}

	public void modifyWord(Scanner scan) {
		// 단어 수정(삭제 후 다시 추가)
		System.out.println("수정할 단어 : ");
		String s = scan.next();
		Word w = new Word(s);

		// 해당 클레스 중 word만 같아도 같은 클래스로 인식

		boolean res = list.remove(w); // 어차피 수정할거니까 지워버리고 다시 받아(.remove는 원래 트루펄스로 반환해줌)
		if (!res) {
			System.out.println("검색 단어가 없습니다.");
			return;
		}
		// 값 다시 추가
		insertWord(scan);
	}

	public void printWord() {
		// TODO Auto-generated method stub
		System.out.println(">>단어장<<");
		Collections.sort(list);

		for (Word tmp : list) {
			System.out.println(tmp);
		}
	}

	public void printFile() throws IOException {
		// 파일로 출력
		FileWriter fw = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuffer sb = new StringBuffer();
		int cnt = 0;
		String data = "";
		Collections.sort(list);
		while (cnt < list.size()) { // list가 모두 소진될때까지
			sb.append(list.get(cnt).toString());
			sb.append("\r\n"); // 줄바꿈(사실 \r 은 빼도 됨)
			data = sb.toString();
			cnt++;
		}
		System.out.println(data);
		fw.write(data);
		fw.close();
	}
}

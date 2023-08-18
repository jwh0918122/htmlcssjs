package Day22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class DictionaryManager implements DictionaryInterface {
	ArrayList<Word> list = new ArrayList<>(); // 단어장

	// 기본단어 세팅
	public ArrayList<Word> gibon() throws IOException {
		FileWriter fw = new FileWriter("word.txt");

		list.add(new Word("동사", "사물의 동작이나 작용을 나타내는 품사"));
		list.add(new Word("형용사", "사물의 성질이나 상태를 나타내는 품사"));
		list.add(new Word("명사", "하나의 언어로 나타내며 명제를 구성하는 요소"));
		list.add(new Word("대명사", "사람이나 사물의 이름을 대신 타나내는 말"));
		
		sortWord(list); //오름차순 정렬 메소드 만든 거
		
		for (int i = 0; i < list.size(); i++) {
			String word2 = list.get(i).getWord();
			String mean2 = list.get(i).getMean();
			fw.write(word2 + ":" + mean2 + "\n");
		}

		fw.close();
		return list;
	}

	// 오름차순 정렬
	public void sortWord(ArrayList<Word> list) {
		list.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				// TODO Auto-generated method stub
				return o1.getWord().compareTo(o2.getWord());
			}

		});

	}

	// 단어 등록
	@Override
	public void addWord(Scanner scan) throws IOException {		
		System.out.println("등록하실 단어와 뜻을 입력하세요 : ");
		String word = scan.next();
		String mean = scan.next();

		list.add(new Word(word, mean)); // 리스트에 단어 등록
		
		sortWord(list); //오름차순 정렬

//		이거는 덮어써져서 추가한 단어 한개만 뜸....
//		FileWriter fw = new FileWriter("word.txt");
//		fw.write(word + ":" + mean + "\n");
//		fw.close();
		

//		// 파일에 단어 등록    => 등록한거는 정렬 메소드가 안됨...ㅜ 
		FileWriter fw1 = new FileWriter("word.txt", true);
		fw1.write(word + ":" + mean + "\n");
		fw1.close();
			
		
		//불러와서 다시 정렬..?
//		BufferedReader br = new BufferedReader(new FileReader("word.txt"));
//
//		int cnt = 0;
//		ArrayList<String> a = new ArrayList<>();
//		while (true) {
//			String line = br.readLine();
//			if (line == null)
//				break;
//			a.add(line.substring(0, line.indexOf(":")));
//			a.stream().sorted();
//
//		}
//		
//		for(int i=0;i<a.size();i++) {
//			FileWriter fw = new FileWriter("word.txt");
//			fw.write(word + ":" + mean + "\n");
//			fw.close();
//		}

	}

	// 단어 검색
	@Override
	public void serchWord(Scanner scan) throws IOException {		
		System.out.println("검색하실 단어를 입력하세요 : ");
		String word = scan.next();

//      리스트로 검색하는 법
//       for (int i = 0; i < list.size(); i++) {
//          if (list.get(i).getWord().equals(word)) {
//             list.get(i).print();
//          }
//       }

//     파일에서 불러와서 검색하는 법
		BufferedReader br = new BufferedReader(new FileReader("word.txt"));
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.substring(0, line.indexOf(":")).equals(word)) {
				System.out.println(line.substring(line.indexOf(":") + 1));
			} else {
				continue;
			}

		}

	}
	
	// 단어 수정
	@Override
	public void updateWord(Scanner scan) throws IOException {		
		System.out.println("수정하실 단어와 뜻을 입력하세요 : ");
		String word = scan.next();
		String mean = scan.next();

		System.out.println("---수정된 결과---");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getWord().equals(word)) {
				list.get(i).setMean(mean);
				list.get(i).print();
			}
		}
		// 다시 같은 이름을 생성하면 파일은 덮어쓰기됨
		FileWriter fw = new FileWriter("word.txt"); //기본 단어생성할때 사용했던 이름임:fw
		for (int i = 0; i < list.size(); i++) {
			String word2 = list.get(i).getWord();
			String mean2 = list.get(i).getMean();
			fw.write(word2 + ":" + mean2 + "\n");
		}

		fw.close();

	}

	//단어장 출력
	@Override
	public void printWord() throws IOException {
//		list 이용해 출력하는 방법
//		System.out.println("<단어장>");
//		for (int i = 0; i < list.size(); i++) {
//			list.get(i).print();
//		}

//		파일을 불러와 출력하는 방법
		BufferedReader br = new BufferedReader(new FileReader("word.txt"));
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			System.out.println(line);

		}

	}

}

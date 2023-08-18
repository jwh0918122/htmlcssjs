package Day22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class File04 {

	public static void main(String[] args) throws IOException {
		// map으로 저장하여 합계, 평균을 구하기
		// out.txt

		BufferedReader file = new BufferedReader(new FileReader("out2.txt"));
		HashMap<String, Integer> map = new HashMap<>();

		// 강사님
		int sum=0;
		while(true) {
			String line=file.readLine();
			if(line==null) break; //한줄이면 {}생략 가능
			String name =line.substring(0,line.indexOf(" "));
			int score = Integer.parseInt(line.substring(line.indexOf(" ")+1));  //띄어쓰기한 곳부터 끝까지
			map.put(name, score);
			sum+=score;
		}
//		System.out.println(map);
		for(String tmp : map.keySet()) {
			System.out.println(tmp+":"+map.get(tmp));
		}
		System.out.println("sum:"+sum);
		System.out.println("avg:"+((double)sum/map.size()));
		file.close();

		//내가 한거
//		while (true) {
//			String line = file.readLine();
//			if (line == null) {
//				break;
//			}
//			String[] arr = line.split(" ");
//
//			map.put(arr[0], Integer.parseInt(arr[1]));
////			System.out.println(line);
////			map.put(line, null)
//		}
//		file.close();
//		int sum = 0;
//		int cnt = 0;
//		for (String tmp : map.keySet()) {
//			System.out.println(tmp + " " + map.get(tmp));
//			sum += map.get(tmp);
//			cnt++;
//		}
//		System.out.println("점수 합계 : " + sum);
//		System.out.println("점수 평균 : " + (double) sum / cnt);

	}

}

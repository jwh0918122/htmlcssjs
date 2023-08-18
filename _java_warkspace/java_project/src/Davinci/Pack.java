package Davinci;

import java.util.ArrayList;
import java.util.Collections;

public class Pack {

	private ArrayList<Dcard> arr = new ArrayList<>();
	private int cnt=0;
	
	// 카드 전체 구성
	String color;
	public Pack() {
				
		for(int i=1;i<=2;i++) {
			switch(i) {
			case 1: color = "검";break;
			case 2: color = "흰";break;			
			}
			for (int j = 0; j <= 12; j++) { // 12는 조커
				Dcard c = new Dcard();
				arr.add(new Dcard(color, j));
				cnt++;

			}
		}

		//카드 섞기
		Collections.shuffle(arr);

//		public void shuffle() {
//			int min=0;
//			int max=arr.size();
//			
//			for(int i=0;i<arr.size();i++) {
//				int index = (int)(Math.random()*(max-min+1))+min;
//				card tmp = arr.get(i);
//				arr.get(i)=arr.get(index);
//				arr.get(index)=tmp;
//				
//				
//			}
//		}

		

		

	
		
	}

	public ArrayList<Dcard> getArr() {
		return arr;
	}

	public void setArr(ArrayList<Dcard> arr) {
		this.arr = arr;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

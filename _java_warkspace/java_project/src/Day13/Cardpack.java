package Day13;
/* CardPack 클래스
 * -52장의 카드 한묶음 (배열)
 * 
 * -카드 섞는 기능
 * -한장의 카드를 뺴내는 기능 - 확인
 * -출력 기능 - Card 클래스에서 사용
 * -카드 초기화 기능
 */

public class Cardpack {
	//int arr[] = new int[52]; //int란 배열안에 들어가느 자료의 형태
	
	private Card[] pack = new Card[52]; //52장의 카드가 들어갈 수 있는 배열
	private int cnt = 0; // 카드의 남는 개수
	
	public Cardpack() {
		char shape='♥'; // ♥ ◆ ♣ ♠
		for(int i=1;i<=4;i++) {// 4가지 모양을 넣기위해 4번 반복
			switch(i) {
			case 1:shape = '♥'; break;
			case 2:shape = '◆'; break;
			case 3:shape = '♣'; break;
			case 4:shape = '♠'; break;
			}
			for(int j=1;j<=13;j++) {
				Card c = new Card();
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++;
			}
			
		}
		
	}
	public Card[] getPack() {
		return pack;
	}
	public void setPack(Card[] pack) {
		this.pack = pack;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	//pick 카드 한장 뺴내는 기능.
	//pick()
	//현재 cnt값은? 52
	//cnt = 0 이라는 의미는 카드가 하나도 생성되지 않은 상황
	//리턴타입 Card
	public Card pick() { // 카드 한장을 주는 기능
		if (cnt == 0) {
			return null;
		}
		cnt--;
		return pack[cnt];

	}
	
	//카드를 섞는 기능.
	//shuffle();
	//리턴타입 : void, 매개변수 : X
	public void shuffle() {
		int min = 0;
		int max = pack.length - 1;
		for (int i = 0; i <= pack.length - 1; i++) { //0~51번지
			int index = (int) (Math.random() * (max - min + 1)) + min;
			Card tmp = pack[i];
			pack[i] = pack[index];
			pack[index] = tmp;
		}
		
		/*	내가 한거
		 * for (int i = 0; i <= pack.length - 1; i++) {
			int random = (int) (Math.random() * (pack.length-1)) + 0;
			 Card tmp = pack[i];
			pack[i] = pack[random];
			pack[random] = tmp;
		}
	 } */

	}
	
	//초기화 기능.
	public void init() {
		cnt =52; //출력할때 한개 cnt--하고 출력해주기 때문에 52로 해줘야함(원래 인덱스 번호는 51번까지임)
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

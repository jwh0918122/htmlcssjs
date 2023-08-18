package Day13;

public class 예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Card c = new Card();
		
		c.print();
		c.setNum(8);
		c.setShape('♣');
		c.print();
		System.out.println();
		System.out.println("-----------------");
		
		Cardpack pack = new Cardpack();

		pack.shuffle(); //섞는 메서드
		
		for(int i=1;i<=4;i++) {//4줄로 출력
			for(int j=1;j<=13;j++) {//모양대로 13개씩
				Card tmp = pack.pick(); //카드 한장 빼는 메서드
				tmp.print();
			}
			System.out.println(); //줄바꿈
		}
		
		pack.init();
		pack.shuffle();
		pack.pick().print(); //이거랑
		
		//이거랑 같다
		Card tmp2 = pack.pick(); 
		tmp2.print(); 
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
	}

}

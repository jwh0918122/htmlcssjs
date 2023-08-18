package Day12;

public class Class04 {

	public static void main(String[] args) {
		// Card 객체를 생성하고, ♣Q를 출력하려고 한다.
		
		Card c = new Card();
		c.getShape();
		c.getNum();
		c.setShape('♣');
		c.setNum(13);
		c.print();		
		
		System.out.println("----------");
		Card c2 = new Card();
		c2.setShape('@');
		c2.setNum(13);
		c2.print();
		
	}

}

/* Card 클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스
 * 모양 : 하트, 클로버, 다이아, 스페이드
 * 숫자 : 1(A)~10 J(11) Q(12) K(13)
 * 카드 정보를 출력
 * 
 *  클래스의 구성
 *  -멤버변수 : char shape, int num
 *  -생성자 : 객체 생성 시 멤버변수를 초기화하는 메서드 (♥1)
 *  -메서드 : print, getter/setter 
 */
class Card{
	//멤버변수
	private char shape;
	private int num;
	
	//생성자 
	public Card() {
		//기본 생성자 (아무것도 입력하지 않았을때 기본이 되는 값)
		shape='♥'; //멤버변수와 매개변수가 헷갈리는 경우만 this.해주면 됨
		num=1;		
	}
	public Card(char shape, int num) { //추가 생성자 
		
		//shape 
		switch (shape) {
		case '♥':
			this.shape='♥';
			break;
		case '◆':
			this.shape='◆';
			break;
		case '♠':
			this.shape='♠';
			break;
		case '♣':
			this.shape='♣';
			break;
		default:
			this.shape='♥';					
	}
		//num
		if(num>0 &&num<=13) {
		this.num=num;
	}else {
		this.num=1;
	}
	}
	//print 메서드
	public void print() {
		// shape print
		System.out.print(shape);

		// num print
		if (num > 0 && num <= 13
				) {
			if (num == 11) {
				System.out.println("J");
			} else if (num == 12) {
				System.out.println("Q");
			} else if (num == 13) {
				System.out.println("K");
			} else {
				System.out.println(num);
			}
		} else {
			num=1;
			System.out.println(num);
					
		}
		
	/*	if(shape='♥') {
			System.out.println(♥);
		}else if(shape='◆') {
			System.out.println('◆');
		}else if(shape='♠') {
			System.out.println('♠');
		}else if(shape='♣') {
			System.out.println('♣');
		}else {
			System.out.println('♥');
		}
		*/
}	//getter,setter
	public char getShape() {
		return shape;
	}
	public void setShape(char shape) {
		switch (shape) {
		case '♥':
			this.shape='♥';
			break;
		case '◆':
			this.shape='◆';
			break;
		case '♠':
			this.shape='♠';
			break;
		case '♣':
			this.shape='♣';
			break;
		default:
			this.shape='♥';					
	}
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if(num>0 &&num<=13) {
			this.num=num;
		}else {
			this.num=1;
		}
	}
}
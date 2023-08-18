package Day13;

public class Card {
	/*Card 클래스 생성
	 * - 숫자 : 1~10, J, Q, K
	 * - 모양 : ♥, ◆, ♣, ♠
	 * - 한장의 카드 정보를 출력하는 기능 
	 */
	/* 클래스의 구성
	 * -멤버변수 : 모양, 숫자 => private 선언=> getter/setter생성
	 * -메서드 : print 메서드
	 * - 생성자 : 기본 생성자 생성 => ♥1
	 */
	
	// 멤버변수
	private char shape;
	private int num;
	
	//생성자는 설정하지 않아도 기본 생성자 제공
	//생성자는 객체 생성시 (new) 에만 작동
	//Card c = new Care();//Card() = 생성자
	public Card() { //기본생성자(클래스이름이랑 동일해야함)
		shape = '♥';
		num = 1;
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		// 값을 변경할 경우
		switch (shape) {
		case '♥':
		case '◆':
		case '♣':
		case '♠':
			this.shape = shape;
			break;
		default:
			this.shape = '♥';
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		// 값을 변경할 경우
		if (num < 1 || num > 13) {
			this.num = 1; // 기본 값
		} else {
			this.num = num; // 1~13까지의 값만 받아들임
		}
	}

	public void print() {

		System.out.print(shape);

		switch (this.num) {
		case 11:
			System.out.print("J ");
			break;
		case 12:
			System.out.print("Q ");
			break;
		case 13:
			System.out.print("K ");
			break;
		default:
			System.out.print(num+" ");
		}
	
	/*	내가 한거
	 * switch (shape) {
		case '♥':
			System.out.print('♥');
			break;
		case '◆':
			System.out.print('◆');
			break;
		case '♣':
			System.out.print('♣');
			break;
		case '♠':
			System.out.print('♠');
			break;
		default:
			System.out.print("♥");
			break;
		}
		
		if (num > 0 && num <= 10) {
			System.out.println(num);
		} else if (num == 11) {
			System.out.println("J");
		} else if (num == 12) {
			System.out.println("Q");
		} else if (num == 13) {
			System.out.println("K");
		} else {
			num = 1;
			System.out.println(num);
		}
		*/
		
	
	}
	
}


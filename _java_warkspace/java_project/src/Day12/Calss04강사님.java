package Day12;

public class Calss04강사님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Card1{
	private char shape;
	private int num;
	
	public Card1() {
		//기본 생성자 (아무것도 입력하지 않았을때 기본이 되는 값)
		shape='♥'; //멤버변수와 매개변수가 헷갈리는 경우만 this.해주면 됨
		num=1;		
	}
	
	
	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		this.shape = shape;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		switch (shape) {
		case '♥':case '◆':case '♠':case '♣':
			this.shape = shape;	
			break;
		default:
			this.shape='♥';					
	}
	}

	public void print() {
		
		switch(num) {
		case 11:System.out.println("J");break;
		case 12:System.out.println("Q");break;
		case 13:System.out.println("K");break;
		default:
			System.out.println(num);break;
	}
}
}

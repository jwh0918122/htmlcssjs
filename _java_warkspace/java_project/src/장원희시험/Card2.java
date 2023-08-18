package 장원희시험;

public class Card2 {
	private char shape;
	private int num;
	
	public Card2() {
		shape = '♥';
		num = 1;
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		//값을 변경할 경우
		switch(shape) {
		case '♥' : 
		case '♣' : 
		case '◆' : 
		case '♠' :
			this.shape = shape;
			break;
		default :
			this.shape='♥';
			break;
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		//값을 변경 할 경우
		if(num<1||num>13) {
			this.num=1;
		}else {
			this.num=num;
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
		
		
	}
}

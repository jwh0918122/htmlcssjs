package Day03;

public class Switch문 {

	public static void main(String[] args) {
		/* switch(변수or식){
		 * case 값1: 실행문1; break;
		 * case 값2: 실행문2; break;
		 * case 값3: 실행문3; break;
		 * case 값4: 실행문4; break;
		 * case 값5: 실행문5; break;
		 * default:
		 * 나머지일 때 실행문; braek;(braek; 안써도 됨)
		 * }
		 * break; 문은 switch문을 빠져나가는 구문
		 */
		
		int num = 2;
		switch(num) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
				
		}
		
		// 1~3까지의 수를 랜덤으로 추출하여 값이 1인지, 2인지, 3인지 판단하여 출력
		int random=(int)(Math.random()*3)+1;
		switch(random) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");	
			break;
		default:
				System.out.println("1~3범위를 벗어났습니다.");
			break;
				
		}

	}

}

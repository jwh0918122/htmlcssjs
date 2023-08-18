package Day02;

public class IF01 {

	public static void main(String[] args) {
		/* if(조건식) { 실행문; }
		 * 실행문이 한줄 일 경우 {} 생략 가능. (비추천)
		 * 조건식이 참이면 실행문을 실행.
		 */

		int num = -10;
		//num가 0보다 크면 양수입니다.
		if(num>0) {
			System.out.println("양수입니다.");
		}
		
		//num가 0보다 작으면 음수입니다.
				if(num<0) {
					System.out.println("음수입니다.");
				}
				
		num = 15;
		//num가 0보다 크면 양수, 아니면 음수
				if(num>0) {
					System.out.println("양수");
					
				}else {
						System.out.println("음수");
				}
		//num가 0보다 크면 양수, 0과 같으면 0, 0보다 작으면 음수
				if(num>0) {
					System.out.println("양수");
					if(num>10) {
						System.out.println("10보다 큽니다.");
					}
				}else if(num==0) {
					System.out.println("0");
				}else {
					System.out.println("음수");
				}
				
		//num2의 변수에 값을 저장하고, num2가 짝수면 짝수, 아니면 홀수로 출력
				int num2 = 8;
				
				if(num2 % 2 == 0) {
					System.out.println(num2+"는(은) 짝수");
				}else {
					System.out.println(num2+"는(은) 홀수");
				}
	}

}

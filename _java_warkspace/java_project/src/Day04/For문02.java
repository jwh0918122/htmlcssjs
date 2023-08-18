package Day04;

public class For문02 {

	public static void main(String[] args) {
		// 1~10까지의 홀수의 합과 짝수의 합을 출력
		 
		
		int sum2=0; //짝수의 합계
		int sum1=0; //홀수의 합계
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sum2=sum2+i; //sum2+=i;
			}else {
				sum1=sum1+i; //sum1+=i;
			}
		}
		System.out.println("1~10까지 짝수의 합 : "+sum2);
		System.out.println("1~10까지 홀수의 합 : "+sum1);
		
	}

}

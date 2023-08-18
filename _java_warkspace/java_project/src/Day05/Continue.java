package Day05;

public class Continue {

	public static void main(String[] args) {
		/* Continue : pass, skip개념
		 * 1~10까지 출력
		 * 5만 빼고
		 */
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				continue; // 조건에 맞다면 건너뛰기
			}
			System.out.print(i+" ");
		}
		
		// 1~10 까지 중 짝수만 출력 continue문을 이용하여 출력
		 
		System.out.println();
		System.out.println("------------------");
		
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		
	}

}

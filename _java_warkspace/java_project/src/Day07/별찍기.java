package Day07;

public class 별찍기 {

	public static void main(String[] args) {
		/* 별 찍기
		 * *****
		 * *****
		 * *****
		 * *****
		 * *****
		 * 5*5 개로 별 찍기
		 * 
		 */
		
		/* for(int i=1;i<=5;i++) { //줄 수
			System.out.println("*****");
		}
		*/
		
		for(int i=1;i<=5;i++) { //줄 수(5줄)(행)
			for(int j=1;j<=5;j++) {//한 줄에 별 5개(열)
				System.out.print("*");
			}
			System.out.println(); //한 줄 다 찍고 줄바꿈
		}
		
		System.out.println();
		System.out.println("--------------------");
	
		
		/* *		i=1,j=1
		 * **		i=2,j=2
		 * ***		i=3,j=3
		 * ****		i=4,j=4
		 * *****	i=5,j=5 
		 */
		
		
		for(int i=1;i<=5;i++) { 	// 1 2 3 4 5 
			for(int j=1;j<=i;j++) { 
				System.out.print('*');	
			}
			System.out.println();
		}			
		
			
		System.out.println();
	
		/* *****	i=1,j=5	6-i
		 * ****		i=2,j=4	6-i
		 * ***		i=3,j=3	6-i
		 * **		i=4,j=2	6-i
		 * *		i=5,j=1	6-i
		 */
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		/*     *  i=1, o=4, j=1
		 *    **  i=2, o=3  j=2
		 *   ***  i=3, o=2, j=3
		 *  ****  i=4, o=1, j=4
		 * *****  i=5, o=0, j=5
		 *    
		 */
		
		/* 내가 입력한 답
		   for(int i=1;i<=5;i++) { // 줄 수
		 
				for(int o=4;o>=i;o--) {//공백
				System.out.print(" ");		
		}
				for(int j=1;j<=i;j++) { //별
				System.out.print("*");
		}
				System.out.println();
		} */
		
		
		// 강사님 답
		for(int i=1;i<=5;i++) {
			//공백
			for(int k=1;k<=5-i;k++) {
				System.out.print(" ");
			}
			//별
			for(int j=1;j<=i;j++) {
				System.out.print("*");
		}
			System.out.println();
	}
		
		/* 1 2 3 	
		 * 4 5 6	
		 * 7 8 9 
		 */ 
		 // 이중 for문을 이용하여 나타내보기

	/* 내가 입력 한 것	
		int n=1;
		for(int h=1;h<=3;h++) {
			for(int y=1;y<=3;y++) {
				System.out.print(n+" ");
				n++;
			}System.out.println();
		}
		*/
		
	//강사님 답
	// cnt 증가해서 값
	// i = 줄
	// j = 숫자의 반복 횟수
		
		int cnt=1;
		for(int i=1;i<=3;i++) {
			//cnt=0; 이러면 123 123 123 123 네줄로 나옴(초기화)
			for(int j=1;j<=3;j++) {
				System.out.print(cnt+" ");
				cnt++;
			}
			System.out.println();
		}
		
		
			
		

	}
	}

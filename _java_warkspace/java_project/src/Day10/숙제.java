package Day10;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/*
		 * 야구게임 컴퓨터가 3자리 숫자를 생성 (각 자리수는 1~9까지의 수) 유저는 3자리의 숫자를 맞추는 게임
		 * 
		 * 자리와 숫자가 일치하면 strike 숫자만 맞으면 ball 아무것도 안맞으면 out
		 * 
		 * ex) 컴퓨터 생성번호 : 1 2 3 사용자 번호 : 1 7 8 => 1s 사용자 번호 : 1 3 2 => 1s 2b 사용자 번호 : 7
		 * 8 9 => out 사용자 번호 : 1 2 3 => 3s 종료
		 */
		// 컴퓨터 숫자를 생성할때 배열로 넣어주기
	
		
		int com[] = new int[3];

		// 중복 없이 com배열에 random값 넣기
		int i = 0; // i를 의미
		while (i < com.length) {
			int random = (int) (Math.random() * 9) + 1;
			if (com[i] != random) {
				com[i] = random;
				i++;
			}
		}
		
		
		
		// user번호 받고 com번호와 비교하기
		Scanner scan = new Scanner(System.in);
		int user[]=new int[3];
		int st=0;
		while(st==3) {
			for(int j=0;j<=user.length-1;i++) {
				System.out.println("세자리 번호를 입력하세요 : ");
				user[i]=scan.nextInt();
				
				for(int h=0;h<=com.length-1;h++) {
					for(int r=0;r<=user.length-1;r++) {
						if(com[h]==user[r]) {
							st++;
						}
					}
				}
				
				switch(st){
				case 1:
				}
				
				
				
			}
			
		}
		
		
		
	}
}

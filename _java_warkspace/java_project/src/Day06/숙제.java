package Day06;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* 주사위 게임
		 * 주사위를 던져서 총 30칸을 이동
		 * 주사위를 랜덤으로 생성(1~6까지 생성)
		 * ex)주사위 : 3
		 * 3칸 전진 => 27칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 전진 => 21칸 남았습니다.
		 * ....
		 * 도착~!!  총 이동횟수 : 10번 => 주사위를 던진 수 
		 */
		
		
	/*	내가 입력한 거
		
		int a=0;
		
		for(int i=30;i>=0;) { 
			int random=(int)(Math.random()+6)+1;
			
			if(i>random) {
			System.out.println(random+"칸 전진");
			System.out.println(i+"칸 남았습니다.");
			i=i-random;
			}else {
				System.out.println("도착");
				System.out.println("이동횟수 : "+a);
				break;
				
			}
		a++;
		} //for문 끝
	
	*/
		Scanner scan=new Scanner(System.in);
		int random=0; // 주사위 값
		int sum=0; // 이동거리 합산
		int count=0; // 주사위 던진 횟수(이동 횟수)
		int last=30; // 최종 목적지 값
		
		while(sum<last) {
			
			scan.nextLine(); //enter를 이용하여 실행★★
			random=(int)(Math.random()*6)+1; //1~6까지의 값 중 랜덤으로 설정
			sum=sum+random; // 발생한 값 합산
			count++; //주사위 던짓 횟수 증가
			System.out.println("주사위 : "+random);
			System.out.println(random+"칸 전진 => "+(last-sum)+"칸 남았습니다.");
			
		}
		System.out.println("도착~!!, 총"
				+ " 이동횟수 : "+count);
		
		
		
		
	}

}

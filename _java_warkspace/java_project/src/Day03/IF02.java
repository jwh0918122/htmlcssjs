package Day03;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학을 입력받아서 합계와 평균 구하기
		 * 평균이 90 이상이면 A, 80이상이면 B, 70이상이면 C, 나머지는 D
		 * 입력값이 0보다 작거나 100보다 크면 "잘못된 점수를 입력하였습니." 출력 
		 */
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("국어 점수를 입력하세요 : ");
	int kor=scan.nextInt();
	System.out.println("영어 점수를 입력하세요 : ");
	int eng=scan.nextInt();
	System.out.println("수학 점수를 입력하세요 : ");
	int math=scan.nextInt();
	
	if(kor<0 || kor>100) {
		System.out.println("국어 점수가 범위에 들어가지 않습니다.");
	}
	if(eng<0 || eng>100) {
		System.out.println("영어 점수가 범위에 들어가지 않습니다.");
	}
	if(math<0 || math>100) {
		System.out.println("수학 점수가 범위에 들어가지 않습니다.");
	}
	
	double avg=(kor+eng+math)/3.0;
	char ch	= 'F';
	
	if(avg>100 || avg <0) {
		System.out.println("잘못된 성적입니다.");
	}else if(avg>=90) {
		ch='A';
	}else if(avg>=80) {
		ch='B';
	}else if(avg>=70) {
		ch='C';
	}else {
		ch='D';
	}
	System.out.println("평가 : "+ch);
	
	scan.close();

		
/*		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요 : ");
		int kor=scan.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int eng=scan.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int math=scan.nextInt();
		double avg=(kor+eng+math)/3.0;
		
		
		if(kor<0 || kor>100) {
			System.out.println("잘못된 국어 점수를 입력하였습니다.");
		}
		else if(eng<0 || eng>100) {
			System.out.println("잘못된 영어 점수를 입력하였습니다.");
		}
		else if(math<0 || math>100) {
			System.out.println("잘못된 수학 점수를 입력하였습니다.");
		}
		else if(avg>=90) {
			System.out.println("A");
		}
		else if(avg>=80) {
			System.out.println("B");
		}
		else if(avg>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		
		scan.close();
*/
			
			
	}

}

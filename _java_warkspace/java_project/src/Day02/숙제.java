package Day02;

public class 숙제 {

	public static void main(String[] args) {
		// 매일 끝나는 시간에 출제
		// 클럽에 제출
		/* 국어, 영어, 수학 점수의 합계와 평균을 출력
		 * 평균이 80이상이면 결과 : 합격, 아니면 결과 : 불합격(if문 이용하여 출력) 
		 */
		
		int kor=97;
		int eng=99;
		int math=100;
		int sum=kor+eng+math;
		double avg=sum/3.0;
		
		System.out.println("국어 점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+math);
		
		System.out.println("세 과목의 합계 : "+sum);
		System.out.println("세 과목의 평균 : "+avg);
		
		if(avg>=80) {
			System.out.println("결과 : 합격");
		}else {
			System.out.println("결과 : 불합격");
		}
		
		// 평균이 80점 이상이면 상, 60점 이상이면 중, 나머지는 하
		if(avg>=80) {
			System.out.println("상");
		}
		else if(avg>=60) {
			System.out.println("중");
		}else {
		System.out.println("하");
		}
	}
	
}

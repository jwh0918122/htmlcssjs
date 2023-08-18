package Day02;

public class 문제 {

	public static void main(String[] args) {
		/* 국어(kor), 영어(eng), 수학(math)
		 * 세값의 합계와 평균을 구하려고 한다.
		 * 필요한 변수와 값을 넣고, 출력
		 * 클럽에 제출
		 */
		
		int kor=47, eng=97, math=100;
		double sum=(kor+eng+math);
		double avg=(sum/3); //sum의 자료형이 double이라서 가능
		//자료형이 double 이고, 나누는 값이 0이면 => (infinity)
		//자료형이 int 이고, 나누는 값이 0이면 => 예외발생(Exception)
		System.out.println("세 값의 합계는 : "+sum);
		System.out.println("세 값의 평균은 : "+avg);
		
		//Math.method
		//Math.round : 반올림
		System.out.println(Math.round(avg));
		//Math.ceil : 올림, Math.floor : 버림 
		System.out.println(Math.ceil(5.1234));
		System.out.println(Math.floor(5.1234));
		//Math.max : 큰값, Math.min : 작은값
		System.out.println(Math.max(10,30));
		System.out.println(Math.min(10,30));
		
		//Math.random : 0과 1사이의 double타입의 난수를 출력(0 <= random <1) 
		System.out.println(Math.random());
		// 1~10까지의 랜덤 수를 추출
		//(int)(Math.random()*n)+start;
		int random=(int)(Math.random()*10)+1;
		System.out.println(random);
	}
	

}

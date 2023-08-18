
public class Test06 {

	public static void main(String[] args) {
		// 나의 국어, 영어, 수학점수를 활용하여 평균을 구하고, 메모장 파일에 출력하시오
		String name="장원희";
		int kor=70;
		int eng=85;
		int math=90;
		double avg=(kor+eng+math)/3;
		System.out.printf("%.00f",avg);
	}

}

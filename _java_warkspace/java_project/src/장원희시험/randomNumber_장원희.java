package 장원희시험;

public class randomNumber_장원희 {

	public static void main(String[] args) {
		// 06번 문항 

		int num;
		
		int sum=0;
		for (int i = 1; i <= 5; i++) {
			num = (int) (Math.random() * 99) + 0;
			System.out.println(i+"번 난수 : "+num);
			sum+=num;

		}
		System.out.println("난수의 합 : "+sum);

	}
}

package Day13;

public class 숙제 {

	public static void main(String[] args) {
		/* 두 정수 a,b가 주어졌을 때 a와 b사이에 속한 모든 정수의 합을 리턴하는 메서드
		 * ex ) a=3, b=5 => 3+4+5
		 * ex ) a=5, a=1 => 1+2+3+4+5
		 * ex ) a=3, b=3 => 3
		 */

		System.out.println(sum(3,5));
		System.out.println(sum(10,5));
		System.out.println(sum(5,5));
		System.out.println(sum(1,5));
	}

	public static int sum(int num1, int num2) {

		int result = 0;
		if (num1 > num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		if (num1 == num2) {
			return num1;
		}
		for (int i = num1; i <= num2; i++) {

			result = result + i;

		}
		return result;
	}

}

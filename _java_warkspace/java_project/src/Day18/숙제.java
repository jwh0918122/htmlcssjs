package Day18;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		// 숫자를 입력받아 입력받은 숫자의 총합을 구하는 프로그램 작성
		// 입력 : 45,78,89,65,95 = String 타입으로 입력
		// 입력받은 문자들을 배열에 넣고 , 합계를 출력
		// 1. 총합
		// 2. 70점 이상 합계

		Scanner scan = new Scanner(System.in);

		String num; // 문자 입력받을 변수
		int sum = 0; // 총합
		int sum2 = 0;
		String[] arr; // 문자를 잘라서 받을 배열

		System.out.println("숫자를 입력해주세요 :  ");
		num = scan.next();

		// 입력받은 문자를 ","기준으로 잘라서 arr[]에 넣기
		arr = num.split(",");
		System.out.println("---입력하신 숫자---");
		for (String tmp : arr) {
			System.out.print(tmp + " ");
		}

		System.out.println();

		// 문자를 숫자로 변환하여 총합 구하기
		for (int i = 0; i < arr.length; i++) {
			sum = sum + Integer.parseInt(arr[i]);
		}
		System.out.println("총합 : " + sum);

		// 문자를 숫자로 변환하여 70이상인 것들의 총합 구하기
		for (int i = 0; i < arr.length; i++) {
			int num2 = Integer.parseInt(arr[i]);
			if (num2 >= 70) {
				sum2 = sum2 + num2;
			}
		}
		System.out.println("70이상인 것들의 총합 : " + sum2);
	}
}

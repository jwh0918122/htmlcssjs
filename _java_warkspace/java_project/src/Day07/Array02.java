package Day07;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// 5개짜리 배열을 생성하여 1~5까지의 값을 입력하고 출력
		
		//내가 한거
		int arr[]=new int[5];
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		
		// 강사님 답
		System.out.println();
		
		int size = 5; // 배열 길이 값 저장
		int arr1[] = new int[size];
		for(int i=0; i<arr1.length;i++) {
			arr[i] = i+1;
			// System.out.printf("arr[%d]", arr1[i]);
			System.out.print(arr[i]+" ");
		}
		
		/* 5명의 점수를 입력받아서 배열에 저장하고,
		 * 점수의 합계와 평균을 출력
		 */
		System.out.println();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("5명의 점수를 입력하세요(0~100) : ");
		int arr2[]=new int[5]; //배열의 길이
		double avg=0; //점수의 평균
		int sum=0; //점수의 합계
		
		//81 56 86 95 100  (입력받은 점수)
		//0   1  2  3  4   (인덱스 번호)
		for(int i=0;i<=arr2.length-1;i++) { //반복횟수(인덱스 사용)
			arr2[i]=scan.nextInt(); //인덱스에 입력받은 점수 넣기
			 sum=sum+arr2[i]; //합계 구하는 과정
			 
		}
		avg=(double)sum/arr.length;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		scan.close();
		
	}

}

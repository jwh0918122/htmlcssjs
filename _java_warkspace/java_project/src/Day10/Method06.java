package Day10;

public class Method06 {

	public static void main(String[] args) {
		/*
		 * 메서드를 활용하여 배열을 활용
		 */

		int arr[] = new int[] { 11, 3, 5, 7, 4, 8, 9, 6, 2, 10, 1, 15, 16, 12, 14, 13 };

		printArray(arr);
		System.out.println();
		System.out.println("--정렬 후--");
		sortArray(arr); 
		printArray(arr); //위에서 정렬된 배열이 출력
		
	}

	/*
	 * 주어진 정수 배열을 콘솔에 출력하는 메서드 매개변수 : 정수 배열(int arr[]) 리턴타입 : void(출력하는 메서드는(보낼게없음)
	 * void) 메서드명 : printArray 5개씩 한줄로 나열
	 */

	public static void printArray(int arr[]) {
		for (int i = 0; i <= arr.length - 1; i++) {
			if (i % 5 == 0 && i != 0) {
				System.out.println();
			}
			System.out.printf("%3d", arr[i]); // 나 포함 앞에 3자리를 띄움★
		}
	}

	/*
	 * 배열이 주어지면 배열을 오름차순으로 정렬하는 기능 매개변수 : 정수 배열(int arr[]) 리턴타입 : void 메서드명 :
	 * sortArray
	 */
	public static void sortArray(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) { //j=i+1 ★★★
				if (arr[i] > arr[j]) { 
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

			}

		}

	}
	
	/* 배열이 주어지면 배열을 오름차순으로 정렬하고 리턴
	 * 메개변수 : arr[]
	 * 리턴타입 : 배열 자료형(int[])
	 * 메서드명 : sortArray1
	 */
		

}


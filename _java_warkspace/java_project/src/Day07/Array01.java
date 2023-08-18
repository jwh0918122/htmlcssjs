package Day07;

public class Array01 {

	public static void main(String[] args) {
		/* 배열 : 같은 타입, 같은 의미를 가지는 변수들의 집합(참조변수)
		 * 일반적으로 객체 생성 키워드 => new
		 * - 배열 선언 방법
		 * 타입[] 배열이름;
		 * 타입 배열이름[];
		 * - 선언 초기화 같이 하는 방법
		 * 타입[] 배열이름 = new 타입[길이]; // 가장 많이 사용하는 방식
		 * 타입[] 배열이름 = new 타입[]{값1,값2,값3,...}; // 값을 직접 넣어주는 방식
		 * 타입[] 배열이름 = {값1,값2,값3,...}; //연습할때, 선언과 동시에 초기활 할때만 가능
		 * - 배열의 길이는 0이상이어야 한다.
		 * - 배열의 시작번지는 0부터 시작
		 * 	 배열[5] => 0 1 2 3 4 
		 * - 배열의 길이 => length를 이용하면 배열의길이를 알 수 있음.
		 */

		
		int a=10; // 일반 변수 선언
		int arr1[]; // 배열 선언만 한 경우
		arr1= new int[5]; // 초기화 한 경우
		int arr2[] = new int[5]; //선언과 초기화 동시에 함(일반적인 방식)
		int arr3[]= new int[] {1,2,3,4,5};
		int arr4[]= {1,2,3,4,5}; // 선언과 동시에 초기화 할 때만 가능
		
		/*-배열을 사용하는 이유
		 * 관리가 편함, 반복문을 사용할 수 있기 때문에 많은 양의 데이터도 쉽게 사용할 수 있음.
		 * 배열의 번지는 0부터 시작, 길이는 개수로 표현됨
		 * 길이가 5라고 할때 0,1,2,3,4(마지막 번지는 길이-1까지)
		 * 배열의 총 길이 : 배열이름.length
		 */
		
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
		
		for(int i=0;i<=arr3.length-1;i++) { //조건식 i<arr3.length; 도 됨
			System.out.print(arr3[i]+" ");
	}
		
		System.out.println();
		// 배열안의 값을 변경(저장)
		arr3[0]=10;
		arr3[1]=21;
		for(int i=0;i<=arr3.length-1;i++) { //조건식 i<arr3.length; 도 됨
			System.out.print(arr3[i]+" ");
	}
	
	/* arr1 배열에 1~5까지의 값을 저장하고 출력
	 */
	
	/* 내가 입력한 거
	  int arr1[]=new int[0];
	 
		System.out.println();
	a=0;
	
	for(int i=1;i<=5;i++) { //01234
		arr1[a]=i;
		System.out.println(arr1[a]);
		a++;
	} */
		
		System.out.println();
		int arr7[]=new int[5];
		
		for(int i=0;i<=arr7.length-1;i++) {
			arr7[i]=i+1;
			System.out.print(arr7[i]+" ");
		}
	
	
	
	
	
	
	
	
	
	
}
	 
}

package Day08;

public class Array04 {

	public static void main(String[] args) {
		/* 국어 영어 수학이라는 글자를 담을 배열을 생성 후
		 * 글자를 입력 => 출력
		 */
		
		// 내가 한 거
		String arr[]=new String[] {"국어","영어","수학"};
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		/* 강사님
		
		String arr[]=new String[3];
		arr[0]="국어"
		arr[0]="영어"
		arr[0]="수학"
		
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		*/
		
		// 향상된 for문
		//한번에 하나씩 객체의 전체 탐색시 사용
		
		System.out.println();
		System.out.println("향상된 for문 사용");
		for(String s : arr){  
			System.out.println("arr "+s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

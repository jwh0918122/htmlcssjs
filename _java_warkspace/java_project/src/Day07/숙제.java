package Day07;

public class 숙제 {

	public static void main(String[] args) {
		/* 10개짜리 배열을 생성 한 후
		 * 1~50사이의 랜덤수를 생성한 후 배열에 저장
		 * 배열을 출력
		 * 합계, 평균, 최대, 최소값 출력
		 */
		
		// 내가 한 거
		int arr[]=new int[10]; //arr의 초기값은 0
		int sum=0;
		double avg=0;
		
		System.out.print("배열 : ");
		for(int i=0;i<=arr.length-1;i++) {
			int random=(int)(Math.random()*50)+1;
			arr[i]=random;
			System.out.print(arr[i]+" ");
			sum=sum+arr[i];
		}
		System.out.println();
		avg=sum/arr.length;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		/* for 문을 밑에 따로 만들어서 min,max값 구하는 이유
		 * : 위에 for문안에 만들면 int min=[0]선언한 것이 맨 처음 int arr[]=int[10];한거로 사용해서 계속 0이 됨
		 * 0보다 작은 수는 없으므로 실행하면 최소값은 계속 0이 나옴
		 * 
		 * 근데 밑에 따로 for문을 만들어 입력하면 위에 for문에서 random값을 arr[]안에 넣었기 때문에 밑에 for문은 random값을 이용함
		 */
		
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				
				min=arr[i];
			}
		}
	
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		
	
	/* 강사님 답
		int size = 10;
		int arr[]=new int[size]; //arr의 초기값은 0
		int sum=0;
		double avg=0;
		int max=0; //arr[0]==0
		int min=50;
		
		// 배열 완성하는 중
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=(int)(Math.random()*50)+1;
			System.out.print(arr[i]+" ");
			sum=sum+arr[i];
		}
		
		//완성된 배열에서 탐색 // 최대값,sum
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println();
		avg=sum/arr.length;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		*/
		
	}
	

}

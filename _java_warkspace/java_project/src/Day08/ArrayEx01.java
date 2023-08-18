package Day08;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 1~10까지 담고있는 배열을 생성 => 출력
		 * 
		 */
		
		int arr[]=new int[10];
		
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// 배열 섞는 코드
		//랜덤 번지를 선택해서 순차적으로 하나씩 교환
		// 순차적 번지 = i / 랜덤 번지 = j
		/*교환 코드
		 * int tmp = arr[i];
		 * arr[i] = arr[j];
		 * arr[j] = tmp;
		 */
		//범위를 min=0, max=arr.length //10개
		//범위로 나온다면 min =1,max = 15까지
		//개수(max-min+1) 시작=min
		//0~9까지 10개 (9-0+1) 0
		
		int min = 0;
		int max = arr.length;
		for(int i=0;i<arr.length;i++) {
			int random=(int)(Math.random()*max)+min;
			int tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		}
		System.out.println();
		System.out.println("--섞은 후--");
		for(int tmp : arr) {
		System.out.print(tmp+" ");
		}
		
		//오름차순 정렬 : 작은 수 부터 정렬
		//내림차순 정렬 : 큰 수 부터 정렬
		//3 8 2 4 9 5 10 1 7 6
		//1 8 3 4 9 5 10 2 7 6		1차
		//1 2 8 4 9 5 10 3 7 6		2차
		//1 2 3 8 9 5 10 4 7 6 		3차
		//1 2 3 4 9 8 10 5 7 6		4차
		//1 2 3 4 5 9 10 8 7 6		5차
		//1 2 3 4 5 6 10 9 8 7		6차
		//1 2 3 4 5 6 7 10 9 8		7차
		//1 2 3 4 5 6 7 8 9 10		8차
		//1 2 3 4 5 6 7 8 9 10		9차 끝
		
		for(int i=0;i<arr.length-1;i++) { //랭스 길이 끝까지 안가고 전까지만 가도 오름차순 정리 됨
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) { //오름차순 (내림차순:<)
					//교환 코드
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println();
		System.out.println("---정렬 후---");
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		
	}
}

package Day09;

public class ArrayEx03 {

	public static void main(String[] args) {
		/* 1~45까지 숫자를 랜덤으로 6개 추출하는 로또번호 추출
		 * 오름차순 정렬 되도록 출력
		 */
		
		int arr[]=new int[6];
		//배열의 0번지부터 끝번지까지 하나씩 값을 돌리겠다.
		for(int i=0;i<=arr.length-1;i++){
			arr[i]=(int)(Math.random()*45)+1; //1~45범위의 값을 배열에 넣기
			System.out.print(arr[i]+" "); //출력
		}
		System.out.println();
		System.out.print("--- 정렬 후 ---");
		
		//1 2 3 4 5 6
		for(int i=0;i<=arr.length-1;i++){
			for(int j=0; j<arr.length;j++) {
				if(arr[i]>arr[j]) { //오름차순
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
					
				}
			}
		}
		System.out.println();
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		
		
	/*	for(int i=0;i<=arr.length-1;i++);{
			int random = (int)(Math.random()*45)+1;
			arr[i]=arr[random];
			
			
		}
	*/	

	}

}

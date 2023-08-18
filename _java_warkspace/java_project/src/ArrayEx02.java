
public class ArrayEx02 {

	public static void main(String[] args) {
		/* 1~50까지의 랜덤수를 10개 생성하여 배열에 저장하고, 출력
		 * 오름차순 정렬하여 출력
		 */
		
		//1~50까지 램던수 10개 배열에 저장하고 출력
		int arr[]=new int[10];
		
		for(int i=0;i<=arr.length-1;i++) {
			int random=(int)(Math.random()*50)+1;
			arr[i]=random;
			System.out.print(arr[i]+" ");
		}
		
		
		//오름차순으로 정렬하여 출력
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println();
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
	}

}

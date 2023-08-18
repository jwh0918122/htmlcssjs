package Day07;

public class Array03 {

	public static void main(String[] args) {
		
	int arr[]=new int[] {10,54,57,62,58,63,98,87};
	/* arr배열의 합계, 평균, 최대값,최소값을 출력
	
	*/
	
/*	내가 한 거
 * int sum=0;
	double avg=0;
	int max=arr[0];
	int min=arr[0];
	
	for(int i=0;i<=arr.length-1;i++) {
		sum=sum+arr[i];
		if(max<arr[i]) { // min=Math.min(min,arr[i]);
			max=arr[i];
				}
		if(min>arr[i]) { // max=Math.max(max,arr[i]);
			min=arr[i];
	}
		}
	avg=(double)sum/arr.length;
	System.out.println("점수의 합계 : "+sum);
	System.out.println("점수의 평균 : "+avg);
	System.out.println("점수의 최대값 : "+max);
	System.out.println("점수의 최소값 : "+min);
	
	*/ 
	
	// 강사님 답
	int sum=0;
	double avg=0;
	int max=arr[0];
	int min=arr[0];
	for(int i=0; i<arr.length;i++) {
		sum=sum+arr[i];
//		if(max<arr[i]) { 
//			max=arr[i];
//				}
//		if(min>arr[i]) { 
//			min=arr[i];	
//				}
		
		max = Math.max(max,arr[i]);
		min = Math.min(min,arr[i]);
	}
	System.out.println("sum : "+sum);
	System.out.println("agv : "+(sum/arr.length));
	System.out.println("max : "+max);
	System.out.println("min : "+min);
	
	}
}

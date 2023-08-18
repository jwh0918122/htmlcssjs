package Day18;

import javax.management.RuntimeErrorException;

public class Exception05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = null;
		
		try {
//			int arr[] = null; //2번째 메서드에 들어갈 매개변수
			System.out.println(method1(50, 1, 10));
//			int max=50, min=1, size =10; //1번째 메서드에 들어갈 매개변수
//			System.out.println(method2(arr, 50, 1);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	//메서드 생성
	/* 기능 : 배열의 길이(size)가 주어지면 길이만큼 배열을 생성해서 배열을 돌려주는 메서드
	 * max, min, size 를 매개변수로 입력받아 
	 * max, min의 범위의 랜덤값을 생성한 후 size 개수의 배열에 담고 리턴
	 *	
	 * size = 10, max = 50, min = 1
	 * 1~50까지의 랜덤수를 저장하는 배열[10] 생성 후 리턴
	 * 
	 * - size가 0보이랑 같거나 작다면 예외발생
	 * - max값이 0보다 작다면 예외발생
	 */	
	public static int[] method1(int max, int min, int size) throws RuntimeException {

		int[] arr = new int[size];

		// size가 0보이랑 같거나 작다면 예외발생
		if (size <= 0) {
			throw new RuntimeException("배열의 길이가 0이거나 0보다 작습니다.");
		}

		// max값이 0보다 작다면 예외발생
		if (max < 0) {
			throw new RuntimeException("max값이 0보다 작습니다.");
		}

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * max) + min;
			arr[i] = random;
		}

		return arr;
	}	
	/* 기능 : 배열을 받아서 배열에 랜덤 값을 채우는 메서드
	 * 랜덤값 max, min, arr[] 은 매개변수로 받기
	 * 
	 * - 배열이 null이면 예외발생
	 * - 배열의 길이가 0이랑 같거나 작으면 예외발생
	 */
	public static void method2(int[] arr,int max, int min)throws RuntimeException {
		
		//배열이 null이면 예외발생
		if(arr==null) {
			throw new RuntimeException("배열이 null입니다.");		
		}
		//배열의 길이가 0이랑 같거나 작으면 예외발생
				if(arr.length<=0) {
					throw new RuntimeException("배열의 길이가 0이거나 0보다 작습니다.");
				}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*max)+min;			
		}
		
		
		
		
	}
}

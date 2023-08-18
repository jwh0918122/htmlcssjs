package Day13;

public class 숙제강사님 {

	public static void main(String[] args) {
		/* 두 정수 a,b가 주어졌을 때 a와 b사이에 속한 모든 정수의 합을 리턴하는 메서드
		 * ex ) a=3, b=5 => 3+4+5
		 * ex ) a=5, a=1 => 1+2+3+4+5
		 * ex ) a=3, b=3 => 3
		 */
		System.out.println(sum(3,5));
		System.out.println(sum(5,1));
		System.out.println(sum(3,3));
		System.out.println(sum2(3,5));
		System.out.println(sum2(5,1));
		System.out.println(sum2(3,3));
		
	}

	public static int sum(int a, int b) {
		// a 작은 수, b는 큰수
		if (a > b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum +=i; //sum = sum + i
		}
		return sum;
	}
	public static int sum2(int a, int b) {
		int max=Math.max(a,b);
		int min=Math.min(a,b);
		int sum=0;
		for(int i=min;i<=max;i++) {
			sum+=i;
		}
		return sum;
		
		
		
		
		
	}

}

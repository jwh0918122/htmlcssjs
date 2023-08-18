package Day23;

class MyThread03 implements Runnable {
	int start;
	int end;
	int sum;

	public MyThread03(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() { 

		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println("1~50의 합계 : " + sum);

	}

	
}

public class Thread03 {

	public static void main(String[] args) {
		// 1~50, 51~100까지의 합을 구하는 Thread를 만들어 그 결과를 확인

		// 두 개의 Thread가 실행되고 난 후
		// thread1의 합계 출력
		// thread2의 합계 출력
		// thread1 + thread2의 합계 출력

		// 1~50까지 합 스레드
		MyThread03강사님 myt1 = new MyThread03강사님(1, 50);
//		Thread th1 = new Thread(myt1);
//		th1.start();
		myt1.start();

		try {
			myt1.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 51~100까지 합 스레드
		MyThread03강사님 myt2 = new MyThread03강사님(51, 100);
//		Thread th2 = new Thread(myt2);
//		th2.start();
		myt2.start();

		try {
			myt2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 두 스레드의 합 스레드
		System.out.print("두 스레드의 합계 : ");
		System.out.println(myt1.sum + myt2.sum);
	}

}

package Day23;

class MyThread03강사님 extends Thread {
	int start;
	int end;
	int sum;

	public MyThread03강사님(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {

		for (int i = start; i <= end; i++) {
			sum += i;
		}
	}
}

public class Thread03강사님 {

	public static void main(String[] args) {
		// 1~50, 51~100까지의 합을 구하는 Thread를 만들어 그 결과를 확인

		// 두 개의 Thread가 실행되고 난 후
		// thread1의 합계 출력
		// thread2의 합계 출력
		// thread1 + thread2의 합계 출력

		// 1~50까지 합 스레드
		MyThread03강사님 myt1 = new MyThread03강사님(1, 50);
		MyThread03강사님 myt2 = new MyThread03강사님(51, 100);
		myt1.start();
		myt2.start();

		try {
			myt1.join();
			myt2.join();
			Thread.sleep(1000); // 1초 기다렸다 실행 1/1000
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("myt1 sum : " + myt1.sum);
		System.out.println("myt2 sum : " + myt2.sum);
		int lastSum = myt1.sum + myt2.sum;
		System.out.println("myt1+myt2 sum : " + lastSum);

	}

}

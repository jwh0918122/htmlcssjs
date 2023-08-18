package Day23;

class MyThread02 implements Runnable {
	//멤버변수 선언

	@Override
	public void run() {
		// 반드시 run() 메서드를 구현해야 함
		for (int i = 0; i <= 200; i++) {
			System.out.println(i + "번째 " + Thread.currentThread().getName());
		}

	}

}

public class Thread02 {

	public static void main(String[] args) {
		// Runnable로 구현한 스레드 객체 생성
		// Thread 객체를 생성해서 runnable 구현체를 생성자로 제공

		MyThread02 mth = new MyThread02();
		Thread th1 = new Thread(mth);
		th1.start();

		
		// join() : 동시에 2개의 스레드가 실행될 때 다른 스레드의 결과를 참조하여 실행
				// 되어야 하는 경우
		try {
			th1.join();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		Thread th2 = new Thread(new MyThread02());
		th2.start();

		try {
			th2.join();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("main end~");

		

	}

}

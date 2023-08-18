package Day23;

class Bank {
	private int money = 10000;

	// 입금 메서드 동기화
	public synchronized void saveMoney(int save) {
//		int m =this.money;
		int m = getMoney(); // 이렇게 해도 됨

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//		this.money=m+save;
		setMoney(m + save); // this.money에 직접 접근하지 않는 방법
	}

	// 출금 메서드 동기화
	public synchronized void minusMoney(int minus) {
		int m = this.money;

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		setMoney(m - minus);

	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}

class Pack extends Thread {

	@Override
	public void run() {
		System.out.println("start save");
		SyncThread.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000)" + SyncThread.myBank.getMoney());
	}

}
class PackWife extends Thread{
	@Override
	public void run() {
		System.out.println("start minus");
		SyncThread.myBank.minusMoney(5000);
		System.out.println("minusMoney(5000)" + SyncThread.myBank.getMoney());
	}
}
public class SyncThread {
	public static Bank myBank = new Bank(); //멤버변수로 Bank클래스 객체 올려둠(static!)

	public static void main(String[] args) throws Exception {
		/* critical section은 두 개 이상의 thread가 동시에 접근 할 수 있는 영역
		 * 동시에 여러개의 thread가 접근하게 되면 문제가 생길 수 있음
		 * 세마포어(semaphore) 기법을 사용하여 한 순간에 오직 하나의 thread만 사용할 수 있겠하는 거
		 * 한 순간에 세마포어를 얻은 스레드만 접근 가능
		 * 
		 * 동기화 키워드 : synchronized
		 * 동기화가 필요한 메서드 앞에 선언
		 * 
		 * 
		 */
		
		Pack p = new Pack();
		p.start();
		
		Thread.sleep(200);
		
		PackWife pw = new PackWife();
		pw.start();
		
		
		
		

	}

}

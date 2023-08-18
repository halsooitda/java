package Day23;

class Bank {
	private int money = 10000;
	
	//입금 메서드 동기화
	public synchronized void saveMoney(int save) {
		int m = this.money; //현재 머니의 상태를 가져옴
		try {
			Thread.sleep(1000); //1초 기다림
		} catch (Exception e) {
			e.printStackTrace();
		}
		setMoney(m+save);
//		this.money = m + save;
		
	}
	
	//출금 메서드 동기화 
	public synchronized void minusMoney(int minus) {
		int m = this.money;
		try {
			Thread.sleep(1000); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		setMoney(m-minus);
		
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}

class Park extends Thread {
	public void run() {
		System.out.println("start save");
		SyncThread.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000)"+SyncThread.myBank.getMoney());
	}
}

class ParkWife extends Thread {
	public void run() {
		System.out.println("start minus");
		SyncThread.myBank.minusMoney(5000);
		System.out.println("minusMoney(5000)"+SyncThread.myBank.getMoney());
	}
}

public class SyncThread {
	//멤버변수
	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		/* critical section은 두개 이상의 thread가 동시에 접근 할 수 있는 영역
		 * 동시에 여러개의 thread가 접근하게되면 문제가 생길 수 있음
		 * 세마포어(semaphore) 기법을 사용하여 한순간에 오직 하나의 thread만 사용가능
		 * 한순간에 세마포어를 얻은 스레드만 접근가능 나머지는 대기상태가 됨
		 * 
		 * 동기화->순차적
		 * 동기화 키워드 : synchronized 
		 * 동기화가 필요한 메서드 앞에 선언
		 * 
		 * */
		
		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		
		ParkWife pw = new ParkWife();
		pw.start();
		
		
		
		
	}

}

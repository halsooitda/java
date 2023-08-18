package Day23;

//Runnable로 구현하는 방법
class MyThread2 implements Runnable {
	//멤버변수 선언 //시작,끝 생성자의 매개변수로 넣어주기...
	@Override
	public void run() {
		//반드시 run() 메서드를 구현해야 함.
		for(int i=0; i<=200; i++) {
			System.out.println(i+"번째 "+Thread.currentThread().getName());
		}
	}
	
}

public class Thread02 {

	public static void main(String[] args) {
		//Runnable로 구현한 스레드 객체 생성
		//Thread 객체를 생성해서 Runnable 구현체를 생성자로 제공
		MyThread2 mth = new MyThread2();
		Thread th1 = new Thread(mth);
		th1.start();
		
		//join() : 동시에 2개의 쓰레드가 실행될 때 다른 쓰레드의 결과를 참조하여 
		//         실행 되어야 하는 경우 join()메서드 사용, 순번을 지키게 만든다.
		try { //th1번이 끝날때까지 
			th1.join();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		Thread th2 = new Thread(new MyThread2());
		th2.start();
		
		try { //th2번이 끝날때까지 기다려라
			th2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("main End~!!");
		
	}

}

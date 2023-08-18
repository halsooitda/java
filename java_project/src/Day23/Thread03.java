package Day23;

class MyThread3 extends Thread {
	int min, max;
	int sum = 0;
	
	public MyThread3() {}
	public MyThread3(int min, int max) {
		if(min>max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		this.min = min;
		this.max = max;
	}
	
	@Override
	public void run() {
		for(int i=min; i<=max; i++) {
			sum += i;
		}
		System.out.println(min+"~"+max+" 합계 = "+sum);

	}
	
}

public class Thread03 {

	public static void main(String[] args) {
		// 1~50, 51~100까지 합을 구하는 두개의 Thread를 만들어 그 결과를 확인
		
		//두개의 Thread가 실행되고 난 후
		//thread1의 합계 출력
		//thread2의 합계 출력
		//thread1 + thread2 출력
		
		MyThread3 mth1 = new MyThread3(1, 50);
		mth1.start();
		MyThread3 mth2 = new MyThread3(51, 100);
		mth2.start();
		
		try {
			mth1.join();
			mth2.join();
			Thread.sleep(1000); //1초 기다렸다 실행 1/1000
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("전체 합계 = "+(mth1.sum+mth2.sum));
	}

}

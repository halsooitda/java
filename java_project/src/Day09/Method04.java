package Day09;

public class Method04 {

	public static void main(String[] args) {
		
		System.out.println(isPrime(3));
		
		// 2~100까지 소수의 합계 (isPrime을 활용하여...)
		int sum = 0;
		for(int i=2; i<=100; i++) { // 2~100까지의 수 중 소수 구하기
			if(isPrime(i)) { //true
				System.out.println(i+"는 소수입니다.");
				sum+=i;
			}
//			else {
//				System.out.println(i+"는 소수가 아닙니다.");
//			}
		}
		System.out.println("소수 합계 > "+sum);
				
	}
	
	/* 정수가 주어지면 이 정수가 소수인지 아닌지 판별 (true / false)
	 * 소수 : 1과 자기자신의 수 외에는 나누어 떨어지지않는 수
	 * 리턴타입 : boolean
	 * 메서드명 : isPrime
	 * 매개변수 : int num
	 * */
	public static boolean isPrime(int num) {
		// 소수인지 판별할 수는 num
		int cnt = 0; // 약수의 개수를 세기 위한 변수
		// 나누려는 수를 반복해서 돌립니다.
		for(int i=1; i<=num; i++) { // 1~자기자신의 수까지
			if(num%i==0) { // 약수다
				cnt++; // 약수 발생개수를 누적
			}
		}
		if(cnt==2) {
			return true;
		}else { // else 안 써도 됨. 나머지는 다 false
			return false;
		}
		
	}
	
}

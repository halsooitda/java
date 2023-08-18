package Day09;

public class Method05 {

	public static void main(String[] args) {
		/* 최대공약수, 최소공배수 메서드
		 * */
		System.out.println("최대공약수 > "+gcd(8,12));
		
		System.out.println("최소공배수 > "+lcm(10,20));
		
		System.out.println("최소공배수 > "+lcm2(10,15));
	}
	
	/* 두 정수를 매개변수로 받아, 최대공약수를 리턴하는 메서드
	 * 리턴타입 : 최대공약수 (int)
	 * 메서드명 : gcd
	 * 매개변수 : 두 정수(int num1, int num2)
	 * */
	public static int gcd(int num1, int num2) {
		int result =0; // 공약수가 들어올 변수
		for(int i=1; i<=num1; i++) {
			if(num1%i==0 && num2%i==0) {
				result = i; // 약수 중 가장 큰 수가 마지막에 남음 = 최대공약수
			} 
		}
		return result;
	}

	
	/* 두 정수를 매개변수로 받아, 최소공배수를 리턴하는 메서드
	 * 리턴타입 : 최소공배수 (int)
	 * 메서드명 : lcm
	 * 매개변수 : 두 정수(int num1, int num2)
	 * */
	
	public static int lcm(int num1, int num2) {
//		int result = 0;
		for(int i=num1; ; i+=num1) {
			if(i%num1==0 && i%num2==0) { //i%num2==0만 맞는지 확인하면 됨
//				result = i;
//				break;
				return i; // 메서드에서 return만나면 값을 반환하고 종료 = 최소공배수
			}
		}
		//return result;
	}
	
	// 최소공배수 규칙 : 두 수를 곱한 후 최대공약수로 나누기
	// 10 * 15 / 5 = 30(최소공배수)
	public static int lcm2(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2); // gcd=>최대공약수 메소드
	} //메인에서만 호출 할 수 있는 거 아님 다른 메소드에서도 호출 가능
	
}

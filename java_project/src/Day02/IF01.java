package Day02;

public class IF01 {

	public static void main(String[] args) {
		/* if(조건식) { 실행문; }
		 * 실행문이 한줄일 경우 {} 생략가능. but 권장x
		 * 조건식이 참이면 실행문을 실행.
		 * */

		int num = 10; 
		//num가 0보다 크면 양수입니다.
		if(num > 0) {
			System.out.println("양수입니다.");
		}
		// num가 0보다 작으면 음수입니다.
		if(num < 0) {
			System.out.println("음수입니다.");
		}
		
		num = -2;
		// num가 0보다 크면 양수 / 아니면 음수
		if(num > 0) {
			System.out.println("양수");
		}else { 
			System.out.println("음수");
		}
		num = 15;
		//num가 0보다 크면 양수, 0과 같으면 0, 0보다 작으면 음수
		if(num > 0) { 
			System.out.println("양수>");
			if(num > 10) { //중첩if사용가능
				System.out.println("10보다 큽니다.");
			}
		}else if(num == 0) {  // else if는 여러개 줄 수 있다.
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
		
		//num2의 변수에 값을 저장하고, num2가 짝수면 짝수, 아니면(홀수면) 홀수로 출력
		int num2 = 5;
		if(num2%2==0) { //괄호 안 값은 true false로 나뉘어져야함
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
	}

}

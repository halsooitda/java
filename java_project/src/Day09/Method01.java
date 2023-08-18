package Day09;

public class Method01 { 
	
	// 메서드 작성위치

	public static void main(String[] args) { 
		/* Method(메서드) : 기능(함수), function
		 * 메서드 선언 및 구현
		 * 접근제한자 리턴타입 메서드명(매개변수){
		 *  기능구현;
		 * }
		 * - 접근제한자 :  접근할 수 있는 주체의 제한범위 -> public static 모두 사용 가능
		 * - 리턴타입: 반환값 (메서드 실행 후 결과로 알려주는 값의 자료형) -> void 리턴할 게 없다. 바로 출력
		 * - 메서드명 : 소문자로 작성 -> main 변수명 작성 규칙과 같다
		 * - 매개변수 : 기능을 수행하기 위해 필요한 값(외부에서 들어와야 하는 값) 없으면 비워둬도 됨
		 * - void : 리턴할 것이 없다라는 의미
		 * 
		 * - 메서드의 위치 
		 *  : 클래스 안, 다른 메서드 밖
		 * - 메서드의 순서는 아무 상관이 없음.
		 * - 메서드는 순서대로 실행되지 않음. 호출이 되어야 실행 (like리모컨, 내가 눌러야 실행)
		 * 
		 * 출력은 메인만 할 수 있음
		 * 메서드는 하나의 기능을 처리하기 위해서 값을 호출
		 * */
		int a = sum(10,20); // 메서드 호출
		System.out.println(a);
		System.out.println(sum(10,20)); // 10이 num1에 저장, 20이 num2에 저장 -> 값이 더해져서 리턴된다
		
		System.out.println("--------------");
		
		int b = sub(10,20); // -10
		System.out.println(b);
		System.out.println(sub(20,10));
		
		System.out.println("---sum1의 호출 결과---");
		sum1(20,30); // 메서드 안에 sysout을 포함함
		//System.out.println(sum1(20,30)); => error
		
	}
	
	
	// 메서드 작성위치
	// 두 정수가 주어지면 두 정수의 합을 알려주는(리턴하는) 메서드
	// 리턴타입 : int (합계)
	// 메서드명 : sum
	// 매개변수 : int num1, int num2 (두 정수)
	public static int sum(int num1, int num2) { // 메서드는 리턴을 만나면 끝난다.
		// 매개변수 = (자료형 변수명, 자료형 변수명)
		return num1 + num2;
	} // 매개변수 사용범위 { }
	
	
	// 두 정수가 주어지면 두 정수의 차를 알려주는(리턴하는) 메서드
	// 리턴타입 : 차 => 정수 => int
	// 메서드명 : sub
	// 매개변수 : 두 정수 (int num1, int num2)
	public static int sub(int num1, int num2) {
		//return num1 - num2;
//		int sub = num1 - num2;
//		return sub;
		if(num1 < num2) { // -부호가 나오지 않도록 앞의 수가 뒤의 수보다 작다면 두 수의 위치를 바꿔서 빼주기
			return num2 - num1;
		}else {
			return num1 - num2;
		}
		
		// Math.abs(값) : 절대치, 항상 +로 만들어줌
		// return Math.abs(sub);
	} 
	
	
	// 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	// 리턴타입 : 없음 (바로 출력하기 때문) => void
	// 매서드명: sum1
	// 매개변수 : 두 정수(int num1, int num2)
	public static void sum1(int num1, int num2) { // void 출력하고 거기서 끝이남, 더 더하고 빼고 뭐 하려는 게 있으면 int로
		System.out.println(num1+num2);
	}
	
	
	
	
}

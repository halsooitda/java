package Day18;

public class Exception01 {

	public static void main(String[] args) {
		/* Exception : 예외처리
		 * 개발자가 코드 구현시 발생할 수 있는 예외를 처리하는 구문
		 * 실행시 발생할 수 있는 예외를 처리하여 정상처리로 유지시키는 기능.
		 * try ~ catch ~ finally
		 * try : 예외가 발생할 가능성이 있는 구문 작성
		 * catch : try구문에서 예외가 발생했을 경우 예외처리
		 * finally : try 구문 외 반드시 실행되어야 하는 구문을 처리 (없으면 사용X)
		 *  
		 * */
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(10/0); // exception 발생라인, 예외 발생 이후는 실행X
			System.out.println(3); // 처리되지 않음
			System.out.println(3); // 처리되지 않음
			 
		} catch (Exception e) { // 발생한 예외를 잡는 객체 e
			e.printStackTrace(); // 실제 예외 구문을 콘솔에 출력
			System.out.println("예외가 발생했습니다."); // 내가 만든 예외발생 멘트
		}
		
		// exception 발생해도 처리됨.
		System.out.println(3);  
		System.out.println(3);
		System.out.println(3);
	}
	
}

package Day18;

public class Exception04 {

	public static void main(String[] args) {
		/* 멀티 캐치 구문, 다중 캐치 구문
		 * try{
		 * 코드
		 * }catch(예외클래스명1 객체) {
		 * 예외처리문;
		 * }catch(예외클래스명2 객체) {
		 * 예외처리문;
		 * }
		 * */
		// Exception // 모든 예외의 최고조상
		// 어떤 예외가 발생하던 다 캐치 (default)
		// 세분화해서 잡고 싶을 때 => 멀티 캐치
		
		double res = 0;
		try {
			//res = 1/0; //0으로 나누었거나, null 값입니다.
			//int arr1[] = null; //0으로 나누었거나, null 값입니다.
			int arr1[] = new int[3];
			arr1[5] = 10;  //배열의 범위가 넘어갔습니다.
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("0으로 나누었거나, null 값입니다.");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열의 범위가 넘어갔습니다.");
		} catch (Exception e) { // 최고 조상이기 때문에 가장 마지막에 처리되어야 함. 위로 올라가게 되면 나머지 예외를 잡을 수 없음.
			e.printStackTrace();
		}
		System.out.println("종료");
		
	}

}

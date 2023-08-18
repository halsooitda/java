package Day13;

public class Method09 {

	public static void main(String[] args) {
		/* 가변인자 메서드
		 * - 매개변수의 개수가 고정되어 있지 않는 경우
		 * */
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,4,5,6));
		
	}

	public static int sum(int...num) { // num를 배열처럼 사용
		int result = 0;
		for(int tmp : num) { // 향상된 for문, num를 있는 만큼 가져와서 tmp에 저장
			result += tmp;
		}
		return result;
	}
	
}

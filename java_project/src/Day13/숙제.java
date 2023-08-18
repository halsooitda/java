package Day13;

public class 숙제 {

	public static void main(String[] args) {
		/* 두 정수 a,b가 주어졌을 때 a와 b 사이에 
		 * 속한 모든 정수의 합을 리턴하는 메서드
		 * 예) a=3, b=5 => 3+4+5
		 * 예) a=5, b=1 => 1+2+3+4+5
		 * 예) a=3, b=3 => 3
		 * */
		System.out.println(sum(3,5));
		System.out.println(sum(5,3));
		System.out.println(sum(-1,3));
		System.out.println(sum(3,3));
		
	}
	
	public static int sum(int a, int b) {
		int result = 0;
		
		if(a > b) {
			for(int j=b; j<=a; j++) {
				result += j;
			}
		}else {
			for(int i=a; i<=b; i++) {
				result += i;
			}
		}
		return result;
	}
	
	
}

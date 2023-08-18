package Day18;

public class Exception03 {

	public static void main(String[] args) {
		/* 자주 발생하는 예외 코드들
		 * ArithmeticException : 0으로 나누었을 때 발생하는 예외
		 * ArrayIndexOutOfBoundsException : 배열의 index가 범위를 벗어났을 경우
		 * ClassCastingException : 클래스의 다운 캐스팅이 잘못됐을 때(형변환 오류)
		 * NullPointerException : 객체가 생성되지 않은 경우
		 * */ 
		
		//ArrayIndexOutOfBoundsException
//		int arr[] = new int[5];
//		for(int i=0; i<=arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//NullPointerException
//		int arr2[]=null;
//		for(int i=0; i<5; i++) {
//			System.out.println(arr2[i]);
//		}
		
		//NullPointerException
		P p = null;
		System.out.println(p.num);
		
	}
	

}

class P {
	int num = 10;
}
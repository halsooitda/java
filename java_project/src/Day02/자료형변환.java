package Day02;

public class 자료형변환 {

	public static void main(String[] args) {
		// 자료형변환 : casting
		/* 자료형 (변수의 타입)
		 * a = b 저장하려고 할때 a자료형과 b의 자료형이 맞지 않는다면 오류
		 * 자료형 변환을 통해서 양쪽의 자료형을 맞춰주는 역할
		 * 자동 자료형 변환 : 자료형 변환시 생략해도 문제가 없는 경우
		 * 크키가 큰자료형 = 크기가 작은 자료형
		 * 
		 * 명시적 형변환 : 에러가 발생하거나, 필요에 의해 형변환이 필요한 경우
		 * 리터럴 값 앞에 (타입)
		 * */
		byte num1 = 1;
		//자동 자료형 변환
		int num2 = num1; // int = byte 
		
		double num3 = 10; // 실수형이지만 정수도 가능
		//명시적 자료형 변환
		int num4 = (int)num3; // int = double
		int num5 = (int)1.2; // 실수를 정수로 변환하면 소수점은 날아감
		System.out.println(num5); // 1
		
		
		
	}

}

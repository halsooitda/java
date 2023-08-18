package Day13;

public class Method08 {

	public static void main(String[] args) {
		/* 메서드 오버로딩 
		 * - 동일한 이름을 가지는 메서드를 여러개 만드는 경우
		 * - 오버로딩 조건
		 * 1. 매개변수의 개수가 다르면 가능
		 * 2. 매개변수의 종류(자료형)가 다르면 가능
		 * - 리턴타입과는 상관없음. 매개변수의 이름과도 상관없음.
		 * */
		Method08 m = new Method08();
		int a = m.sum(10, 20);
		System.out.println(a);
		
		System.out.println(m.sum(10, 20, 30));
		
		System.out.println(m.sum(1.5, 2.5));
		
		String str = "Hello";
		
	}

	// num1과 num2를 매개변수로 받아서 결과로 합을 돌려주는 메서드
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	public int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	public double sum(double num1, double num2) {
		return num1 + num2;
	}
	// 리턴타입은 상관X, 매개변수 이름도 상관X 안됨.
//	public int sum(double num3, double num4) {
//		return num3 + num4;
//	}
//	
	
	
}

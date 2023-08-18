package Day21;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda01 {

	public static void main(String[] args) {
		/* 람다식(Lambda) + 스트림(Stream) => 람다와 스트림
		 * 
		 * 함수의 구현과 호출만으로 프로그래밍이 수행되는 방식
		 * 람다식 : 익명함수와 비슷한 용어 (함수보다 단순하게 표현하는 방식)
		 * 외부자료의 부수적인 영향(side effect)를 주지 않도록 구현하는 방식
		 * (매개변수) -> { 구현 };
		 * (int x, int y) -> { return x+y; }; => 가능
		 * int x -> { return !x; }; => 가능
		 * int x -> return !x; => 오류
		 * 
		 * { 리턴이 있다면 } {} : 생략불가. 
		 * 실행문이 하나라면 {} 생략 가능
		 * n -> System.out.println(n); => 가능
		 * */
		
		//ArrayList에 10 20 30 40 50을 입력한 후 출력
		ArrayList<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(30);
		number.add(20);
		number.add(40);
		number.add(50);
		
		for(Integer tmp : number) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("----------------");
		
		//람다식 형태로 출력 
		//향상된 for문과 비슷하다.
		//1회성
		number.forEach((n)-> { //forEach는 for문을 돌려주는 구문, 괄호 안=매개변수
			System.out.print(n+" ");
		}); 
		
//		Consumer<Integer> method = (n) -> {
//			System.out.print(n+" ");
//		};
//		
//		number.forEach(method);
	
	}

}

package Day21;

import java.util.HashMap;

public class Lambda02 {

	public static void main(String[] args) {
		/* map을 구성하여 forEach를 이용하여 출력
		 * number.forEach((n)-> {
		 *  System.out.print(n+" ");
		 * });
		 * */
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("영희", 100);
		map.put("철수", 50);
		map.put("미애", 90);
		
		map.forEach((x, y)-> System.out.println(x+":"+y+"점"));
		//실행문이 하나이기 때문에 {} 빼도 됨
		
		
		Number add = (a, b) -> { //함수구현
			return a+b;
		};
		System.out.println(add.add(100, 30)); //결과체크
		
		Number max = (a, b) -> (a >= b)? a:b; //함수구현
		System.out.println(max.add(20, 10)); //결과체크
	}

}

//람다식에서 사용할 함수형 인터페이스
//메서드가 1개여야 함, 어노테이션 필수
@FunctionalInterface
interface Number {
	 int add(int a, int b); //리턴타입
	 
}
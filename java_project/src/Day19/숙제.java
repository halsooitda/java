package Day19;

import java.util.HashMap;

public class 숙제 {

	public static void main(String[] args) {
		/* map을 이용하여 상품과 가격을 추가하여 합계를 구하시오.
		 * 상품을 map에 추가하는 값은 메서드로 작업
		 * 1. map은 main에 만들어놓고, 메서드로 추가만(매개변수로 받기)
		 * 2. map을 메서드에서 만들어서 main으로 리턴
		 * 가위 2500
		 * 크레파스 4000
		 * 합계 6500
		 * */
		//매개변수 : HashMap<String, Integer> map
		//리턴(타입만) : HashMap<String, Integer>
		
		//메인에 map만들기
		HashMap<String, Integer> map = new HashMap<>();
		map.put("가위", 2500);
		map.put("크레파스", 4000);
		숙제 m = new 숙제();
		m.sum(map);
		
	}
	
	//map을 매개변수로 받아 사용(실제 map객체는 다른 곳에 있다라는 의미)
	public void sum(HashMap<String, Integer> map) {
		int sum = 0;
		for(String tmp : map.keySet()) {
			sum += map.get(tmp);
			System.out.println(tmp+" : "+map.get(tmp)+"원");
		}
		System.out.println("합계 : "+sum+"원");
	}
	
}

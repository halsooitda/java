package Day19;

import java.util.HashMap;
import java.util.Map;

public class 숙제02 {

	public static void main(String[] args) {
		//메서드에 map만들기
		숙제02 m = new 숙제02();
		int sum = 0;
		for(String tmp : m.map().keySet()) {
			sum += m.map().get(tmp);
			System.out.println(tmp+" : "+m.map().get(tmp)+"원");
		}
		System.out.println("합계 : "+sum+"원");
		
	}
	
	public HashMap<String, Integer> map() {
		//리턴을 해야 함
		HashMap<String, Integer> map = new HashMap<>();
		map.put("가위", 2500);
		map.put("크레파스", 4000);
		return map;
	}
	
}

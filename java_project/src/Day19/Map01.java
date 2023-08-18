package Day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * - 값을 2개 쌍으로 저장, key / value 값으로 저장
		 * - key는 중복불가, value는 중복가능
		 * - HashMap을 가장 많이 사용
		 * 
		 * HashMap<key클래스, value클래스> map = new HashMap<클래스, 클래스>();
		 * map은 값이 2개이기 때문에 향상된 for, Iterator 사용할 수 없음.
		 * map의 key => set으로 구성한 후
		 * 
		 * list, set => add() : 추가
		 * map => put() : 추가
		 * getKey() / getValue(); // 추출
		 * */ 
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("apple", 2000);
		map.put("banana", 2000);
		map.put("orange", 3000);
		map.put("peach", 4000);
		map.put("kiwi", 5000);
		
		System.out.println(map);
		System.out.println(map.keySet()); //key 값을 set으로 분리
		System.out.println(map.values()); //value 값만 추출
		
		// key = apple 값의 value만 추출
		System.out.println(map.get("apple"));
		
		System.out.println("---Iterator 출력---");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+":"+map.get(key));
		}
		
		System.out.println("---향상된 for문 사용---");
		int sum = 0;
		for(String key : map.keySet()) {
			sum += map.get(key); // value의 합계
			System.out.println(key+":"+map.get(key));
		}
		System.out.println("총 금액 : "+sum);
		System.out.println(map.entrySet()); // key/value를 한쌍으로 set 구성
		
		for(Map.Entry<String, Integer> tmp : map.entrySet()) {
			System.out.println(tmp.getKey()+":"+tmp.getValue());
			
		}
		

	}

}

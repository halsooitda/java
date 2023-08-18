package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list 생성
		 * */
		//출력을 for / 향상된 for / Iterator 사용하여 출력
		ArrayList<String> daily = new ArrayList<String>();
		daily.add("씻기");
		daily.add("아침식사");
		daily.add("공부");
		daily.add("점심식사");
		daily.add("학원");
		daily.add("저녁식사");
		daily.add("운동");
		daily.add("씻기");
		daily.add("취침");
		
		//for문
		System.out.println("--하루 일과--");
		for(int i=0; i<daily.size(); i++) {
			System.out.println(daily.get(i));
		}
		
		//향상된 for문
		System.out.println("--하루 일과--");
		for(String tmp : daily) {
			System.out.println(tmp);
		}
		
		// Iterator
		System.out.println("--하루 일과--");
		Iterator<String> it = daily.iterator();
		while(it.hasNext()) { //hasNext() : 다음 요소가 있는지 체크, true / false (다음 번지에 값이 있느지)
			String tmp = it.next(); //next() : 다음 요소 가져오기
			System.out.println(tmp);
		}
		
		Collections.sort(daily);
		System.out.println(daily); // 가나다라 순으로 정렬
		
		daily.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 숫자는 크다, 작다를 이용 가능.
				// 문자는 compareTo 메서드를 활용하여 정렬
				return o2.compareTo(o1); // 내림차순
			}
			
		});
		System.out.println(daily);
	}

}

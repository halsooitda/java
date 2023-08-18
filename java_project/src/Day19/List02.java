package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class List02 {

	public static void main(String[] args) {
		/* 두 배열을 매개변수로 입력받아서 하나로 합치는 ArrayList를 구성
		 * list = a b c d e f g h
		 * */
		String arr1[] = new String[] {"a","e","c","g"};
		String arr2[] = new String[] {"b","f","d","h","k","l"};
		//합치기 => 정렬
		ArrayList<String> list = new ArrayList<String>();
		
		//arr1 값 넣어주기
		for(int i=0; i<arr1.length; i++) { 
			list.add(arr1[i]);            
		}
		//arr2 값 넣어주기
		for(String tmp : arr2) {
			list.add(tmp);
		}
		System.out.println(list);
		
		//정렬
		System.out.println("---오름차순---");
		Collections.sort(list);
		System.out.println(list);
		
		//내림차순
		System.out.println("---내림차순---");
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println(list);
	}

}

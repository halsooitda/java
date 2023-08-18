package Day20;

import java.util.TreeSet;

public class SetEx02 {

	public static void main(String[] args) {
		// 배열의 점수들 중 가장 큰 점수와 가장 작은 점수를 출력
		int[] score = {80,97,48,58,70,96,36,90};
		
		TreeSet<Integer> set = new TreeSet<>();
		for(int i=0; i<score.length; i++) {
			set.add(score[i]);
		}
		System.out.println(set);
		//가장 앞에 있는 값(first), 가장 뒤에 있는 값(last)
		System.out.println(set.first()); //가장 작은 값
		System.out.println(set.last()); //가장 큰 값
		
		//headSet : 지정한 값보다 작은 값 출력
		//tailSet : 지정한 값보다 큰 값 출력
		System.out.println(set.headSet(80)); //80보다 작은 값을 Set으로 리턴
		System.out.println(set.tailSet(80)); //80보다 큰 값 Set으로 리턴
		
		//subSet : 검색 범위 뒷쪽 값은 미포함
		System.out.println(set.subSet(70, 90)); //70은 포함 90은 미포함
	
		
		
	}

}

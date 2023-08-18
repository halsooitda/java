package Day21;

import java.util.Arrays;

public class Stream02 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬) 중복되는 값 제거
		 * */ 
		int[] arr = {5,7,4,1,2,3,6,5,4,8,9,5,1,4};
		//배열 => Stream : Arrays.stream(배열명)
		Arrays.stream(arr).filter(n-> n%2==0)
			.distinct().sorted()
			.forEach(n-> System.out.print(n+" "));
		System.out.println();
		
		//배열로 리턴
		int[] arr2 = Arrays.stream(arr)
				.filter(a-> a%2==1)
				.distinct()
				.sorted()
				.toArray();//배열로 리턴
		
		for(int tmp : arr2) {
			System.out.print(tmp+" ");
		}
		
	}

}

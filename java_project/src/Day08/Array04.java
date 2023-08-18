package Day08;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		/* 국어 영어 수학 이라는 글자를 담을 배열을 생성 후
		 * 글자를 입력 => 출력
		 * */
		String arr[] = new String[3];
		arr[0] = "국어";
		arr[1] = "영어";
		arr[2] = "수학";
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		// 향상된 for문 
		// 한번에 하나씩 객체의 전체 탐색시 사용
		System.out.println("향상된 for문 사용");
		for(String s : arr) { // arr에 있는 값 0번지부터 s한테 넘겨준다
			System.out.println("arr "+s); // 0번지값 s에 담고 찍고 1번지값 s에 담고 찍고 마지막 번지까지 반복(처음부터 전체 탐색)
		}
		
		
		
	}

}

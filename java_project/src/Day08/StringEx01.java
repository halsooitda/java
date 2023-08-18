package Day08;

import java.util.Scanner;

public class StringEx01 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때, 
		 * 검색어를 입력하면 해당단어를 포함하는 파일을 출력
		 * */
		String[] fileName = {"java의 정석.txt", "이것이자바다.java", "String.jpg",
				"String 메서드.txt", "String 함수.jpg"};
		// ex) java => java의 정석.txt, 이것이자바다.java
		// ex) String => String.jpg, String 메서드.txt, String 함수.jpg
		// ex) jpg => String.jpg, String 함수.jpg
		
		Scanner scan = new Scanner(System.in);
		int cnt=0 ;
		for (;;) {
			cnt=0;
			System.out.println("검색어를 입력하세요.");
			String s = scan.next();
			for (int i = 0; i < fileName.length; i++) {
				if (fileName[i].contains(s)) {
					cnt++;
					System.out.println(fileName[i]);
					
				} 
				
			}
			System.out.println(cnt);
			if (cnt==0) {
				System.out.println("검색 결과가 없습니다.");
				break;
			}
		}
		
//		System.out.println("검색어를 입력하세요.");
//		String s = scan.next();
//		int cnt = 0;
//		System.out.println("--검색어 : "+s+" --");
//		for(String tmp : fileName) {
//			if(tmp.contains(s)) {
//				System.out.println(tmp);
//				cnt++; // 검색된 값의 개수
//			}
//		}
//		if(cnt==0) {
//			System.out.println("검색된 결과가 없습니다.");
//		}
		
	}

}

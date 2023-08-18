package kiosk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		/* 단어장
		 * 단어(5개)를 입력받아 콘솔에 출력하는 기능
		 * --단어장--
		 * hello : 안녕
		 * apple : 사과
		 * orange : 오렌지
		 * 
		 * 
		 * */
		HashMap<String, String> word = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		int size = 5;
		
		//입력받기
		for(int i=0; i<size; i++) {
			System.out.print("단어: ");
			String eng = scan.next();
			System.out.print("뜻: ");
			String kor = scan.next();
			word.put(eng, kor);
		}
		
		//출력
		System.out.println();
		System.out.println("--단어장--");
		Iterator<String> it = word.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = word.get(key);
			System.out.println(key+" : "+value);
		}
		
		
	}

}

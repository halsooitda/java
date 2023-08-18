package Day19;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아(Scanner) 출력
		 * 합계, 평균 출력
		 * 종료 키워드가 나올때까지 반복 (0=종료)
		 * 과목과 점수를 입력해주세요
		 * 국어 89
		 * 수학 78
		 * 0 종료
		 * map으로 출력 후 합계, 평균 출력 
		 * */ 
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>(); // 앞에 자료형 구성을 했다면 뒤에 <>에는 생략 가능.
		
		System.out.println("0 입력시 종료");
		while(true) {
			System.out.print("과목 > ");
			String sub = scan.next();
			if(sub.equals("0")) {
				break;
			}
			System.out.print("점수 > ");
			int score = scan.nextInt();
			map.put(sub, score);
		}
		System.out.println("종료합니다.");
		System.out.println();
		
		System.out.println("====결과====");
		int sum = 0;
		for(String key : map.keySet()) {
			sum += map.get(key);
			System.out.println(key+" = "+map.get(key));
		}
		System.out.println("총 합계 > "+sum);
		System.out.println("평균 > "+((double)sum/map.size()));
		
		
		
		
	}

}

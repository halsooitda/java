package Day03;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학을 입력받아서 합계, 평균
		 * 평균이 90이상이면 A
		 * 평균이 80이상이면 B
		 * 평균이 70이상이면 C
		 * 나머지는 D
		 * 입력값이 0보다 작거나, 100보다 크면 잘못된 값입니다.
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 차례대로 입력하세요.");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		int sum = kor+eng+math;
		double avg = sum/3.0; // .0 or double로 형변환
		
		if(kor<0 || kor>100) {
			System.out.println("국어 점수가 잘못된 값입니다.");
		}
		if(eng<0 || eng>100) { 
			System.out.println("영어 점수가 잘못된 값입니다.");
		}
		if(math<0 || math>100) {
			System.out.println("수학 점수가 잘못된 값입니다.");
		}
		
		System.out.println("합계="+sum);
		System.out.println("평균="+avg);
		
		if(avg >= 90) {
			System.out.println("A");
		}else if(avg >= 80) {
			System.out.println("B");
		}else if(avg >= 70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		scan.close();
		
	}

}

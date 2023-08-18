package Day06;

import java.util.Scanner;

public class 소수구하기 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 자기 자신만의 수만 가지는 수
		 * 소수 : 3, 5, 7, 11, 13 ,17 ...
		 * 소수는 약수가 2개인 수 (1과 나 자신)
		 * */ 
		/* num를 입력받아서 num가 소수인지 아닌지 판별
		 * ex) num=13 : 소수입니다.
		 * ex) num=12 : 소수가 아닙니다.
		 * */
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수를 입력하십시오.");
//		int num = scan.nextInt();
//		
//		// 약수의 개수 구하기
//		int cnt = 0; // 약수의 개수를 세기 위한 변수, 구문 안에서 선언하면 구문 밖에서 사용 불가
//		for(int i=1; i<=num; i++) {
//			if(num%i==0) { // 약수의 조건
//				// 약수가 발생되었다.
//				cnt++; // cnt=cnt+1;
//			}
//		} System.out.println(num+"의 약수의 개수 > "+cnt);
//				
//		// 개수가 2개인지 아닌지 체크
//		if(cnt==2) {
//			System.out.println(num+"은(는) 소수입니다.");
//		}else {
//			System.out.println(num+"은(는) 소수가 아닙니다.");
//		}
		
		// 2~100까지 소수를 출력 == num
//		for(int num=2; num<=100; num++) {
//			for(int i=1; i<=num; i++) {
//				if(num%i==0) { 
//					cnt++; 
//				}
//			} 
//				if(cnt==2) {
//					System.out.println();
//				}
//		}
		int cnt=0; // 약수의 개수를 세어줄 변수
		for(int i=2; i<=100; i++) { // 2~100까지의 수
			cnt=0; // 다음 수의 약수의 개수를 구하기 위한 초기화
			for(int j=1; j<=i; j++) { // 나누는 수 (약수)
				if(i%j==0) {
					cnt++;
				}
			}
			// 개수가 2개인지 체크 끝
			if(cnt==2) {
				System.out.println(i);
			}
		}
			
			
			
			
		
		
	}

}

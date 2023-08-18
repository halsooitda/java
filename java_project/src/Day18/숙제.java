package Day18;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자의 총합을 구하는 프로그램 작성
		 * 입력 : 45,78,89,65,95 => String 타입으로 입력
		 * 입력받은 문자들을 배열에 넣고, 합계를 출력
		 * 1. 총합
		 * 2. 70점 이상 합계
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		String num = scan.next();
		String arr[] = num.split(","); // ,를 기준으로 잘라서 배열에 저장
		
		int arr2[] = new int[arr.length]; // 문자배열 길이만한 숫자 배열
		int sum = 0; // 총 합계
		int sum2 = 0; // 70점 이상 숫자들 합계
		
		// 문자 -> 숫자 바꿔서 숫자 배열에 넣기
		for(int i=0; i<arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		
		int cnt = 0; // 총 몇명인지
		int cnt2 = 0; // 70점 이상이 몇명인지
		// 합계 구하기
		for(int i=0; i<arr.length; i++) {
			sum+=arr2[i]; // 총 합계
			cnt++;
			if(arr2[i] >= 70) { // 70점 이상 숫자들 합계 구하기
				sum2+=arr2[i];
				cnt2++;
			}
		}
		
		System.out.println("총 합계 > "+sum+" ("+cnt+"명)");
		System.out.println("70점 이상 합계 > "+sum2+" ("+cnt2+"명)");

	}

}

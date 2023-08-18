package Day08;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자를 거꾸로 출력
		 * ex) 11456 => 출력 : 65411 => 6+5+4+1+1 => 결과값 출력
		 * ex) 19781 => 출력 : 18791 => 1+8+7+9+1 => 결과값 출력
		 *  /, % 이용
		 * */ 
		
		Scanner scan = new Scanner(System.in); // scan이 객체, 객체를 생성해 이용하기 위해서 클래스 만든다
		System.out.println("숫자를 입력하시오.");
		int num = scan.nextInt();
		int sum = 0; // 합계를 나타내기 위한 변수
		
		// num % 10 나머지 값을 저장 => 마지막 자리
		// num = num / 10; int형으로 나머지를 버린 몫만을 가지고 다시 나누기 (마지막에는 값이 0이 됨)
		while(num > 0) {
			int b = num % 10; // 마지막 자리 추출
			sum += b; // 각자리 합 누적
			num = num / 10; // 12345 1234 123 12 1 0
			System.out.print(b+" ");
		}
		System.out.println();
		System.out.println("자리 합 : "+sum);
		
		
//		System.out.println("숫자를 입력하십시오.");
//		
//		String str = scan.next(); // 숫자를 문자열로 받음
//		String arr[] = str.split(""); // 입력받은 숫자 문자열 한글자씩 나눠서 배열로 리턴
//		int arr2[] = new int[str.length()]; // 입력된 숫자 길이만큼의 숫자 배열 생성
//		int sum = 0; // 합계 넣어줄 변수 선언
//		
//		// 문자배열을 숫자배열에 넣어주기
//		for(int i=0; i<arr.length; i++) {
//			arr2[i] = Integer.parseInt(arr[i]); // 문자를 숫자로 바꿔서 숫자 배열에 넣어주기
//		} 
//		
//		//거꾸로 출력
//		System.out.println("---거꾸로 출력---");
//		for(int i=str.length()-1; i>=0; i--) { // 마지막 번지부터 0번지까지 찍어내기
//			System.out.print(arr2[i]);
//		}
//		
//		// 각자리의 합계
//		System.out.println();
//		System.out.println("---각자리 합계---");
//		for(int i=str.length()-1; i>=0; i--) {
//			System.out.print(arr2[i]); 
//			if(i==0) {
//				System.out.print("=");
//			}else {
//				System.out.print("+");
//			}
//			sum += arr2[i]; // 변수에 각 배열 숫자 누적
//		}
//		System.out.println(sum);
		
	}

}

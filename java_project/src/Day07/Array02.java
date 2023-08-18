package Day07;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/* 5개짜리 배열을 생성하여 1~5까지의 값을 입력하고 출력 
		 * */
		
		int[] arr = new int[5];
		for(int i=0; i<=4; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("-----------------");
		
		/* 5명의 점수를 입력받아서 배열에 저장하고,
		 * 점수의 합계와 평균을 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
		int[] a = new int[5];
		int sum = 0;
		
		for(int i=0; i<=4; i++) {
			System.out.println("점수를 입력하십시오.");
			a[i]= scan.nextInt();
			sum+=a[i]; 
		}
		double avg = sum/5.0;
		System.out.println("합계 > "+ sum);
		System.out.println("평균 > "+ avg);
		
		
		
	}

}

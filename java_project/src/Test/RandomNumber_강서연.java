package Test;

import java.util.Scanner;

public class RandomNumber_강서연 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("난수의 개수를 입력하세요. : ");
		int num = scan.nextInt();
		
		int min = 0, max = 99;
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			int random = (int)(Math.random()*(max-min+1))+min;
			sum += random;
		}
		System.out.println("난수 "+num+"개의 합은 "+sum);
	}

}

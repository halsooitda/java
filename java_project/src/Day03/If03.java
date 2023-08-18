package Day03;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		/* 정수를 입력받아서 2의 배수가 되는지 체크 (2의 배수입니다.)
		 * 3의 배수가 되는지 체크 (3의 배수입니다.)
		 * */
		Scanner scan = new Scanner(System.in); // ctrl + shift + o : import 단축키
		System.out.println("숫자(정수)를 입력하십시오.");
		int num = scan.nextInt();
		
		if(num%2==0 && num%3==0) {
			System.out.println("2와 3의 공배수입니다.");
		}else if(num%2==0) {
			System.out.println("2의 배수입니다.");
		}else if(num%3==0) {
			System.out.println("3의 배수입니다.");
		}
		
		
		scan.close();
		
		
	}

}

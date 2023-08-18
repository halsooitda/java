package Day05;

import java.util.Scanner; // ctrl+shift+o

public class For문03 {

	public static void main(String[] args) {
		/* num를 입력받아 num의 약수를 출력
		 * 약수 : 나누어서 떨어지는 수
		 * 12의 약수 : 12%(1~12) = 나머지가 0이 되는 수
		 * 1,2,3,4,6,12(자신의 수) 
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하십시오.");
		int num = scan.nextInt();
			
		for(int i=1; i<=num; i++) { // 자신의 수까지
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
				
		
		scan.close();
		
	}

}

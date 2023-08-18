package Day07;

import java.util.Scanner;

public class DowhileEx01 {

	public static void main(String[] args) {
		/* do~while 문을 이용하여
		 * 값을 입력하면 그대로 출력
		 * 단. y/Y가 입력되면 종료
		 * */
		
		// 1~10까지 출력
		int i = 0;
		do { 
			i++;
			System.out.print(i+" ");
		}while(i<10);
		
		System.out.println();
		System.out.println("------------------");
		
		Scanner scan = new Scanner(System.in);
		char ch;
		do {			
			System.out.println("한글자를 입력하시오.(y/Y:종료)");
			ch = scan.next().charAt(0);
			System.out.println(ch);
//			if(ch=='y' || ch=='Y') {
//				System.out.println("종료");
//				break;
//			}
		} while(!(ch=='y' || ch=='Y')); // true인 거의 반대, ()이면 반복인데 부정을 붙였으니까 ()아니면 계속 반복
		System.out.println("종료");
		
			
		

	}

}

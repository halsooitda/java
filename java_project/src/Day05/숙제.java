package Day05;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 1~50사이의 랜덤수를 생성하여 맞추는 게임
		 * 예) 컴퓨터가 랜덤 생성 수 : 45
		 * 컴퓨터가 랜덤수를 생성하였습니다.
		 * 입력> 10
		 * up~!!
		 * 입력> 20
		 * up~!!
		 * 입력> 50
		 * down~!!
		 * 입력> 45
		 * 정답~!! 종료!!
		 * */ 
		int random = (int)(Math.random()*50)+1;
		System.out.println(random);
		System.out.println("컴퓨터가 랜덤수를 생성하였습니다.");
		System.out.println("1~50사이의 정수를 입력하여 랜덤수를 맞추시오.");
		System.out.println("(기회는 5번)");
		Scanner scan = new Scanner(System.in);
		
//		for(int i=1; i<=5; i++) {
//			System.out.println(i+"번째 입력> ");
//			int num = scan.nextInt(); // 내가 맞추는 정답
//			
//			if(num<random) {
//				System.out.println("up!");
//			}
//			if(num>random) {
//				System.out.println("down!");
//			}
//			if(num==random) {
//				System.out.println("정답입니다.");
//				break;
//			}
//			if(i==5) {
//			System.out.println("기회를 모두 소진하였습니다.");
//			}
//		}
		
		// while문을 사용할 경우
		int i = 1;
		while(i<=5) {
			System.out.println(i+"번째 입력 > ");
			int num = scan.nextInt();
			
			if(num==random) { // num != random 둘이 같으면 종료
				System.out.println("정답입니다!");
				break;
			}else if(num<random) {
				System.out.println("up!");
			}else if(num>random) {
				System.out.println("down!");
			}
			if(i==5) {
				System.out.println("기회를 모두 소진하였습니다.");
			}
			i++;
			
		}
		
		
		scan.close();
	}

}

package Day10;

import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		/* 컴퓨터가 가위바위보를 랜덤으로 선택 (0=가위, 1=바위, 2=보) 
		 * 내가 가위바위보 중 하나를 선택해서 입력
		 * 승패무의 결과를 출력
		 * ex)
		 * com = 0(가위)
		 * user = 가위 => 무승부입니다.
		 * com = 1(바위)
		 * user = 가위 => 졌습니다.
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보 게임 시작!");
		System.out.println("|0:가위|1:바위|2:보|");
		
		int user = scan.nextInt();
		if(user==0) {
			System.out.println("user > 가위");
		} else if(user==1) {
			System.out.println("user > 바위"); 
		} else if(user==2) {
			System.out.println("user > 보");
		} else if(user<0 || user>2) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		int com = (int)(Math.random()*3); // 0,1,2
		if(com==0) {
			System.out.println("com > 가위");
		} else if(com==1) {
			System.out.println("com > 바위"); 
		} else if(com==2) {
			System.out.println("com > 보");
		}
		
		if(user==com) { // 무승부
			System.out.println("무승부입니다.");
		}
		
		if(user==0) { // 내가 가위
			if(com==1) {
				System.out.println("졌습니다.");
			}else if(com==2) {
				System.out.println("이겼습니다.");
			}
		}
		
		if(user==1) { // 내가 바위
			if(com==0) {
				System.out.println("이겼습니다.");
			}else if(com==2) { 
				System.out.println("졌습니다");
			}
		}
		
		if(user==2) { // 내가 보
			if(com==0) { 
				System.out.println("졌습니다");
			}else if(com==1) {
				System.out.println("이겼습니다.");
			}
		}
		
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("가위, 바위, 보 게임시작>");
//		int comNum = (int) (Math.random() * 3); // 0 1 2 중 하나
//		System.out.println("컴퓨터 결정 완료~!!");
//		System.out.println("가위/바위/보 중 하나 선택 > ");
//		String myChoice = scan.next(); // 가위, 바위, 보 중 하나
//
//		// 컴퓨터 상태를 String 변환
//		String comChoice = (comNum == 0 ? "가위" : comNum == 1 ? "바위" : "보");
//		System.out.println("comChoice > " + comChoice);
//
//		// 비교
//		if (comChoice.equals(myChoice)) {
//			System.out.println("무승부");
//		} else {
//			if (comChoice.equals("가위")) {
//				System.out.println(myChoice.equals("바위") ? "승" : "패");
//			} else if (comChoice.equals("바위")) {
//				System.out.println(myChoice.equals("보") ? "승" : "패");
//			} else {
//				// 컴선택 = "보"
//				System.out.println(myChoice.equals("가위") ? "승" : "패");
//			}
//		}
//
//		System.out.println("종료~!!");
 		
	}

}

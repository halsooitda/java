package Day10;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리 숫자를 생성 (각 자리수는 1~9까지의 수) / 배열로
		 * 유저는 3자리의 숫자를 맞추는 게임
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 맞으면 ball, 아무것도 안 맞으면 out
		 * ex) 컴퓨터 생성번호 : 1 2 3
		 * 사용자 번호 : 1 7 8 => 1s
		 * 사용자 번호 : 1 3 2 => 1s 2b
		 * 사용자 번호 : 7 8 9 => out
		 * 사용자 번호 : 1 2 3 => 3s 종료 
		 * */
		Scanner scan = new Scanner(System.in);
		
		// 번호 3개 입력
		int user[] = new int[3];
		System.out.println("3개의 숫자를 입력하세요.");
		for (int i = 0; i < user.length; i++) {
			user[i] = scan.nextInt();
		}
		
		// 유저 3자리 출력
		System.out.print("유저 번호 > ");
		for (int i = 0; i < user.length; i++) {
			System.out.print(user[i] + " ");
		}
		System.out.println();
		
		// 컴퓨터가 3자리 입력(중복X)
		int com[] = new int[3];
		int cnt = 0; // i 같은 역할, 번지수
		while (cnt < com.length) {
			int r = (int) (Math.random() * 9) + 1;
			if (!isContain(com, r)) { // 같으면 안된다
				com[cnt] = r; // 다르면 넣어주고
				cnt++; // 다음 번지로 넘어감
			}
		}
		
		// 컴퓨터 3자리 출력
		System.out.print("컴퓨터 번호 > ");
		for (int i = 0; i < com.length; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println();
		
		
		int strike = 0;
		int ball = 0;
		for (int i = 0; i < com.length; i++) {
			if (com[i] == user[i]) {
				strike++;
			} else if (isContain(com, user[i])) {
				ball++;
			}
		}
		
		
		if (strike == 0 && ball == 0) {
			System.out.println("out");
		} else {
			System.out.println("strike: " + strike + " / ball: " + ball);
		}

	}

	// 같은 값이 있는지 확인하는 기능
	public static boolean isContain(int arr[], int random) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == random) {
				return true;
			}
		}
		return false;
	}
}

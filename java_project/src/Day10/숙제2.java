package Day10;

import java.util.Scanner;

public class 숙제2 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리 숫자를 생성 (각 자리수는 1~9까지의 수) / 배열로 랜덤 저장(중복 불가능)
		 * 유저는 3자리의 숫자를 맞추는 게임 => 직접 입력(중복되지 않게)
		 * 자리와 숫자가 일치하면 strike =>             자리 + 숫자 => strike
		 * 숫자만 맞으면 ball, 아무것도 안 맞으면 out =>   자리X 숫자O => ball
		 * ex) 컴퓨터 생성번호 : 1 2 3
		 * 사용자 번호 : 1 7 8 => 1s
		 * 사용자 번호 : 1 3 2 => 1s 2b
		 * 사용자 번호 : 7 8 9 => out
		 * 사용자 번호 : 1 2 3 => 3s 종료 
		 * */
		
		Scanner scan = new Scanner(System.in);
		int comNum[] = new int[3]; // 컴퓨터 숫자 배열
		int myNum[] = new int[3]; // 내 배열
		
		// 앞에서 썼던 메서드 호출
//		System.out.println("--comNum--");
//		// static이 아니면 : 객체 생성 후 메서드 호출
//		Method07_lotto me = new Method07_lotto();
//		me.randomArray(comNum); // static인데 왜 객체 생성했냐고 밑줄 친 거임
//		me.printArray(comNum);
//		
//		System.out.println("--myNum--");
//		// static의 특징 : 객체를 만들지 않고 클래스명으로 호출 가능.
//		Method07_lotto.randomArray(myNum);
//		Method07_lotto.printArray(myNum);
		
		// comNum 중복되지 않게 랜덤수 추출 저장
		for(int i=0; i<comNum.length; i++) {
			comNum[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) { // i가 1일때부터 돌아감, i=1이면 j=0번지랑 비교, i=2이면 j=0,1번지랑 비교
				if(comNum[j] == comNum[i]) { 
					i--; // 같으면 i하나 빼서 없었던 거 치고 다시 넣음
					break; // 가까운 for문만 빠져나감
				}
			}
		}
		
		// 결과 체크
		for(int a : comNum) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		while(true) {
			int stk = 0;
			int ball = 0;
			System.out.print("숫자 입력 > ");
			// 문자로 입력받기
			String myStr = scan.next(); // 숫자를 문자로 받음
			String[] myNumStr = myStr.split(""); // 한글자마자 잘라서 배열로 저장
			for(int i=0; i<myNum.length; i++) {
				// 문자를 숫자로 변환해서 myNum에 저장
				myNum[i] = Integer.parseInt(myNumStr[i]);
			}
//			for(int temp : myNum) {
//				System.out.print(temp+" ");
//			} 
			
			// 숫자 비교
			for(int i=0; i<comNum.length; i++) {
				for(int j=0; j<myNum.length; j++) { 
					if(comNum[i] == myNum[j] && i == j) { // 번지수도 같다면, 값 + 자리수도 같은 경우
						stk++;
					}else if(comNum[i] == myNum[j] && i != j) { // 값만 같은 경우(자리수는 다른 경우)
						ball++;
					}
				}
			}
			// 출력
			if(stk==0 && ball==0) {
				System.out.println("out");
			}else {
				System.out.println("> "+ stk+"s "+ball+"b");
			}
			if(stk==3) {
				System.out.println("축! 성공!, 게임 종료~");
				break;
			}
		}
		
	}

}

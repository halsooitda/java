package Day11;

import java.util.Scanner;

import Day10.Method07_lotto;

public class BaseBallGame {

	public static void main(String[] args) {
		/* 야구게임 메서드화
		 * 사용자번호는 직접 입력
		 * 컴퓨터번호는 랜덤생성(1~9, 중복X)
		 * */
		Scanner scan = new Scanner(System.in);
		int comNum[] = new int[3]; // 컴퓨터 번호 배열
		int myNum[] = new int[3]; // 사용자 번호 배열
		int s = 0, b = 0; // 스트라이크, 볼 변수 선언
		int min =1, max=9;
		
		randomArray(comNum,min,max); // 컴퓨터 번호 배열에 랜덤수 중복되지 않게 넣어주는 메서드 이용
		Method07_lotto.printArray(comNum);
//		printArray(comNum); // 컴퓨터 번호 출력
		
		while(true) {
			// 문자로 입력받기
			System.out.println("숫자 3개를 입력하세요.");
			String myStr = scan.next(); // 숫자를 문자로
			String myNumStr[] = myStr.split(""); // 한글자마다 잘라서 배열로 저장
			for(int i=0; i<myNum.length; i++) {
				// 문자를 숫자로 바꿔서 myNum에 저장
				myNum[i] = Integer.parseInt(myNumStr[i]);
			}
			
			s = strike(comNum,myNum);
			b = ball(comNum,myNum);
			if(s==0 && b==0) {
				System.out.println("out");
			}else if(s==3) {
				System.out.println("축하합니다! 성공입니다.");
				System.out.println("---종료---");
				break;
			}else {
				System.out.println("> "+s+"s "+b+"b");
			}
		}
	}
	
	/* 랜덤 수 생성 메서드
	 * 범위를 주지 않고 min, max를 이용하여 범위 설정
	 * min = 11, max = 19
	 * (int)(Math.random()*(19-11+1=9))+11 => 11부터 9개의 수 (11~19)
	 * (int)(Math.random()*개수)+시작
	 * (int)(Math.random()*(max-min+1))+시작
	 * */
	public static int random(int min, int max) {
		if(max < min) { // 만약 값이 바뀌었다면 max와 min을 교환, min이 무조건 작은 쪽으로 가게 만들어줌.
			int tmp = max;
			max = min;
			min = tmp;
		}
		return (int)(Math.random()*(max-min+1))+min;
	}
	
	/* 랜덤 배열 중복되지 않게 생성
	 * isContain을 Method07_lotto 가져와서 사용
	 * 매개변수 : 배열, int min, int max
	 * 리턴타입 : X
	 * */ 
	public static void randomArray(int comNum[], int min, int max) {
		int cnt=0; // cnt=i, 번지수
		while(cnt<comNum.length) {
			int r = random(min, max); // random메서드에 매개변수 min, max를 넣어줌
			if(!Method07_lotto.isContain(comNum, r)) { // if(arr[i] == random) {return true;}
				comNum[cnt] = r; // 같지 않으면 랜덤값을 컴퓨터 배열에 넣어주고
				cnt++; // 다음 번지로 넘어간다. 만약 같으면 못 넣고 다음 번지로 못 넘어감
			}
		}
	}
	
	/* 스트라이크 개수를 카운트하는 메서드
	 * comNum, myNum 주고, 번호와 위치가 일치하면 count하는 메서드
	 * 리턴타입 => int
	 * */
	public static int strike(int comNum[], int myNum[]) {
		int stk=0;
		for(int i=0; i<comNum.length; i++) {
			if(comNum[i] == myNum[i]) { // 컴퓨터 배열 i번지와 나의 배열 i번지가 같다면 스트라이크 +1
				stk++;
			}
		}
		return stk;
	}
	
	/* 볼 개수를 카운트하는 메서드
	 * comNum, myNum 주고, 번호만 일치하면 count하는 메서드
	 * */
	public static int ball(int comNum[], int myNum[]) {
		int ball = 0;
		for(int i=0; i<comNum.length; i++) { // myNum의 0~2번지 값 하나씩 주면서 comNum 전체 중에 있는지 확인, 컴퓨터 번지와 내 번지가 같은 자리에 같은 수 있으면X
			if(Method07_lotto.isContain(comNum, myNum[i]) && comNum[i] != myNum[i]) {
				ball++;
			}
		}
		return ball;
	}
	
	/* 배열 출력 메서드
	 * void -> return 줄 수 있음 대신 값을 주는 것이 아니라 break 같은 의미. 
	 * */
	public static void printArray(int comNum[]) {
		for(int i=0; i<comNum.length; i++) {
			System.out.print(comNum[i]+" ");
		}
		System.out.println();
	}
	

}

package Day04;

public class Switch문03 {

	public static void main(String[] args) {
		/* 랜덤으로 1부터 7까지의 숫자를 발생시켜
		 * 1 = 일요일, 2 = 월요일, 3 = 수요일... 7=토요일
		 * */
		int random = (int)(Math.random()*7)+1;
		System.out.println("random="+random);
		switch(random) {
		case 1: System.out.println("일요일"); break;
		case 2: System.out.println("월요일"); break;
		case 3: System.out.println("화요일"); break;
		case 4: System.out.println("수요일"); break;
		case 5: System.out.println("목요일"); break;
		case 6: System.out.println("금요일"); break;
		case 7: System.out.println("토요일"); break;
			default: System.out.println("잘못 입력된 값입니다."); break;
		}
		
		
		
	}

}

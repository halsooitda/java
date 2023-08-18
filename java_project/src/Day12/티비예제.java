package Day12;

public class 티비예제 {

	public static void main(String[] args) {
		/* Tv 클래스 생성 (like 리모컨, 자동차와 비슷)
		 * - power -> 켜져있으면 끄고, 꺼져있으면 키고
		 * - ch (up : +1씩 증가 / down : -1씩 감소) -> 파워가 켜져있을 때만
		 *   ch은 20까지 있음. 20이 넘어가면 다시 0번으로, 0에서 내려가면 다시 20으로 (순환구조)
		 * - vol (up : +1씩 증가 / down : -1씩 감소) -> 파워가 켜져있을 때만
		 *   vol은 10까지 있음. 10이 넘으면 10, 0이면 음소거라고 출력
		 * - print
		 * */ 
		Tv2 t = new Tv2();
		
	}

}

class Tv2 {
	private boolean power;
	private int ch, vol;
	
	public void isPower() {
		
	}
	
}
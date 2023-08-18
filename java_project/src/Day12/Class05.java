package Day12;

public class Class05 {

	public static void main(String[] args) {
		/* Tv 클래스 생성 (like 리모컨, 자동차와 비슷)
		 * - power -> 켜져있으면 끄고, 꺼져있으면 키고
		 * - ch (up : +1씩 증가 / down : -1씩 감소) -> 파워가 켜져있을 때만
		 *   ch은 20까지 있음. 20이 넘어가면 다시 0번으로, 0에서 내려가면 다시 20으로 (순환구조)
		 * - vol (up : +1씩 증가 / down : -1씩 감소) -> 파워가 켜져있을 때만
		 *   vol은 10까지 있음. 10이 넘으면 10, 0이면 음소거라고 출력
		 * - print
		 * */ 
		Tv t = new Tv();
		
		t.print(); // 초기 상태 Off
		t.power(); // 기본 파워가 false이므로 티비키기
		t.power(); // 티비 끔
		t.power(); // 티비 켬
		System.out.println();
		
		t.chUP(); // 기본 채널이 0이므로 1증가해서 1번
		t.chUP(); // 2번
		t.chUP(); // 3번
		t.chDown(); // 2번
		t.setCh(20); // 채널 20으로 세팅
		t.chUP(); // 1증가 -> 0번으로 돌아옴
		t.chDown(); // 1감소 -> 20으로 돌아옴
		System.out.println();
		
		t.volUp(); // 기본 음량 0이므로 1증가해서 음량 1
		t.volUp(); // 2
		t.volUp(); // 3
		t.volDown(); // 2
		t.setVol(10); // 음량 10으로 세팅
		t.volUp(); // 최대 음량입니다.
		t.volUp(); // 최대 음량입니다.
		t.setVol(0); // 음량 0으로 세팅
		t.volDown(); // 음소거 상태
		t.volDown(); // 음소거 상태
		System.out.println();
		
		t.print(); // 티비 On, 채널 20번, 음량 0
		
		
	}
}
//클래스 생성위치
class Tv {
	private boolean power; // false
	private int ch, vol; // 0
	// 멤버변수의 기본값은 별도 값을 주지 않더라도 기본세팅 0 / null / false
	
//	// 기본 생성자
//	public Tv() {
//		this.power = false;
//		this.ch = 0;
//		this.vol = 0;
//	}
	
	// power
	public void power() {
		if(power==false) {
			power = true;
			System.out.println("티비 On");
		}else {
			power = false;
			System.out.println("티비 Off");
		}
	}
	
	// chUp
	public void chUP() {
		if(power) { // true일 떄=켜졌을 때
			if(ch>=0 && ch<20) { // 0~20은 1씩 올리고 내리고 / 20에서 +1하면 0으로 / 0에서 -1하면 20으로
				ch++;
				System.out.println("채널 "+ch+"번");
			}else if(ch==20) {
				ch=0;
				System.out.println("채널 "+ch+"번");
			}
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	// chDown
	public void chDown() {
		if(power) {
			if(ch>0 && ch<=20) {
				ch--;
				System.out.println("채널 "+ch+"번");
			}else if(ch==0) {
				ch=20;
				System.out.println("채널 "+ch+"번");
			}
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	
	
	// volUp
	public void volUp() { // 최대 10, 0이면 음소거 출력, 전원 켜져있을때만
		if(power) {
			if(vol>=10) {
				System.out.println("음량 "+vol);
			}else if(vol>=0 && vol<10) {
				vol++;
				System.out.println("음량 "+vol);
			}
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	// volDown
	public void volDown() {
		if(power) {
			if(vol<=0) {
				System.out.println("음소거");
			}else if(vol>0 && vol<=10) {
				vol--;
				System.out.println("음량 "+vol);
			}
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
	}
	
	// print
	public void print() {
		System.out.println((power)? "티비 On" : "티비 Off" );
		
		if(power) {
			System.out.println("채널 "+ch+"번");
			System.out.println("음량 "+vol);
		}
		
	}
	
	
	// getter, setter
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public int getCh() {
		return ch;
	}
	
	public void setCh(int ch) {
		this.ch = ch;
	}
	
	public int getVol() {
		return vol;
	}
	
	public void setVol(int vol) {
		this.vol = vol;
	}
	
}

package Day15;

interface Power {
	abstract void turnOn(); 
	void turnOff(); // abstract 생략 가능
	
}

interface Remocon {
	void chUp();
	void chDown();
}

// 인터페이스를 구현하려면 반드시 모든 메서드를 구현해야 함.
class TV implements Power, Remocon {
	private boolean power;
	private int ch;
	
	@Override
	public void turnOn() {
		// 파워켜기
		power = true;
		System.out.println("전원이 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		// 파워끄기
		power = false;
		System.out.println("전원이 꺼졌습니다.");
	}

	@Override
	public void chUp() {
		ch++;
		System.out.println("현재채널 :"+ch);
		
	}

	@Override
	public void chDown() {
		ch--;
		System.out.println("현재채널 :"+ch);
		
	}
	
}

public class 인터페이스01 {

	public static void main(String[] args) {
		/* 인터페이스 : 추상메서드와 상수(final)로만 이루어진 것
		 * 추상메서드 : 메서드의 선언부만 있고, 구현은 없는 메서드
		 * 추상클래스: 추상메서드+ 일반메서드 + 멤버변수 + 상수(final)
		 * 추상클래스 : 미완성 설계도 => 객체를 생성할 수 없다. 
		 * 키워드 : abstract
		 * abstract 클래스명 앞 / abstract 메서드명 앞에 추가
		 * abstract 리턴타입 메서드명(매개변수);
		 * - 인터페이스에서는 abstract 키워드 생략가능. (어차피 추상메서드만 존재가능)
		 * - 추상클래스에서는 abstract 키워드 생략 불가능.
		 * - 주로 부모클래스에서 상속받을 때, 특정 메서드가 자식들에게 자주 오버라이딩 되는 상황일 때,
		 *  해당 메서드를 추상 메서드로 작성
		 *  - 상속 받은 클래스에 추상메서드가 있다면, 반드시 구현해야 한다.
		 *  
		 *  인터페이스 키워드 : interface
		 *  - 기능요약서
		 *  - 자체적으로는 사용할 수 없고, 인터페이스를 구현한 클래스로 활용
		 *  - 구현 키워드 : implements
		 *  - 인터페이스는 멤버 변수가 없음. 이 부분을 염두에 두고 메서드 정리가 필요함.
		 *  
		 *  - 상속 : 다중상속 불가 
		 *  - 구현 : 다중구현 가능
		 *  - 상속 + 구현 동시에 가능
		 * */
		TV t = new TV();
		t.turnOn();
		t.turnOff();
		t.turnOn();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chDown();

	}

}

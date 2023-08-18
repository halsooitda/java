package Day12;

public class 자동차예제 {

	public static void main(String[] args) {
		Car2 c = new Car2(); // 차의 객체가 만들어지는 상태
		System.out.println("메인카");
		c.setYear("2023");
		c.setColor("흰색");
		c.printInfo();
		c.powerOn();
		c.powerOn(); // 이미 켜져있습니다.
		c.setSpeed(100);
		c.speedUP();
		c.speedUP();
		c.speedUP();
		c.speedUP();
		c.speedUP();
		c.speedUP();
		c.speedUP();
		c.speedUP();
		c.speedUP();
		c.speedUP();
		c.speedUP();
		c.speedDown();
		c.speedDown();
		c.setSpeed(0); // 멈춤
		c.speedDown(); // 이미 멈춰있어서 속도 다운 불가
		c.powerOff(); // 멈췄을 때만 시동끌 수 있음
		
		
		System.out.println();
		System.out.println("세컨카");
		Car2 c2 = new Car2(); // Car() => 생성자
		c2.setName("소나타");
		c2.setYear("2022");
		c2.setColor("빨강");
		c.printInfo();
		
		System.out.println();
		Car2 c3 = new Car2("그렌저","2020","파랑"); // ctrl+space
		c3.printInfo();
		
		// 객체를 생성할 때 초기값을 지정하는 것을 생성자
		// 생성자를 이용하면 초기화를 쉽게 할 수 있다.
		// class를 생성하면 아무것도 없는 생성자를 제공 => Car()
		// 다른 생성자를 추가하면 기본 생성자는 사라짐
		// 다른 생성자를 추가하더라도 기본 생성자를 같이 추가하여 생성자를 여러개 두는 것이 일반적임.
		/* 
		 * - 생성자 선언 방법
		 * public 클래스명(){ 
		 * 리턴타입이 없음, 생성자명은 클래스명과 같아야 함.
		 * 
		 * }
		 * */
		
	}

}

class Car2 { // 접근제한자 default : 나 + 같은 패키지, 만약 11패키지에서 만들었다면 에러남. 같은 패키지 내에서 같은 이름 불가능
// 멤버변수 : name, year, color, power, speed
//	private final String name = "람보르기니"; // 변경될 수 없는 값 (상표, 국적과 같은 정보들)
	private String name="카니발"; // 변경가능
	private String year; // int는 숫자를 이용해야할 때만+연산과 관계있을 때 (올리거나 내리거나 등 연산목적), 정보목적 숫자는 스트링으로
	private String color; // null
	private boolean power; //boolean의 초기값 false
	private int speed; // 0
	
	// 생성자 위치 => 메서드 전
	public Car2() {
		//기본생성자
	}
	// 같은 생성자 두개 생성 불가 but 생성자의 매개변수의 값이나 타입이 다르면 가능.
	// => 오버로딩 (메서드 오버로딩, 생성자 오버로딩 가능)
	// 오버로딩 가능 조건 : 매개변수의 개수가 다름, 타입이 다름
	public Car2(String name, String year, String color) {
		this.name = name;
		this.year = year;
		this.color = color;
	}
	
	// 메서드 : 내 차종의 정보를 출력하는 메서드 (name, year, color)
	// 내 멤버변수의 정보를 출력
	// static -> 최소화, 정말 공용으로 사용해야하는 것들만, 우린 객체를 생성하니까 안 써도 됨...
	public void printInfo() {
		System.out.println("차종 : "+name);
		System.out.println("연식 : "+year);
		System.out.println("색상 : "+color);
	}
	
	// 시동켜기 : powerOn 
	// power = true, 시동이 켜졌습니다. 문구 출력
	public void powerOn() {
		if(power) {
			System.out.println("이미 켜져있습니다.");
			return;
		}
		power = true;
		System.out.println("시동이 켜졌습니다.");
	}
	
	// 시동크기 : powerOff
	// power = false, 시동이 꺼졌습니다.
	public void powerOff() {
		if(speed != 0) {
			System.out.println("시동을 끌 수 없습니다.");
			return; // 여기서 끝내기
		}
		power = false;
		System.out.println("시동이 꺼졌습니다.");
	}
	
	// 속도 올림 : speedUp
	// 최대속도 200이 넘어가면 더이상 speed가 올라가지 않는다.
	// 시동이 켜졌을 때만 속도 조절 가능
	public void speedUP() {
		//현재 스피드의 상태 =0
		if(power) {
			if(speed >= 200) {
				System.out.println("최고속도입니다.");
			}else {
				speed += 10;
				System.out.println("현재 속도 : "+speed);
			}
		}else {
			System.out.println("시동을 켜주세요.");
		}
	}

	
	// 속도 내림 : speedDown
	// 속도가 0이 되면 더이상 내려가지 않는다.
	// 시동이 켜졌을 때만 속도 조절 가능
	public void speedDown() {
		if(power) {
			if(speed<=0) {
				System.out.println("멈춰있습니다.");
			}else {
				speed -= 10;
				System.out.println("현재 속도 : "+speed);
			}
		}else {
			System.out.println("시동이 꺼져있습니다.");
		}
	}
	

	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
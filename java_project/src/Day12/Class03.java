package Day12;

public class Class03 {

	public static void main(String[] args) {
		Car c = new Car();
		
		c.setName("밴츠");
		c.setYear("2023년식");
		c.setColor("흰색");
		c.print();
		
		c.setPower(false);
		c.powerOn();
		c.powerOff();
		
		c.setSpeed(0);
		System.out.println("속도 > "+c.getSpeed());
		c.speedDown(); // 0보다 커야 속도 다운 가능
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		System.out.println("속도 > "+c.getSpeed());
		
	}

}

class Car { // 접근제한자 default : 나 + 같은 패키지, 만약 11패키지에서 만들었다면 에러남. 같은 패키지 내에서 같은 이름 불가능
// 멤버변수 : name, year, color, power, speed
	private String name, year, color;
	private boolean power;
	private int speed;

	// 메서드 : 내 차종의 정보를 출력하는 메서드 (name, year, color)
	public void print() {
		System.out.println("name > "+name);
		System.out.println("year > "+year);
		System.out.println("color > "+color);
	}
	
	// 시동켜기 : powerOn 
	// power = true, 시동이 켜졌습니다. 문구 출력
	public void powerOn() {
		if(power==false) {
			power = true;
			System.out.println("시동이 켜졌습니다.");
		}else {
			System.out.println("이미 시동이 켜진 상태입니다.");
		}
	}
	// 시동크기 : powerOff
	// power = false, 시동이 꺼졌습니다.
	public void powerOff() {
		if(power==true) {
			power = false;
			System.out.println("시동이 꺼졌습니다.");
		}else {
			System.out.println("이미 시동이 꺼진 상태입니다.");
		}
	}
	
	
	//속도 올림 : speedUp 
	//최대속도 200 이넘어가면 더이상 speed가 올라가지 않는다
	// 시동이 켜졌을 때만 속도 조절 가능
	public void speedUp() {
		if(power) { // power가 true일 때 실행
			if(speed >=0 && speed < 200) {
				speed+=10;
			}else if(speed == 200) {
				System.out.println("최고속도입니다.");
			}
		}else {
			System.out.println("시동이 꺼져있습니다");
		}
	}
	
	
	// 속도 내림 : speedDown
	// 속도가 0이 되면 더이상 내려가지 않는다.
	// 시동이 켜졌을 때만 속도 조절 가능
	public void speedDown() {
		if(power) {
			if(speed > 0 && speed <= 200) {
				speed-=10;
			}else if(speed==0) {
				System.out.println("멈춰있습니다.");
			}
		}else {
			System.out.println("시동이 꺼져있습니다");
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
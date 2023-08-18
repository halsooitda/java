package Day14;

public class ClassEx01 {

	public static void main(String[] args) {
		// Car class를 활용한 생성자 연습 
		 Car c = new Car("벤츠", "흰색", "2023", 4, 4, false, 0);
		 c.printInfo();
		 
		 System.out.println();
		 System.out.println(c); // toString 자체에 프린트 기능이 없음
		 
		 System.out.println();
		 c.powerOnOff(); // 기본이 꺼져있는 것이므로 켜짐
		 c.powerOnOff(); // 꺼짐
		 c.powerOnOff(); // 켜짐
		 c.speedUp(); // 초기 속도 0 + 10
		 c.speedUp();
		 c.speedUp();
		 c.speedDown();
		 c.speedDown();
		 c.speedDown(); // 0
		c.speedDown();
		c.speedDown();
		c.speedDown();
		
	}

}
// Car class 작성 위치
class Car {
	// 멤버변수 : name, color, year, door, airback, power, speed
	// 멤버변수 생성 => getter/setter 생성
	// 생성자 : 기본생성자
	// name, color, year 받는 생성자
	// name, color, year, door 받는 생성자
	// name, color, year, door, airback 받는 생성자
	// 전체 받는 생성자
	private String name, color, year;
	private boolean power;
	private int door, airback, speed;
	
	// 기본 생성자
	public Car() {}
	
	public Car(String name, String color, String year) {
		this.name = name;
		this.color = color;
		this.year = year;
	}
	public Car(String name, String color, String year, int door) {
		this(name, color, year); // 생성자 호출은 반드시 첫줄에
		this.door = door;
	}
	public Car(String name, String color, String year, int door, int airback) {
		this(name, color, year, door);
		this.airback = airback;
	}
	// 전체 받는 생성자 (자동 생성)	 => source에 있음
	public Car(String name, String color, String year, int door, int airback, boolean power, int speed) {
		//super(); // 상속자가 가지고 있는 생성자
		this.name = name;
		this.color = color;
		this.year = year;
		this.door = door;
		this.airback = airback;
		this.power = power;
		this.speed = speed;
	}

	// 메서드
	// printInfo() : name, color, year, door, airback
	public void printInfo() {
		System.out.println("차종 : "+name);
		System.out.println("색상 : "+color);
		System.out.println("연식 : "+year);
		System.out.println("문 : "+door+"개");
		System.out.println("에어백 : "+airback+"개");
	}
	
	// powerOnOff() 
	public void powerOnOff() {
		if(power) {
			power = false;
			System.out.println("시동 Off");
		}else {
			power = true;
			System.out.println("시동 On");
		}
	}
	
	// speedUP()
	public void speedUp() {
		if(power) {
			speed += 10;
			System.out.println("현재 속도 : "+speed);
		}else {
			System.out.println("시동이 꺼져있습니다.");
		}
	}
	
	// speedDown()
	public void speedDown() {
		if(power) {
			if(speed > 0) {
				speed -= 10;
				System.out.println("현재 속도 : "+speed);
			}else {
				System.out.println("정지상태입니다.");
			}
		}else {
			System.out.println("시동이 꺼져있습니다.");
		}
	}
	
	// toString : 멤버변수를 출력하는 기능 => source에 있음
	@Override //어디에서 가져온 값을 내가 다시 한번 형태를 바꾼다.
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", year=" + year + ", power=" + power + ", door=" + door
				+ ", airback=" + airback + ", speed=" + speed + "]";
	}
	
	// getter/setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public boolean isPower() {
		return power;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public int getDoor() {
		return door;
	}
	
	public void setDoor(int door) {
		this.door = door;
	}
	
	public int getAirback() {
		return airback;
	}
	
	public void setAirback(int airback) {
		this.airback = airback;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
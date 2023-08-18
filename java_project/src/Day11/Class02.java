package Day11;

public class Class02 {

	public static void main(String[] args) {
		 Car c = new Car(); // 객체선언,초기화
		 c.setColor("red"); 
		 c.setPower(true); // 시동켜짐
		 c.setSpeed(0);
		 System.out.println("My car color : "+c.getColor());
		 System.out.println("My car power : "+(c.getPower()? "On" : "Off"));
		 System.out.println("My car speed : "+c.getSpeed());
		 c.speedUp();
		 c.speedUp();
		 c.speedUp();
		 c.speedUp();
		 c.speedUp();
		 c.speedUp();
		 c.speedUp();
		 c.speedUp();
		 c.speedUp();
		 c.speedUp();
		 c.speedUp();
		 System.out.println("My car speed : "+c.getSpeed());
		 c.speedDown();
		 c.speedDown();
		 c.speedDown();
		 c.speedDown();
		 c.speedDown();
		 System.out.println("My car speed : "+c.getSpeed());
		 
//		 Car c2 = new Car(); // 새로 생긴 객체 (새 자동차), 별도, 개별
//		 System.out.println(c2.color); // null 값이 없다.
//		 System.out.println(c2.speed); // 0
//		 System.out.println(c2.power); // false
	}

}

// 클래스-소문자, 클래스명-대문자로 시작
class Car {
	//멤버변수 = private 설정 (일반적) => 직접 접근X
	//메서드 = public 설정 => getter/setter 메서드 통해 멤버변수에 접근
	private String color;
	private boolean power;
	private int speed;
	
	public void power() {
		power = !power; // 파워의 반대의 값을 파워에 담는다, 전원이 켜져있으면 끄고 꺼져있으면 키고
	}
	public void speedUp() {
		speed+=10;
	}
	public void speedDown() {
		speed-=10;
	}
	//getter
	public String getColor() {
		return this.color; // 멤버변수의 컬러를 리턴
	}
	public boolean getPower() {
		return this.power;
	}
	public int getSpeed() {
		return this.speed;
	}
	//setter
	public void setColor(String color) {
		this.color = color;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
}
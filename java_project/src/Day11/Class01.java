package Day11;

public class Class01 { // 파일명과 클래스명이 같을 경우에만 public 가능.
// 멤버변수 선언 위치 (클래스 안, 메서드 밖(위))
	public static void main(String[] args) {
		/* 클래스 - 설계도 / 설계도로 객체 생성
		 * 객체 - 제품
		 * 메서드 - (제품의) 기능
		 * 
		 * 클래스
		 * - 속성(정보) : 멤버변수
		 * - 기능 : 메서드
		 * 
		 * 프린터 클래스
		 * - 속성(정보) : 크기, 색, 제조사, 제품명, 종류 등
		 * - 기능(메서드) : 인쇄, 복사, 스캔, 팩스
		 * 
		 * 멤버변수는 클래스 안, 메서드 밖(위)에 작성 - 4번라인
		 * 멤버변수는 클래스 안에서 사용가능(모든 메서드에서 공통적으로 사용가능)
		 * 
		 * - 객체 선언
		 * 클래스명 객체명; // 선언만. 값은 없음 null
		 * 객체명 = new 클래스명(); // 이미 선언된 것에 초기화만
		 * 
		 * - 객체 선언(초기화 생성)
		 * 클래스명 객체명 = new 클래스명();
		 * 
		 * - 메서드 사용법 (클래스가 다른 메서드를 호출할 경우)
		 * 객체명.메서드명(); 
		 * 
		 * - 같은 클래스 안에서 메서드를 호출할 경우는 그냥 => 메서드명();
		 * - 다른 클래스 안에서 메서드를 호출할 경우는 => 객체명.메서드명();
		 * */
		/* 접근제한자(제어자)
		 * public : 모두 사용가능
		 * protected : 나 + 패키지 + 자식클래스(상속)
		 * (default) : 나 + 패키지
		 * private : 나
		 * 
		 * public > protected > default > private
		 * 
		 * - 클래스에 public을 붙일 수 있는 건 파일명 = 클래스명 같을 경우에만 가능
		 * - 멤버 변수와 멤버 메서드는 public 문제없이 사용가능.
		 * - private이 붙은 멤버변수나 멤버메서드는 다른 클래스에서 사용할 수 없다.
		 * - 일반적으로 멤버변수는 private, 메서드는 public으로 선언한다.
		 * - private으로 선언된 멤버변수는 getter/setter 메서드를 만들어서 해당 변수에 접근할 수 있도록 한다.
		 * */
		Point p = new Point(); // 객체선언,초기화 => 클래스명 객체명 = new 클래스명();
		p.print(); // 값을 주지 않아도 멤버변수는 기본값 0으로 세팅이 되어있다.
//		p.x = 1; // private이라 직접적으로 접근 불가능
//		p.y = 2;
		p.save(10, 20);
		p.print();
		// x값만 사용하고 싶을 때
		// 메서드를 돌려서 준다
		System.out.println(p.getX()+1);
		System.out.println(p.getY());
		System.out.println("-------------");
		
		p.setX(100);
		p.setY(500);
		p.print();
		System.out.println(p.getX());
		
		
	}

}
/* 다른 클래스 밖에서 생성
 * 접근제한자 class 클래스명 {
 * 
 * }
 * */
class Point { 
	// 멤버변수 위치
//	public int x;
//	public int y; 
	private int x; // 멤버변수 보호
	private int y;
	
	//(x,y)
	public void print() {
		System.out.println("("+x+","+y+")");
	}
	
	// 포인트 값을 저장하는 메서드
	public void save(int x, int y) { // 매개변수로 밖에서 주는 값으로 setting
		// this : 멤버변수를 지정하는 키워드
		this.x = x; //(파란 x=멤버변수, 옆 x=매개변수)
		this.y = y; // 값을 받아서 값을 내주는 것=setter
	}
	
	// getter
	public int getX() { // 멤버변수에 접근할 수 있는 
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	// setter
	public void setX(int x) { // 멤버변수 세팅할 수 있는
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}




//class A{ // 아무것도 안 적으면 디폴트
//	
//}
//class B{ // 파일명과 클래스명이 달라서 public 불가능
//	
//}
package Day14;

public class ClassEx03 {

	public static void main(String[] args) {
		/* 클래스 생성시 값을 초기화하는 방법
		 * - 기본값, 명시적 초기값, 초기화블럭, 생성자
		 * 1. 기본값 : 기본적으로 지정된 값 int => 0, String => null
		 * 2. 명시적 초기값 : 멤버변수 선언과 동시에 값을 지정하는 방법
		 *    private String name = "홍길동";
		 * 3. 초기화블럭 : {  } 멤버변수의 초기화
		 * 4. 생성자 : 객체를 생성할 때 초기화 해서 생성
		 * 초기값들의 우선순위
		 * 기본값 -> 명시적 초기값 -> 초기화블럭 -> 생성자(제일 우선)
		 * */ 
		EzenStudent e = new EzenStudent();
		System.out.println(e);
		
		EzenStudent e2 = new EzenStudent("강남", "홍길동", "자바", "010-1111-1111");
		System.out.println(e2); // 생성자 > 초기화 블럭
		
	}

}

class EzenStudent {
	// 멤버변수 : 지점="incheon"(명시적), 이름, 반, 전화번호
	private String pos = "incheon"; // 명시적 초기값
	private String name; // 기본값 null
	private String cl;
	private String tel;
	
	{
		// 초기화 블럭 영역 > 명시적 초기값
		pos="인천";
		cl="미정";
		
	}
	
	// 생성자 
	public EzenStudent() {}

	public EzenStudent(String pos, String name, String cl, String tel) {
		super();
		this.pos = pos;
		this.name = name;
		this.cl = cl;
		this.tel = tel;
	}

	// print 메서드(toString 가능)
	@Override
	public String toString() {
		return "EzenStudent [pos=" + pos + ", name=" + name + ", cl=" + cl + ", tel=" + tel + "]";
	}
	
	// getter/setter
	public String getPos() {
		return pos;
	}
	
	public void setPos(String pos) {
		this.pos = pos;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCl() {
		return cl;
	}
	
	public void setCl(String cl) {
		this.cl = cl;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
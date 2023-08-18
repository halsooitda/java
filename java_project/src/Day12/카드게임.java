package Day12;

public class 카드게임 {

	public static void main(String[] args) {
		// Card 객체를 생성하고, ♣Q 를 출력하려고 한다.
		// ♥11 -> ♥J
		// 아무값도 안 넣으면 ♥1
		// ♥, ♣, ◆, ♠ 가 아닌 다른 모양이 들어가면 => ♥
		// 숫자도 1~13이 아닌 다른 수가 들어가면 => 1
		Card2 c = new Card2();
		c.print();
		
		c.setNum(10);
		c.setShape('@');
		c.print();
		
		Card2 c1 = new Card2('♣',13);
		c1.print();
	}

}

/* Card 클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스
 * 모양 : 하트♥, 클로버♣, 다이아◆, 스페이드♠
 * 숫자 : 1~10, J(11), Q(12), K(13) - 11이 걸리면 J로 표현해주세요
 * 카드 정보를 출력
 * 
 * 클래스의 구성
 * - 멤버변수 : char shape, int num
 * - 생성자 : 객체 생성시 멤버변수를 초기화하는 메서드 (♥1)
 * - 메서드 : print, getter/setter
 */
class Card2 {
	private char shape; // 모양 ♥, ♣, ◆, ♠
	private int num; // 숫자
	
	// 기본 생성자
	public Card2() { // 아무것도 안 넣어도 나오는 값
		this.shape = '♥';
		this.num = 1;
	}
	// 추가 생성자
	public Card2(char shape, int num) {
		if(num < 1 || num > 13) {
			this.num = 1;
		}else {
			this.num = num;
		}
		
		switch(shape) {
		case '♥' : case '♣' : case '◆' : case '♠' :
			this.shape = shape;
			break;
			default :
				this.shape = '♥';
		}
	}
	
	//print 메서드
	//num, shape를 모양에 맞춰 출력하는 메서드
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 11: System.out.println("J"); break;
		case 12: System.out.println("Q"); break;
		case 13: System.out.println("K"); break;
		default:
			System.out.println(num); break;
		}
	}
	//getter setter
	public char getShape() {
		return shape;
	}
	public void setShape(char shape) {
		switch(shape) {
		case '♥' : case '♣' : case '◆' : case '♠' :
			this.shape = shape;
			break;
			default :
				this.shape = '♥';
		}
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if(num < 1 || num > 13) {
			this.num = 1;
		}else {
			this.num = num;
		}
	}
	
	
}
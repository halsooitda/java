package Day12;

public class Class04 {

	public static void main(String[] args) {
		// Card 객체를 생성하고, ♣Q 를 출력하려고 한다.
		// ♥11 -> ♥J
		// 아무값도 안 넣으면 ♥1
		// ♥, ♣, ◆, ♠ 가 아닌 다른 모양이 들어가면 => ♥
		// 숫자도 1~13이 아닌 다른 수가 들어가면 => 1
		
		Card c = new Card('♥',1);
		c.print();
		
		c.setShape('♣');
		c.setNum(12);
		c.print();
		
		c.setShape('ㅁ');
		c.setNum(0);
		c.print();
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
class Card {
	private char shape;
	private int num;
	
	// 기본생성자
	public Card() {
		
	}
	// 다른 생성자 추가
	public Card(char shape, int num) {
		this.shape = shape;
		this.num = num;
	}
	
	// 프린트
	public void print() {
		// 모양만 프린트
		if(shape == '♥' || shape == '♣' || shape == '◆' || shape == '♠') {
			System.out.print(shape);
		}else {
			shape = '♥';
			System.out.print(shape);
		}
		// 숫자만 프린트
		if(num >= 1 && num <= 13) {
			if(num == 11) {
				System.out.println("J");
			}else if(num == 12) {
				System.out.println("Q");
			}else if(num == 13) {
				System.out.println("K");
			}else {
				System.out.println(num);
			}
		}else {
			num = 1;
			System.out.println(num);
		}
	}
	
	// getter/setter
	public char getShape() {
		return shape;
	}
	public void setShape(char shape) {
		this.shape = shape;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}


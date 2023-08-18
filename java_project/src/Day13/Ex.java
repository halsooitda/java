package Day13;

public class Ex {

	public static void main(String[] args) {
		Card c = new Card(); // 카드 한장
		c.print();
		
		c.setShape('♠');
		c.setNum(8);
		c.print();
		
		c.setShape('@');
		c.setNum(0);
		c.print();
		
		System.out.println();
		System.out.println("------------");
		
		
		CardPack pack = new CardPack(); // 카드팩 객체 생성
		
		pack.shuffle(); 
		for(int i=1; i<=4; i++) { // 4줄로 출력
			for(int j=1; j<=13; j++) { // 모양대로 13개씩
				Card tmp = pack.pick(); // 빼낸 카드 한장을 넣어줄 임시변수
				tmp.print();
			} // 4*13번 반복
			System.out.println(); // 줄바꿈
		} // 하트1이 제일 아래에 깔리고 그 위로 순서대로 쌓인다.
		
		System.out.println();
		pack.init(); // 카드번지 초기화
		//pack.shuffle();
		pack.pick().print(); // 카드 한장 뽑기

		
	}

}

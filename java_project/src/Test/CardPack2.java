package Test;

import Day13.Card;

public class CardPack2 {
	private Card2[] pack = new Card2[52];
	private int cnt = 0;
	
	public CardPack2() {
		char shape = 'a';
		for(int i=1; i<=4; i++) { //모양 4개
			switch(i) {
			case 1 : shape = '♥'; break;
			case 2 : shape = '♣'; break;
			case 3 : shape = '♠'; break;
			case 4 : shape = '◆'; break;
			}
			for(int j=1; j<=13; j++) { //숫자 13개
				Card2 c = new Card2();
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++;
			}
		}
	}
	
	public Card2 pick() {
		if(cnt == 0) {
			return null; 
		}
		cnt--; 
		return pack[cnt]; 
	}
	
	//getter/setter
	public Card2[] getPack() {
		return pack;
	}
	public void setPack(Card2[] pack) {
		this.pack = pack;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

//-----------------------------------------------
	public static void main(String[] args) {
		CardPack2 cp = new CardPack2();
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=13; j++) {
				Card2 tmp = cp.pick();
				tmp.print();
			}
			System.out.println();
		}
		
		
	}

}

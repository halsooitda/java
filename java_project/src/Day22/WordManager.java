package Day22;

import java.util.ArrayList;
import java.util.Scanner;

public class WordManager implements WordProgram {
	ArrayList<Word> list = new ArrayList<>(); //단어 뜻
		
	@Override
	public void add(Scanner scan) {
		System.out.println("--단어등록--");
		System.out.print("등록할 단어 > ");
		String word = scan.next();
		System.out.print("뜻 > ");
		String mean = scan.next();
		
		list.add(new Word(word, mean));
		
	}

	@Override
	public void search(Scanner scan) {
		System.out.println("--단어검색--");
		System.out.print("검색할 단어 > ");
		String word = scan.next();
		
		//단어 존재O
		for(Word w : list) {
			if(w.getWord().equals(word)) {
				System.out.println(w);
				return;
			}
		}
		//단어 존재X
		System.out.println("존재하지 않는 단어입니다.");
	}

	//단어 수정
		@Override
		public void update(Scanner scan) {
			System.out.println("--단어수정--");
			System.out.print("수정할 단어 > ");
			String word = scan.next();
			
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getWord().equals(word)) {
					System.out.println("1.단어수정|2.뜻 수정");
					System.out.print("선택 > ");
					int cho = scan.nextInt();
					
					switch(cho) {
					case 1 : System.out.print("수정 후 단어 > ");
							 String newWord = scan.next();
							 list.get(i).setWord(newWord);
							 System.out.println("수정 완료");
							 return;
					case 2 : System.out.print("수정 후 뜻 > ");
							 String newMean = scan.next();
							 list.get(i).setMean(newMean);
							 System.out.println("수정 완료");
							 return;
					}
				}
			}
			System.out.println("존재하지 않는 단어입니다.");
		}

	@Override
	public void print() {
		System.out.println("--단어출력--");
		for(Word w : list) {
			System.out.println(w);
		}
		
	}

	//getter/setter
	public ArrayList<Word> getList() {
		return list;
	}
	
	public void setList(ArrayList<Word> list) {
		this.list = list;
	}
	
}

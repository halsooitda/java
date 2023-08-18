package Day22;

import java.util.HashMap;

public class Word implements Comparable<Word> {
	private String word;
	private String mean;
	private HashMap<String, String> engWord = new HashMap<>();
	
	//생성자
	public Word() {}
	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;
	}
	
	//출력
	@Override
	public String toString() {
		return  word + " : " + mean ;
	}
	
	//단어등록
	public void addWord(String word, String mean) {
		engWord.put(word, mean);
		System.out.println("단어 등록 완료");
	}
	
	//단어수정
	public void updateWord(String word, String mean) {
		if(engWord.keySet().contains(word)) {
			engWord.put(word, mean);
			System.out.println("단어 수정 완료");
		}else {
			System.out.println("해당 단어가 없습니다.");
		}
	}
	
	
	//getter/setter
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	
	//오름차순
		@Override
		public int compareTo(Word o) {
			return this.word.compareTo(o.word);
		}
	
}

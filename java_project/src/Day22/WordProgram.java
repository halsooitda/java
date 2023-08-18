package Day22;

import java.util.Scanner;

public interface WordProgram {
	//1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.종료
	void add(Scanner scan); 
	void search(Scanner scan);
	void update(Scanner scan);
	void print();
}

package Day22;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EnglishDictionary {

	public static void main(String[] args) throws IOException {
		//영어사전
		/* 메뉴
		 * 1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.종료
		 * 파일로 저장
		 * 클래스로 단어 구성(word, mean) 단어, 뜻
		 * 단어대로 오름차순
		 * */
		/* do
		 * 1.동사(어떤 동작이나 행위를) 하다
		 * 2.동사(앞에서 언급한 대로) 하다
		 * 3.동사 하다[되어 가다](어떤 일의 성공 여부나 진행 상황에 대해 말하거나 물을 때 씀
		 * 4.조동사(다른 동사 앞에 쓰여 부정문이나 의문문을 만듦)
		 * 5.조동사(부가 의문문을 만들 때 쓰임)
		 * */
		/* 사전의 내용을 만들어 파일로 출력(저장)
		 * 리스트로 구성한 뜻을 맵에 넣어준다 Map<String(단어), list(뜻)>
		 * */
		FileWriter fw = new FileWriter("word.txt");
		WordManager wm = new WordManager();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		do {
			System.out.println("1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.종료");
			System.out.print("선택 > ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 : wm.add(scan); break;
			case 2 : wm.search(scan); break;
			case 3 : wm.update(scan); break;
			case 4 : wm.print(); break;
			case 5 : wm.getList().stream().sorted();
					for(Word w : wm.list ) {
						fw.append(w.toString());				
					}
					System.out.println("종료"); break;
			default : System.out.println("잘못된 메뉴 선택입니다."); 
			
			}
			System.out.println(); //줄바꿈
			
		}while(menu != 5);
		
		
		
	}

}

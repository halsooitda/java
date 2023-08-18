package word;

import java.util.Scanner;

public class WordMain {
	//멤버변수

	public static void main(String[] args) {
		/* 단어장 프로그램 작성
		 * 1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.파일출력|6.종료
		 * 파일로 저장
		 * 파일명은 word.txt
		 * */
		Scanner scan = new Scanner(System.in);
		WordManager wm = new WordManager();
		wm.addWord();
		int menu = -1;
		do {
			 System.out.println("1.단어등록|2.단어검색|3.단어수정");
			 System.out.println("4.단어출력|5.파일출력|6.종료");
			 System.out.print("선택 > ");
			 menu = scan.nextInt();
			 System.out.println();
			 
			 try {
				 switch(menu) {
				 case 1 : wm.insertWord(scan); break;
				 case 2 : wm.searchWord(scan); break;
				 case 3 : wm.modifyWord(scan); break;
				 case 4 : wm.printWord(); break;
				 case 5 : wm.filePrint(); break;
				 case 6 : break;
				 default : 
					 System.out.println("잘못된 메뉴입니다.");
				 }
			} catch (Exception e) {
				e.printStackTrace();
			}
			 System.out.println();
			 
		}while(menu != 6);
		System.out.println("프로그램 종료");
		
		
		
		
	}

}

package studentManager1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 매니저를 호출하기 위한 기능
		StudentManager sm = new StudentManager();
		int menu = 0;
		do {
			// 메뉴 넣기
			System.out.println("---menu---");
			System.out.println("1.학생등록|2.학생확인|3.학생검색");
			System.out.println("4.수강신청|5.수강철회|6.종료");
			System.out.print("메뉴 선택 >");
			
			menu = scan.nextInt();
			
			// 메뉴에 따른 분기 구현
			switch(menu) {
			case 1: sm.insertStudent(scan); break;
			case 2: sm.printStudent(); break;
			case 3: sm.searchStudent(scan); break;
			case 4: sm.registerSubject(scan); break;
			case 5: sm.cancelSubject(scan); break;
			case 6: break; 
				default: System.out.println("잘못된 메뉴 선택입니다."); break;
			}
		}while(menu != 6);
		System.out.println("종료");
		

	}

}

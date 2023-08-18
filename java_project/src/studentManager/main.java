package studentManager;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/* - 수강관리 프로그램
		 * 이젠아카데미 (인천지점)
		 * 홍길동 => 개인정보
		 * - 자바 8시간 6개월 (오미란) 월~금
		 * - 파이썬 3시간 1개월 (순이) 토       => 전체가 하나의 배열
		 * --------------------
		 * 이젠아카데미 (인천지점)
		 * 홍길순 => 개인정보
		 * - 자바 8시간 6개월 (오미란) 월~금
		 * - 파이썬 3시간 1개월 (순이) 토
		 * 
		 * --menu--
		 * 1. 학생등록
		 * 2. 학생확인(리스트)
		 * 3. 학생검색(학생정보+수강정보)
		 * 4. 수강신청
		 * 5. 수강철회
		 * 6. 종료
		 * 
		 * 
		 * 1. interface 생성 => program
		 * - 학생 리스트 출력기능 
		 * - 학생 등록 기능
		 * - 학생 검색 기능
		 * - 수강 신청 기능
		 * - 수강 철회 기능
		 * 
		 * 2. 클래스 구성
		 * - 메뉴는 메인 클래스에서 4 -> 3
		 * - class manager => 전체 구현 3 -> 4
		 * - class student => 학생 정보 2
		 * - class subject => 과목 정보 1
		 * 
		 * Student[] std = new[5];
		 * 학생은 여러개의 과목을 수강할 수 있어야 한다.
		 * 학생이 과목을 배열로 포함하고 있어야 한다. (멤버변수로)
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		Student s = new Student();
		Manager m = new Manager();
		int menu = 0;
		
		do {
			System.out.println("---menu---");
			System.out.println("1. 학생등록");
			System.out.println("2. 학생확인");
			System.out.println("3. 학생검색");
			System.out.println("4. 수강신청");
			System.out.println("5. 수강철회");
			System.out.println("6. 종료");
			System.out.println("-----------");
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: s.insertStudent(scan); break;
			case 2: m.printStudent(); break;
			case 3: s.searchStudent(scan); break;
			case 4: 
			case 5: 
			case 6: System.out.println("종료합니다."); break; 
			default: System.out.println("잘못된 메뉴 선택입니다."); break;
			}
			
			
		}while(menu != 6);
		
	}

}

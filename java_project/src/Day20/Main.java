package Day20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Map을 이용한 성적관리 프로그램 생성
		 * 스튜던트 매니저랑 비슷
		 * 
		 * 학생 클래스
		 * 과목추가, 과목삭제, 과목수정, 합계/평균계산
		 * 
		 * 전체 리스트
		 * 학생추가, 학생삭제, 학생정보수정, 학생과목추가, 학생과목수정, 학생별점수계산
		 * 
		 * 인터페이스
		 * 학생추가 / 학생삭제 / 학생검색 / 학생출력(전체 리스트) / 
		 * 학생점수추가 =>누구의 어떤 점수를 추가할 것인지 / 학생점수삭제=> 누구의 어떤 점수를?
		 * 학생점수수정 / 학생점수계산 
		 * 
		 * 메뉴
		 * 1. 성적 추가 (국어78) : 한 친구의 성적 추가
		 * 2. 성적 조회 (전체성적조회) : 합계, 평균 같이 조회
		 * 3. 성적 조회 (과목별 조회) : 서치 후 일치하는 과목 출력
		 * 4. 성적 수정 (서치 후 수정)
		 * 5. 성적 삭체 (서치 후 삭제)
		 * 6. 종료
		 * 
		 * CRUD
		 * C(create)생성 R(read)조회
		 * U(update)수정 D(delete)삭제
		 * */
		StdManager std = new StdManager();
		
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		do {
			System.out.println("1.학생추가 |2.학생출력 |3.학생검색");
			System.out.println("4.학생수정 |5.학생삭제 |6.점수추가");
			System.out.println("7.점수수정 |8.점수삭제 |9.종료");
			System.out.print("선택 > ");
			cnt = scan.nextInt();
			System.out.println();
			
			switch(cnt) {
			case 1 : std.addStudent(scan); break;
			case 2 : std.printStudent(); break;
			case 3 : std.searchStudent(scan); break;
			case 4 : std.updateStudent(scan); break;
			case 5 : std.deleteStudent(scan); break;
			case 6 : std.addGrade(scan); break;
			case 7 : std.updateGrade(scan); break;
			case 8 : std.deleteGrade(scan); break;
			case 9 : System.out.println("종료"); break;
			default : System.out.println("잘못 선택하셨습니다."); break;
			}
			System.out.println("-----------");
			System.out.println(); //줄바꿈
		}while(cnt != 9);
		
		
	}

}

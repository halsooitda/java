package studentManager1;

import java.util.Scanner;

public class StudentManager implements Program {
	// 멤버변수 student
	private Student[] std = new Student[5];
	private int stdCount; // 배열 인덱스
	
	@Override
	public void printStudent() {
		System.out.println("--전체 학생 정보--");
		for(int i=0; i<stdCount; i++) {
			std[i].stdPrint(); // 학생정보 출력
		}
		
	}

	@Override
	public void insertStudent(Scanner scan) {
		// 1명의 학생정보값을 입력받아서 객체 생성한 후 std 배열에 등록
		System.out.println("학생명 >");
		String name = scan.next();
		System.out.println("나이 >");
		int age = scan.nextInt();
		System.out.println("주소 >");
		String address = scan.next();
		System.out.println("전화번호 >");
		String phone = scan.next();
		
		// 입력받은 값으로 객체를 생성
		Student s = new Student(name, age, phone, address); // 객체 생성해서 배열에 넣어주기
		// 배열이 다 찼을 경우 배열복사
		if(stdCount == std.length) {
			// 빈배열
			Student[] tmp = new Student[stdCount+5]; // 현재 개수에서 5개 늘리기
			// 기존 배열을 빈배열로 복사 arraycopy
			System.arraycopy(std, 0, tmp, 0, stdCount);
			// 기존 std가 날아가고 std에 tmp 배열로 연결
			std = tmp; // std에 tmp를 덮어써라 배열 10개 됨 또 다 차면 이거 반복해서 15개되고...
		}
		// std 배열에 등록
		std[stdCount] = s;
		stdCount++; // 배열 번지 증가
				
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 검색할 학생이름을 입력받아서 배열에서 탐색 후 있다면 
		// 학생정보 + 수강정보를 출력
		System.out.println("검색할 이름 입력 >");
		String searchName = scan.next();
		
		// 탐색
		for(int i=0; i<stdCount; i++) {
			if(searchName.equals(std[i].getStdName())) {
				std[i].stdPrint();
				std[i].subPrint();
				return;
			}
		}
		System.out.println("검색한 이름이 없습니다.");
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		// 수강신청하고자 하는 학생의 이름 받기
		System.out.println("수강신청 학생명 > ");
		String name = scan.next();
		int index = -1;
		
		// 학생의 위치 찾기
		for(int i=0; i<stdCount; i++) {
			if(name.equals(std[i].getStdName())) {
				index = i;
				break;
			}
		}
		// 학생이 없다면
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		
		// 어떤 과목을 수강신청할지도 받기
		System.out.println("수강신청 과목 >");
		String sName = scan.next();
		
		// 수강 객체를 생성한 후 
		Subject sb = new Subject(sName);
		
		// 수강신청 학생 객체가 수강신청 메서드 호출
		std[index].insertSubject(sb);
	}

	@Override
	public void cancelSubject(Scanner scan) {
		// 수강철회하고자 하는 학생의 이름 받기
		int index = -1;
		System.out.println("수강철회 학생명 > ");
		String name = scan.next();
		
		for(int i=0; i<stdCount; i++) {
			if(name.equals(std[i].getStdName())) {
				index = i;
			}
		}
		// 못 찾았다면
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		// 어떤 과목을 수강철회할지 받기
		System.out.println("철회과목 >");
		String sName = scan.next();
		// 수강철회 메서드 호출
		std[index].deleteSubject(sName);
	}

}

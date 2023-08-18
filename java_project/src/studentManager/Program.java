package studentManager;

import java.util.Scanner;

public interface Program {
	/* 1. interface 생성 => program => class manager가 구현
	 * - 학생 리스트 출력기능 
	 * - 학생 등록 기능
	 * - 학생 검색 기능
	 * - 수강 신청 기능
	 * - 수강 철회 기능
	 * */
	
	void printStudent();
	void insertStudent(Scanner scan);
	void searchStudent(Scanner scan);
	void registerSubject(Scanner scan);
	void cancelSubject(Scanner scan);
	
}

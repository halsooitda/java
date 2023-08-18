package Day20;

import java.util.Scanner;

public interface StudentInterface {
	
	void addStudent(Scanner scan); //학생 추가
	void updateStudent(Scanner scan); //학생 수정
	void deleteStudent(Scanner scan); //학생 삭제
	void searchStudent(Scanner scan); //학생 검색
	void printStudent(); //학생 출력(전체 리스트)
	void addGrade(Scanner scan); //점수 추가 => 누가 어떤 점수를
	void deleteGrade(Scanner scan); //점수 삭제 => 누가 어떤 점수를
	void updateGrade(Scanner scan); //점수 수정
//	void calcGrade(); //점수 계산 (학생 합계를 Student 변수로 가지고 있기)
	
}

package Day20;

import java.util.ArrayList;
import java.util.Scanner;

public class StdManager implements StudentInterface {
	private ArrayList<Student> student = new ArrayList<>();
	
	public StdManager() {
		student.add(new Student("강서연", 16));
		student.add(new Student("류지영", 15));
		student.add(new Student("멍이", 12));
	}
	
	@Override
	public void addStudent(Scanner scan) {
		System.out.println("--학생 추가--");
		System.out.print("이름 > ");
		String name = scan.next();
		System.out.print("나이 > ");
		int age = scan.nextInt();

		student.add(new Student(name, age));
	}

	@Override
	public void deleteStudent(Scanner scan) {
		System.out.println("--학생 삭제--");
		System.out.print("이름 > ");
		String name = scan.next();
		//학생 존재시
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.remove(i);
				System.out.println("삭제되었습니다.");
				return;
			}
		}
		//학생 존재X
		System.out.println("존재하지 않는 학생입니다.");
	
	}

	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("--학생 검색--");
		System.out.print("이름 > ");
		String name = scan.next();
		//학생 존재시
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).printStd();
				return;
			}
		}
		//학생 존재X
		System.out.println("존재하지 않는 학생입니다.");

	}

	@Override
	public void printStudent() {
		//만약 학생이 없으면 조건도 넣으면 좋을 듯...
		System.out.println("--학생 출력--");
		if(student.size() <= 0) {
			System.out.println("학생이 없습니다.");
			return;
		}
		for(int i=0; i<student.size(); i++) {
			student.get(i).printStd();
		}
	}
	
	
	@Override
	public void updateStudent(Scanner scan) {
		System.out.println("--학생 수정--");
		System.out.print("이름 > ");
		String name = scan.next();
		
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				System.out.println("1.이름수정|2.나이수정");
				System.out.print("선택 > ");
				int cho = scan.nextInt();
				
				switch(cho) {
				case 1 : System.out.print("수정할 이름 > ");
						 String newName = scan.next();
						 student.get(i).setName(newName);
						 System.out.println("수정 완료");
						 return;
				case 2 : System.out.print("수정할 나이 > ");
						 int newAge = scan.nextInt();
						 student.get(i).setAge(newAge);
						 System.out.println("수정 완료");
						 return;
				}
			}
		}
		System.out.println("존재하지 않는 학생입니다.");
		
	}
	
	@Override
	public void addGrade(Scanner scan) {
		System.out.println("--점수 추가--");
		System.out.print("추가할 학생 이름 > ");
		String name = scan.next();
		//학생 존재시
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				System.out.print("추가할 과목 이름 > ");
				String sub = scan.next();
				System.out.print("점수 > ");
				int score = scan.nextInt();
				
				student.get(i).addSub(sub, score);
				return;
			}
		}
		//학생 존재X
		System.out.println("존재하지 않는 학생입니다.");
		
		
	}

	@Override
	public void deleteGrade(Scanner scan) {
		System.out.println("--점수 삭제--");
		System.out.print("삭제할 학생 이름 > ");
		String name = scan.next();
		//학생 존재시
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				System.out.print("삭제할 과목 이름 > ");
				String sub = scan.next();
				
				student.get(i).deleteSub(sub);
				return;
			}
		}
		//학생 존재X
		System.out.println("존재하지 않는 학생입니다.");
	}

	@Override
	public void updateGrade(Scanner scan) {
		System.out.println("--점수 수정--");
		System.out.print("수정할 학생 이름 > ");
		String name = scan.next();
		//학생 존재시
		for(int i=0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				System.out.print("수정할 과목 이름 > ");
				String sub = scan.next();
				System.out.print("점수 > ");
				int score = scan.nextInt();
				
				student.get(i).updateSub(sub, score);
				return;
			}
		}
		//학생 존재X
		System.out.println("존재하지 않는 학생입니다.");
		
	}

	

}

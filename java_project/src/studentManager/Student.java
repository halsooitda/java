package studentManager;

import java.util.Scanner;

public class Student implements Program {
	private String name, phone;
	private int age;
	private int cnt = 0; // 배열의 index
	Student[] std = new Student[10];
	Student[] sub = new Student[cnt];
	Manager m = new Manager();
	
	
	public Student() {} 
	public Student(String name, String phone, int age) {
		this.name = name;
		this.phone = phone;
		this.age = age;
	}


	@Override
	public void printStudent() {
		
	}
	
	// 등록
	@Override
	public void insertStudent(Scanner scan) {
		
			System.out.println("학생의 성함을 입력해주세요.");
			this.name = scan.next();
			System.out.println("학생의 전화번호를 입력해주세요.");
			this.phone = scan.next();
			System.out.println("학생의 나이를 입력해주세요.");
			this.age = scan.nextInt();
			
			Student s = new Student(name, phone, age);
			std[cnt] = s; // 한 학생의 이름,번호,나이 들어가있는 배열
			cnt++;
		
	}
	
	// 검색
	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("찾으실 학생의 성함을 입력하세요.");
		String search = scan.next();
		int count = 0;
		
		for(int i=0; i<std.length; i++) {
			if(search.equals(std[i].getName())) {
				std[i].printStudent();
				count++;
			}
		}
		if(count==0) {
			System.out.println("찾는 학생이 없습니다.");
		}
	}

	@Override
	public void registerSubject(Scanner scan) {
		
		
	}


	@Override
	public void cancelSubject(Scanner scan) {
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getCnt() {
		return cnt;
	}


	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	
	
	

	
}

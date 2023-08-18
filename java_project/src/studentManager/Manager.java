package studentManager;

import java.util.Scanner;

public class Manager implements Program {
	private String name, phone;
	private int age;
	
	@Override
	public void printStudent() {
		System.out.println("이젠아카데미(인천지점)");
		System.out.println("--학생정보--");
		System.out.println("이름:"+name+", age:"+age+"세");
		System.out.println("tel:"+phone);
		
	}

	@Override
	public void insertStudent(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchStudent(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelSubject(Scanner scan) {
		// TODO Auto-generated method stub
		
	}



}

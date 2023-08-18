package CyberLibrary;

import java.util.Scanner;

public class Librarian {
	//사서는 1명, 아이디/비번 미리 지정
	private String librarianID = "ezen";
	private String librarianPW = "0629";
	
	//생성자
	public Librarian() {}
	
	//로그인
	public boolean librarianLogin(Scanner scan) {
		System.out.println("< 관리자 로그인 > ");
		System.out.print("ID: ");
		String ID = scan.next();
		System.out.print("PW: ");
		String PW = scan.next();
		System.out.println();
		
		//아이디, 비밀번호 맞는지 확인
		if(ID.equals(librarianID) && PW.equals(librarianPW)) {
			return true;
		}else {
			System.out.println("--ID or PW가 틀렸습니다.--");
			System.out.println();
			return false;
		}
		
		
	}
	
	//getter/setter
	public String getLibrarianID() {
		return librarianID;
	}

	public void setLibrarianID(String librarianID) {
		this.librarianID = librarianID;
	}

	public String getLibrarianPW() {
		return librarianPW;
	}

	public void setLibrarianPW(String librarianPW) {
		this.librarianPW = librarianPW;
	}
	
	
	
	
}

package CyberLibrary;

import java.util.HashMap;

public class User {
	private String userName; 
	private String userID;
	private String userPW;
	private HashMap<Book, String> lendList = new HashMap<>(); //한 유저가 빌린 책 리스트
	
	public User() {}
	
	//회원가입을 위한 생성자
	public User(String userName, String userID, String userPW) {
		this.userName = userName;
		this.userID = userID;
		this.userPW = userPW;
	}
	
	//
	public void printLendList() {
		for(Book book : lendList.keySet()) {
			System.out.print(book); 
			System.out.println(" | "+lendList.get(book));
		}
	}
	
	@Override
	public String toString() {
		return "이름 : " + userName + " | ID : " + userID + " | Password : " + userPW ;
	}
	
	//getter/setter
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}

	public HashMap<Book, String> getLendList() {
		return lendList;
	}

	public void setLendList(HashMap<Book, String> lendList) {
		this.lendList = lendList;
	}
	
}

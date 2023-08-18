package CyberLibrary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
	private ArrayList<User> userList = new ArrayList<>();
	private String UserName;
	private int UserNum; //번지수
	
	public UserManager() {
		userList.add(new User("강서연", "kang", "0000"));
		userList.add(new User("류지영", "ryu", "1111"));
		userList.add(new User("장영준", "jang", "2222"));
	}
	
	//회원탈퇴
	public int DeleteUser(Scanner scan) {
		if(userList.get(UserNum).getLendList().size()<=0) {
			System.out.println("탈퇴하시겠습니까? Y/N");
			while(true) {
				System.out.print("선택 > ");
				String slt = scan.next();
				switch(slt) {
				case "y" :
				case "Y" :
					userList.remove(UserNum);
					System.out.println("--탈퇴되었습니다.--");
					return 7;
				case "n" :
				case "N" : return 0;
				default: System.out.println("--메뉴를 다시 선택해주십시오.--"); 
				}
			}
			
		}else {
			System.out.println("--대여한 책이 있어 탈퇴가 불가능합니다.--");
			return 0;
		}
	}
	   
	// 회원 대여기록 출력
	public void printUserLend() {
		for(User u : userList) {
			if(u.getLendList().size() > 0) {
				System.out.println("< "+u.getUserName()+" > ");
				u.printLendList();
				System.out.println("-------------");
				return;
				
			}
		}
		System.out.println("--대여한 회원이 없습니다.--");
	}
	
	// 회원 로그인
	public boolean userLogin(Scanner scan) {
		System.out.println("< 일반 회원 로그인 >");
		System.out.print("ID > ");
		String inputID = scan.next();
		System.out.print("PW > ");
		String inputPW = scan.next();
		System.out.println();
		
		for(int i=0; i<userList.size(); i++) {
			// userList를 get(i)로 확인한다.
			// userList의 ID와 PW가 각각 입력값과 같을 경우 실행.
			if(userList.get(i).getUserID().equals(inputID) && userList.get(i).getUserPW().equals(inputPW)) {
				System.out.println("==="+userList.get(i).getUserName()+"님 환영합니다.===");
				UserName=userList.get(i).getUserName();
				UserNum=i;
				return true;
			}
		}
		
		System.out.println("--ID or PW가 틀렸습니다.--");
		return false;
	}
	
	// 회원가입
	public void Join(Scanner scan) {
		System.out.println("< 회원가입 >");
		System.out.print("이름: ");
		String inputName = scan.next();
		System.out.print("ID: ");
		String inputID = scan.next();
		System.out.print("PW: ");
		String inputPW = scan.next();
		
		for(int i=0; i<userList.size(); i++) {
			// 입력한 ID 값이 userList의 userID 값에 있을 경우 실행
			if(userList.get(i).getUserID().equals(inputID)) {
				System.out.println("--사용중인 ID입니다.--");
				return;
			}
		}
		
		userList.add(new User(inputName, inputID, inputPW));
		System.out.println("--회원가입이 완료되었습니다.--");
	}
	
	// 회원정보 수정
	public void UpdateUser(Scanner scan) {
		// User 객체인 u가 UpdateUser 인자값 user와 같을 경우에만 정보 수정 가능
		System.out.println("< 회원 정보 수정 >");
		for(int i=0; i<userList.size(); i++) {
			System.out.println("1.ID수정 | 2.PW수정");
			System.out.print("선택 > ");
			int cho = scan.nextInt();
			
			switch(cho) {
			case 1 : System.out.print("새로운 ID: ");
					 String inputID = scan.next();
					 //아이디 중복 불가하게 하는 기능
					 for(int j=0; j<userList.size(); j++) {
							// 입력한 ID 값이 userList의 userID 값에 있을 경우 실행
							if(userList.get(j).getUserID().equals(inputID)) {
								System.out.println("--사용중인 ID입니다.--");
								return;
							}
						}
					 userList.get(UserNum).setUserID(inputID);
					 System.out.println("--수정 완료--");
					 return;
			case 2 : System.out.print("새로운 PW: ");
					 String inputPW = scan.next();
					 userList.get(UserNum).setUserPW(inputPW);
					 System.out.println("--수정 완료--");
					 return;
			}
		}
		
	}
	
	// 개인정보 확인
	public void PrintUser() {
	      
		System.out.println("------------< 회원 정보 확인 >--------------");
		System.out.println(userList.get(UserNum));
		for(Book b : userList.get(UserNum).getLendList().keySet()) {
			System.out.print(b);
			System.out.println(" | "+userList.get(UserNum).getLendList().get(b));
		}
		System.out.println("----------------------------------------");
	}
		
	// 전체 회원 정보 출력
	public void PrintAllUser() {
		System.out.println("--------------------------------------");
		for(User u : userList) {
			System.out.println(u);
			System.out.println("--------------------------------------");
		}
		
	}
	
	//대여
	public void LendBook(Book book) {
		LocalDateTime today=LocalDateTime.now();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		userList.get(UserNum).getLendList().put(book,dtf.format(today));
		
	}
	
	//반납
	public Book ReturnBook(Scanner scan) {
		System.out.println("< 도서 반납 >");
		System.out.print("반납할 책이름: ");
		scan.nextLine();
		String bookname=scan.nextLine();
		for(Book tmp:userList.get(UserNum).getLendList().keySet()) {
			if(tmp.getBookName().equals(bookname)) {
				userList.get(UserNum).getLendList().remove(tmp);
				return tmp;
			}
		}
		System.out.println("--존재하지 않은 책입니다.--");
		return null;
	}

	
	public ArrayList<User> getUserList() {
		return userList;
	}

	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public int getUserNum() {
		return UserNum;
	}

	public void setUserNum(int userNum) {
		UserNum = userNum;
	}
	
	
	
}

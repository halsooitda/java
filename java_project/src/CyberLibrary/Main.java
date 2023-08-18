package CyberLibrary;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		Librarian lib = new Librarian();
		BookManager book = new BookManager();
		UserManager user = new UserManager();
		
		int maxNum = book.getRemainNum().size(); //총 책 개수가 맥스
		ArrayList<Book> lit = new ArrayList<>(); //추천책 리스트
		for(Book tmp : book.getRemainNum().keySet()) {
			lit.add(tmp); //전체 책 다 넣음
		}
		
		int mainMenu = 0;
		do {
			System.out.println("\n"
					+ "⠀⠀⠀⣤⣼⡏⠉⠉⠉⠉⠉⠙⠓⠶⣤⣀⠀⢀⣤⠶⠚⠋⠉⠉⠉⠉⠉⣿⣤⣤⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⣿⢸⡇⠀⠐⠶⠶⠶⠤⣤⣀⡀⠉⢿⠋⠀⢀⣀⣠⡤⠤⠤⠤⠀⣿⠀⣿  ⠀\n"
					+ "⠀⠀⠀⣿⢸⡇⠀⢠⣤⣄⣀⣀⣀⣈⠉⠀⢸⠀⠘⠉⣁⣀⣀⣀⣀⣀⠀⣿⠀⣿⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⣿⢸⡇⠀⢀⣀⣀⡀⠈⠉⠉⠓⠀⢸⠀⠒⠋⠋⠉⠉⠉⠀⠀⠀⣿⠀⣿⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⣿⢸⡇⠀⢈⡉⠉⠉⠉⠛⠲⠦⠀⢸⠀⢠⠴⠖⠛⠋⠉⠉⠉⠀⣿⠀⣿⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⣿⢸⡇⠀⠈⠉⠉⠉⠛⠒⠶⣤⠀⢸⠀⣀⡤⠶⠒⠛⠛⠛⠉⠀⣿⠀⣿⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⣿⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⣿⠀⣿⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⣿⠘⠛⠛⠛⠛⠛⠛⠛⠲⠶⢤⣄⣸⣠⡤⠶⠖⠛⠛⠛⠛⠛⠛⠛⠀⣿⠀⠀⠀⠀\n"
					+ "⠀⠀⠀⠿⠿⠿⠿⠿⠷⠶⠶⠶⠶⠶⠶⠾⠿⠿⠶⠶⠶⠶⠶⠶⠶⠲⠶⠶⠶⠿⠀⠀⠀⠀\n"
					+ "");
			System.out.println("     < 인천광역시 전자도서관 >");
			System.out.println("1.관리자 | 2.일반 회원 | 3.프로그램 종료");
			System.out.print("선택 > ");
			mainMenu = scan.nextInt();
			System.out.println();//줄바꿈
			
			//메인메뉴
			int librarianMenu = 0;
			switch(mainMenu) {
			case 1: // 관리자 회원 case
				if(lib.librarianLogin(scan)) {
					while(librarianMenu != 3) {
						System.out.println("< 관리자 메뉴 >");
						System.out.println("1.도서관리 | 2.회원관리 | 3.로그아웃");
						System.out.print("선택 > ");
						librarianMenu = scan.nextInt();
						System.out.println();//줄바꿈
						
						switch(librarianMenu) {
						case 1: //도서관리
							int num = 0;
							while(num != 6) {
								System.out.println("< 도서관리 >");
								System.out.println("1.도서추가 | 2.도서수정 | 3.도서삭제");
								System.out.println("4.도서검색 | 5.도서목록 | 6.도서관리종료");
								System.out.print("선택 > ");
								num = scan.nextInt();
								System.out.println();//줄바꿈
								scan.nextLine();
								
								switch(num) {
								case 1 : book.InsertBook(scan); break;
								case 2 : book.UpdateBook(scan); break;
								case 3 : book.DeleteBook(scan); break;
								case 4 : book.SearchBook(scan); break;
								case 5 : book.PrintBook(); break;
								case 6 : System.out.println("--도서 관리 시스템을 종료합니다.--"); break;		
								default : System.out.println("--메뉴를 다시 선택해주십시오.--"); 
								}//switch end
								System.out.println();//줄바꿈
								
								
							}//도서관리 while 끝
							
							break;
						case 2: //회원관리
							System.out.println("< 회원관리 >");
							System.out.println("1.회원 목록 출력 | 2.대여 기록 확인");
							System.out.print("선택 > ");
							int memManMenu = scan.nextInt();
							
							switch(memManMenu) {
							case 1: user.PrintAllUser(); break;
							case 2: user.printUserLend(); break;	
							default : System.out.println("--메뉴를 다시 선택해주십시오.--"); 
							}
							break;
						case 3: //로그아웃
							System.out.println("--로그아웃 완료--");
							System.out.println();
							break;
						default: System.out.println("--메뉴를 다시 선택해주십시오.--");
						}
						System.out.println();
						
					}//사서 메뉴 선택 while 끝
				}//로그인 if문 끝
				break; //사서 케이스 브레이크
				
			case 2: // 일반 회원 case
				
				System.out.println("< 일반 회원 >");
				System.out.println("1.로그인 | 2.회원가입");
				System.out.print("선택 > ");
				int userChoice = scan.nextInt();
				System.out.println();//줄바꿈
				
				switch(userChoice) { //로그인 회원가입 스위치
				//로그인
				case 1 : 
					int ran = (int)(Math.random()*maxNum)+1; //로그인을 할때마다 랜덤수 발생
				    boolean flag = true; // 책 추천을 띄우는 flag, 1번만 실행하기 위해서 true로 설정
					
				    int userMenu = 0;
				    if(user.userLogin(scan)) { //로그인 되면
				    	while(userMenu != 7) { //로그아웃 할때까지
				    		if(flag == true) { //무조건 출력 
				    			System.out.println("📖 오늘의 책 추천 \n"+lit.get(ran)+"\n====================");
				    			flag = false; // 처음 로그인했을 때 한 번만 책 추천란을 띄우고, flag를 false로 바꾼다.
				    		}
				    		
				    		System.out.println("< 회원 메뉴 >");
				    		System.out.println("1.도서대여   |2.도서반납  |3.도서검색 |4.도서목록출력");
				    		System.out.println("5.회원정보수정|6.회원정보확인|7.로그아웃 |8.회원탈퇴");
				    		System.out.print("선택 > ");
				    		userMenu = scan.nextInt();
				    		System.out.println();
							
							switch(userMenu) {
							case 1 :
								//유저가 빌린 리스트
								//String 대여날짜
								HashMap<Book, String> map = user.
								getUserList().get(user.getUserNum()).getLendList();
								//북매니저에서 유저가 빌린 리스트를 받아서
								//이미 빌린 책인지 비교, 
								//빌린 적 있거나 존재 안 하는 책이면 null
								//아니면 스캐너로 적은 빌릴 책을 대여해줌
								Book tmp = book.LendBook(scan,map);
							
								if(tmp!=null) {
									user.LendBook(tmp); //빌리기 성공시 대여리스트에 넣어줌
								}
									break;
							case 2 : 
							    	Book temp = user.ReturnBook(scan);
							    	book.ReturnBook(temp);
								    break;
							case 3 : book.SearchBook(scan); break;
							case 4 : book.PrintBook(); break;
							case 5 : user.UpdateUser(scan); break;
							case 6 : user.PrintUser(); break;
							case 7 : System.out.println("--로그아웃 완료--"); break;
							case 8 : 
							    userMenu = user.DeleteUser(scan); break; //탈퇴시 처음 화면으로 돌아가기 위함
							default: System.out.println("--메뉴를 다시 선택해주십시오.--");
							}
							System.out.println();
							
						}//회원 메뉴 선택while끝
						
					}//로그인 if문 끝
					
					break; //로그인 브레이크
					
				//회원가입
				case 2 : 
					user.Join(scan); break;
				}
				System.out.println(); 
				
				break; //일반회원 케이스 브레이크
			
			case 3: System.out.println("--프로그램 종료--"); break;
			default: System.out.println("--메뉴를 다시 선택해주십시오.--");
			}
			System.out.println();
			
		}while(mainMenu != 3); //do~while end

		
	}

}

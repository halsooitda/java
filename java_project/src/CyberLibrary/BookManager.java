package CyberLibrary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class BookManager extends Book{
	
	HashMap<Book, Integer> remainNum = new HashMap<>();
	
	public BookManager(HashMap<Book, Integer> remainNum) {
		this.remainNum = remainNum;
	}
	public BookManager() throws IOException {
		setRemainNum0();
	}
	
	//이름,저자,회사,분류
//	public void setRemainNum() {
//		remainNum.put(new Book("Java의 정석",
//				"남궁성", "도우출판",
//				"IT"), 3);
//		remainNum.put(new Book("자바의 정석 기초편",
//				"남궁성", "도우출판",
//				"IT"), 2);
//		remainNum.put(new Book("이것이 자바다",
//				"신용권", "한빛미디어",
//				"IT"), 3);
//		remainNum.put(new Book("혼자 공부하는 자바",
//				"신용권", "한빛미디어",
//				"IT"), 3);
//		
//		remainNum.put(new Book("달러구트 꿈 백화점",
//				"이미예", "팩토리나인",
//				"소설"), 3);
//		remainNum.put(new Book("인간 실격",
//				"다자이 오사무", "민음사",
//				"소설"), 1);
//		remainNum.put(new Book("데미안",
//				"헤르만헤세", "민음사",
//				"소설"), 5);
//	}
	
	public void setRemainNum0() throws IOException {//txt 파일에 재고수를 입력 할것 
		String bookName = null;
		String bookWriter= null;
		String company= null;
		String type = null;
		int num = 1;
		int cnt = 0;
		BufferedReader br = new BufferedReader(new FileReader("booklist.txt"));
		while(true) {
			String line=br.readLine();
			if(line==null) break;
			switch(line) {
			case "IT": type="IT"; break;
			case "소설": type="소설"; break;
			case "에세이": type="에세이"; break;
			case "자기계발": type="자기계발"; break;
			default: 
				if(line.indexOf("-")==0) {
					bookName = line.substring(line.indexOf("-")+1);
				}else {
					bookWriter= line.substring(0,line.indexOf("/")-1);
					company=line.substring(line.indexOf("/")+2);
				}
				cnt++;
				break;
			}
			
			
			if(cnt==2) {
				remainNum.put(new Book(bookName, bookWriter, company, type), num);
				cnt=0;
			}
			
			
			
		}
		br.close();
	}

//	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	//책 추가
	public void InsertBook(Scanner scan) {
		System.out.println("< 도서 등록 > ");
		System.out.print("도서이름: ");
		String bookName=scan.nextLine();
		System.out.print("저자: ");
		String bookWriter=scan.next();
		System.out.print("출판사: ");
		String company=scan.next();
		System.out.print("분류: ");
		String type=scan.next();
		System.out.print("재고: ");
		int num=scan.nextInt();
		remainNum.put(new Book(bookName, bookWriter, company, type), num);
		
		System.out.println();
		System.out.println(" --도서 등록 완료--");
		System.out.println(" 이름:"+bookName);
		System.out.println(" 저자:"+bookWriter);
		System.out.println(" 출판사:"+company);
		System.out.println(" 분류:"+type);
		System.out.println(" 재고:"+num);
		System.out.println(" ---------------");
	}
	
	//책 수정
	public void UpdateBook(Scanner scan) {
		System.out.println("< 도서 정보 수정 >");
		System.out.print("수정 도서 이름: "); 
		String bookName=scan.nextLine();
		System.out.println();
		
		for(Book tmp:remainNum.keySet()) {
			if(tmp.getBookName().equals(bookName)) {
				int menu=-1;
				System.out.println("< 수정 항목 선택 >");
				System.out.println("1.저자|2.출판사|3.장르|4.재고");
				System.out.print("선택 > ");
				menu=scan.nextInt();
				switch(menu) {
				case 1:
					System.out.print("저자:");
					String bookWriter=scan.next();
					tmp.setBookWriter(bookWriter);
					System.out.println("--수정 완료--");
					break;
				case 2:
					System.out.print("출판사:");
					String company=scan.next();
					tmp.setCompany(company);
					System.out.println("--수정 완료--");
					break;
				case 3:
					System.out.print("분류:");
					String type=scan.next();
					tmp.setType(type);
					System.out.println("--수정 완료--");
					break;
				case 4:
					System.out.print("재고:");
					int num=scan.nextInt();
					remainNum.put(tmp, num);
					System.out.println("--수정 완료--");
					break;
				
				default:System.out.println("--잘못된 메뉴입니다.--"); break;
				}
				return;
			}
		}
		System.out.println("--존재하지 않는 책입니다.--");
		
	}
	
	//책 삭제
	public void DeleteBook(Scanner scan) {
		System.out.println("< 도서 삭제 >");
		System.out.print("삭제 도서 이름: ");
		String bookName = scan.nextLine();
		for(Book tmp:remainNum.keySet()) {
			if(tmp.getBookName().equals(bookName)) {
				remainNum.remove(tmp);
				System.out.println("--삭제 완료--");
				return;
			}
		}
		System.out.println("--존재하지 않는 책입니다.--");
	}
	
	//책 검색
	public void SearchBook(Scanner scan) {
		int menu=-1;
		System.out.println("< 검색 항목 선택 >");
		System.out.println("1.책이름|2.저자|3.출판사|4.장르");
		System.out.print("선택 > ");
		menu = scan.nextInt();
		scan.nextLine();
		int cnt=-1;
		switch(menu) {
		case 1: 
			//책 이름은 하나뿐이니까 if문을 둘 필요가 없음
			System.out.print("찾을 책의 이름: ");
			String bookName = scan.nextLine();
			for(Book tmp:remainNum.keySet()) {
				if(tmp.getBookName().equals(bookName)) {
					System.out.print(tmp);
					System.out.println(" | 재고:"+remainNum.get(tmp));
					return;
				}
			}
			System.out.println("--존재하지 않는 책입니다.--");
			break;
		case 2:  
			System.out.print("찾을 책의 저자: ");
			String bookWriter=scan.nextLine();
			for(Book tmp:remainNum.keySet()) {
				if(tmp.getBookWriter().equals(bookWriter)) {
					System.out.print(tmp);
					System.out.println(" | 재고:"+remainNum.get(tmp));
					cnt++;
				}
			}
			if(cnt==-1) {
				System.out.println("--존재하지 않는 책입니다.--");
			}
			break;
		case 3:  
			System.out.print("찾을 책의 출판사: ");
			String company=scan.nextLine();
			for(Book tmp:remainNum.keySet()) {
				if(tmp.getCompany().equals(company)) {
					System.out.print(tmp);
					System.out.println(" | 재고:"+remainNum.get(tmp));
					cnt++;
				}
			}
			if(cnt==-1) {
				System.out.println("--존재하지 않는 책입니다.--");
			}
			break;
		case 4:   
			System.out.print("찾을 책의 장르: ");
			String type=scan.nextLine();
			for(Book tmp:remainNum.keySet()) {
				if(tmp.getType().equals(type)) {
					System.out.print(tmp);
					System.out.println(" | 재고:"+remainNum.get(tmp));
					cnt++;
				}
			}
			if(cnt==-1) {
				System.out.println("--존재하지 않는 책입니다.--");
			}
			break;
		default:System.out.println("--잘못된 메뉴입니다.--");break;
		}
		
		
	}
	
	//책 목록 출력
	public void PrintBook() {
	      Scanner scan = new Scanner(System.in);
	      int listcnt = 1; //책번호
	      int cnt = 1; //10의 배수를 세는 카운트
	      boolean flag = true; //출력종료 선택 여부를 확인하는 변수. false=출력종료
	      
	      System.out.println("< 책 전체 목록 >");
	      for(Book tmp : remainNum.keySet()) {
	         if(flag == false){ // switch(slt)에서 출력 종료(2)를 선택했을 경우 
	            return;
	         }else if(cnt % 10 == 0 && flag == true) { //10의 배수일 때, 4번사용
	            System.out.print(listcnt+"."+tmp);
	            System.out.println("| 재고:"+remainNum.get(tmp));
	            listcnt++;
	            System.out.println();
	            System.out.println("1.다음페이지 | 2.출력종료");
	            System.out.print("선택 > ");
	            int slt = 0;
	            slt = scan.nextInt(); //다음페이지 or 출력 종료 선택 변수
	            System.out.println();
	            switch(slt) {
	            case 1:
	               if(remainNum.size() != cnt) { //책의 종류수와 cnt가 같지 않을 경우에만 같아지면 마지막페이지
	                  cnt++;
	               }else {
	                  System.out.println("--마지막 페이지입니다.--");
	               }
	               break;
	            case 2: flag = false; break;
	            default: System.out.println("--메뉴를 다시 선택해주십시오.--"); break;            
	            }
	         }else { //책의 번호가 10의 배수가 아닐 때
	            System.out.print(listcnt+"."+tmp);
	            System.out.println(" | 재고:"+remainNum.get(tmp));
	            listcnt++;
	            cnt++;
	         }
	            
	      }//for문 끝
	   }
	
	//도서 대여
	public Book LendBook(Scanner scan, HashMap<Book, String> map) {
		System.out.println("< 도서 대여 >");
		System.out.print("빌릴 책이름: ");
		scan.nextLine();
		String bookName = scan.nextLine();
		
		for(Book tmp:map.keySet()) {
			if(tmp.getBookName().equals(bookName)) {
				System.out.println("--이미 빌린 책입니다.--");
				return null;
			}
		}
		
		for(Book tmp:remainNum.keySet()) {
			if(tmp.getBookName().equals(bookName)) {
				int num=remainNum.get(tmp);
				if(num == 0) {
					System.out.println("--재고가 없습니다.--");
					return null;
				}
				num--;
				remainNum.put(tmp,num);
				System.out.println("--"+bookName+" 대여 완료--");
				return tmp;
			}
		}
		System.out.println("--존재하지 않는 책입니다.--");
		return null;
	}
	
	//도서 반납
	public void ReturnBook(Book book){
		for(Book tmp:remainNum.keySet()) {
			if(tmp.getBookName().equals(book.getBookName())) {
				int num = remainNum.get(book);
				num++;
				remainNum.put(tmp,num);
				System.out.println("--"+book.getBookName()+" 반납 완료--");
				return;
			}
		}
		System.out.println("--존재하지 않는 책입니다.--");
	}
	
	//getter/setter
	public HashMap<Book, Integer> getRemainNum() {
		return remainNum;
	}
	public void setRemainNum(HashMap<Book, Integer> remainNum) {
		this.remainNum = remainNum;
	}
}

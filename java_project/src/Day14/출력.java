package Day14;

import java.util.Scanner;

public class 출력 {

	public static void main(String[] args) {
		EzenComputer ez = new EzenComputer("홍길동", "010101", "23", "010-1234-5678", "인천", "자바", "2023-05-23~-2023-11-20");
		ez.printStudent();
		ez.printSchool();
		ez.printClass();
		
		ez.addClass("파이썬", "2023-07-01~-2023-08-01");
		ez.printClass();
		
		System.out.println("------------------");
		
		EzenComputer1 ec = new EzenComputer1("홍길동", "010101", "010-1234-5678", 23, "인천");
		ec.printCompany();
		ec.printInfo();
		ec.insertCourse("java", "6개월");
		ec.insertCourse("python", "2개월");
		ec.insertCourse("HTML", "2개월");
		ec.insertCourse("CSS", "2개월");
		ec.insertCourse("JS", "2개월");
		ec.insertCourse("JS", "2개월");
		ec.printCourse();
		System.out.println("---------------");
		EzenComputer1 ec1 = new EzenComputer1("홍길순","001101", "010-0000-0000", 24, "인천");
		ec1.printInfo();
		ec1.insertCourse("java", "6개월");
		ec1.printCourse();
		System.out.println("---------------");
		System.out.println();
		
		// 숙제 
		/* 배열로 5명의 학생 등록 후 
		 * - 이름으로 검색 (어느 지점(학원정보)의 무슨 과목(수강정보)을 듣고 있는지 출력)
		 * - 지점으로 검색 (지점(학원정보)에 있는 학생(학생정보)들 모두 출력)
		 * */
		// 2번지
		EzenComputer1 ec2 = new EzenComputer1("김민지", "020303", "010-1111-1111", 22, "강남");
		ec2.insertCourse("python", "2개월");
		// 3번지
		EzenComputer1 ec3 = new EzenComputer1("최가은", "990102", "010-2222-2222", 25, "강남");
		ec3.insertCourse("python", "2개월");
		// 4
		EzenComputer1 ec4 = new EzenComputer1("이윤서", "010710", "010-3333-3333", 23, "김포");
		ec4.insertCourse("java", "6개월");
		//5
		EzenComputer1 ec5 = new EzenComputer1("전채은", "010710", "010-4444-4444", 23, "김포");
		ec5.insertCourse("python", "2개월");
		//6
		EzenComputer1 ec6 = new EzenComputer1("강서연", "010710", "010-5555-5555", 23, "부산");
		ec6.insertCourse("java", "6개월");
		
		EzenComputer1[] std = new EzenComputer1[7];
		std[0] = ec;
		std[1] = ec1;
		std[2] = ec2;
		std[3] = ec3;
		std[4] = ec4;
		std[5] = ec5;
		std[6] = ec6;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어를 입력하세요.");
		String search = scan.next();
		int cnt = 0 ;
		
		System.out.println("검색어 "+search+"의 정보----");
		for(int i=0; i<std.length; i++) {
			if(search.equals(std[i].getName())) {
				std[i].printInfo(); // 학생정보
				std[i].printCompany(); // 학원정보
				std[i].printCourse(); // 수강정보
				System.out.println("----------------");
				cnt++;
			} else if(search.equals(std[i].getBranch())) {
//				std[i].printCompany(); // 학원정보
				std[i].printInfo(); // 학생정보
				System.out.println("----------------");
				cnt++;
			}
			for(int j=0; j<std[i].getCourse().length; j++) {
				if(std[i].getCourse()[j] != null) {
					if(search.equals(std[i].getCourse()[j])) {
						std[i].printInfo(); // 학생정보
						std[i].printCourse(); // 수강정보
						cnt++;
					}
				}
			}
			
		}
		
		if(cnt==0) {
			System.out.println("찾는 검색어가 없습니다.");
		}
		
//		System.out.println();
//		System.out.println("코스를 검색하십시오.");
//		String searchC = scan.next();
//		System.out.println(searchC+"과정의 수강학생 정보");
//		
//		for(int i=0; i<std.length; i++) { // 학생의 번지
//			for(int j=0; j<std[i].getCourse().length; j++) { // 수강과목의 번지, 해당 학생의 코스의 길이까지
//				if(std[i].getCourse()[j] != null) { // 해당 학생의 코스의 j번지가 안 비어있으면
//					if(searchC.equals(std[i].getCourse()[j])) {
//						std[i].printInfo();
//						
//					}
//				}
//			}
//		}
		
		
	}

}

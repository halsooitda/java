package Day17;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		/* 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받기.
		 * 입력받은 파일 중 이미지 파일을 검색하여 출력하는 코드 작성
		 * 이미지 파일 형식 (jpg, png, gif, jpeg)
		 * {"java.txt", "java.jpg", "method.png",
		 * "spring.pdf", "spring.gif"}
		 * --이미지 파일--
		 * java.jpg
		 * method.png
		 * spring.gif
		 * */
		//열 파일명 5개를 입력받아 배에 넣고 이미지 파일 검색
		
		Scanner scan = new Scanner(System.in);
		String[] fileName = new String[5];
		
		// 파일명 입력받고 배열에 넣고 이미지 파일 검색
		for(int i=0; i<fileName.length; i++) {
			System.out.print("파일명 입력 "+(i+1)+" > ");
			fileName[i] = scan.next();
		}
		System.out.println();
		
		// 이미지 파일 찾기
		System.out.println("--이미지 파일--");
		int cnt = 0; // 이미지 파일을 카운트 해주는 변수
		for(int i=0; i<fileName.length; i++) {
			String f = fileName[i].substring(fileName[i].indexOf(".")+1);
			if(f.equals("jpg")||f.equals("png")||f.equals("gif")||f.equals("jpeg")) {
				System.out.println(fileName[i]);
				cnt++;
			}
		}
		if(cnt==0) { // 0일시 이미지 파일 없음
			System.out.println("찾으시는 파일이 없습니다.");
		}
		
		
		
	}
	

}

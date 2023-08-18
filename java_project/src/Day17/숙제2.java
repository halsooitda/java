package Day17;

import java.util.Scanner;

public class 숙제2 {

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
		
		String[] fileName = {"java.txt", "java.jpg", "method.png",
				  "spring.pdf", "spring.gif"};
		
		
		String[] img = {"jpg","png","jpeg","gif"}; // 배열
		System.out.println("==이미지 파일 검색==");
		for(String tmpFile : fileName) {
			// 확장자만 추출
			String search = tmpFile.substring(tmpFile.indexOf(".")+1);
			if(isContains(img, search)) {
				System.out.println(tmpFile);
			}
		}
	
	}
	
	// isContains(배열, 찾는 값)
	// 기능 : 배열에서 찾는 문자열이 있는지 체크 : 있다면 true
	public static boolean isContains(String[] arr, String search) {
		// 배열이 없는 경우
		if(arr == null || arr.length == 0) {
			return false;
		}
		
		if(search == null) {
			return false;
		}
		
		for(String tmp : arr) {
			if(tmp.equals(search)) {
				return true;
			}
		}
		return false; // 위에 for문 외 나머진 모두 다 false
	}
	
	
	

}

package Day08;

public class String02 {

	public static void main(String[] args) {
		// 자바의정석.java 파일명과 확장자명을 분리하여 출력
		// 파일명 : 자바의정석
		// 확장자 : java
		
		String file = "자바의정석.java";
		
		System.out.println("파일명 : "+file.substring(0, file.indexOf(".")));
		System.out.println("확장자 : "+file.substring(file.indexOf(".")+1));
		  
		// file에서 java가 포함되어있으면 자바파일이라고 출력
		// contains : 해당글자가 포함되어있는지를 체크 boolean-true/false
		// 확장자 확인시 많이 쓴다. 해당 값이 있는지 없는지 추출할 때
		if(file.contains("java")) { 
			System.out.println("자바파일");
		}
		
		
		
		
	}

}

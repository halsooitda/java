package Day08;

public class String01 {

	public static void main(String[] args) {
		/* String 클래스 = 문자열을 다루는 클래스 => 참조변수
		 * String str = new String(); // 정석
		 * String str = "홍길동"; // 일반 자료형처럼 이용 가능.
		 * */ 
		String str = "Hello World~!!"; // 한글자마다 배열처럼 이용 가능.
		System.out.println(str);
		
		// length : 전체 글자의 길이
		System.out.println("--length--");
		System.out.println(str.length()); // 띄어쓰기도 글자로 포함, 한글자마자 한 배열에 들어있다는 것처럼 이용 가능.
		
		// charAt(index) : index번지에 있는 문자열을 반환
		System.out.println("--charAt(0)--");
		System.out.println(str.charAt(0));
		
		// subString : 문자열을 (내가 필요한 만큼만)추출
		System.out.println("--subString--");
		System.out.println(str.substring(3)); // 3번지부터 끝까지
		System.out.println(str.substring(3, 10)); // 3번지부터 10번지(10번지는 포함X)까지, 항상 끝번지는 포함X
		
		// str.compareTo(str1) : str문자열과 str1을 비교하여 같으면 0, 사전순으로 앞이면 -1, 뒤면 1 이동시켜 정렬시킴
		System.out.println("--compareTo--");
		System.out.println("b".compareTo("a")); // b가 a보다 뒤에 있어요 => 1출력
		System.out.println("a".compareTo("c")); // a는 b보다 앞에 있어요 => -1 / c랑 비교면 -2 (앞에 있는 칸만큼 -붙임)
		System.out.println("a".compareTo("a")); // 같으면 0
		
		// str.concat(str2) : 이어붙이기 (+ 연산자와 같은 의미) , DB에서도 쓰임
		System.out.println("--concat--");
		System.out.println("Hello".concat(" Apple~!!"));
		System.out.println("Hello "+"Apple~!!");
		
		// equals : 두 문자열이 같은지 확인 (대소문자 구분) 결과 => (같으면)true/false
		// 문자는 == 로 같은지 비교가 안됨.  
		// 참조변수를 == 로 비교하면 주소가 같은지 비교 (안의 값이 같은지 확인하는 게 아님) / equals는 내용이 같은지 확인
		System.out.println("--equals--");
		System.out.println("abc".equals("def")); // false
		System.out.println("abc".equals("abc")); // true
		
		// indexOf : 문자의 위치(index)를 찾아주는 기능, 찾는 문자가 없으면 -1을 리턴 (대소문자 구분)
		// lastIndexOf : 문자의 위치를 뒤에서부터 찾아주는 기능
		System.out.println("--indexOf--"); 
		System.out.println(str.indexOf("l")); // Hello World~!!, 앞에서부터 처음 걸린 l을 찾아줌
		System.out.println(str.lastIndexOf("l")); // Hello World~!!, 뒤에서부터 처음 걸린 l을 찾아줌
		
		System.out.println("--예제--");
		String email = "hello1234@naver.com";
		// 아이디를 추출 -> 출력
		// 처음부터 @ 전까지 substring/indexOf
		// substring(시작,끝)
		System.out.println(email.substring(0, email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")+1)); // @ 다음부터 끝까지 출력
		
		// trim : 불필요한 공백 제거
		System.out.println("--trim--");
		System.out.println("    Hello      ".trim()); 
		
		// toLowerCase(), toUpperCase() : 대소문자 변환
		System.out.println("--toLower/UpperCase--");
		System.out.println("toLowerCase".toLowerCase()); // 소문자 변환
		System.out.println("toLowerCase".toUpperCase()); // 대문자 변환
		
		// isEmpty() : 객체가 비어있는지 체크 비어있으면 true
		System.out.println("--isEmpty()--");
		System.out.println(str.isEmpty());
		
		// replace : 글자를 치환(변환)
		System.out.println("--replace--");
		System.out.println("Hello World".replace("World", "JAVA"));
		
		// split : 특정 값을 기준으로 나누기 => 배열로 리턴
		System.out.println("--split--");
		String str1 = "dog,cat,tiger"; // 쉼표를 기준으로 잘라서 배열로 나타내기
		String[] arr = str1.split(",");
		for(String tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		String[] arr2 = str1.split(""); // 한글자씩 나눠 놓기
		for(String tmp : arr2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("-------------");
		
		String num1 = "1"; // 문자 형식으로 받은 숫자
		String num2 = "2"; // 문자 형식으로 받은 숫자
		String sum = num1+num2;
		System.out.println(sum); // 1과 2를 붙임
		
		// parseInt : 문자를 숫자로 변환 
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		System.out.println(num3+num4);
		
		// toString : 객체를 문자로 변환 
		//String.valueOf() : 숫자를 문자로 변환
		// instanceof : 객체의 형이 일치하는지 체크
		int a = 12345;
		String s = String.valueOf(a);
		System.out.println(s instanceof String);
		
		
	}

}

package Day04;

public class For문02 {

	public static void main(String[] args) {
		/* 1~10까지 홀수의 합과 짝수의 합을 출력
		 * */
		int a = 0; // 짝수의 합계
		int b = 0; // 홀수의 합계
		for(int i=1; i<=10; i++) {
			if(i%2==0) { // 짝수일 때
				a += i;
			}else { // 홀수일 때
				b += i;
			}
		}
		System.out.println("짝수의 합="+a);
		System.out.println("홀수의 합="+b);
		// ctrl + space : 내가 쓴 변수명 나온다.
		
	}

}

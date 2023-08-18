package Day06;

public class While문 {

	public static void main(String[] args) {
		/* 반복문 중 하나 while문
		 * while(조건식) { 조건식이 true일 때 반복
		 * 실행문;
		 * 증감식;
		 * }
		 * */
		
		// for문을 이용하여 1~10까지를 출력
		System.out.println(">> for문을 활용하여 1~10까지 출력");
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		
		// while문을 이용하여 1~10까지 출력
		System.out.println(">> while문을 활용하여 1~10까지 출력");
		int cnt =1; // 반복변수의 선언
		while(cnt<=10) {
			System.out.print(cnt+" ");
			cnt++;
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println(">> while문을 활용하여 1~10까지 중 짝수만 출력");
		int i = 1;
		while(i<=10) {
			if(i%2==0) { // 짝수인지 확인
				System.out.print(i+" "); 
				// 짝수일 경우만 1씩 증가
			}
			i++;
		}
			
		
		
	}

}

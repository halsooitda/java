package Day05;

public class Continue {

	public static void main(String[] args) {
		/* Continue : pass, skip개념
		 * 1~10까지 출력
		 * 5만 빼고 출력(조건에 맞다면 패스해)
		 * */
		for(int i=1; i<=10; i++) {
			if(i==5) {
				continue; // 조건에 맞다면 건너뛰기
			}
			System.out.print(i+" "); // 5빼고 출력
		}
		
		System.out.println();
		System.out.println("----------------------");
		
		// 1~10까지 중 짝수만 출력 continue문을 이용하여 출력
		
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				continue; // 홀수면 넘어가라
			}
			System.out.print(i+" "); 
		}
		
		
	}

}

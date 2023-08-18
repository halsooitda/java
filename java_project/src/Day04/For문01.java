package Day04;

public class For문01 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * 종류 : for, while, do~while 
		 * - for, while문은 동작방식이 같다. => 조건이 맞지 않는다면 한번도 실행 안될 수 있음. 
		 * - do~while문은 두 방식과는 조금 다름 => 반드시 1번은 실행.
		 * 
		 * for(1초기화 ; 258조건식 ; 47증감식) { 조건식이 false일때까지 반복, 조건식에서 끝이 난다.
		 * 36실행문;
		 * }
		 * 초기화 : 조건식이나 실행문에서 사용하는 변수를 초기화
		 *      처음 실행시 한번만 수행 / 생략 가능
		 * 조건식 : 반복문의 반복을 결정하는 식 (true => 반복, false => 중지)
		 *      생략 가능(생략시 무조건 true)
		 * 증감연산식 : 조건식에서 사용되는 변수가 증가 / 감소되어 반복횟수를 조절
		 *      생략 가능
		 * */

		//1~10까지 출력하는 예제
		//초기화 사용할 변수 (i) 1부터 => int i = 1; / i는 index의 약자 순서, 번호를 매길 때 사용 
		//조건식 : 변수가 10이 될 때까지 => i<=10 (1~10까지)
		//증감식 : 1씩 증가 => i = i + 1; or i++
		//실행문 : i출력
		for(int i=1 ; i<=10 ; i=i+1) { // 증감식 i++도 가능 , 괄호부터 시작이 아니라 for문부터 시작이라고 생각
			System.out.print(i+" ");
		} //i의 범위는 괄호 안에서 끝나므로 재사용 가능하다.
		
		// 증감연산자 ++ (1증가) --(1감소)
		System.out.println(); // 줄바꿈
		System.out.println("-----------------"); 
		// 10~1까지 출력하는 예제
		for(int i=10 ; i>=1 ; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-----------------"); 
		// 2부터 10까지 2씩 증가 (짝수만 출력)
		for(int i=2 ; i<=10 ; i=i+2) { // i+=2
			System.out.print(i+" ");
		}	
		
		// 지역변수의 범위 { 선언   소멸 }
		
		System.out.println();
		System.out.println("-----------------"); 
		/* 1부터 10까지 짝수만 출력
		 * if문의 조건을 사용하여 조건(짝수)이 true일때만 출력
		 * */
		for(int i=1; i<=10; i++) {
			if(i%2==0) { //홀수 i%2==1
				System.out.println(i+" ");
			}else {
				System.out.println("홀수는 pass");
			}
		}
		
		System.out.println();
		// 1부터 10까지의 합계 (1+2+3+...+10=?)
		// 합계가 저장되어야 하는 변수가 필요
		int sum = 0; // 0이라는 값을 정해주지 않으면 더할 값이 없어서 에러나고, 만약 for문을 한번도 못한다면 sum의 값이 없기 때문에 출력할 때 에러난다.
		for(int i=1; i<=10; i++) {
			// sum : 0+1+2+3+...+10
			sum += i; // sum = sum + i;도 가능
		} System.out.println(sum); // for문 밖에서 sum을 선언하였기 때문에 출력 가능한 것임
		
		
		
	}

}

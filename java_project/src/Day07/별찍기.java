package Day07;

public class 별찍기 {

	public static void main(String[] args) {
		/* 별찍기
		 * *****     i=1, j=5
		 * *****     i=2, j=5
		 * *****     i=3, j=5
		 * *****     i=4, j=5
		 * *****     i=5, j=5
		 * 5*5개로 별찍기
		 * */
		
		for(int i=1; i<=5; i++) { // 줄수 5줄
			for(int j=1; j<=5; j++) { // 별 한개씩 총 별5개
				System.out.print("*");
			} 
			System.out.println(); // 5번 다 찍고나서 줄바꿈
		}
		
		System.out.println("--------------");
		
		/* *      i=1, j=1 (i는 줄, j는 별) i가 1일 때 별이 한번돌아
		 * **     i=2, j=2
		 * ***    i=3, j=3
		 * ****   i=4, j=4
		 * *****  i=5, j=5
		 * */
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		/* ***** i=1, j=5=6-i
		 * ****  i=2, j=4=6-i 
		 * ***
		 * **
		 * *
		 * */
		for(int i=5; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		} //내가 한 방법
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		/*     * i=1, o=4=5-i, j=1
		 *    ** i=2, o=3, j=2
		 *   ***
		 *  ****
		 * *****
		 * */
		for (int i = 1; i <= 5; i++) {
			// 공백
			for (int k = 1; k <= 5-i; k++) {
				System.out.print(" ");
			}
			// 별
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		System.out.println("--------------");
		/* 1 2 3  i = 줄
		 * 4 5 6  j = 숫자의 반복 횟수
		 * 7 8 9  
		 * */
		// 이중for문을 이용하여 나타내보기
		// cnt 증가해서 값을 나타냄
		int cnt = 0;
		for(int i=1; i<=3; i++) { 
			for(int j=1; j<=3; j++) {
				cnt++; // 3번 증가하고
				System.out.print(cnt+" ");
			}
			System.out.println(); // 줄 바꾸고 (cnt의 값은 그대로 저장되어있음 초기화x)
		}
		
		System.out.println();
		for(int i=1; i<=9; i++) {
			System.out.print(i+" ");
			if(i%3==0) {
				System.out.println();
			}
				
		}
		
		
		
	}

}

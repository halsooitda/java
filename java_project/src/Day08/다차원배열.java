package Day08;

public class 다차원배열 {

	public static void main(String[] args) {
		/* 2차원 배열
		 * 자료형 배열명[][] = new 자료형[길이][길이];
		 * */
		int arr[][] = new int[5][3]; // 행개수 5개, 열개수3개
		int cnt=1; // 값을 넣어줄 변수
		// 행개수 5개
		for(int i=0; i<arr.length; i++) { // 행이 0~4번지까지 총 5번 반복
			// 열개수 3개
			for(int j=0; j<arr[0].length; j++) { // 첫행의 length를 열로
				arr[i][j] = cnt;
				cnt++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(); // 한행마다 줄바꿈
		}
		
	}

}

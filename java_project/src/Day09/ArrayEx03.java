package Day09;

public class ArrayEx03 {

	public static void main(String[] args) {
		/* 1~45까지 숫자를 랜덤으로 6개 추출하는 로또번호 추출
		 * 오름차순 정렬되도록 출력
		 * */
		
		int arr[] = new int[6];
		
		System.out.println("--로또번호 추출--");
		// 배열의 0번지부터 끝번지까지 하나씩 값을 돌리겠다.
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45)+1; // 1~45 범위의 값을 배열에 넣기
			System.out.print(arr[i]+" "); // 출력
		}
		
		// 오름차순 정리
		for(int i=0; i<arr.length-1; i++) { // i는 첫번째 번지
			for(int j=i+1; j<arr.length; j++) { // j는 i다음 번지
				if(arr[i] > arr[j]) { // 뒤에 있는 수가 앞에 있는 수보다 작다면 자리바꾸기(오름차순)
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println();
		System.out.println("--오름차순 정렬 후--");
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		
		
	}

}

package Day07;

public class 숙제 {

	public static void main(String[] args) {
		/* 10개짜리 배열을 생성한 후
		 * 1~50사이의 랜덤수를 생성한 후 배열에 저장
		 * 배열을 출력하고 
		 * 합계, 평균, 최대, 최소값을 출력
		 * */
		int size = 10; 
		int[] arr = new int[size]; // arr의 초기값은 0
		int sum = 0;
		// int min = arr[0];을 여기서 하게 되면 arr[0]는 현재 값이 정해지지 않아 0인 상태임. 0이면 항상 작을 수밖에 없음.
		
		// 배열을 완성하는 중
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int max = arr[0];
		int min = arr[0]; 
		// 완성된 배열에서 탐색 / 최대값, sum
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		System.out.println("합계 > "+sum);
		double avg = (double)sum/arr.length;
		System.out.println("평균 > "+avg);
		System.out.println("최대값 > "+max);
		System.out.println("최소값 > "+min);
		
	
	}

}

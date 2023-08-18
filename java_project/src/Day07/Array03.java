package Day07;

public class Array03 {

	public static void main(String[] args) {
		int arr[] = new int[] {10,54,57,62,58,63,98,87};
		/* arr 배열의 합계, 평균, 최댓값, 최소값을 출력
		 * if로 비교하여 max, min 구하기
		 * Math.max, Math.min 이용
		 * */
		
		int max = arr[0];
		int min = arr[0]; // arr[0]에 값이 미리 담겨져있기 때문에 여기서 선언하고 사용 가능 아니면 값이 0이됨
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
//			if(arr[i]>max) {
//				max = arr[i]; 
//			}else if(arr[i]<min) {
//				min = arr[i];
//			}
			
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

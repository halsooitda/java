package Day10;


public class Method06 {

	public static void main(String[] args) {
		/* 메서드를 이용하여 배열을 활용
		 * */
		int arr[] = new int[] {11,3,5,7,4,8,9,6,2,10,1,15,16,12,14,13};
		printArray(arr); 
		System.out.println();
		System.out.println("---정렬 후 arr---");
		int arr2[] = sortArray1(arr); // 배열을 리턴
//		sortArray(arr); // 정렬이 안된 배열을 정렬시키기 -> 정렬된 상태로 배열이 저장됨
		printArray(arr); // 위에서 정렬된 배열 출력
		
		System.out.println();
		System.out.println("---arr2---");
		printArray(arr2); 
	}
	
	/* 주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 리턴타입 : 출력 => void
	 * 메서드명 : printArray
	 * 매개변수 : 정수 배열 (int arr[])
	 * 5개씩 한줄로 나열
	 * */
	public static void printArray(int arr[]) {
//		int cnt=0;
//		for(int i=1; i<=3; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print(arr[cnt]+" ");
//				cnt++;
//			}
//			System.out.println();
//		}
		
		for(int i=0; i<arr.length; i++) {
			if(i%5==0 && i!=0) { // 0번지도 5로 나누면 나머지가 0이므로
				System.out.println();
			}
			System.out.print(arr[i]+" ");
		}
		
	}
	
	/* 배열이 주어지면 배열을 오름차순 정렬하는 기능
	 * 리턴타입 : 리턴할 게 없음 => void 
	 * 메서드명 : sortArray
	 * 매개변수 : 정수 배열(int arr[])
	 * */
	public static void sortArray(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	/* 배열이 주어지면 배열을 오름차순 정렬하고 배열을 리턴 -> 굳이 리턴할 필요없다.
	 * 리턴타입 : 배열 자료형(int[])
	 * 메서드명 : sortArray1
	 * 매개변수 : 정수 배열(int arr[])
	 * */
	public static int[] sortArray1(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr; // 배열을 리턴한다.
	}
	
	
}

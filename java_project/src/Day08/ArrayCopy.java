package Day08;

public class ArrayCopy {

	public static void main(String[] args) {
		/* 배열은 길이를 가지고 있음.
		 * 한번 정해진 배열의 길이는 이후 추가 / 삭제 불가능.
		 * 배열의 길이를 늘리거나, 줄이거나 할 경우 배열 복사를 이용
		 * System.arraycopy(이전배열, 시작번지, 새배열, 시작번지, 개수);
		 * */
		
		// 배열 복사를 이용하여 배열을 복사하는 경우
		int arr[] = new int[] {1,2,3,4};
		int arr1[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr1[i] = arr[i]; // arr1로 arr의 값을 복사
		}
		System.out.println("--arr배열 출력--");
		for(int num : arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("--arr1배열 출력--");
		for(int num : arr1) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		int arr2[] = new int[arr.length*2]; // 원래 있던 거에서 두배 늘리기
		// arr => arr2 배열복사
		System.arraycopy(arr, 0, arr2, 1, arr.length); // 총 개수는 arr에 있는 거 전부 
		// arr의 0번지부터 붙여넣겠습니다, arr2의 1번지부터 붙여넣겠습니다 (0번지는 건너뜀)
		System.out.println("--arr2배열 출력--");
		for(int num : arr2) {
			System.out.print(num+" ");
		}
		
		
		
		
		
		
	}

}

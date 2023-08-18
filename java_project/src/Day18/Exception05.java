package Day18;

public class Exception05 {

	public static void main(String[] args) {
		int max = 10, min = 1, size = 10; //max나 size에 0이 들어가면 예외발생
		int arr[] = null; // 2번째 메서드에 들어갈 매개변수
		
		Exception05 ex05 = new Exception05();
		try {
			int arr1[] = ex05.creatArr(max, min, size);
			ex05.creatArr2(arr, max, min); //배열이 null
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
		
		
	}//메인
	
	// 메서드 생성
	/* 기능 : 배열의 길이(size)가 주어지면 길이만큼 배열을 생성해서 배열을 돌려주는 메서드
	 * max, min, size 를 매개변수로 입력받아 
	 * max, min의 범위의 랜덤값을 생성한 후 size 개수의 배열에 담고 리턴
	 * 
	 * size = 10, max = 50, min = 1
	 * 1~50까지의 랜덤수를 저장하는 배열[10] 생성 후 리턴
	 * 
	 * - size가 0보다 작거나 같다면 예외발생
	 * - max값이 0보다 작거나 같다면 예외발생
	 * */
	public int[] creatArr(int max, int min, int size) throws RuntimeException {
		if(size <= 0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		}
		if(max <= 0) {
			throw new RuntimeException("랜덤의 범위가 0보다 작습니다.");
		}
		
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(max-min+1))+min;
		}
		return arr; // 배열표시는 선언부에 있기 때문에 배열만 리턴하면됨
		
	}
	

	/* 배열을 받아서 배열에 랜덤값을 채우는 메서드
	 * 랜덤값 max, min, arr[] 은 매개변수로 받기
	 * - 배열이 null이면 예외발생
	 * - 배열의 길이가 0보다 작거나 같으면 예외발생
	 * */
	public void creatArr2(int arr[], int max, int min) throws RuntimeException {
		if(arr == null) {
			throw new RuntimeException("배열이 null입니다.");
		}
		if(arr.length <= 0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(max-min+1))+min;
		}
	}
	

}
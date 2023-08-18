package Day10;

public class Method07_lotto {

	public static void main(String[] args) {
		/* 로또 번호 생성 (1~45 랜덤으로 생성)
		 * 당첨확인
		 * */
		int lotto[] = new int[7]; // 당첨번호+보너스번호 => 랜덤생성
		int user[] = new int[6]; // 사용자번호
		
		// lotto 배열과 user 배열을 random값으로 채우기
		randomArray(lotto);
		randomArray(user);
		// print
		printArray(lotto);
		printArray(user);
		
		// 매개변수의 자리에 다른 값이 들어가도 자료형만 맞으면 에러가 나지 않음.
		int rank = lottoRank(lotto, user);
		if(rank == -1) {
			System.out.println("꽝");
		}else {
			System.out.println(rank+"등 당첨입니다.");
		}
	}
	
	/* 1. 번호를 랜덤으로 생성하는 기능
	 *    1~45까지 랜덤생성
	 * 매개변수 : X
	 * 리턴타입 : 랜덤값 1개 => int
	 * 메서드명 : random
	 * */
	public static int random() {
		return (int)(Math.random()*10)+1;
	}
	
	/* 2. 배열에 1번의 랜덤번호를 저장하는 기능
	 * 매개변수 : 배열 => int arr[]
	 * 리턴타입 : X => void
	 * 메서드명 : randomArray
	 * */
	public static void randomArray(int arr[]) {
		// 배열을 받아서 배열에 랜덤 값을 채우기
		// isContain
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = random();
//		}
		// user = 5 15 0 0 0 0 현재 다 비어있는 상태, isContain에서 현재 0~5번지까지 다 체크
		int cnt = 0; // i를 의미
		while(cnt < arr.length) {
			int r = random(); // 5 15
			if(!isContain(arr,r)) { // true = 중복된다. 버리고, false이면 넣는다
				arr[cnt] = r;
				cnt++; // =i++ , 중복값이 나오면 다음 번지로 못 넘어감
			}
		}
	}
	
	/* 3. 배열을 콘솔에 출력하는 기능
	 * 매개변수 : 배열 => int arr[]
	 * 리턴타입 : X => void
	 * 메서드명 : printArray
	 * */
	public static void printArray(int arr[]) { // 어떤 배열이 들어오든 상관없다. 6개든 7개든 상관없이
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	/* 4. 같은 값이 있는지 확인하는 기능
	 * 매개변수 : 배열, 랜덤값
	 * 리턴타입 : boolean
	 * 메서드명 : isContain
	 * */
	public static boolean isContain(int arr[], int random) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == random) {
				return true; // for문과 상관없이 리턴 만나면 바로 메서드 종료, 뒤에 있는 거 확인X
			}
		} 
		return false; // 중복값이 없다
	}
	
	/* 5. 등수를 알려주는 메서드
	 * 매개변수 : lotto[], user[]
	 * 리턴타입 : int => 등수를 리턴 / 여기서 찍어도 됨 void
	 * 메서드명 : lottoRank
	 * -- 당첨기준
	 * 6개일치 : 1등
	 * 5개일치+보너스 : 2등
	 * 5개일치: 3등
	 * 4개일치 : 4등
	 * 3개일치 : 5등
	 * 나머지는 꽝
	 * */ 
	public static int lottoRank(int lotto[], int user[]) {
		// lotto = 7개, user = 6개
		// lotto와 user는 개수가 다르기 때문에 바뀌어서 들어오면 error문구 내주기
		if(lotto.length <= user.length) {
			return -1; // 잘못들어왔다
		}
		int cnt = 0; // 일치 개수(보너스 제외)
		for(int i=0; i<user.length; i++) { // 보너스를 제외시키기 위해서 user의 길이만큼만 돌린다 (6회)
			if(isContain(user, lotto[i])) {
				cnt++; // lotto의 0~5번지 값 하나씩 주면서 user 전체 중에 있는지 확인, 보너스 제외
			}
		}
		// cnt : 보너스 제외 맞춘 개수
		switch(cnt) {
		case 6: return 1; // break; 필요X 리턴만나면 끝
		case 5: 
			if(isContain(user, lotto[lotto.length-1])) { // 마지막 번지 : 길이-1
				return 2;
			}else {
				return 3;
			}
		case 4: return 4;
		case 3: return 5;
		default: 
			return -1;
		
		}
	}
	
}

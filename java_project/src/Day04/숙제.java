package Day04;

public class 숙제 {

	public static void main(String[] args) {
		// 구구단 2단 출력
//		int a=0;
//		for(int i=2; i<=18; i=i+2) {
//			a= a+1;
//			System.out.println(2+"*"+a+"="+i);
//		}
		
		int n = 2; // 단에 해당하는 값을 저장 , 하나만 고치면 단수를 변경할 수 있도록
		for(int j=2; j<=9; j++){
			for(int i=1; i<=9; i++) { //n에 해당하는 값을 2~9까지 반복
				System.out.println(j+"*"+i+"="+(j*i));
			}
		} //이중 for문
		
	}

}

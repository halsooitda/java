package Day02;

public class 문제 {

	public static void main(String[] args) {
		/* 국어(kor) 영어(eng) 수학(math)
		 * 세 값의 합계와 평균을 구하려고 한다.
		 * 필요한 변수와 값을 넣고, 출력
		 * 
		 * */
		int kor=100, eng=90, math=80;
		int sum = kor+eng+math;
		System.out.println("합계="+sum);
		System.out.println("평균="+sum/3);
		
		double avg = (double)sum / 3; // 정수/정수=정수 이므로 소수점을 나타내려고 앞에 명시
		//자료형이 double이고, 나누는 값이 0이면 => (infinity)
		//자료형이 int이고, 나누는 값이 0이면 => 예외발생(Exception)
		System.out.println("합계="+sum + " 평균="+avg);
		
		//Math.method
		//반올림 (Math.round)
		System.out.println(Math.round(1.7));
		//Math.ceil :올림 Math.floor :버림
		System.out.println(Math.ceil(5.1234));
		System.out.println(Math.floor(5.1234));
		
		//Math.max : 큰값, Math.min : 작은값
		System.out.println(Math.max(10, 30));
		System.out.println(Math.min(10, 30));
		
		//Math.random : 0과 1사이의 아무값을 출력 ->자주 쓰인다.
		// 0 <= random < 1
		// 1~10까지의 랜덤수를 수출
		// (int)(Math.random()*n)+start; 
		int random = (int)(Math.random()*10)+1; 
		System.out.println(random);
		
		
		
	}

}

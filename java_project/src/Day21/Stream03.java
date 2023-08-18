package Day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream03 {

	public static void main(String[] args) {
		/* Student 클래스를 리스트로 구성하여 값을 add
		 * 3명만 추가
		 * */
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 60));		
		list.add(new Student("영이", 90));		
		list.add(new Student("순이", 100));
		
		//list를 스트림으로 구성하여 콘솔에 출력 ex) 홍길동 : 60
//		list.stream()
//		.forEach(n-> System.out.println(n.getName()+" : "+n.getScore()));

		//list를 스트림으로 구성해서 스트림 객체 s 생성
		Stream<Student> s = list.stream();
		s.forEach(n-> System.out.println(n)); //toString 이용방법
		
		list.stream().forEach(n-> {
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name+" : "+score);
		});
		
		System.out.println();
		//가변길이 매개변수로 리스트 구현
		List<Student> list2 = Arrays.asList(
				new Student("강감찬", 78),
				new Student("세종대왕", 80),
				new Student("이순신", 90)
				);
		
		//점수합계를 출력
		int sum = list2.stream().mapToInt(n->n.getScore()).sum(); //sum()은 int형에서만 가능
		System.out.println("합계 > "+sum);
	
		//인원수 출력
		long count = list2.stream().count();
		System.out.println(count+"명");
		
	}

}

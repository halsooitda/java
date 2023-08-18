package Day21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class 숙제 {

	public static void main(String[] args) {
		/* 여행사 상품이 있습니다
		 * 여행 비용은 15세 이상은 100만원, 그 미만은 50만원 계산
		 * 고객 3명이 패키지 여행을 떠난다고 했을 때 
		 * 1.비용계산 2.고객 명단 검색 => 출력
		 * 고객의 클래스를 생성하고 ArrayList로 고객관리
		 * 
		 * 예시) 고객 정보 => 고객명단
		 *  이름 : 이순신, 나이 : 40, 비용 : 100
		 *  이름 : 김유신, 나이 : 20, 비용 : 100
		 *  이름 : 홍길동, 나이 : 10, 비용 : 50
		 *  총 여행 비용 : 250
		 *  
		 *  20대 이상 고객 명단 => 이름순으로 정렬
		 *  이름 : 김유신, 나이 : 20, 비용 : 100
		 *  이름 : 이순신, 나이 : 40, 비용 : 100
		 * */ 
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer("이순신", 40));
		list.add(new Customer("김유신", 20));
		list.add(new Customer("홍길동", 10));
		
		//고객 명단
		list.stream().forEach(n-> System.out.println(n)); //toString 이용
		//총 여행 비용
		int sum = list.stream().mapToInt(n-> n.getPrice()).sum();
		System.out.println("총 여행 비용: "+sum+"만원");
		System.out.println(); //줄바꿈
		
		System.out.println("--20대 이상 고객 명단--");
		//오름차순 정렬
		list.sort(new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				//이름순으로 정렬
				//String 정렬 : compareTo 
				//Integer : o1 - o2
				return o1.getName().compareTo(o2.getName());
			}
		});
		//20대 이상 출력
		list.stream()
		.filter(n-> n.getAge()>=20)
		.forEach(n-> System.out.println(n));
	
	}

}

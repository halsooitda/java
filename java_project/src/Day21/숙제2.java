package Day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 숙제2 {

	public static void main(String[] args) {
		// Customer2 클래스를 이용한 객체 생성
		Customer2 lee = new Customer2("이순신", 40);
		Customer2 kim = new Customer2("김유신", 20);
		Customer2 hong = new Customer2("홍길동", 10);
		
		ArrayList<Customer2> list = new ArrayList<>();
		list.add(lee);
		list.add(kim);
		list.add(hong);
		
		int sum = 0;
		System.out.println("--고객명단--");
		//for문 이용시
		for(Customer2 tmp : list) {
			String name = tmp.getName();
			int age = tmp.getAge();
			int price = tmp.getPrice();
			sum += price;
			System.out.println(tmp); //toString 이용
		}
		System.out.println("총 비용:"+sum);	
		
		Collections.sort(list); //Comparable
		
		System.out.println();
		System.out.println("--20세 이상--");
		//20세 이상 데이터 출력 (오름차순)
//		list.sort(new Comparator<Customer2>() {
//
//			@Override
//			public int compare(Customer2 o1, Customer2 o2) {
//				//이름순으로 정렬
//				//String 정렬 : compareTo 
//				//Integer : o1 - o2
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		
		for(Customer2 tmp : list) {
			if(tmp.getAge() >= 20) {
				System.out.println(tmp);
			}
		}
//---------------------------------------------------------------------		
		System.out.println();
		System.out.println("--스트림을 이용한 방법--");
		//전체출력
		list.stream().forEach(n-> System.out.println(n));
		
		System.out.println();
		System.out.println("--고객명만 출력--");
		//원하는 요소를 출력할 때 map
		list.stream().map(m-> m.getName()).forEach(f-> System.out.println(f));
		
		System.out.println();
		System.out.println("--총 비용--");
		//총비용
		int total = list.stream().mapToInt(m-> m.getPrice()).sum();
		System.out.println("총 비용:"+total);
		
		System.out.println();
		System.out.println("--20세 이상--");
		//나이가 20세 이상인 데이터만 추출
		//Stream에서 sorted를 하려면 클래스 자체의 정렬이 구현되어 있어야 함.
		list.stream()
		.filter(c-> c.getAge()>=20)
		.sorted()
		.forEach(a-> System.out.println(a));

	}

}

class Customer2 implements Comparable<Customer2> {
	//멤버변수 선언
	private String name;
	private int age;
	private int price;
	
	//생성자
	public Customer2() {}
	public Customer2(String name, int age) {
		this.name = name;
		this.age = age;
		this.price = (age>=15)? 100:50;
	}
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//toString
	@Override
	public String toString() {
		return "고객명단 [name:" + name + ", age:" + age + ", price:" + price + "]";
	}
	
	@Override
	public int compareTo(Customer2 o) { 
		//내 이름과 들어오는 o의 이름을 비교
		return this.name.compareTo(o.name);
	}
	
}
package Day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map => 인터페이스. 객체 구현X => 반드시 구현 클래스로 객체를 생성
		 * 데이터를 묶어서 관리할 때 사용
		 * 주로 배열대신 사용
		 * 
		 * List : 배열과 동일
		 * - 값을 하나씩 저장
		 * - 순서를 보장 (index)
		 * - 중복 허용
		 * - 배열 대신에 가장 많이 사용하는 구조
		 * 
		 * Set 
		 * - 값을 하나씩 저장
		 * - 순서를 보장X (index 없음 - 번지가 없음 -> for문 사용X)
		 * - 중복 허용X (같은 자료가 입력되면 버려짐.)
		 * 
		 * Map
		 * - 값을 두개씩 저장 key/value 쌍으로 저장
		 * - key는 중복 불가능 / value는 중복 가능.
		 * - key가 중복되면 value는 덮어쓰기 됨.
		 * - 아이디/패스워드와 같이 묶어서 하나의 자료로 저장해야 할 때 사용
		 * 
		 * 배열은 기본 자료형, 클래스 자료형으로 구성가능.
		 * int arr[], String arr[], Student arr[]
		 * collection에서는 기본 자료형X 클래스 자료형으로만 구성 가능.
		 * 
		 * int -> Integer, String, 나머지 기본자료형들은 첫글자만 대문자로 변환하면
		 * 클래스가 됨. Byte, Boolean => 기본 자료형의 클래스들.
		 * 
		 * 만약 클래스를 지정하지 않으면 Object가 자동 설정됨.
		 * 
		 * List<클래스형> 객체명 = new 구현클래스<클래스형>();
		 * List => 구현 클래스 ArrayList(검색이 많은 케이스) 
		 *                 LinkedList(추가,삭제가 많은 케이스)
		 * 
		 * ArrayList => 배열과 비슷한 자료구조 값을 등록하는 형태
		 * 미리 길이를 지정하지 않음. 추가되면 늘어나고, 삭제되면 줄어드는 형태
		 * 추가, 삭제가 쉽다. => 검색이 쉽다.
		 * 
		 * LinkedList => 값을 중간에 끼워넣기, 중간에서 빼기 형태가 쉽다.
		 * 검색이 느리다.
		 * */
		List<Integer> list = new ArrayList<Integer>(); // 인터페이스로 구현
		ArrayList<Integer> list2 = new ArrayList<Integer>(); // 내 어레이리스트로 구현
		ArrayList list3 = new ArrayList(); // 자료형이 Object가 됨. -> 잘 쓰는 형태가 아님.
		
		//add() : 요소를 추가
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list); // 기본적인 toString 가지고 있음
		
		//size() : list의 총개수 = arr.length
		System.out.println(list.size());
		
		//문자열을 담을 수 있는 ArrayList 생성
		//문자를 5개 저장한 후 출력
		//총개수가 몇개인지도 출력
		ArrayList<String> slist = new ArrayList<String>();
		slist.add("h");
		slist.add("e");
		slist.add("l");
		slist.add("l");
		slist.add("o");
		System.out.println(slist);
		System.out.println("문자 개수 > "+slist.size());
		
		//값을 하나씩 찍어보기
		//get(index) : 값을 가져올 때.
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

//-------------------------------------------------		
		//리스트 생성하고, 1~10까지 저장한 후 출력
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			list4.add(i);
		}
		System.out.println(list4);
		//index의 번지는 0번지부터
		System.out.println(list4.get(0)); //0번지 하나 찍기
		
		//set(index, 값) : 값을 변경할 때. 
		list4.set(0, 7); //0번지 값을 7로 변경
		System.out.println(list4);
		
		//remove(index) : index번지의 값을 삭제
		//remove(Object) : Object의 요소(값)를 삭제
		list4.remove(0);
		System.out.println(list4); //0번지가 삭제되면 뒷번지의 값을 당겨와서 자동으로 채운다.
		Integer a = 9;
		list4.remove(a); //9를 삭제해라, 요소를 삭제, 반드시 Object를 넣어야 함. 숫자를 넣으면 인덱스로 인식
		System.out.println(list4);
		
		//contains(Object) : list에 값이 있는지 검사, true / false로 리턴
		System.out.println(list4.contains(a)); //a = 9, 확인하고 싶은 것을 넣어도 가능 ex)10 => true
		
		//clear() : 리스트 비움(요소 전부 삭제)
		list4.clear();
		System.out.println(list4);
		
		//isEmpty() : list가 비어있는지 체크, 비어있으면 true
		System.out.println(list4.isEmpty());
		
		
		System.out.println("--------------------------");
		//리스트 생성하고, 1~10까지 채운 후 출력 (for 이용하여 요소를 꺼내서 출력)
		ArrayList<Integer> num = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			num.add(i+1);
			System.out.print(num.get(i)+" ");
		}
		System.out.println(); //줄바꿈
		//요소에서 5를 삭제
		Integer b = 5;
		num.remove(b);
		//다시 출력 : 향상된 for문 사용
//		for(int i=0; i<num.size(); i++) {
//			System.out.print(num.get(i)+" ");
//		}
		for(int tmp : num) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("-----------------------------");
		
		//Iterator : index가 없는 값을 출력하기 위해 사용, 객체임
		/* list에서는 순서를 보장하기 때문에 get(i)를 사용하여 원하는 번지에 접근이 가능.
		 * set / map은 순서를 보장하지 않기 때문에 (일반)for문을 이용할 수 없음.
		 * 향상된 for, Iterator 처럼 순서와 상관없이 값을 가져올 수 있는 구문을 사용
		 * 향상된 for, Iterator는 map에서 직접 사용 불가능.
		 * */
		// Iterator<클래스형> 객채명 = 출력할객체.iterator();
		
		System.out.println(">> Iterator 출력"); 
		Iterator<Integer> it = num.iterator();
		while(it.hasNext()) { //hasNext() : 다음 요소가 있는지 체크, true / false (다음 번지에 값이 있느지)
			Integer tmp = it.next(); //next() : 다음 요소 가져오기
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		//indexOf(값) : 해당 값의 list의 index를 반환 / 없다면 -1 리턴
		Integer c = 9;
		System.out.println(num.indexOf(c)); //7번지에 있다.
		System.out.println(num.indexOf(b)); // b는 삭제했음 없으므로 -1 리턴
		
		//리스트 생성 후 값을 무작위로 5개만 추가
		num.clear();
		num.add(5);
		num.add(1);
		num.add(9);
		num.add(7);
		num.add(3);
		System.out.println(num);
		
		//Collections.sort() //오름차순만 가능
		//Collections.sort(num);
		//System.out.println(num);
		
		//sort(comparator를 구현한 객체) : 정렬
		//- 객체 : Comparator 인터페이스를 구현한 객체를 넣어야 함.(익명클래스를 사용)
		//- 비교(compare) 메서드를 구현하여 객체를 정렬
		//- compareTo : 사전상 앞에 있으면 -1, 같으면 0, 뒤에 있으면 1
		num.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				//compare 역할 : 결과가 -면 앞으로 보내고, +면 뒤로 보내는 역할
				//번지가 o1앞에 있는 객체, o2뒤에 있는 객체
				//o1-o2 : 오름차순, o2-o1 : 내림차순
				return o1-o2;
			}
			
		});
		System.out.println(num);
		
		
		
		
		
		
		
		
	}

}

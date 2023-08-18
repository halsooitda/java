package Day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		/* 스트림(Stream) : 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * - 실제 입력/출력이 표현된 데이터의 이상화된 흐름
		 * - 스트림은 자료에 대한 스트림을 생성하여 연산을 다 수행하면 스트림은 소모됨.
		 * - 다른 연산을 수행하려면 스트림을 다시 생성해야 함.
		 * - 스트림 연산은 기존 자료에 변경을 유발하지 않음.
		 * - 스트림 복사본을 이용하여 자료를 연산함.
		 * - 중간연산과 최종연산으로 구분이 됨.
		 * - 중간연산 : filter : 조건에 맞는 요소 추출, map : 변환 
		 * - 최종연산 : forEach(), sum()
		 * Arrays.stream : 배열 값을 이용한 스트림 생성
		 * list.stream() : 리스트에서 스트림 생성
		 * */ 
		int[] arr = {1,2,3,4,5,6,7,8};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		System.out.println("--스트림을 이용한 합계--");
		
		int total = Arrays.stream(arr).sum();
		System.out.println(total);
		long count = Arrays.stream(arr).count();
		System.out.println(count);
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		
		//점수 배열을 생성한 후 70점 이상(filter)만 합계(sum)
		int[] arr2 = {57,84,98,56,45,85,90};
		
		sum=0;
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i]>=70) {
				sum+=arr2[i];
			}
		}
		System.out.println(sum);
		
		int sum2 = Arrays.stream(arr2).filter(n-> n>=70).sum(); //변수가 하나면()생략가능, 실행문 하나면 {}생략가능
		System.out.println(sum2);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(6);
		list.add(8);
		list.add(5);
		list.add(9);
		list.add(8);
		list.stream().forEach(n-> System.out.print(n+" "));
		System.out.println();
		System.out.println("----------------");
		
		list.stream().forEach(System.out::println); //println->메서드명, 출력스트림::메서드 형태로 분리를 해서
		
		//distinct() : 중복제거, 중간연산
		System.out.println("--중복제거--");
		list.stream().distinct().forEach(System.out::println);
		
		//sorted() : 정렬, 중간연산
		System.out.println("--정렬--");
		list.stream().sorted().forEach(n-> System.out.print(n+" "));
		System.out.println();
		
		//중복제거하여 정렬
		System.out.println("중복제거 + 정렬");
		list.stream().distinct().sorted().forEach(n-> System.out.print(n+" "));
		System.out.println();
		
		//가변 매개변수 => 스트림 객체 생성
		Stream<Integer> s1 = Stream.of(10,20,50,40,90,30); //넣는만큼 배열처리
		int s = s1.mapToInt(n-> n.intValue()).sum(); //sum은 int stream에서만 사용가능
		System.out.println(s);
		//한번 소모된 스트림은 다시 사용할 수 없음.
		//s1.forEach(System.out::println); 
		
	}

}

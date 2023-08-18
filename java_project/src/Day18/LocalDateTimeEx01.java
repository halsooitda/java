package Day18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx01 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		String curr = today.toString();
		System.out.println(curr); // String 객체는 추출 가능
		
		System.out.println(curr.substring(0, curr.indexOf("T"))+" "+curr.substring(curr.indexOf("T")+1, curr.indexOf(".")));
		
		System.out.println("--------------------");
		String date = curr.substring(0, curr.indexOf("T")); // endIndex 포함X
		System.out.println(date);
		String time = curr.substring(curr.indexOf("T")+1, curr.indexOf(".")); // startIndex 포함O
		System.out.println(time);
		
		System.out.println("--------------------");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		System.out.println("--------------------");
		LocalDateTime sDate = LocalDateTime.of(2009, 9, 30, 8, 30); // 날짜 생성
		System.out.println(sDate.format(dtf));
		
	}

}

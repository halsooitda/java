package Day18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx01 {

	public static void main(String[] args) throws ParseException {
		/* 날짜를 문자열로 format 설정
		 * */
		Date date = new Date();
		System.out.println(date); // date 객체로 리턴
		
		// mm => 분, MM => 월
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss");  // SimpleDateFormat : 모양을 바꿔주는 역할
		String dateString = sdf.format(date);
		System.out.println(dateString);
		
		// 문자열을 날짜로
		String dateStr = "2023-11-05 11:05:05";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date2 = sdf2.parse(dateStr);
		System.out.println(date2);
		
	}

}

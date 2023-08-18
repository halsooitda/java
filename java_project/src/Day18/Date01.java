package Day18;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		/* 날짜/시간 클래스
		 * Date 클래스
		 * calendar 클래스 => 추상클래스
		 * 직접 객체를 생성할 수 없음. (싱클턴 방식)
		 * 이미 생성된 객체가 있다면 해당 객체 리턴, 없으면 생성해서 리턴
		 * getInstance() 메서드를 이용하여 인스턴스를 얻어옴.
		 * */
		
//		Date d = new Date();
//		d.getDate(); // depercated : 비권장, 곧 없어지는 메서드
//		System.out.println(d.getDate()); // 일
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH)+1;
		System.out.println(month); // month : 0~11까지 +1
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일(일~토)
		System.out.println(week);
		System.out.println(year+"-"+month+"-"+day);
		// hour, minute, second, ampm
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int ampm = now.get(Calendar.AM_PM);
		System.out.println("--------------------");
		
		//2023-06-19(월)
		//오후 7:45
		String weekStr = null;
		switch(week) {
		case 1 :  weekStr = "일"; break;
		case 2 :  weekStr = "월"; break;
		case 3 :  weekStr = "화"; break;
		case 4 :  weekStr = "수"; break;
		case 5 :  weekStr = "목"; break;
		case 6 :  weekStr = "금"; break;
		case 7 :  weekStr = "토"; break;
		default : break;
		}
		
		System.out.println(year+"-"+month+"-"+day+"("+weekStr+")");
		System.out.println((ampm==0? "오전":"오후")+" "+hour+":"+minute+":"+second);
		
//		switch(ampm) {
//		case 0 : System.out.println(hour+":"+minute+":"+second+"am"); break;
//		case 1 : System.out.println(hour+":"+minute+":"+second+"pm"); break;
//		default :
//		}
		
		
	}

}

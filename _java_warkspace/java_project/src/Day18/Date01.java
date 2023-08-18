package Day18;

import java.util.Calendar;

public class Date01 {

	public static void main(String[] args) {
		/* 날짜,시간 클래스
		 * Date 클래스
		 * Calendar 클래스 => 추상클래스
		 * 직접 객체를 생성할 수 없음 
		 * (싱글턴 방식)이미 생성된 객체가 있다면 해당 객체 리턴. 없으면 생성해서 리턴
		 * getInsstance() 매서드를 이용하여 인스턴스를 얻어 옴.
		 */
		
//		Date d = new Date();		
//		d.getDate(); // depercated : 비권장
//		System.out.println(d.getDate()); //일
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR); //연도
		System.out.println(year);
		int month = now.get(Calendar.MONTH)+1; //month : 0~11까지이므로 +1해줘야함 
		System.out.println(month); 
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = now.get(Calendar.DAY_OF_WEEK); //요일(일요일부터 시작 / 일~토)
		System.out.println(week);
		System.out.println(year+"-"+month+"-"+day);
		
		System.out.println("---------------------------");
		int hour = now.get(Calendar.HOUR); //hour 12시간
		System.out.println(hour);
		int hour2 = now.get(Calendar.HOUR_OF_DAY); //hour 24시간 
		System.out.println(hour2);
		int minute = now.get(Calendar.MINUTE); //minute
		System.out.println(minute);
		int second = now.get(Calendar.SECOND); //second
		System.out.println(second);
		int ampm = now.get(Calendar.AM_PM); //ampm
		System.out.println(ampm);
		
		System.out.println("---------------------------");
		
		//2023-06-19(월)
		
//		내가 한 거 
//		System.out.print(year+"-"+month+"-"+day);
//		
//		switch(week) {
//		case 1 : System.out.println("(일)"); break;
//		case 2 : System.out.println("(월)"); break;
//		case 3 : System.out.println("(화)"); break;
//		case 4 : System.out.println("(수)"); break;
//		case 5 : System.out.println("(목)"); break;
//		case 6 : System.out.println("(금)"); break;
//		case 7 : System.out.println("(토)"); break;		
//		}
			
		String weekStr = null;
		
		switch(week) {
		case 1 : weekStr ="(일)"; break;
		case 2 : weekStr ="(월)"; break;
		case 3 : weekStr ="(화)"; break;
		case 4 : weekStr ="(수)"; break;
		case 5 : weekStr ="(목)"; break;
		case 6 : weekStr ="(금)"; break;
		case 7 : weekStr ="(토)"; break;
				
		}
		System.out.println(year+"-"+month+"-"+day+weekStr);
		
		//오후 7:45		
		if(ampm==0) {
			System.out.print("오전"+" ");
		}else {
			System.out.print("오후"+" ");
		}
		System.out.println(hour+":"+minute);
	
	}
}

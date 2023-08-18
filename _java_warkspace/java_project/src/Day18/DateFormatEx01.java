package Day18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx01 {

	public static void main(String[] args) throws ParseException {
		/* 날짜를 문자열로 format 설정
		 */
		
		Date date = new Date(); //우리가 만든게 아니라 기본적으로 탑재된 클래스
		System.out.println(date);
		
		//mm => 분, MM => 월
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss");
		String dateString = sdf.format(date);
		System.out.println(dateString);
		
		//문자열을 날짜로
		String dataStr="1997-09-18 10:30:00";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date2 = sdf2.parse(dataStr);
		System.out.println(date2);
	}

}

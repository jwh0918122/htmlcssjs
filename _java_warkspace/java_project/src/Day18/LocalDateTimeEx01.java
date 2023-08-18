package Day18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today); //T를 기본으로 앞에는 연월일, 뒤에는 시분초(datd 객체에서는 추출 불가)
		
		System.out.println(today.getYear());
		String curr = today.toString(); //String 객체는 추출 가능
		System.out.println(curr);
//		System.out.println(curr.substring(curr.indexOf("T")+1,curr.indexOf("."))); //curr에 "T" 뒤부터 "." 앞까지 출력
		String date = curr.substring(0,curr.indexOf("T")); //endIndex 포함X
		System.out.println(date);
		String time = curr.substring(curr.indexOf("T")+1,
				curr.indexOf(".")); //startIndex 포함O
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		LocalDateTime sDate = LocalDateTime.of(1997, 9, 18, 10, 30);
		System.out.println(sDate.format(dtf));
		
		
	}

}

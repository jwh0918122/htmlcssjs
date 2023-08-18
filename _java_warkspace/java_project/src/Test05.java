import java.util.Calendar;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// 나의 주민번호를 활용하여 나이, 성별을 출력하시오

		int myYear = 97;
		int myGender = 2;
		String myGender1 = null;

		switch (myGender) {
		case 1:
			myYear=myYear+1900;
			myGender1="남";
			break;
		case 2:
			myYear=myYear+1900;
			myGender1="여";
			break;
		case 3:
			myYear=myYear+2000;
			myGender1="남";
			break;
		case 4:
			myYear=myYear+2000;
			myGender1="여";
			break;
		}
		Calendar now = Calendar.getInstance();
		int age=now.get(Calendar.YEAR)-myYear;
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+ myGender1);
		

	}

}

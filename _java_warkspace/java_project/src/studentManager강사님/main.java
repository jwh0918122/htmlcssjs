package studentManager강사님;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/* --menu--(메인에서 돌릴거임)
		 * 1. 학생등록
		 * 2. 학생확인(리스트)
		 * 3. 학생검색(학생정보, 수강정보)
		 * 4. 수강신청
		 * 5. 수강철회
		 * 6. 종료r
		 */		
		Scanner scan = new Scanner(System.in);
		
		//매니저를 호출하기 위한 기능
		StudentManager sm = new StudentManager();
		int menu = 0;
		do {
			//메뉴 담기
			System.out.println("---menu---");
			System.out.println("1.학생등록 |2.학생확인(리스트) |3.학생검색(학생,수강정보) |4.수강신청 |5.수강철회 |6.종료");
			System.out.println("> 메뉴 선택 :");
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 :sm.insertStudent(scan);
				break;
			case 2 :sm.printStudent();
				break;
			case 3 :sm.searchStudent(scan);
				break;
			case 4 :sm.insertsubject(scan);
				break;
			case 5 :sm.deleteSubject(scan);
				break;
			case 6 : break;
			default :
				System.out.println("잘못된 입력입니다.");
				break;
			}
			
			
		}while(menu != 6);
		System.out.println("종료~!!");
		
		
		scan.close();

	}

}

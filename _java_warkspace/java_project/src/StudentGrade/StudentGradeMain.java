//package StudentGrade;
//
//import java.util.Scanner;
//
//public class StudentGradeMain {
//	/* map을 이용한 성적관리 프로그램 생성
//	 * 한 학생의 성적을 관리한다 생각하고 해보고, 여러사람 한다 생각하고 해보기
//	 * 
//	 * 메뉴
//	 * 1. 성적추가 (국어 78)
//	 * 2. 성적조회 (전체 성적 조회) : 합계, 평균 같이 조회
//	 * 3. 성적조회 (과목별 조회) : 서치 후 일치하는 과목 출력
//	 * 4. 성적수정 (서치 후 수정)
//	 * 5. 성적삭제 (서치 후 삭제)
//	 * 6. 종료
//	 * 
//	 * CRUD
//	 * C(create) 생성
//	 * R(read) 조회
//	 * U(update) 수정
//	 * D(delete) 삭제
//	 * 
//	 */
//	public static void mai0n(String[] args) {
//		
//		
//		Scanner scan= new Scanner(System.in);
////		StudentGradeManager m = new StudentGradeManager();
////		m.gibon();
//		
//		int num;
//		do {
//			System.out.println("메뉴를 선택하세요 : ");
//			System.out.println("1.성적추가|2.전체 성적조회|3.과목 성적조회|4.성적수정|5.성적삭제|6.종료");
//			num=scan.nextInt();
//			
//			switch(num) {
//			case 1 : m.gradeadd(scan); break;
//			case 2 : m.allGradeprint(scan);	break;
//			case 3 : m.subjectGradeprint(scan);  break;
//			case 4 : m.gradeUpdate(scan); break;
//			case 5 : m.gradeDelete(scan); break;
//			case 6 : break;
//			default : 
//				System.out.println("잘 못 입력하셨습니다.");
//			}
//					
//		}while(num!=6);
//		
//		System.out.println("종료");
//	}
//
//}

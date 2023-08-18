//package StudentGrade2;
//
//import java.util.Scanner;
//
//import StudentGrade.StudentGradeManager;
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Scanner scan = new Scanner(System.in);
//		Manager m = new Manager(); 
//		
//		m.gibon(); //기본 학생들
//
//		int num;
//		do {
//			System.out.println("메뉴를 선택하세요 : ");
//			System.out.println("1.학생추가|2.학생삭제|3.학생수정|4.학생검색");
//			System.out.println("5.학생리스트|6.학생점수추가|7.학생전체점수|8.학생과목별점수");
//			System.out.println("9.점수수정|10.점수삭제|11.점수계산|12.종료");
//			num = scan.nextInt();
//
//			switch (num) {
//			case 1:
//				m.studentAdd(scan); //학생 추가
//				break;
//			case 2:
//				m.studentDel(scan); // 학생 삭제
//				break;
//			case 3: // 학생 수정
//				m.studentUpdate(scan);
//				break;
//			case 4:
//				m.studentSearch(scan); // 학생 검색
//				break;
//			case 5:
//				m.studentPrint(); // 학생 리스트
//				break;
//			case 6:
//				m.scoreAdd(scan); // 학생점수추가
//				break;
//			case 7:
//				m.allScorePrint(scan); // 학생전체점수
//				break;
//			case 8:
//				m.sub_Scoreprint(scan); // 학생과목별점수
//				break;
//			case 9:
//				m.scoreUpdate(scan); // 점수 수정
//				break;
//			case 10:
//				m.scoreDelete(scan); // 점수 삭제
//				break;
//			case 11:
//				m.scoreSumAvg(scan); // 점수 합계,평균
//				break;
//			case 12: // 종료
//				break;
//
//			default:
//				System.out.println("잘 못 입력하셨습니다.");
//			}
//
//		} while (num != 11);
//
//		System.out.println("종료");
//
//		scan.close();
//	}
//
//}

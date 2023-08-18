package studentManager;
/*수강관리 프로그램
 * Ezen 아카데미(인천지점)
 * 홍길동 => 개인정보
 * 자바 9시간 6개월 (오미란) 월~금
 * 파이썬 3시간 1개월 (순이) 
 */

//- package 생성 => studentManager
/*interface 생성 => program
 * - 학생 등록 기능
 * - 학생 검색 기능
 * - 수강 신청 기능
 * - 수강 철회 기능
 */
/* 클래스 구성 어떻게 하면 좋을지
 * 
 */

/* --menu--(메인에서 돌릴거임)
 * 1. 학생등록
 * 2. 학생확인(리스트)
 * 3. 학생검색(학생정보, 수강정보)
 * 4. 수강신청
 * 5. 수강철회
 * 6. 종료
 */
import java.util.Scanner;

public interface program {
	void printStudent();
	void insertStudent(Scanner scan);
	void searchStudent(Scanner scan);
	void insertsubject(Scanner scan);
	void deleteSubject(Scanner scan);
	

}

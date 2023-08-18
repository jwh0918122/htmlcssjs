package StudentGrade;

import java.util.Scanner;

/* map을 이용한 성적관리 프로그램 생성
 * 한 학생의 성적을 관리한다 생각하고 해보고, 여러사람 한다 생각하고 해보기
 * 
 * 메뉴
 * 1. 성적추가 (국어 78)
 * 2. 성적조회 (전체 성적 조회) : 합계, 평균 같이 조회
 * 3. 성적조회 (과목별 조회) : 서치 후 일치하는 과목 출력
 * 4. 성적수정 (서치 후 수정)
 * 5. 성적삭제 (서치 후 삭제)
 * 6. 종료
 * 
 * CRUD
 * C(create) 생성
 * R(read) 조회
 * U(update) 수정
 * D(delete) 삭제
 * 
 */
public interface StudentGradeInterface {

	//학생추가, 학생삭제, 학생검색, 학생출력(전체리스트),학생수정...?, 학생 점수 계산
	
	void studentAdd(Scanner scan); // 학생 추가
	
	void studentDel(Scanner scan); //학생 삭제
	
	void studentUpdate(Scanner scan); //학생 수정
	
	void studentSearch(Scanner scan); //학생 검색
	
	void studentPrint(); //학생 출력(전체리스트)
	
	void scoreAdd(Scanner scan); //학생 점수 추가 => 누구의 어떤 점수를 추가할 것인지?

	void allScorePrint(Scanner scan); //한 학생의 전체 성적 출력

	void sub_Scoreprint(Scanner scan); //한 과목 성적 출력

	void scoreUpdate(Scanner scan); //점수 수정

	void scoreDelete(Scanner scan); //학생 점수 삭제 => 누구의 어떤 점수를?
	
	void scoreSumAvg(Scanner scan); // 학생 점수 계산

	
}

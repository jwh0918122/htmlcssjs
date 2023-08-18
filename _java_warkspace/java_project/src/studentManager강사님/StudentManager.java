package studentManager강사님;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

import studentManager.program;

public class StudentManager implements program{
	//멤버변수 student
	private student[] std = new student[5];
	private int stdCount;
	
	@Override
	public void printStudent() {
		System.out.println("--전체 학생 정보--");
		for (int i = 0; i < stdCount; i++) { // null은 출력하면 안되니까 랭스 말고 카운트로
			std[i].stdprint(); // 학생 정보 출력
		}

	}

	@Override
	public void insertStudent(Scanner scan) {
		//1명의 학생 정보 값을 입력받아서 객체 생성한 후 std 배열에 등록
		System.out.println("학생명 >");
		String name = scan.next();
		System.out.println("나이 >");
		int age = scan.nextInt();
		System.out.println("주소 >");
		String address = scan.next();
		System.out.println("전화번호 >");
		String phone = scan.next();
		
		//입력받은 값으로 객체를 생성
		student s = new student(name, age, phone, address);
		//배열이 다 찼을 경우 배열복사
		if(stdCount==std.length) {
			//빈 배열
			student[] tmp = new student[stdCount+5]; //현재 개수에서 5개 늘리기
			//기존 배열을 빈 배열로 복사 arraycappy
			System.arraycopy(std, 0, tmp, 0, stdCount);
			//기존 std가 날아가고 std에 tmp 배열로 연결
			std = tmp;
			
		}
		//std배열에 등록
		std[stdCount]=s;
		stdCount++; //배열 번지 증가
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 검색할 학생이름을 입력받아 배열에서 탐색 후 있다면 학생 정보+수강정보를 출력
		System.out.println("검색 할 이름 > ");
		String searchName = scan.next();
//		int index = -1;
		//탐색
		for(int i=0; i<stdCount;i++) {
			if(searchName.equals(std[i].getStdName())) {
				std[i].stdprint(); //학생정보
				std[i].subprint(); //수강정보
				return;
			}
		}
		System.out.println("검색한 이름이 없습니다.");
//		if(index==-1) {
//				}
	}

	@Override
	public void insertsubject(Scanner scan) {
		// 수강신청하고자 하는 학생의 이름 받기
		System.out.println("수강신청 학생명 >");
		String name = scan.next();
		int index = -1;
		
		//
		for(int i=0;i<stdCount;i++) {
			if(name.equals(std[i].getStdName())) {
				index=i;
				break;
			}
		}
		//학생이 없다면
		if(index==-1) {
			System.out.println("학생 정보가 없습니다.");
			return;
		}
		//어떤 과목을 수강신청할지도 받기
		System.out.println("수강신청 과목 >");
		String sName = scan.next();
		
		//수강 객체를 생성한 후
		subject sb = new subject(sName);
		//수강신청 학생 객체가 수강신청 메서드 호출
		std[index].insertsubject(sb);
	}

	@Override
	public void deleteSubject(Scanner scan) {
		//수강철회하고자 하는 학생의 이름 받기
		int index = -1;
		System.out.println("수강철회 학생명 >");
		String name = scan.next();
		
		for(int i=0;i<stdCount;i++) {
			if(name.equals(std[i].getStdName())) {
				index=i;
			}
		}
		//못찾았다면
		if(index==-1) {
		 System.out.println("학생정보가 없습니다.");
		 return;
		}
		//어떤 과목을 수강철회 할지 받기
		System.out.println("철회 과목 >");
		String sName = scan.next();
		//수강 철회 메서드 호출
		std[index].deleteSunject(sName);
		
		
	}
	

}

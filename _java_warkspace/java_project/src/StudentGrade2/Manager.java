package StudentGrade2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import StudentGrade.StudentGradeInterface;

public class Manager implements StudentGradeInterface {

	ArrayList<Student> stu_List = new ArrayList<>();

	public void gibon() {
		// 기본 학생
		stu_List.add(new Student("장원희", "27","010-1111-1111", new HashMap<>()));
		stu_List.add(new Student("몽이", "7","010-2222-1111", new HashMap<>()));
		stu_List.add(new Student("영희", "30","010-3333-1111", new HashMap<>()));
		stu_List.add(new Student("이순신", "80","010-4444-1111", new HashMap<>()));
		stu_List.add(new Student("철수", "25","010-5555-1111", new HashMap<>()));

	}

	@Override
	public void studentAdd(Scanner scan) {
		// 학생 추가

		System.out.println("추가하실 학생의 이름,나이,전화번호를 입력하세요 : ");
		String name = scan.next();
		String age = scan.next();
		String phone=scan.next();

		Student s = new Student(name, age,phone,null);

		stu_List.add(s); 

	}

	@Override
	public void studentDel(Scanner scan) {
		// 학생 삭제

		System.out.println("삭제하실 학생의 이름을 입력하세요 : ");
		String name = scan.next();

		int cnt = 0;
		for (int i = 0; i < stu_List.size(); i++) {
			if (stu_List.get(i).getName().equals(name)) {
				stu_List.remove(i);
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("입력하신 학생은 존재하지 않습니다.");
		}

	}

	@Override
	public void studentSearch(Scanner scan) {
		// 학생 검색

		System.out.println("검색하실 학생의 이름을 입력하세요 : ");
		String name = scan.next();

		int cnt = 0;
		for (int i = 0; i < stu_List.size(); i++) {
			if (stu_List.get(i).getName().equals(name)) {
				cnt++;
				// 검색한 학생의 정보
				System.out.println(stu_List.get(i));

			}
		}

		if (cnt == 0) {
			System.out.println("입력하신 학생은 존재하지 않습니다.");
		}

	}
	
	
	@Override
	public void studentUpdate(Scanner scan) {
		// 학생 수정

		System.out.println("1.이름|2.나이|3.전화번호");
		System.out.println("수정하실 정보를 선택하세요 : ");
		int num = scan.nextInt();

		System.out.println("정보를 수정하실 학생의 이름을 입력하세요 : ");
		String name = scan.next();

		int cnt = 0;
		for (int i = 0; i < stu_List.size(); i++) {
			if (stu_List.get(i).getName().equals(name)) {

				switch (num) {
				case 1:
					System.out.println("변경하실 이름을 입력하세요 : ");
					String rename = scan.next();
					stu_List.get(i).setName(rename);

					break;
				case 2:
					System.out.println("변경하실 나이를 입력하세요 : ");
					String reage = scan.next();
					stu_List.get(i).setAge(reage);

					break;
				case 3:
					System.out.println("변경하실 번호를 입력하세요 : ");
					String rephone = scan.next();
					stu_List.get(i).setPhone(rephone);
					break;
				default:
					System.out.println("잘 못 입력하셨습니다.");

				}

			}
		}

	}

	@Override
	public void studentPrint() {
		// 학생 출력(전체리스트)

		System.out.println("<전체 학생 리스트>");
		for (int i = 0; i < stu_List.size(); i++) {
			System.out.println(stu_List.get(i));
		}

	}

	@Override
	public void scoreAdd(Scanner scan) {
		// 학생 점수 추가 => 누구의 어떤 점수를 추가할 것인지?

		System.out.println("점수를 추가하실 학생의 이름을 입력하세요 : ");
		String name = scan.next();

		String subjectScan;
		int scoreScan;

		int index = -1;

		for (int i = 0; i < stu_List.size(); i++) {
			if (stu_List.get(i).getName().equals(name)) {
				index = i;

			}
		}

		System.out.println("과목과 점수를 입력하세요 : ");
		subjectScan = scan.next();
		scoreScan = scan.nextInt();

		stu_List.get(index).subjectAdd(subjectScan, scoreScan);

		if (index == -1) {
			System.out.println("입력하신 학생은 존재하지 않습니다.");
		}

	}

	@Override
	public void allScorePrint(Scanner scan) {
		// 한 학생의 전체 성적 출력

		System.out.println("성적을 조회하실 학생의 이름을 입력하세요 : ");
		String name = scan.next();

		int cnt = 0;
		for (int i = 0; i < stu_List.size(); i++) {
			if (stu_List.get(i).getName().equals(name)) {

				// 검색한 학생의 성적 정보
				for (String tmp : stu_List.get(i).map.keySet()) {
					System.out.println("과목 : " + tmp + " / 점수 : " + stu_List.get(i).map.get(tmp));
				}
				cnt++;
			}

		}
		if (cnt == 0) {
			System.out.println("입력하신 학생은 존재하지 않습니다.");
		}
	}

	@Override
	public void sub_Scoreprint(Scanner scan) {
		// 한 과목 성적 출력

		System.out.println("성적을 조회하실 학생의 이름과 과목을 입력하세요 : ");
		String name = scan.next();
		String subject = scan.next();

		int cnt = 0;
		for (int i = 0; i < stu_List.size(); i++) {
			if (stu_List.get(i).getName().equals(name)) {
				cnt++;
				// sut_List 의 인덱스 i에 있는 map중 스캔받은 과목을 찾음
				for (String tmp : stu_List.get(i).map.keySet()) {
					if (tmp.equals(subject)) {
						// 검색한 과목의 성적 정보
						System.out.println("과목 : " + tmp + " / 점수 : " + stu_List.get(i).map.get(tmp));
					} else {
						System.out.println("입력하신 과목의 성적은 존재하지 않습니다.");
						break;
					}
				}

			}

		}
		if (cnt == 0) {
			System.out.println("입력하신 학생은 존재하지 않습니다.");
		}

	}

	@Override
	public void scoreUpdate(Scanner scan) {
		// 점수 수정

		System.out.println("점수를 수정하실 학생의 이름을 입력하세요 : ");
		String name = scan.next();

		System.out.println("과목과 변경하실 점수를 입력하세요 : ");
		String subject = scan.next();
		int score = scan.nextInt();

		int cnt = 0;
		for (int i = 0; i < stu_List.size(); i++) {
			if (stu_List.get(i).getName().equals(name)) {
				cnt++;
				// sut_List 의 인덱스 i에 있는 map중 스캔받은 과목을 찾음
				for (String tmp : stu_List.get(i).map.keySet()) {
					if (tmp.equals(subject)) {
						// 검색한 과목의 점수 수정
						// map은 key값이 중복되면 value는 덮어씌어지니까 아래처럼 해줌
						stu_List.get(i).map.put(subject, score);

					} else {
						System.out.println("입력하신 과목의 성적은 존재하지 않습니다.");
						break;
					}
				}

			}

		}
		if (cnt == 0) {
			System.out.println("입력하신 학생은 존재하지 않습니다.");
		}

	}

	@Override
	public void scoreDelete(Scanner scan) {
		// 학생 점수 삭제 => 누구의 어떤 점수를?

		System.out.println("점수를 삭제하실 학생의 이름과 과목을 입력하세요 : ");
		String name = scan.next();
		String subject = scan.next();

		int cnt = 0;
		for (int i = 0; i < stu_List.size(); i++) {
			if (stu_List.get(i).getName().equals(name)) {
				stu_List.get(i).subjectDelete(subject);
				cnt++;
//				 sut_List 의 인덱스 i에 있는 map중 스캔받은 과목을 찾음
//				for (String tmp : stu_List.get(i).map.keySet()) {
//					System.out.println(tmp);
//
//					if (tmp.equals(subject)) {
//						// 검색한 과목 삭제
//						stu_List.get(i).map.remove(tmp);
//						return; // 이게 없으면 맵의 값이 여러개이기 때문에 else로 가서 영원히 빠져나오지 못함
//
//					} else {
//						System.out.println("입력하신 과목의 성적은 존재하지 않습니다.");
//						return;
//					}
//				}

			}

		}
		if (cnt == 0) {
			System.out.println("입력하신 학생은 존재하지 않습니다.");
		}

	}

	@Override
	public void scoreSumAvg(Scanner scan) {
		// 학생 점수 총합계, 평균

		System.out.println("확인하실 학생의 이름을 입력하세요 : ");
		String name = scan.next();

		int cnt = 0;
		for (int i = 0; i < stu_List.size(); i++) {
			if (stu_List.get(i).getName().equals(name)) {
				cnt++;

				System.out.println("점수의 총 합계 : " + stu_List.get(i).scoreSum());
				System.out.println("점수의 평균 : " + stu_List.get(i).scoreAvg());

			}

		}
		if (cnt == 0) {
			System.out.println("입력하신 학생은 존재하지 않습니다.");
		}

	}

	
}

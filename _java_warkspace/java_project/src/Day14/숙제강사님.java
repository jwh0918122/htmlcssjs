package Day14;

public class 숙제강사님 {

	public static void main(String[] args) {
		//숙제
		/* 배열로 7명의 학생 등록 후 // 마음대로 등록
		 * -이름으로 검색(어느 지점(학원정보)의 무슨과목(수강정보)을 듣고있는지 출력)
		 * -지점으로 검색(지점(학원정보)에 있는 학생(학생정보) 모두 출력
		 */
		EzenComputer1 ec = new EzenComputer1("홍길동", "970918", 27, "010-1111-1111", "인천");
		ec.insertCourse("빅데이터", "1개월");
		EzenComputer1 ec2 = new EzenComputer1("장원희", "970919", 28, "010-2222-1111", "인천");
		ec2.insertCourse("java", "6개월");

		EzenComputer1[] std = new EzenComputer1[7];
		std[0] = ec;
		std[1] = ec2;
		std[2] = new EzenComputer1("강감찬", "1999-01-01", 24, "010-222-3333", "부천");
		std[2].insertCourse("java", "6개월");
		std[3] = new EzenComputer1("순이", "1999-01-01", 24, "010-222-5555", "부천");
		std[3].insertCourse("java", "6개월");
		std[3].insertCourse("파이썬", "12개월");	
		std[4] = new EzenComputer1("철수", "1999-01-01", 24, "010-222-6666", "인천");
		std[4].insertCourse("java", "6개월");
		std[5] = new EzenComputer1("영철", "1999-01-01", 24, "010-222-7777", "인천");
		std[5].insertCourse("파이썬", "2개월");
		std[6] = new EzenComputer1("이순신", "1999-01-01", 24, "010-222-8888", "부천");
		std[2].insertCourse("HTML", "3개월");

		// 학생 이름의 학원,수강정보
		String searChName = "순이";
		int cnt = 0;
		System.out.println("<" + searChName + "님의 search 정보>");
		for (int i = 0; i < std.length; i++) {
			if (searChName.equals(std[i].getName())) { // String은 ==로 비교할 수 없다.
				std[i].printComany(); // 학원정보
				std[i].printInfo(); // 학생정보
				std[i].printCourse(); // 수강정보
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("찾는 학생이 없습니다.");
		}

		// 인천 지점의 학생들 모두 search (지점정보, 학생정보)
		String searchBranch = "인천";

		System.out.println("<" + searchBranch + "지점의 search 정보>");
		int bran_cnt = 0;
		for (int i = 0; i < std.length; i++) {
			if (searchBranch.equals(std[i].getBranch())) {
				std[i].printInfo(); // 학생정보
				bran_cnt++;
			}
		}
		if (bran_cnt == 0) {
			System.out.println("찾는 지점이 없습니다.");
		}

		// 자바를 듣고있는 학생 검색 (내가 한거)
		String searchCourse = "java";

		System.out.println("<" + searchCourse + "과목의 search정보>");
		int course_cnt = 0;
		for (int i = 0; i < std.length; i++) {
			for (int j = 0; j < std[i].getCourse().length; j++) {
				if (searchCourse.equals(std[i].getCourse()[j])) {
					std[i].printInfo();
					course_cnt++;
				}
			}
		}
		if (course_cnt == 0) {
			System.out.println("검색 결과가 없습니다.");
		}
				
		//자바를 듣고있는 학생 검색 강사님		
//		String searchCourse = "java";
//		System.out.println("<" + searchCourse + "과목의 search정보>");
//		int course_cnt=0;		
//		while(course_cnt<std.length) {
//			for(int i=0;i<std[course_cnt].getCourse().length;i++) {
//				if(std[course_cnt].getCourse()[i] != null) {
//					if(searchCourse.equals(std[course_cnt].getCourse()[i])) {
//						std[course_cnt].printComany();
//						std[course_cnt].printInfo();
//						std[course_cnt].printCourse();
//					}
//				}
//			}
//			course_cnt++;
//		}
		
		
		
		

	}
}

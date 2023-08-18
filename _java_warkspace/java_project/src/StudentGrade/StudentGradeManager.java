//package StudentGrade;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
////public class StudentGradeManager implements StudentGradeInterface {
//	
//	
//	
//	ArrayList<Student> arrs = new ArrayList<>(); //학생(성적을 담고있는) 리스트
//	
//	public void gibon() {
//		
//
//		
//		arrs.add(new Student("장원희",new Grade().mapadd("과학",100)));
////		Student 장원희 = new Student("장원희",new Grade().mapsang("과학",100));
////		Student 장원희 = new Student("장원희",new Grade().mapsang("과학",100));
////		Student 장원희 = new Student("장원희",new Grade().mapsang("과학",100));
////		Student 장원희 = new Student("장원희",new Grade().mapsang("과학",100));
//		
//		//return arrs;
//	}
//	
//	@Override
////	public void gradeadd(Scanner scan) {
//		// 성적 추가
//		
////		StudentGradeManager sgm = new StudentGradeManager();
//		
////		ArrayList<Student> ggg = sgm.gibon();
//		
//		arrs.get(0).mapadd(null, 0);
//		
//		System.out.println("성적을 추가할 학생의 이름을 입력하세요 : ");
//		String name = scan.next();
//
//		String subject;
//		int score;
//
//		int cnt = 0;
//		for (int i = 0; i < arrs.size(); i++) {
//			if (arrs.get(i).equals(name)) {
//				System.out.println("추가하실 과목과 성적을 입력하세요 :  ");
//				subject = scan.next();
//				score = scan.nextInt();
//
//				arrs.get(i).mapadd(subject, score); // 스튜던트가 그레이드 상속받은거니까 그레이드 따로 객체생성안하고 그냥 씀
//				cnt++;
//			}
//		}
//		
////		for (int i = 0; i < ggg.size(); i++) {
////			if (ggg.get(i).getName().equals(name)) {// 입력받은 이름이 학생리스트에 있다면
////				System.out.println("추가하실 과목과 성적을 입력하세요 : ");
////
////				subject = scan.next();
////				score = scan.nextInt();
////
////				ggg.get(i).mapadd(subject, score); // 스튜던트가 그레이드 상속받은거니까 그레이드 따로 객체생성안하고 그냥 씀
////				cnt++;
////
////			}
////			for (String tmp : ggg.get(i).getGrade().keySet()) {
////				System.out.println("과목 : " + tmp + " / 점수 : " + ggg.get(i).getGrade().get(tmp));
////			}
//
//		}
//		if (cnt == 0) {
//			System.out.println("입력하신 학생은 존재하지 않습니다.");
//		}
//
//	}
//
//	@Override
//	public void allGradeprint(Scanner scan) {
//		// 학생의 전체 성적 출력
//
////		StudentGradeManager sgm = new StudentGradeManager();
////
////		ArrayList<Student> ggg = sgm.gibon();
//
//		System.out.println("전체 성적을 조회할 학생의 이름을 입력하세요 : ");
//		String name = scan.next();
//
//		int cnt = 0;
//
//		for (int i = 0; i < ggg.size(); i++) {
//			if (ggg.get(i).getName().equals(name)) {// 입력받은 이름이 학생리스트에 있다면
//				System.out.println("--" + name + "의 전체 과목 성적--");
//
//				for (String tmp : ggg.get(i).getGrade().keySet()) {
//					System.out.println("과목 : " + tmp + " / 점수 : " + ggg.get(i).getGrade().get(tmp));
//				}
//				cnt++;
//
//			}
//
//		}
//
//		if (cnt == 0) {
//			System.out.println("입력하신 학생은 존재하지 않습니다.");
//		}
//
////		for(int i=0;i<StudentList.size();i++) {
////			System.out.println(StudentList.get(i).getName());
////			StudentList.get(i).mapPrint();
////			
////		}
//	}
//
//	public void mapPrint() {
//		// 한 학생의 과목과 점수 출력
//		
//		
//		for(String tmp : .keySet()) {
//			System.out.println(tmp+" : "+gradeList.get(tmp));
//		}
//		
//	}
//	
//	@Override
//	public void subjectGradeprint(Scanner scan) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void gradeUpdate(Scanner scan) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void gradeDelete(Scanner scan) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	
//
//}

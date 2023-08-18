package Day14;

import java.util.Scanner;

public class EzenComMain1숙제 {

	public static void main(String[] args) {
		EzenComputer1 ec=new EzenComputer1("장원희","970918",27,"010-1111-1111","인천");
		EzenComputer1 ec2=new EzenComputer1("장원희2","970919",28,"010-2222-1111","인천");
		EzenComputer1 ec3=new EzenComputer1("장원희3","970920",29,"010-3333-1111",",부천");
		EzenComputer1 ec4=new EzenComputer1("장원희4","970921",30,"010-4444-1111","강남");
		EzenComputer1 ec5=new EzenComputer1("장원희5","970922",31,"010-5555-1111","부산");
		EzenComputer1 ec6=new EzenComputer1("장원희6","970922",31,"010-5555-1111","인천");
		EzenComputer1 ec7=new EzenComputer1("장원희7","970922",31,"010-5555-1111","부산");
		ec.insertCourse("자바", "6개월");
		ec2.insertCourse("파이썬", "3개월");
		ec3.insertCourse("자바", "6개월");
		ec4.insertCourse("빅데이터", "1개월");
		ec5.insertCourse("자바", "6개월");
		ec6.insertCourse("빅데이터", "1개월");
		ec7.insertCourse("자바", "6개월");
		
//		ec.printInfo();
//		ec.printCourse();
//		System.out.println("----------");
//		ec4.printInfo();		
//		ec4.printCourse();
		
//		System.out.println("---------");
//		EzenComputer1 ec2 = new EzenComputer1("장원희", "010555", "강남");
//		ec2.printInfo();
//		ec2.insertCourse("파이썬", "3개월");
//		ec2.printCourse();
		
		//숙제
		/* 배열로 7명의 학생 등록 후 // 마음대로 등록/////////////////////////////////////////////
		 * -이름으로 검색(어느 지점(학원정보)의 무슨과목(수강정보)을 듣고있는지 출력)////////////////
		 * -지점으로 검색(지점(학원정보)에 있는 학생(학생정보) 모두 출력
		 */
		EzenComputer1[] std = new EzenComputer1[7];
		std[0]=ec;
		std[1]=ec2;
		std[2]=ec3;
		std[3]=ec4;
		std[4]=ec5;
		std[5]=ec6;
		std[6]=ec7;
		
		Scanner scan = new Scanner(System.in);
		
		/* 학생 이름으로 검색 => 학원, 수강과목 출력 */
		System.out.println("학생 이름을 검색해보세요(학원, 수강 정보 출력) : ");
		
		String stu_nm = scan.next();  
		
		int stu_cnt = 0; // 학생 검색 시 일치하는 것이 아무것도 없을 때 없다고 출력하기 위한 변수
		for (int i = 0; i < std.length; i++) {
			if (stu_nm.equals(std[i].getName())) { // String을 같은지 비교할때는 .equals함수를 씀
				std[i].printComany();
				std[i].printCourse();
			}else {
				stu_cnt++;
			}
			if (stu_cnt == 7) {
				System.out.println("검색 결과가 없습니다.");
			}

		} 
		
		/* 지점 검색 => 지점에 해당하는 학생정보 모두 출력 */
		System.out.println("지점을 검색하세요(학생들 정보 출력) : ");
		String bran_nm = scan.next();
		
		int branch_cnt = 0; // 지점 검색결과가 없을 시 없다고 출력하기 위한 변수
		for (int i = 0; i < std.length; i++) {
			if (bran_nm.equals(std[i].getBranch())) {
				std[i].printInfo();				
			}else {
				branch_cnt++;
			}
			if (branch_cnt == 7) {
				System.out.println("해당 지점의 정보가 없습니다.");
			}
		}
		
		scan.close();
	}
}

package StudentGrade;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

	private String name;
	private ArrayList<Grade> g = new ArrayList<>(); //포함
	
	
	public Student() {
	// 기본 생성자
	}

	public Student(String name, HashMap<String, Integer> gradeMap) {
		super();
		this.name = name;		
//		grade=gradeMap; //Grade클래스의 grade맵을 메개변수로받은 gradeList로 바꿔줌		
	}

	public Student(String name, String subject, int score) {
//		super(subject, score);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void print() {
//	super.mapadd(name, getScore());
//	g.get(0).mapadd(name, 0) //Grade안에 있는 메서드 사용
	
//	g.add(null) //g리스트에 Grade 추가
	}
	

	
//	public ArrayList<Student> addList(String name, HashMap<String, Integer> grade) {
//		// 이름과 성적 맵을 받아 리스트에 넣는 메서드
//
//		studentList.add(new Student(name, grade));
//
//		return studentList;
//
//	}



}

package StudentGrade;

import java.util.HashMap;

public class Grade {
	
	private String subject;
	private int score;
	
	HashMap<String, Integer> grade = new HashMap<>();
	
	
	public Grade () {}
	// 기본 생성자
	
	public Grade(String subject, int score) {
		super();
		this.subject = subject;
		this.score = score;
	}
	
	
	public HashMap<String, Integer> mapadd(String subject, int score){
		
		grade.put(subject, score);
		return grade;
	}
	
//	public Grade(HashMap<String, Integer> m) {
//		// 맵 만드는 생성자
//		this.m = m;
//
//	}
	
	public HashMap<String, Integer> putmap(String subject, int score) {
		// 과목과 점수를 받아 맵에 넣는 메서드
		grade.put(subject, score);
		return grade;
	}

	


	@Override
	public String toString() {
		return "Grade [subject=" + subject + ", score=" + score + ", grade=" + grade + "]";
	}

	//getter,setter
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public HashMap<String, Integer> getGrade() {
		return grade;
	}

	public void setGrade(HashMap<String, Integer> grade) {
		this.grade = grade;
	}




	
	
}

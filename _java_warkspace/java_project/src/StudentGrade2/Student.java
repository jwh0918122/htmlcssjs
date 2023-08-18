package StudentGrade2;

import java.util.HashMap;

public class Student {

	private String name; // 학생 이름
	private String age; // 학생 나이
	private String phone;

	
	private String subject; // 과목
	private int score; // 점수

	HashMap<String, Integer> map = new HashMap<String, Integer>();

	public Student() {
		// 기본 생성자
	}


	
	public int scoreSum() {
		// 합계 구하기
		int sum = 0;
		for (String tmp : map.keySet()) {
			sum += map.get(tmp);
		}

		return sum;

	}

	public double scoreAvg() {
		// 평균 구하기

		int sum = 0;
		int cnt = 0;
		for (String tmp : map.keySet()) {
			sum += map.get(tmp);
			cnt++;
		}

		double avg = (double) sum / cnt;
		return avg;

	}

	public Student(String name, String age,String phone, HashMap<String, Integer> map) {
		// 이름, 나이, 맵 받는 생성자
		this.name = name;
		this.age = age;
		this.map = map;
		this.phone=phone;
	}

	public Student(String subject, int score) {
		// 과목,점수 받는 생성자
		this.subject = subject;
		this.score = score;
	}

	public void subjectAdd(String subject, int score) {
		//한 학생의 과목과 점수 넣는 메서드
		map.put(subject, score);

	}

	public void subjectDelete(String tmp) {
		//한 학생의 점수(한 과목의)를 삭제하는 메서드
		map.remove(tmp);
	}

	@Override
	public String toString() {
		return "학생 이름 : " + name + " | 나이 : " + age +" | 전화번호 : "+phone;
	}

	// getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

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

	public HashMap<String, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


}

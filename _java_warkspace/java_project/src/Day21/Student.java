package Day21;

public class Student {

	// name,score만 가지는 클래스 생성
	private String name;
	private int score;

	public Student() {
	}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	// getter,setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}

package studentManager강사님;

public class subject {
	/*한 과목이 나타내야 하는 정보
	 * - 과목코드, 과목명, 학점, 시수, 교수명, 학기, 분류, 시간표...
	 */
	private String subName;
	private int subTime;
	private String subProfessor;
	private double subCredite;
	private String subScheduIer;
	
	public subject() {
		
	}
	public subject(String subName) {
		this.subName = subName;
		
	}
	public subject(String subName, int subTime) {
		this.subName = subName;
		this.subTime = subTime;
	}
	public subject(String subName, int subTime, String subProfessor, double subCredite, String subScheduIer) {
		super();
		this.subName = subName;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subCredite = subCredite;
		this.subScheduIer = subScheduIer;
	}
	@Override
	public String toString() {
		return "수강과목 [수강과목=" + subName + ", 수강시간=" + subTime + ", 강사=" + subProfessor
				+ ", 수강점수=" + subCredite + ", 수강스케줄=" + subScheduIer + "]";
	}
	
	//getter,setter
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public int getSubTime() {
		return subTime;
	}
	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}
	public String getSubProfessor() {
		return subProfessor;
	}
	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}
	public double getSubCredite() {
		return subCredite;
	}
	public void setSubCredite(double subCredite) {
		this.subCredite = subCredite;
	}
	public String getSubScheduIer() {
		return subScheduIer;
	}
	public void setSubScheduIer(String subScheduIer) {
		this.subScheduIer = subScheduIer;
	}

}

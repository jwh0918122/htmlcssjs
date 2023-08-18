package Day14;

public class EzenComputer1 {
	private String name;
	private String birth;
	private String phone;
	private int age;
	private final static String COMPANY="EZEN"; //Final은 대문자로 처리
	private String branch;
	private String[] course = new String[5]; //수강과목
	private String[] period = new String[5]; // 기간
	private int cnt; // 배열의 index 처리용
		
	//기본 생성자
	public EzenComputer1() {
		
	}

	public EzenComputer1(String name, String phone, String branch) {
		this.name=name;
		this.phone=phone;
		this.branch=branch;
	}
	public EzenComputer1(String name,String birth, int age, String phone, String branch) {
		this(name,phone,branch);
		this.age=age;
		this.birth=birth;
			
	}
	public EzenComputer1(String name,String birth, int age, String phone, String branch, String[] course) {
		this(name,phone,branch);
		this.age=age;
		this.birth=birth;
		this.branch=branch;
		this.course=course;
			
	}
	//method
	public void printInfo() {
//		System.out.println("---학생 기본 정보---");
		System.out.println("이름 : " + name +" / " +"나이 : " + age+" / "+"생년월일 : " + birth+" / "+"전화번호 : " + phone);			
	}
	
	public void printComany() {
//		System.out.println("---학원 정보---");
		System.out.println("학원명 : " +COMPANY+" / "+branch+"지점");
	}
	public void printCourse() {
		if(course.length==0 || cnt ==0) {
			System.out.println("수강 과목이 없습니다.");
			return;
		}
		//cnt까지만 출력 => 추가되지 않은 값은 출력X
		for(int i=0;i<cnt;i++) {//수강과목 => 1과목
			System.out.println("과정 : "+course[i]+"("+period[i]+")");
		}
	}
	
	//수강정보 등록 => insertCourse() 한번 호출하면 1과목 등록
	public void insertCourse(String course, String period) {
		//cnt=0 => 아직 추가 값 없음.
		if(cnt>=5) {
			System.out.println("더이상 수강할 수 없습니다.(최대 5과목)");
			return;
			//배열 생성 기존 배열의 2배
			//배열 복사
			//기존 배열을 생산한 배열로 다시 연결
		}
		this.course[cnt]=course;
		this.period[cnt]=period;
		cnt++; // 1개 담고 번지 증가		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	
	

}

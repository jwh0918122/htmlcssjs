package Day14;

public class EzenComputer {
	/* - 학생 정보를 관리하기 위한 클래스
	 * - 학생 기본정보 : 이름, 나이, 생년월일, 전화번호  
	 * - 학원 정보 : 학원명="EZEN"(final), 지점
	 * - 수강 정보 : 수강과목, 기간 => 한 학생이 여러과복을 수강하기 위해서는 배열로 처리(5과목)
	 *  
	 * 예)홍길동 인천 자바 6개월(2023/05/23 ~ 2023/11/20)
	 * 	 홍길동 인천 파이썬 1개월(2023/07/01 ~ 2023/08/01)
	 * 홍길동 990101, 010-1111-1111, 24 
	 * 학원명 : EZEN, 지점 : 인천
	 * 수강과목 : 자바 6개월(~), 파이썬 1개월(~)
	 *  
	 *  기능
	 *  - 학생의 기본정보를 출력하는 기능
	 *  - 학생의 기본정보를 출력하는 기능
	 *  - 학생의 수강정보를 출력하는 기능
	 *  - 학생의 수강정보를 추가하는 기능 
	 */
	
	/* 멤버변수 */
	// 학생정보
	private String name;
	private String age;
	private String dob;
	private String phone;
	// 학원정보
	private final String academy = "EZEN";
	private String place;
	// 수강정보	
	private String[] subject = new String[5];
	private String[] period = new String[5];
	private int cnt;

	public EzenComputer() {
		// 기본 생성자
	}

	public EzenComputer(String name, String age, String dob, String phone, String place, String[] subject,
			String[] period) {
		// 추가 생성자
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.phone = phone;
		this.place = place;
		this.subject = subject;
		this.period = period;
	}
	public EzenComputer(String name, String age, String dob, String phone, String place) {
		// 추가 생성자
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.phone = phone;
		this.place = place;
		
	}

	
	// 학생의 기본정보를 출력하는 기능
	public void stuprint() {
		System.out.println("---학생 기본 정보---");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("생년월일 : " + dob);
		System.out.println("전화번호 : " + phone);
	}

	// 학생의 학원정보를 출력하는 기능
	public void acaprint() {
		System.out.println("---학생의 학원 정보---");
		System.out.println("상호명 : " + academy);
		System.out.println("지점 : " + place);
	}


	//학생의 수강정보를 출력하는 기능
	public void subprint() {
		System.out.println("---학생의 수강 정보---");
		System.out.println("학생 이름 : " + name);

		if (cnt == 0) {
			System.out.println("수강 과목이 없습니다.");
		}

		for (int i = 0; i < subject.length; i++) {
			if (subject[i] == null) {

				break;
			} else {
				System.out.println("수강과목 : " + subject[i] + " / " + period[i]);

			}
		}

	}
	//학생의 수강정보를 추가해주는 기능
	public void add(String subject, String period) {
//		for (int i = 0; i < this.subject.length; i++) {
//			if (this.subject[i] == null) {
//				this.subject[i] = subject;
//				this.period[i] = period;
//				break;
//			}
//		}
	this.subject[cnt]=subject;
	this.period[cnt]=period;	
	cnt++;
	}
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public String getAcademy() {
		
		return academy;
	}
	

}

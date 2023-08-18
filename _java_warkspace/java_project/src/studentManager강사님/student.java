package studentManager강사님;

public class student {
	/*한 학생의 정보를 받는 클래스
	 * - 이름, 나이, 전화번호, 주소, 지점, 수강과목(여러 개) 
	 */
	
	private String stdName;
	private int stdAge;
	private String stdPhone;
	private String stdAddress;
	private String stdBranch;
	
	private subject[] subjectList = new subject[5]; //student클래스(현재클래스)는 subject클래스를 포함하고 있음(상속X)
	private int subCount; //subject 배열 index
	
	public student() {
		
	}

	public student(String stdName, int stdAge, String stdPhone, String stdAddress) {
		super(); //상속받는 거 아니라서 생략 가능
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.stdPhone = stdPhone;
		this.stdAddress = stdAddress;
	}
	//출력 메서드
	public void stdprint() {
		System.out.println("--학생 정보--");
		System.out.println("학생명(나이)"+stdName+"("+stdAge+")");
		System.out.println("주소(phone): "+stdAddress+"("+stdPhone+")");
	}
	//수강과목 출력 메서드
	public void subprint() {
		//만약 수강과목이 없을 경우 
		if(subCount ==0) {
			System.out.println("수강중인 과목이 없습니다.");
			return;
		}
		//있을 경우 : 여러 개 있을 수 있음
		for(int i=0;i<subCount;i++) {
			System.out.println(subjectList[i]);//toString 호출
			//subjectList[i].출력 메서드 호출;
		}
	}
	
	//수강과목 추가 
	//매개변수 : 수강과목 객체subName, 리턴타입 void
	//수강과목을 객체로 받아 => 배열에 등록
	
	public void insertsubject(subject subName) {

		// 배열이 다 찼다면 늘려주기
		if (subCount == subjectList.length) {
			// 빈 배열
			subject[] tmp = new subject[subCount + 5]; // 현재 개수에서 5개 늘리기
			// 기존 배열을 빈 배열로 복사 arraycappy
			System.arraycopy(subjectList, 0, tmp, 0, subCount);
			// 기존 subjecList 날라가고 subjectList에 tmp배열로 연결
			subjectList = tmp;
		}
		// 수강과목을 객체로 받아 => 배열에 등록
		subjectList[subCount] = subName;
		subCount++;
	}

	// 수강과목 삭제
	public void deleteSunject(String subName) {
		//검색해서 삭제
		int index = -1; //찾은 번지
		if(subName==null) {
			return;
		}
		for(int i=0;i<subCount;i++) {
			if(subjectList[i].getSubName().equals(subName));{
				index = i; //삭제 위치
				break;
			}
		}
		//찾는 값이 없다면
		if(index==-1) {
			System.out.println("철회할 과목이 없습니다.");
			return;
		}
		//찾았을 경우 => 삭제
		//찾은 위치부터 뒷 번지를 앞 번지로 옮기는 작업
		for(int i=index;i<subCount-1;i++) { //subCount = 끝번지
			subjectList[i] = subjectList[i+1];	
		}
		//마지막 번지는 null
		subjectList[subCount-1]=null;
		subCount--; //삭제되면서 과목개수가 줄어듬
	}

	//getter, setter
	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdAge() {
		return stdAge;
	}

	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}

	public String getStdPhone() {
		return stdPhone;
	}

	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}

	public String getStdAddredd() {
		return stdAddress;
	}

	public void setStdAddredd(String stdAddredd) {
		this.stdAddress = stdAddredd;
	}

	public subject[] getSubjdectList() {
		return subjectList;
	}

	public void setSubjdectList(subject[] subjdectList) {
		this.subjectList = subjdectList;
	}

	public int getSubCount() {
		return subCount;
	}

	public void setSubCount(int subCount) {
		this.subCount = subCount;
	}

	public String getStdBranch() {
		return stdBranch;
	}

	public void setStdBranch(String stdBranch) {
		this.stdBranch = stdBranch;
	}

}

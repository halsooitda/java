package studentManager1;

public class Student {
	/* 한 학생의 정보를 받는 클래스
	 * - 이름, 나이, 전화번호, 주소, 지점, 수강과목s
	 * */
	private String stdName;
	private int stdAge;
	private String stdPhone;
	private String stdAddress;
	private String stdBranch;
	private Subject[] subjectList = new Subject[5]; // 학생이 수강하는 과목들
	private int subCount; // subject 배열 index
	
	public Student() {}

	public Student(String stdName, int stdAge, String stdPhone, String stdAddress) {
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.stdPhone = stdPhone;
		this.stdAddress = stdAddress;
	}
	// 출력 메서드
	public void stdPrint() {
		System.out.println("--학생정보--");
		System.out.println("학생명(나이) : "+stdName+"("+stdAge+")");
		System.out.println("주소(tel) : "+stdAddress+"("+stdPhone+")");
	}
	// 수강과목 출력 메서드
	public void subPrint() {
		// 만약 수강과목이 없을 경우
		if(subCount==0) {
			System.out.println("수강중인 과목이 없습니다.");
			return;
		}
		// 있을 경우 : 여러개 있을 수 있음.
		for(int i=0; i<subCount; i++) { // 비어있을 수도 있으니 length까지 가면 안된다.
			System.out.println(subjectList[i]); // toString 호풀
			// subjectList[i].출력 메서드 호출;
		}
		
	}
	
	// 수강과목 추가
	// 매개변수 : 수강과목 객체 subName, 리턴X
	public void insertSubject(Subject subName) {
		// 배열이 다 찼다면 늘려주기
		if(subCount == subjectList.length) {
			Subject[] temp = new Subject[subCount+5];
			System.arraycopy(subjectList, 0, temp, 0, subCount);
			subjectList = temp;
		}
		// 수강과목을 객체로 받아 배열에 등록
		subjectList[subCount] = subName;
		subCount++;
	}
	
	// 수강과목 삭제
	public void deleteSubject(String subName) {
		// 검색해서 삭제
		int index = -1; // 찾은 번지
		if(subName == null) {
			return;
		}
		for(int i=0; i<subCount; i++) {
			if(subjectList[i].getSubName().equals(subName)) {
				index = i; // 삭제 위치
				break;
			}
		}
		// 찾는 값이 없다면
		if(index == -1) {
			System.out.println("철회할 과목이 없습니다");
			return;
		}
		
		// 찾았을 경우 => 삭제
		// 찾은 위치부터 뒷번지를 앞번지로 옮기는 작업
		for(int i=index; i<subCount-1; i++) { //subCount=끝번지
			subjectList[i]= subjectList[i+1]; // i의 기준이 끝까지 가버리면, 마지막 번지+1번지는 없는 값이 됨.
			
		}
		
		// 마지막 번지는 null로 채워진다. (마지막 다음 번지는 없고 마지막번지안에 있던 값은 앞의 번지에 채웠으니까)
		subjectList[subCount-1] = null;
		subCount--; // 삭제되면서 과목개수가 줄어듦
		
		
	}
	

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

	public String getStdAddress() {
		return stdAddress;
	}

	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}

	public Subject[] getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(Subject[] subjectList) {
		this.subjectList = subjectList;
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

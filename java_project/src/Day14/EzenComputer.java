package Day14;

public class EzenComputer {
	/* - 학생 정보를 관리하기 위한 클래스
	 * - 학생 기본정보 : 이름, 생년월일, 전화번호, 나이
	 * - 학원 정보 : final학원명="EZEN", 지점
	 * - 수강 정보 : 수강과목, 기간 
	 *   => 한 학생이 여러과목을 수강하기 위해서는 배열로 처리 5과목
	 * 예) 홍길동 인천 자바 6개월(2023-05-23~-2023-11-20)
	 *     홍길동 인천 파이썬 1개월(2023-07-01~-2023-08-01)
	 * 
	 * 홍길동 990101, 010-1111-1111, 24 
	 * 학원명 : EZEN, 지점 : 인천
	 * 수강과목 : 자바 6개월(2023-05-23~-2023-11-20), 파이썬 1개월(2023-07-01~-2023-08-01)
	 * 
	 * 기능 
	 * - 학생의 기본정보를 출력하는 기능
	 * - 학생의 학원정보를 출력하는 기능
	 * - 학생의 수강정보를 출력하는 기능
	 * - 학생의 수강정보를 추가하는 기능
	 * 
	 * */
	
	private String name, birth, age, tel, pos;
	private final String sch = "EZEN";
	private String[] sub = new String[5];
	private String[] per = new String[5];
	
	public EzenComputer() {}
	
	public EzenComputer(String name, String birth, String age, String tel, String pos, String sub, String per) {
		super();
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.tel = tel;
		this.pos = pos;
		this.sub[0] = sub; // 0번지에 생성자로 초기화
		this.per[0] = per; 
	}

	// 학생정보
	public void printStudent() {
		System.out.println(name+" | "+birth+" | "+age+" | "+tel);
	}
	
	// 학원정보
	public void printSchool() {
		System.out.println("학원명 : "+sch+" | "+"지점 : "+pos); 
	}
	
	// 수강정보
	public void printClass() {
		System.out.print("수강과목 : ");
		for(int i=0; i<sub.length; i++) {
			if(sub[i] != null) { // 배열에 값이 들어있을 때만 출력해라
				System.out.print(sub[i]);
				System.out.print("("+per[i]+") ");
			}
		}
		System.out.println();
	}
	
	// 수강정보추가
	public void addClass(String subject, String period) {
		for(int i=0; i<sub.length; i++) { 
			if(sub[i] == null) { // 1번지부터 값이 들어있지 않은 제일 앞 배열에 넣고 끝내기
				sub[i] = subject;
				per[i] = period;
				return;
			}
		}
		
	}
	
	// getter/setter
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


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getPos() {
		return pos;
	}


	public void setPos(String pos) {
		this.pos = pos;
	}


	public String[] getSub() {
		return sub;
	}


	public void setSub(String[] sub) {
		this.sub = sub;
	}


	public String[] getPer() {
		return per;
	}


	public void setPer(String[] per) {
		this.per = per;
	}


	public String getSch() {
		return sch;
	}
	
	
	
	
}

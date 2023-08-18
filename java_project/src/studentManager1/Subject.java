package studentManager1;

public class Subject {
	/* 한 과목이 나타내야하는 정보
	 * - 과목코드, 과목명, 학점, 시수, 교수명, 학기, 분류, 시간표...
	 * */
	private String subName;
	private int subTime;
	private String subProfessor;
	private double subCredite;
	private String subScheduler;
	
	public Subject() {}
	// 과목명만 받는 생성자
	public Subject(String subName) { 
		this.subName = subName;
	}
	// 과목명, 시간 받는 생성자
	public Subject(String subName, int subTime) {
		this.subName = subName;
		this.subTime = subTime;
	}
	// 모두 받는 생성자
	public Subject(String subName, int subTime, String subProfessor, double subCredite, String subScheduler) {
		super();
		this.subName = subName;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subCredite = subCredite;
		this.subScheduler = subScheduler;
	}
	
	
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
	public String getSubScheduler() {
		return subScheduler;
	}
	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}
	
	@Override
	public String toString() {
		return "Subject [subName=" + subName + ", subTime=" + subTime + "]";
	}
	
	
}

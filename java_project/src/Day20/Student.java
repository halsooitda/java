package Day20;

import java.util.HashMap;

public class Student {
	//멤버변수 : 이름, 나이, 전화번호, 점수, 합계, 평균
	private String name;
	private int age;
	private String phone;
	private HashMap<String, Integer> Subject = new HashMap<>(); // 과목, 점수
	private int sum;
	private double avg;
	
	//기본 생성자
	public Student() {}
	//이름, 나이, 번호 받는 생성자
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	//학생 출력
	public void printStd() {
		System.out.println(name+"("+age+")");
		if(phone != null) {
			System.out.println(phone);
		}
		printSub();
		calc();
		
	}
	
	//과목, 점수 출력
	public void printSub() {
		for(String tmp : Subject.keySet()) {
			System.out.println(tmp+" : "+Subject.get(tmp));
		}
	}
	
	//점수 추가
	public void addSub(String sub, int score) {
		Subject.put(sub, score);
		System.out.println("점수 추가 완료");
	}

	//점수 삭제
	public void deleteSub(String sub) {
		if(Subject.keySet().contains(sub)) {
			Subject.remove(sub);
			System.out.println("점수 삭제 완료");
		}else {
			System.out.println("해당 과목이 없습니다.");
		}
	}
	
	//점수 수정
	public void updateSub(String sub, int score) {
		if(Subject.keySet().contains(sub)) {
			Subject.put(sub, score);
			System.out.println("수정 완료");
		}else {
			System.out.println("해당 과목이 없습니다.");
		}
	}
	
	//계산
	private void calc() {
		sum = 0;
		if(Subject.size() > 0) { //과목값이 있을 때만
			for(String tmp : Subject.keySet()) {
				sum += Subject.get(tmp);
			}
			System.out.println("합계 : "+sum);
			avg = (double)sum/Subject.size();
			System.out.println("평균 : "+avg);
			return;
		}
		System.out.println("점수가 없습니다.");
	}
	
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public HashMap<String, Integer> getSubject() {
		return Subject;
	}
	public void setSubject(HashMap<String, Integer> subject) {
		Subject = subject;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
}

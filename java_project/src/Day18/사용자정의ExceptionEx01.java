package Day18;

public class 사용자정의ExceptionEx01 {

	public static void main(String[] args) {
		/* passwordException
		 * 
		 * - 비밀번호는 null일 수 없다.
		 * - 비밀번호는 길이가 5자 이상
		 * - 비밀번호는 문자로만 이루어지면 안됨(문자+숫자 또는 특수문자 포함)
		 * */
		PassWordTest pt = new PassWordTest();
		//String password = "abc"; // 길이 오류
		//String password = "abcde"; // 특수문자 or 숫자 미포함
		//String password = null; // null 오류
		String password = "abcd!"; // ok
		try {
			pt.setPassword(password);
			System.out.println(pt.getPassword());
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
	}

}

class PassWordTest {
	private String password;
	
	
	//getter
	public String getPassword() {
		return password;
	}
	
	//setter
	public void setPassword(String password) {
		// throw 발생 처리
		/* - 비밀번호는 null일 수 없다.
		 * - 비밀번호는 길이가 5자 이상
		 * - 비밀번호는 문자로만 이루어지면 안됨(문자+숫자 또는 특수문자 포함) */
		if(password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}else if(password.length() < 5) {
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
		}else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		
		this.password = password;
	}
	
}
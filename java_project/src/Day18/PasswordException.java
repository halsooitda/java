package Day18;

public class PasswordException extends IllegalArgumentException {
	// 사용자정의 Exception 생성할 때 IllegalArgumentException
	public PasswordException(String message) {
		super(message);
	}
}

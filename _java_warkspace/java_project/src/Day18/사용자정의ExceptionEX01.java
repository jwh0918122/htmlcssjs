package Day18;

public class 사용자정의ExceptionEX01 {

	public static void main(String[] args) {
		/* passwordException
		 * 
		 * 비밀번호
		 * - null일 수 없다.
		 * - 길이가 5자 이상
		 * - 문자 + 숫자 or 특수문자(문자로만은 X)
		 */

		PasswordTest pt = new PasswordTest();
//		String password = "abc"; //길이 오류
//		String password = "abcde"; //특수문자or숫자 오류
//		String password = null; //null 오류
		String password ="abcd!"; 
		try {
			pt.setPassword(password);
			System.out.println(pt.getPassword());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class PasswordTest {
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		} else if (password.length() < 5) {
			throw new PasswordException("비밀번호는 5글자 이상이어야 합니다.");
		} else if (password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		this.password = password;
	}
}
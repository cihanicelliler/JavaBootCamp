package Auth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthManager implements AuthService {

	String mailPattern = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	Pattern pattern = Pattern.compile(mailPattern, Pattern.CASE_INSENSITIVE);

	@Override
	public boolean checkMail(String mail) {
		Matcher matcher = pattern.matcher(mail);
		if (matcher.matches()) {
			System.out.println("Mail pattern is success.");
			return true;
		} else {
			System.out.println("Invalid mail.");
			return false;
		}
	}

	@Override
	public void log(String message) {
		System.out.println("Auth is success.");

	}

}

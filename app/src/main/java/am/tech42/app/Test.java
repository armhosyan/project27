package am.tech42.app;

import java.util.List;
import am.tech42.library.Validator;

public class Test {
	public static void main(String[] args) {
		Student st = new Student();
		char[] password = new char[0];

		st.setName("Volodya");
		st.setSurName("Barunakovich");
		st.setAge(-5);
		st.setId(12112);
		st.setPassword(password);
		
		List<String> list = Validator.validate(user);
		for(String s: list) {
			System.out.println(s);
		}
	}
}

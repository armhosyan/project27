package am.tech42.app;
import am.tech42.library.Library;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello from app");
		Library lib = new Library();
		lib.foo();
	}
}

package Random;

import java.io.Console;

public class ConsoleClass {
// will run in terminal but in console it doesn't  work
	public static void main(String[] args) {
		Console console = System.console();
		if (console == null) {
			System.out.println("consoli isn't available");
			System.exit(1);
		}
		String name = console.readLine("what is your name?");
		char[] pwd = console.readPassword("enter your pwd :");
		console.printf("hello, %s \n", name);
		console.printf("your password is , %s \n", new String(pwd));

	}

}

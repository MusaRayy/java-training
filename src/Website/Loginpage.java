package Website;

import java.util.Scanner;

public class Loginpage {
	String title = "WELCOME GOOGLE", username, password, name, luname, lpswd;
	Scanner scan = new Scanner(System.in);

	void printBaseMenu() {
		System.out.println("\t" + title);
		System.out.println("1.REGISTER");
		System.out.println("2.LOGIN");
		System.out.println("Enter your choice");
		int choice = scan.nextInt();
		if (choice == 1) {
			doRegister();
		} else if (choice == 2) {
			doLogin();
		} else {
			System.out.println("invalid choice");
			printBaseMenu();
		}
	}

	void doRegister() {
		System.out.println("Enter your username:(NOTE:characters should be 4-12 digits..)");
		username = scan.next();

		if (username.length() >= 4 && username.length() <= 12) {
			getRegPwd();
		} else {
			System.out.println("invalid uname");
			doRegister();
		}

	}

	private void getRegPwd() {
		System.out.println("Enter your password:(NOTE:characters should be 6-12 digits..)");
		password = scan.next();

		if (password.length() >= 6 && password.length() <= 12) {

			System.out.println("Enter your name");
			name = scan.next();
			doLogin();
		} else {
			System.out.println("invalid password");
			getRegPwd();
		}

	}

	private void doLogin() {
		System.out.println("Login started");
		System.out.println("Enter your username:(NOTE:characters should be 4-12 digits..)");
		luname = scan.next();

		if (luname.length() >= 4 && luname.length() <= 12) {
			getLoginPwd();
		} else {
			System.out.println("invalid uname");
			doLogin();
		}

	}

	private void getLoginPwd() {
		System.out.println("Enter your password:(NOTE:characters should be 6-12 digits..)");
		lpswd = scan.next();

		if (lpswd.length() >= 6 && lpswd.length() <= 12) {

			validateLogin();

		} else {
			System.out.println("invalid password");
			getLoginPwd();
		}

	}

	private void validateLogin() {
		// APPLE == apple
		if (luname.equalsIgnoreCase(username) && lpswd.equals(password)) {

			gotoDashboard();
		} else {
			System.out.println("invalid username/password");
			System.out.println("do u want to retry?(Y/N)");
			String c = scan.next();
			if (c.equalsIgnoreCase("Y"))
				doLogin();

		}
	}

	private void gotoDashboard() {
		System.out.println("welcome " + name);
		System.out.println("1.Logout");
		System.out.println("2.Change User Name");
		System.out.println("3.Change Password");
		System.out.println("Enter your Choice");
		int choice = scan.nextInt();
		if (choice == 1) {

		} else if (choice == 2) {

		} else if (choice == 3) {

		} else {
			System.out.println("invalid choice");
			gotoDashboard();
		}
	}

	public static void main(String[] args) {
		Loginpage login = new Loginpage(); // object creation
		login.printBaseMenu();

	}

}

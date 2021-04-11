package surya;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Loginpage {
	String title = "FACEBOOK LOGIN", uname, pword, name, luname, lpword;

	void printBaseMenu() {
		System.out.println("\t\t\t\t" + title);
		System.out.println("1.REGISTER:");
		System.out.println("2.LOGIN");
		System.out.println("Enter your choice:");

		try {
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			if (choice == 1)
				printRegMenu();
			else if (choice == 2)
				printLogin(false);
		} catch (InputMismatchException e) {
			System.out.println("please enter number only");
			printBaseMenu();
		}

	}

	void printRegMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username: (NOTE:characters should be between 4-12digits)");
		uname = scan.next();

		if (uname.length() >= 4 && uname.length() <= 12) {
			getRegisterPassword();
		} else {
			System.out.println("invalid username, plz try again");
			printRegMenu();
		}

	}

	void getRegisterPassword() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter password: (NOTE:characters should be between 6-18digits)");
		pword = scan.next();

		if (pword.length() >= 6 && pword.length() <= 18) {

			System.out.println("Enter your name:");
			name = scan.next();

			printLogin(false);
		} else {
			System.out.println("invalid password,plz try again");
			getRegisterPassword();
		}
	}

	public static void main(String[] args) {

		Loginpage ss = new Loginpage();
		ss.printBaseMenu();
	}

	void printLogin(boolean isChange) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter loginusername:");
		luname = scan.next();
		System.out.println("Enter loginpassword:");
		lpword = scan.next();
		if (luname.equalsIgnoreCase(uname) && (lpword.equals(pword))) {
			dashboard(isChange);
		} else {
			System.out.println("username(or)password doesnt match");
			printLogin(false);
		}

	}

	void dashboard(boolean isChange) {

		if (isChange) {
			System.out.println("ok");
		} else {
			Scanner scan = new Scanner(System.in);
			System.out.println("hello " + name);
			System.out.println("1.Logout");
			System.out.println("2.Change username");
			System.out.println("3.Change password");
			System.out.println("Enter your option:");
			int option = scan.nextInt();
			if (option == 1) {
				printLogoutMenu();
			} else if (option == 2) {
				changeNewUserName();
			} else if (option == 3) {
				changeNewPassword();
			} else {
				System.out.println("incorrect option");
				dashboard(isChange);
			}
		}
	}

	void printLogoutMenu() {
		printBaseMenu();
	}

	void changeNewUserName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter username: (NOTE:characters should be between 4-12digits)");
		uname = scan.next();

		if (uname.length() >= 4 && uname.length() <= 12) {
			printLogin(true);
		} else {
			System.out.println("invalid username, plz try again");
			printRegMenu();
		}

	}

	void changeNewPassword() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter password: (NOTE:characters should be between 6-18digits)");
		pword = scan.next();

		if (pword.length() >= 6 && pword.length() <= 18) {
			printLogin(true);
		} else {
			System.out.println("invalid password,plz try again");
			getRegisterPassword();
		}
	}
}

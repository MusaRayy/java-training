package surya;
import java.util.Scanner;

public class Loginpage {
	String title = "FACEBOOK LOGIN", uname, pword, name, luname, lpword;
	Scanner scan = new Scanner(System.in);

	void printBaseMenu() {
		System.out.println(title);
		System.out.println("1.REGISTER:");
		System.out.println("2.LOGIN");
		System.out.println("Enter your choice:");
		int choice = scan.nextInt();

		if (choice == 1)
			printRegMenu();
		else if (choice == 2)
			printLogin();
	}

	void printRegMenu() {
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
		System.out.println("Enter password: (NOTE:characters should be between 6-18digits)");
		pword = scan.next();

		if (pword.length() >= 6 && pword.length() <= 18) {

			System.out.println("Enter your name:");
			name = scan.next();

			printLogin();
		} else {
			System.out.println("invalid password,plz try again");
			getRegisterPassword();
		}
	}

	public static void main(String[] args) {

		Loginpage ss = new Loginpage();
		ss.printBaseMenu();
	}

	void printLogin() {

		System.out.println("Enter loginusername:");
		luname = scan.next();
		System.out.println("Enter loginpassword:");
		lpword = scan.next();
		if (luname.equalsIgnoreCase(uname) && (lpword.equals(pword))) {
			dashboard();
		} else {
			System.out.println("username(or)password doesnt match");
			printLogin();
		}

	}

	void dashboard() {
		System.out.println("hello" + name);
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
			dashboard();
		}
	}

	void printLogoutMenu() {
		printBaseMenu();
	}

	void changeNewUserName() {
		System.out.println("Enter username: (NOTE:characters should be between 4-12digits)");
		uname = scan.next();

		if (uname.length() >= 4 && uname.length() <= 12) {
			printLogin();
		} else {
			System.out.println("invalid username, plz try again");
			printRegMenu();
		}

	}
	void changeNewPassword() {
		System.out.println("Enter password: (NOTE:characters should be between 6-18digits)");
		pword = scan.next();

		if (pword.length() >= 6 && pword.length() <= 18) {
			printLogin();
		} else {
			System.out.println("invalid password,plz try again");
			getRegisterPassword();
		}
	}
}

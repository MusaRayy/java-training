import java.util.Scanner;

public class IfConditions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter 2 number");
		int a = sc.nextInt();
		int b = sc.nextInt();

		// a<b, b<a, a>b, b>a, a!=b, a==b

		// nested if-else
		if (a < b) {
			if (b > 50) {
				System.out.println(b + " is big number - IFabove 50");
			} else {
				System.out.println(b + " is big number - IFbelow 50");
			}
		} else {
			System.out.println(a + " is big number - ELSE");
		}

		System.out.println("enter day");
		// instead of declaring new variable we can use existing variables (a, b) here
		// because after the above if-else that 2 variable no use
		int day = sc.nextInt();

		if (day == 1) {
			System.out.println("sunday");
		} else if (day == 2) {
			System.out.println("monday");
		} else if (day == 3) {
			System.out.println("tue");
		} else if (day == 7) {
			System.out.println("satr");
		} else {
			System.out.println("invalid number");
		}

	}
}
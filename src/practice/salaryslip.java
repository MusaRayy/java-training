package practice;
import java.util.Calendar;
import java.util.Scanner;

public class salaryslip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println(Calendar.getInstance());
//		System.out.println(Calendar.getInstance().getTime());

		System.out.println("enter your empid");
		int empId = sc.nextInt();
		System.out.println("enter your empname");
		String empName = sc.next();
		System.out.println("enter your empsalary");
		float empSalary = sc.nextFloat();
		System.out.println("enter your empdoj");
		int empJod = sc.nextInt();

		int currentyear = Calendar.getInstance().get(Calendar.YEAR);
		int exp = currentyear - empJod;

		if (exp <= 5) {
			double bouns = empSalary + (0.2 * empSalary);
			System.out.println("Hi " + empName + " your bouns is "
			+ bouns + "Rs for your " + exp + "years exp");
		}
		else if (exp > 5 && exp<=10) {
			double bouns = empSalary + (0.3 * empSalary);
			System.out.println("Hi " + empName + " your bouns is "
			+ bouns + "Rs for your " + exp + "years exp");
		}
		else {
			System.out.println("not yet implemented");
		}
	}

}

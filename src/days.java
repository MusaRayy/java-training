import java.util.Scanner;

public class days {

	public static void main(String[] args) {
		String day;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a day number or name");

		day = sc.next();

		if(day.equals("1") || day.equalsIgnoreCase("sun")) {
			
			System.out.println("today is sunday");
		}else if(day.equals("2") || day.equalsIgnoreCase("mon")) {
			System.out.println("today is monday");
		}else if(day.equals("3") || day.equalsIgnoreCase("tue")) {
			System.out.println("today is tuesday");
		}else if(day.equals("4") || day.equalsIgnoreCase("wed")) {
			System.out.println("today is wednesday");
		}else if(day.equals("5") || day.equalsIgnoreCase("thu")) {
			System.out.println("today is thursday");
		}else if(day.equals("6") || day.equalsIgnoreCase("fri")) {
			System.out.println("today is friday");
		}else if(day.equals("7") || day.equalsIgnoreCase("sat")) {
			System.out.println("today is saturday");
		}else {
			System.out.println("invalid day");
		}
		
		
		System.out.println("=================================");
		
		switch (day.toUpperCase()) {
		
		case "1":
		case "SUN":
			System.out.println("today is Sun");
			break;
			
		case "2":
		case "MON":
			System.out.println("today is Mon");
			break;
			
		case "3":
			System.out.println("today is Tues");
			break;
			
		case "4":
			System.out.println("today is Wed");
			break;
			
		case "5":
			System.out.println("today is Thur");
			break;
			
		case "6":
			System.out.println("today is Fri");
			break;
	
		case "7":
			System.out.println("today is Sat");
			break;

		default:
			System.out.println("invalid input from switch case");
			break;
		}
			
	}

}

/*
 * Controll statements
 * 
 * conditional stmt - if else selectional stmt - == equals if else, switch case
 * looping/iteration stmt st tn, endd ptn -> for, while, do-while
 */
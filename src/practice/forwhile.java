package practice;
import java.util.Scanner;

public class forwhile {

	public static void main(String[] kid) {
		
		System.out.println("enter the max limit?");
		Scanner sc =  new Scanner(System.in);
		int max =sc.nextInt();
		
		for (int i = 1; i <= max; i++) {
			System.out.println("*");
		}

		System.out.println("==========");
		for (int s = 1; s <= max; s++) {
			System.out.print("%");
		}

		System.out.println("\n==========");
		for (int u = 1; u <= max; u++) {
			if (u == max) {
				for (int i = 0; i < u; i++) {
					System.out.print("* ");
				}
			} else {
				System.out.println("*");
			}
		}
		
		System.out.println("\n==========");
		for (int u = 1; u <= max; u++) {
			if (u == max|| u ==1 || u ==(max/2)) {
				
				for (int i = 0; i < max; i++) {
					System.out.print(i+" ");
				}
				System.out.println();
			} else {
				System.out.println(u);
			}
		}
		System.out.println("\n==========");
		for (int u = 1; u <= max; u++) {
			if (u ==1 || u ==(max/2)) {
				
				for (int i = 0; i < max; i++) {
					System.out.print(i+" ");
				}
				System.out.println();
			} else {
				System.out.println(u);
			}
		}
		System.out.println("\n==========");
		for (int u = 1; u <= max; u++) {
			if (u ==(max/2)) {
				
				for (int i = 0; i < max; i++) {
					System.out.print(i);
				}
				System.out.println();
			} else {
				
				System.out.print(u);
				for (int i = 1; i < max-1; i++) {
					System.out.print(" ");
				}
				System.out.print(u);
				System.out.println();
			}
		}
	}
	
	
	
	//F, H, I, T, U, 
	
	//LITTLE - function

}

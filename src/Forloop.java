import java.util.Scanner;

public class Forloop {

	public static void main(String[] args)
	{
		
	     Scanner sc = new Scanner(System.in);
	     
	     int a=sc.nextInt();
	     float f = sc.nextFloat();
		for(int i=1;i<=5;i++)
		{
			if (i==1 || i==3) {
				for(int j=1;j<=5;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}else {
			System.out.println("*");
			}
		}

	}

}

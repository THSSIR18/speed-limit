import java.util.Scanner;
public class SpeedLimit
{
	public static void main (String[] args)
	{ 
		System.out.println("SunCity Motor Vehicle Speeding Tickets: Fines...");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the current speed limit: ");
		int first= sc.nextInt();
		System.out.print("Enter the speed at which the car is traveling: ");
		int second= sc.nextInt();
		if (second>first)
		{
			double total= ((second-first)*5) + 50;
			System.out.println("The fine would be $" + total);
		}
		else
		{
			System.out.println("There is no speeding violation");
		}
	}
}
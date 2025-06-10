import java.util.Scanner;
class dowhile2 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean flag=true;

		do
		{
			System.out.println("1.Buhari\n2.A2B\3.Exit");
			System.out.println("Select an Input");
			int input=sc.nextInt();
			if(input==1)
				System.out.println("\t\t\tGreetings from Buhari");
			else if(input==2)
				System.out.println("\t\t\tGreetings from A2B");
			else if(input==3)
				System.out.println("Thank You");
		}
		while (false==flag);
		System.out.println("Exit");
	}
}

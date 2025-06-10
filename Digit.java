import java.util.Scanner;
class Digit
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter a vale of N:");
		int n=sc.nextInt();

		while(n>0)
		{
			n=n/10;
			count++;
			System.out.println("1 Digit");
		}

	}
}

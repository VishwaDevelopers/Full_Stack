import java.util.Scanner;
class  Test4
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Select the input:");
		System.out.println("1. Qspider\n 2. Jspider\n 3. Pyspider");
		int input=sc.nextInt();

		if(input==1)
		{
			System.out.println("Harsha sir");
		}
		else if(input==2)
		{
			System.out.println("Taberz");
		}
		else if(input==3)
		{
			System.out.println("Nagaraj");
		}
		else
		{
				System.out.println("Invalid");
		}


	}
}

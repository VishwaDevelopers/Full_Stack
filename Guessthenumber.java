import java.util.Scanner;
class Guessthenumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int sys_num=(int)(Math.random()*3);
		System.out.print("Enter the number(0-3):");
		int num=sc.nextInt();
		if(sys_num==num)
		{
			System.out.println("Wow its a correct number");
		}
		else
		{
			System.out.println("No its not correct number");
		}

	}
}

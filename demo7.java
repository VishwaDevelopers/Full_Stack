import java.util.*;
class demo7
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number:");
		int num=sc.nextInt();

		for (int i=1;i<=num ;i++ )
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}

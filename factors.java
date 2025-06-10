import java.util.*;
class factors
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the num:");
		int num=sc.nextInt();

		for (int i=1;i<=num/2 ;i++ )
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}
}

import java.util.*;
class print1ton
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the n:");
		int n=sc.nextInt();

		for (int i=1;i<=n ;i++ )
		{
			System.out.print(i+",");
		}
	}
}

import java.util.*;
class factorial 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the num:");
		int num=sc.nextInt();
		int ans=1;

		for (int i=1;i<=num ;i++ )
		{
			ans=ans*i;
		}
		System.out.println(ans);
	}
}

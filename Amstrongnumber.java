import java.util.*;
class  Amstrongnumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number:");
		int num=sc.nextInt();
		int count=0;
		int temp=num;

		while (num>0)
		{
			num/=10;
			count++;
		}
		int sum=0;
		for (int i=num;i>0 ;i/=10 )
		{
			int last=i%10;
			int ans=1;	
			for (int k=1;k<=count ;k++ )
			{
				ans*=last;
			}
			sum+=ans;

		}
		if(sum==num)
		{
			System.out.println("Amstrongnumber");
		}
		else
			System.out.println("Not Amstrongnumber");
	}
}

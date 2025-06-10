import java.util.*;
class happynumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the number");
		int num=sc.nextInt();
		sum=0;

		while(num!=1 && num!=4)
		{
			while (num>0)
			{
				sum+=(num%10)*(num%10);
				num/=10;
			}
	num=sum;
	sum=0;
		}

		if (num==1)
			System.out.println("Happy Number");
		else 
			System.out.println("Un Happy Number");
	}
}
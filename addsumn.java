import java.util.*;
class addsumn 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the N:");
		int num=sc.nextInt();
		int sum=0;
		for (int i=1;i<=num ;i++ )
		{
			sum=sum+i;
		}
		System.out.println("Sum:"+sum);	
		}
	}

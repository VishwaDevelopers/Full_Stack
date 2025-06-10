import java.util.*;
class  Demo9
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the n:");
		int n=sc.nextInt();
		

		while(n>=1)
		{
			if(n%8==0 && n%6==0 && n%2==0)
			{
				System.out.println(n);
			}
			n--;
		}
	}
}

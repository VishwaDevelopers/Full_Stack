import java.util.*;
class  PrintValue
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the N Value :");
		int n=sc.nextInt(),i=1;

		

		while(i<=n)
		{
			if (i%8==0 && i%6==0 && i%2==0)
				System.out.println(i);
			i++;
		}
	}
}

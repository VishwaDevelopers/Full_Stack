import java.util.*;
class Demo5
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the data :");
		char a=sc.next().charAt(0);

		if(a>='0' && a<='9')
		{
			System.out.println("number");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}


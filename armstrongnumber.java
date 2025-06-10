import java.util.*;
class largesttwonumber 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
        System.out.println("Enter the value of b:");
		int b=sc.nextInt();

		int ans=(a>b);
		System.out.println("Largest value is:"+ans); 
	}
}

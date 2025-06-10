import java.util.Scanner;
class fizzbuzz
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter n:");
		int num=sc.nextInt();

		while(n>=1)
		{
			if(num%3==0 && num%5==0)
				System.out.println(n+"FizzBuzz");
			else if(num%3==0)
				System.out.println(n+"Buzz");
			n--;
		}
	}
}

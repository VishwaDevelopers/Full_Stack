import java.util.Scanner;
class addfirstandlast 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		int number=sc.nextInt();

		if(number<=9)
			System.out.println("invalid");
		else
		{
			int last=number%10;

			while(number>9)
			number/=10;
			System.out.println("Result:"+(number+last));
		}
	}
}
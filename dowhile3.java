import java.util.Scanner;
class dowhile3
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean flag=true;
		do
		{
			System.out.println("1.Development\n2.Testing\n3.Exit");
			int input=sc.nextInt();
			switch(input)
			{
				case 1:
				{
                    System.out.println("Select the Development Trainer");
					System.out.println("Tabrez");
				}
				case 2:
				{
					System.out.println("Select the Testing Trainer");
				}
				case 3:
				{
					System.out.println("Thank You");
				}

			}
				
			
		}
		while (flag==false);

		System.out.println("Thankyou");
	}
}

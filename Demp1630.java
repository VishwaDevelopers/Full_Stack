import java.Scanner;
class Demo1630
{
	static Scanner sc=new Scanner(System.in)
	public static void main(String[] args) 
	{
		System.out.println("Enter the hotel:");
		System.out.println("1. A2B\n 2. Buhari");
		if(num>2)
			System.out.println("Invalid hotel ");
		int num=sc.nextInt();
		switch (num)
		{
		case 1 :{
			System.out.println("Greetings from A2B\n 1. Idli\n 2. vada\n 3. pongal");
			break;
		}
		case 2:{
			System.out.println("Greetings from Buhari\n 1. chiken briyani\n 2. mutton biryani\n 3. prawn biryani");
			break;

		
		}
		default:{
			System.out.println("Invalid hotel")
		}
	}
}

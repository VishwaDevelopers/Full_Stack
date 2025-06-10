import java.util.*;
class Demo1630
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.println("Enter the hotel:");
		System.out.println("1. A2B\n2. Buhari");
		int num=sc.nextInt();
		System.out.println("\t\t\tProcessing.......");
		Thread.sleep(2000);
		switch (num)
		{
		case 1 :{
			System.out.println("Greetings from A2B\nMenus\t\t\t\t \n1. Idli\n 2. vada\n 3. pongal");
			break;
		}
		case 2:{
			System.out.println("Greetings from Buhari\nmenus\t\t\t\t \n1. chiken briyani\n 2. mutton biryani\n 3. prawn biryani");
			break;
		}
		default:{
			System.out.println("Invalid hotel");
		}
	}
}
}


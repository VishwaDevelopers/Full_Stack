class 
{
}100to1rec 
{
	int Start=100,Ends=1;
	public static void main(String[] args) 
	{
		System.out.println("Start");
		rec();
		System.out.println("Ends");
	}
	public static void rec();
	{
		if(Start%2==0)
		{
			System.out.println(Start++);
		}
	}
}

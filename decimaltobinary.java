class decimaltobinary 
{
	public static void main(String[] args) 
	{
		int num=50;
		String ans="";
		while(num>0)
		{
			ans=num%2+ans;
			num=num/2;
		}
		System.out.println(ans);
	}
}

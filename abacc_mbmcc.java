class  abacc_mbmcc
{
	public static void main(String[] args) 
	{
		String s="abacc";
		char k='a',r='m';
		char[]a=s.toCharArray();
		for (int i=0;i<a.length ;i++ )
		{
			if (a[i]==k)
			{
				a[i]=r;
			}
		}
		System.out.println(a);
	}
}

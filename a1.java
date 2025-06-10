class a1
{
	public static void solve(int[]a)
	{
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=i+1;j<a.length ;j++ )
			{
               System.out.print("("+a[i]+","+a[j]+")");
			}
			System.out.println();
		}
}
public static void main(String[]args)
	{
	int[]a={2,3,4,6,8};
	solve(a);
	}
}
